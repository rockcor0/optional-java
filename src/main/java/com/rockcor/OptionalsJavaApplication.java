package com.rockcor;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rockcor.service.Juego;

@SpringBootApplication
public class OptionalsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptionalsJavaApplication.class, args);
		
		optional();
	}
	
	private static void optional() {
		
		Optional<Juego> warcraft = Optional.ofNullable(getGame(false));
		Optional<Juego> pokemon = Optional.ofNullable(getGame(true));
		
		System.out.println(">> " + warcraft.get().getName());
		
		//This line throw the exception NoSuchElementException, because pokemon is null
		//System.out.println(pokemon.get().getName());
		
		System.out.println(">> warcraft.isPresent: " + warcraft.isPresent());
		System.out.println(">> pokemon.isPresent: " + pokemon.isPresent());
		
		System.out.println(">> warcraft.isEmpty: " + warcraft.isEmpty());
		System.out.println(">> pokemon.isEmpty: " + pokemon.isEmpty());
		
		warcraft.isPresent();

	}
	
	private static Juego getGame(boolean isEmpty){
		
		if(isEmpty)
			return null;
		else
			return new Juego("World of warcraft", "PC", true);
	}

}
