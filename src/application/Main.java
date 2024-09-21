package application;

import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Animal animal1 = new Animal("Myke", 10, 25.57, "Diurno", "Onívaro");

		System.out.print("==== Animal ====");
		System.out.println(animal1);

		System.out.println();

		Cachorro cachorro = new Cachorro("Pitoco", 2, 5.43, "Diurno", "Onívoro", "Marrom", "Pischer", "Pequeno");

		System.out.print("==== Cachorro ====");
		System.out.println(cachorro);
		
		System.out.println();

		System.out.println("Qual som o animal faz: ");

		animal1.emitirSom(sc.next());

		System.out.println();
		System.out.println("Qual som o cachorro faz: ");

		cachorro.emitirSom(sc.next());

		sc.close();
	}
}
