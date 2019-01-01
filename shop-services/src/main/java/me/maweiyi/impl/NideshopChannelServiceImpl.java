package me.maweiyi.impl;

import java.util.List;
import me.maweiyi.entity.NideshopChannel;
import me.maweiyi.repository.NideshopChannelRepository;
import me.maweiyi.service.NideshopChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopChannelServiceImpl implements NideshopChannelService {

  @Autowired
  NideshopChannelRepository nideshopChannelRepository;

  @Override
  public List<NideshopChannel> findAll() {
    return nideshopChannelRepository.findAll();
  }
}
