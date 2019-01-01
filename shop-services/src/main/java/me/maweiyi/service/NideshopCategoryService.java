package me.maweiyi.service;

import java.util.List;
import me.maweiyi.entity.NideshopCategory;

public interface NideshopCategoryService {

  List<NideshopCategory> findAll();

  List<NideshopCategory> listNideshopCategoryAndNideshopGoods();

  List<NideshopCategory> listNideshopCategoryWithParentId();

}
