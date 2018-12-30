package me.maweiyi.controller;


import me.maweiyi.entity.NideshopAd;
import me.maweiyi.service.NideshopAdService;
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
  NideshopAdService nideshopAdService;

  @RequestMapping("/index")
  @ResponseBody
  public NideshopAd nideshopAd() {
    return nideshopAdService.findById(1);
  }

}
