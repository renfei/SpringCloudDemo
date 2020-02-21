package net.renfei.democlient.controller;

import net.renfei.apicenter.request.DemoRquest;
import net.renfei.apicenter.result.Result;
import net.renfei.democlient.client.DemoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClientController {
    @Autowired
    private DemoServiceClient demoServiceClient;

    @GetMapping("/")
    public String getDemoService() {
        DemoRquest demoRquest = new DemoRquest();
        demoRquest.setMsg("This DemoRquest.Msg From DemoClientController.");
        Result result = demoServiceClient.sayMsg(demoRquest);
        return "You're visiting DemoClient. Call DemoService:{" + result.getMessage() + "}";
    }
}
