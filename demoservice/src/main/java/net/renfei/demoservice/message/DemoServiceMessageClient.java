package net.renfei.demoservice.message;

import net.renfei.apicenter.message.MQChannel;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DemoServiceMessageClient {
    @Input(MQChannel.DEMOSERVICE)
    SubscribableChannel input();
}
