package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("userShopController")
@RequestMapping("/user/shop")
@Slf4j
@Api(tags = "店铺相关接口")
public class ShopController {

    private static final String SKY = "SKY_SHOW_STATUS";

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取店铺的营业状态
     * @return
     */
    @GetMapping("/status")
    @ApiOperation(value = "获取店铺的营业状态")
    public Result status() {
        Integer status = (Integer) redisTemplate.opsForValue().get(SKY);
        log.info("获取店铺的营业状态：{}", status == 1 ? "营业" : "打烊中");
        return Result.success(status);
    }
}
