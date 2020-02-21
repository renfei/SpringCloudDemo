package net.renfei.demoservice.controller;

import net.renfei.apicenter.request.DemoRquest;
import net.renfei.apicenter.result.Result;
import net.renfei.apicenter.service.DemoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoService {
    @Override
    public Result index() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("You're visiting DemoService.");
        return result;
    }

    @Override
    public Result sayMsg(@RequestBody DemoRquest demoRquest) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("This is DemoService, Your Mag is: " + demoRquest.getMsg());
        return result;
    }
}
