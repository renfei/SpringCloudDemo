package net.renfei.demoservice.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DemoClientMessageClient {
    @Output
    MessageChannel output();
}
