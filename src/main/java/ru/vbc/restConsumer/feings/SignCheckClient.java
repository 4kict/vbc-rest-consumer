package ru.vbc.restConsumer.feings;

import org.springframework.cloud.netflix.feign.FeignClient;
import ru.vbc.restConsumer.api.SignCheckService;

@FeignClient("vbc-sign-check")
public interface SignCheckClient extends SignCheckService {
}
