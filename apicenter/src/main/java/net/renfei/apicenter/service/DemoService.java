package net.renfei.apicenter.service;

import net.renfei.apicenter.request.DemoRquest;
import net.renfei.apicenter.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface DemoService {
    @GetMapping("/")
    Result index();
    @PostMapping("/sayMsg")
    Result sayMsg(DemoRquest demoRquest);
}
