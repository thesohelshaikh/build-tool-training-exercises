/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gradle.lab;

//import com.gradle.lab.old.OldMessage;

public class App {
    private static Message HELLO = new Message("Hello World!");
    public String getGreeting() {
        return HELLO.getTextWithTime();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(HELLO.hasWhitespace());
        System.out.println(HELLO.getTextHash());
        //System.out.println(new OldMessage("hello there").hasWhitespace());
    }
}
