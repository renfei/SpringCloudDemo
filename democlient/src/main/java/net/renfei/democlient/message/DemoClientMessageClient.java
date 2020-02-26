package net.renfei.democlient.message;

import net.renfei.apicenter.message.MQChannel;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface DemoClientMessageClient {
    @Input(MQChannel.DEMOCLIENT)
    SubscribableChannel input();
}
