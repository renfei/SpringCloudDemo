package net.renfei.democlient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import net.renfei.apicenter.request.DemoRquest;
import net.renfei.apicenter.result.Result;
import net.renfei.democlient.client.DemoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class DemoClientController {
    @Autowired
    private DemoServiceClient demoServiceClient;

    @GetMapping("/")
    @HystrixCommand(
            fallbackMethod = "fallbackMethod",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  //启用熔断
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),  //10秒内多少个请求才会起作用
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000"),  //熔断窗口时间
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误阈值百分比
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10")  //超时时间
            })
    public String getDemoService() {
        DemoRquest demoRquest = new DemoRquest();
        demoRquest.setMsg("This DemoRquest.Msg From DemoClientController.");
        Result result = demoServiceClient.sayMsg(demoRquest);
        return "You're visiting DemoClient. Call DemoService:{" + result.getMessage() + "}";
    }

    public String fallbackMethod() {
        return "DemoService服务有点问题，请稍后再试";
    }

    public String defaultFallback() {
        return "这是默认的Fallback方法";
    }
}
