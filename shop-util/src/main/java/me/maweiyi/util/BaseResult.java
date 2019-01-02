package me.maweiyi.util;

import java.util.Collection;
import java.util.Map;
import lombok.Data;

@Data
public class BaseResult {

  private int code;
  private String message;
  private Map<String, Object> data;

  private BaseResult() {}

  public static BaseResult error(int code, String message) {
    BaseResult baseResult = new BaseResult();
    baseResult.setCode(code);
    baseResult.setMessage(message);
    return baseResult;
  }

  public static BaseResult success(int code, String message) {
    BaseResult baseResult = new BaseResult();
    baseResult.setCode(code);
    baseResult.setMessage(message);
    return baseResult;
  }

  public static BaseResult success(Map<String, Object> data, int code, String message) {
    BaseResult baseResult = new BaseResult();
    baseResult.setCode(code);
    baseResult.setMessage(message);
    baseResult.setData(data);
    return baseResult;
  }



}
