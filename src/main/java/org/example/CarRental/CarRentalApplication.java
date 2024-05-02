package org.example.CarRental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

import java.util.List;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args)
	{
		System.out.printf
				("Wybierz interesującą Cię sprawę:%n" +
				"1. Zaloguj się%n" +
				"2. Zarejestruj się%n" +
				"3. Wypożycz auto%n" +
				"4. Sprawdź ofertę%n");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		switch (input){
			case 1:
				System.out.println("Podaj login i hasło");
				break;
			case 2:
				System.out.println("W celu założenia konta podaj swoje dane");
				break;
			case 3:
				System.out.println("Wybierz jakie auto chcesz wypożyczyć");
				break;
			case 4:
				System.out.println("Czy wyświetlić wszystkie samochody? Wybierz T (tak) lub N (nie)");
				String answer = scanner.next();
				if (answer.equals("T")){

				}
		}

		SpringApplication.run(CarRentalApplication.class, args);

	}

	@Bean
	ApplicationRunner applicationRunner(CarsRepository carsRepository){
		return args -> {
			carsRepository.findAll().forEach(System.out::println);
		};
	}

	@Bean
	ApplicationRunner applicationRunnerAddress(AddressRepository addressRepository){
		return args -> {
			addressRepository.findAll().forEach(System.out::println);
		};
	}
}
ssh-keygen -t rsa -b 4096 -C „minkowskikamil@gmail.com"ssh-keygen -t rsa -b 4096 -C „minkowskikamil@gmail.com"