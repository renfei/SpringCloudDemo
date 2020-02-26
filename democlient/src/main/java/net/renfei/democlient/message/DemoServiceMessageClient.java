package net.renfei.democlient.message;

import net.renfei.apicenter.message.MQChannel;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * DemoService的MQ频道客户端
 *
 * @author RenFei
 */
public interface DemoServiceMessageClient {
    @Output(MQChannel.DEMOSERVICE)
    MessageChannel output();
}
