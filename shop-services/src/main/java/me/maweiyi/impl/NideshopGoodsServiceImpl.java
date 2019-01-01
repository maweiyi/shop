package me.maweiyi.impl;

import java.util.List;
import me.maweiyi.entity.NideshopGoods;
import me.maweiyi.repository.NideshopGoodsRepository;
import me.maweiyi.service.NideshopGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopGoodsServiceImpl implements NideshopGoodsService {

  @Autowired
  NideshopGoodsRepository nideshopGoodsRepository;

  @Override
  public List<NideshopGoods> isHot(Boolean isHot) {
    return nideshopGoodsRepository.findNideshopGoodsByIsHot(isHot);
  }

  @Override
  public List<NideshopGoods> isNew(Boolean isNew) {
    return nideshopGoodsRepository.findNideshopGoodsByIsNew(isNew);
  }
}
