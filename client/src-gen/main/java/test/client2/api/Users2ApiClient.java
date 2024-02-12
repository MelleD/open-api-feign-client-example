package test.client2.api;

import org.springframework.cloud.openfeign.FeignClient;
import test.client2.config.ClientConfiguration;

@FeignClient(name="${users2.name:users2}", url="${users2.url:http://localhost}", configuration = ClientConfiguration.class)
public interface Users2ApiClient extends Users2Api {
}
