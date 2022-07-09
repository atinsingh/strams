package io.pragra.learning.main;

public class SpanishGreeing implements Greeting{
    @Override
    public String greeting(String name) {
        return "Hola "+ name +"!";
    }
}
