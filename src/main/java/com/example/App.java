package com.example;

public class App {
    
    
    public String checkEvenOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        App app = new App();
        
        System.out.println("Check 7: " + app.checkEvenOdd(7));
    }
}