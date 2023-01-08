package co.id.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerComponent {
    @KafkaListener(topics = "mytopic", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data);
    }
}