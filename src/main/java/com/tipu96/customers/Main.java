package com.tipu96.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet(){
        return new GreetResponse("Greetings", List.of("GoLang", "Java", "Javascript"), new Person("Umar", 21, 20_000));
    }

    record Person (String name, int age, double savings){}
    record GreetResponse(String greet, List<String> favouruteProgrammingLanguages, Person person){}
//    public class GreetResponse{
//    public GreetResponse(String greet) {
//        this.greet = greet;
//    }
//
//    public String getGreet() {
//        return greet;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GreetResponse that = (GreetResponse) o;
//        return Objects.equals(greet, that.greet);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(greet);
//    }
//
//    @Override
//    public String toString() {
//        return "GreetResponse{" +
//                "greet='" + greet + '\'' +
//                '}';
//    }
//
//    private final String greet;
//    }
}
