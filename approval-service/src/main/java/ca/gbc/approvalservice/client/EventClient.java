package ca.gbc.approvalservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "event-service", url ="${event.service.url}")
public interface EventClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/events/{id}/type")
    String getEventType(@PathVariable("id") String id);


}
