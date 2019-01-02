package me.maweiyi.impl;

import java.util.List;
import me.maweiyi.entity.NideshopBrand;
import me.maweiyi.repository.NideshopBrandRepository;
import me.maweiyi.service.NideshopBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopBrandServiceImpl implements NideshopBrandService {

  @Autowired
  NideshopBrandRepository nideshopBrandRepository;

  @Override
  public List<NideshopBrand> findAll() {
    return nideshopBrandRepository.findAll();
  }

  @Override
  public List<NideshopBrand> listNideshopBrandBySortOrder(Integer value) {
    return nideshopBrandRepository.listNideshopBrandBySortOrder(value);
  }
}
