package me.maweiyi.controller;


import java.util.List;
import me.maweiyi.entity.NideshopCategory;
import me.maweiyi.service.NideshopCategoryService;
import me.maweiyi.service.NideshopGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NideshopAdController {

  private static final Logger LOGGER = LoggerFactory.getLogger(NideshopAdController.class);

  @Autowired
  private NideshopGoodsService nideshopGoodsService;

  @Autowired
  private NideshopCategoryService nideshopCategoryService;
  @RequestMapping("/index")
  @ResponseBody
  public List<NideshopCategory> nideshopAd() {
    return nideshopCategoryService.listNideshopCategoryAndNideshopGoods();
  }

}
