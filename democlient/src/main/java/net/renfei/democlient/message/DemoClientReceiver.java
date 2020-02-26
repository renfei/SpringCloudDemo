package net.renfei.democlient.message;

import lombok.extern.slf4j.Slf4j;
import net.renfei.apicenter.message.MQChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * DemoClient消息队列接收端
 *
 * @author RenFei
 */
@Slf4j
@EnableBinding({DemoClientMessageClient.class, DemoServiceMessageClient.class})
public class DemoClientReceiver {
    @StreamListener(MQChannel.DEMOCLIENT)
    public void process(Object message) {
        log.info("DemoClientReceiver received a reply:{}", message);
    }
}
