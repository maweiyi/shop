package me.maweiyi.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.maweiyi.entity.NideshopAd;
import me.maweiyi.entity.NideshopBrand;
import me.maweiyi.entity.NideshopCategory;
import me.maweiyi.entity.NideshopChannel;
import me.maweiyi.entity.NideshopGoods;
import me.maweiyi.service.NideshopAdService;
import me.maweiyi.service.NideshopBrandService;
import me.maweiyi.service.NideshopCategoryService;
import me.maweiyi.service.NideshopChannelService;
import me.maweiyi.service.NideshopGoodsService;
import me.maweiyi.util.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NideshopIndexController {
  private static final Logger LOGGER = LoggerFactory.getLogger(NideshopIndexController.class);


  @Autowired
  private NideshopBrandService nideshopBrandService;

  @Autowired
  private NideshopCategoryService nideshopCategoryService;

  @Autowired
  private NideshopChannelService nideshopChannelService;

  @Autowired
  private NideshopGoodsService nideshopGoodsService;

  @Autowired
  private NideshopAdService nideshopAdService;
  @GetMapping(name = "/index")
  @ResponseBody
  public BaseResult nideshopIndex() {
    Map<String, Object> map = new HashMap<>();
    try {
      List<NideshopAd> nideshopAds = nideshopAdService.findAll();
      map.put("banner", nideshopAds);
      List<NideshopBrand> nideshopBrands = nideshopBrandService.listNideshopBrandBySortOrder(5);
      map.put("brandList", nideshopBrands);
      List<NideshopChannel> nideshopChannels = nideshopChannelService.findAll();
      map.put("channel", nideshopChannels);
      List<NideshopGoods> nideshopGoodsNew = nideshopGoodsService.isNew(true);
      map.put("newGoods", nideshopGoodsNew);
      List<NideshopGoods> nideshopGoodsHot = nideshopGoodsService.isHot(true);
      map.put("hotGoods", nideshopGoodsHot);
      List<NideshopCategory> nideshopCategoriesParent = nideshopCategoryService.listNideshopCategoryWithParentId();
      List<NideshopCategory> nideshopCategories = nideshopCategoryService.listNideshopCategoryAndNideshopGoods();
      List<NideshopCategory> nideshopCategoryList = new ArrayList<>();
      NideshopCategory comm = new NideshopCategory();
      for (NideshopCategory nideshopCategory: nideshopCategoriesParent) {
        for (NideshopCategory nideshopCategory1: nideshopCategories) {
          if (nideshopCategory.getId().equals(nideshopCategory1.getParentId())) {
            comm = nideshopCategory1;
            comm.setNideshopCategory(nideshopCategory);
          }
          nideshopCategoryList.add(comm);
        }
      }
      map.put("newCategoryList", nideshopCategoryList);
    } catch (Exception e) {
      LOGGER.error(e.toString());
      BaseResult.error(-1, "error");
    }
    return BaseResult.success(map, 1, "success");
  }
}
