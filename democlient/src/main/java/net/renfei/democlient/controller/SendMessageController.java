package net.renfei.democlient.controller;

import net.renfei.democlient.message.DemoServiceMessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    @Autowired
    private DemoServiceMessageClient demoServiceMessageClient;

    @GetMapping("/sendMessage")
    public void sendMessage(){
        demoServiceMessageClient.output().send(
                MessageBuilder.withPayload("This is a message from democlient").build()
        );
    }
}
