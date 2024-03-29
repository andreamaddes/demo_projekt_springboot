package ch.zhaw.springboot.demo_projekt_springboot;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController

public class PersonController {

    private Map<Integer, Person> persons = new HashMap<>();

    @EventListener(ApplicationReadyEvent.class)
    public void init () {
      this.persons.put(1,new Person(1, "Barack Obama"));
      this.persons.put(2,new Person(2, "Donald Trum"));
      this.persons.put(3,new Person(3, "Andrea Maddes"));
    System.out.println("Init Data");
    }

@GetMapping("/person/{id}")
public Person getPerson (@PathVariable Integer id){
    return this.persons.get(id);
}

}
