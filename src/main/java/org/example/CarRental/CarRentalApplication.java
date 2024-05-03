package org.example.CarRental;

import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Scanner;

import java.util.List;
import java.util.concurrent.Executors;

@Controller
@SpringBootApplication
public class CarRentalApplication implements CommandLineRunner{
	@Autowired
	private CarsRepository carsRepository;

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CarRentalApplication.class, args);
	}


		@Override
		public void run(String... args){
			try {
				HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
				server.createContext("/", new BasicHttpHandler());
				server.setExecutor(Executors.newFixedThreadPool(10));
				server.start();
				System.out.println("Server started");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("serwer nie wystartował");
			}

			List<Cars> cars = carsRepository.findAll();

			System.out.printf
					("Wybierz interesującą Cię sprawę:%n" +
							"1. Zaloguj się%n" +
							"2. Zarejestruj się%n" +
							"3. Wypożycz auto%n" +
							"4. Sprawdź ofertę%n");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			switch (input) {
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
					if (answer.equals("T")) {
						for(Cars car : cars){
							System.out.println(car);
						}
					}
					break;
			}

		}
	}




//	@Bean
//	ApplicationRunner applicationRunner(CarsRepository carsRepository){
//		return args -> {
//			carsRepository.findAll().forEach(System.out::println);
//		};
//	}}
//
//	@Bean
//	ApplicationRunner applicationRunnerAddress(AddressRepository addressRepository){
//		return args -> {
//			addressRepository.findAll().forEach(System.out::println);
//		};
//	}

