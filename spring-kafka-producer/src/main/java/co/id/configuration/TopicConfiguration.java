package co.id.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {
    public NewTopic newTopic() {
        return TopicBuilder.name("mytopic").build();
    }
}