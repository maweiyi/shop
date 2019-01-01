package me.maweiyi.impl;

import java.util.List;
import me.maweiyi.entity.NideshopAd;
import me.maweiyi.repository.NideshopAdRepository;
import me.maweiyi.service.NideshopAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopAdServiceImpl implements NideshopAdService {

  @Autowired
  private NideshopAdRepository nideshopAdRepository;

  @Override
  public NideshopAd findById(Integer id) {
    return nideshopAdRepository.getOne(id);
  }

  @Override
  public List<NideshopAd> findAll() {
    return nideshopAdRepository.findAll();
  }
}
