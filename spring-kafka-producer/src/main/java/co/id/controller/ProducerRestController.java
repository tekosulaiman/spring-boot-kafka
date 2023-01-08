package co.id.controller;

import co.id.payload.request.ProducerRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerRestController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public ProducerRestController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping("/api/v1/messagepublish")
    public void publish(@RequestBody ProducerRequest request){
        kafkaTemplate.send("mynewtopic", "Message Value From New Topic");
    }
}