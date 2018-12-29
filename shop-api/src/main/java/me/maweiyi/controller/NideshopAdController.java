package me.maweiyi.controller;


import me.maweiyi.NideshopService;
import me.maweiyi.dao.NideshopAd;
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
  NideshopService nideshopService;

  @RequestMapping("/banner")
  @ResponseBody
  public NideshopAd nideshopAd() {
    return nideshopService.findNideshopAdById(1);
  }

}
