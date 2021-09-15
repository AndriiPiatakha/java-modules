package com.itbulls.app;

import com.itbulls.greetings.Greetings;
import com.itbulls.greetings.ServiceStatusLogger;
import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        Greetings.sayHello();
        
        // consuming Service example
        Iterable<ServiceStatusLogger> services = ServiceLoader.load(ServiceStatusLogger.class);
        ServiceStatusLogger service = services.iterator().next();
        service.printServiceStatusLog();
    }
}