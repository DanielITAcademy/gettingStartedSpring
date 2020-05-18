package com.ITAcademy.restproject.Controllers;
import java.util.concurrent.atomic.AtomicLong;


//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.restproject.models.Greeting;

	@RestController
	public class GreetingController {

		private static final String template = "Hello,%s! ";

	    private final AtomicLong counter = new AtomicLong();
	    // Crea una petició GET amb direcció a "/" que com a resposta retorni un "HELLO WORLD"
	    @RequestMapping("/helloworldprueba")
	    public Greeting greetings(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),String.format(template, name));
	    }
	
	}
	
	
	
