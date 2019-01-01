package me.maweiyi.impl;

import java.util.List;
import me.maweiyi.entity.NideshopCategory;
import me.maweiyi.repository.NideshopCategoryRepository;
import me.maweiyi.service.NideshopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopCategoryServiceImpl implements NideshopCategoryService {

  @Autowired
  NideshopCategoryRepository nideshopCategoryRepository;

  @Override
  public List<NideshopCategory> findAll() {
    return nideshopCategoryRepository.findAll();
  }

  @Override
  public List<NideshopCategory> listNideshopCategoryAndNideshopGoods() {
    return nideshopCategoryRepository.listNideshopCategoryAndNideshopGoods();
  }

  @Override
  public List<NideshopCategory> listNideshopCategoryWithParentId() {
    return nideshopCategoryRepository.listNideshopCategoryWithParentId();
  }
}
