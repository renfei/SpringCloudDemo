package net.renfei.democlient.client;

import net.renfei.apicenter.service.DemoService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "DemoService")
public interface DemoServiceClient extends DemoService {
}
