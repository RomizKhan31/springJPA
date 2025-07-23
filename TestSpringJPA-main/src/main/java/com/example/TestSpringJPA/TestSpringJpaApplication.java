// Beginner friendly version with basic input example
package com.example.TestSpringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringJpaApplication.class, args);
	}


        // Basic input example after program finishes
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", age " + age + "! Thanks for using this program.");
                
}
