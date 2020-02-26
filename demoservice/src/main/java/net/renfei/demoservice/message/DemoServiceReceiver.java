package net.renfei.demoservice.message;

import lombok.extern.slf4j.Slf4j;
import net.renfei.apicenter.message.MQChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 服务端监听消息队列
 *
 * @author RenFei
 */
@Slf4j
@Component
@EnableBinding({DemoServiceMessageClient.class, DemoClientMessageClient.class})
public class DemoServiceReceiver {
    @StreamListener(MQChannel.DEMOSERVICE)
    @SendTo(MQChannel.DEMOCLIENT)
    public String process(Object message) {
        log.info("Messages received by the DemoService:{}", message);
        return "This is DemoServiceReceiver's reply";
    }
}
