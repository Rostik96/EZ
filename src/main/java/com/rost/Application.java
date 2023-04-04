package com.rost;

import java.sql.SQLException;
import java.util.stream.Stream;

import org.h2.tools.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.rost.service.PeopleService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class Application {
	private final PeopleService service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> service.index().forEach(System.out::println);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		return Server.createTcpServer(
				"-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
	}
}
