package test.client1.api;

import org.springframework.cloud.openfeign.FeignClient;
import test.client1.config.ClientConfiguration;

@FeignClient(name="${users1.name:users1}", url="${users1.url:http://localhost}", configuration = ClientConfiguration.class)
public interface Users1ApiClient extends Users1Api {
}
