package demo;

import javax.inject.Singleton;

@Singleton
public class HelloService {

    public String hello() {
        return "Hello World!";
    }
}
