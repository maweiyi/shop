package me.maweiyi.service;

import java.util.List;
import me.maweiyi.entity.NideshopGoods;

public interface NideshopGoodsService {
  List<NideshopGoods> isHot(Boolean isHot);
  List<NideshopGoods> isNew(Boolean isNew);
}
