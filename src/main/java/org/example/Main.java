package org.example;

import java.io.IOException;

// GET /calculate?operand1=11&operator=*&operand2=55
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.printf("Hello and welcome!");

		new CustomWebApplicationServer(8080).start();
	}
}