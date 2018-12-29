package me.maweiyi.impl;

import me.maweiyi.NideshopService;
import me.maweiyi.dao.NideshopAd;
import me.maweiyi.mapper.NideshopAdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopServiceImpl implements NideshopService {

  @Autowired
  private NideshopAdMapper nideshopAdMapper;

  @Override
  public NideshopAd findNideshopAdById(Integer id) {
    return nideshopAdMapper.selectByPrimaryKey(id);
  }
}
