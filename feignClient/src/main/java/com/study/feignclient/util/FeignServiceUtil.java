package com.study.feignclient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.study.feignclient.util
 * fileName       : FeignServiceUtil
 * author         : heon
 * date           : 2024-02-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-26           heon               최초 생성
 */
@FeignClient(value = "feignDemo", url="http://localhost:8082/user")
public interface FeignServiceUtil {

    @GetMapping("name")
    String getName();

    @GetMapping("address")
    String getAddress();

    @GetMapping("status")
    String getStatus();
}
