package me.maweiyi.service;

import java.util.List;
import me.maweiyi.entity.NideshopAd;

public interface NideshopAdService {

  NideshopAd findById(Integer id);

  List<NideshopAd> findAll();

}
