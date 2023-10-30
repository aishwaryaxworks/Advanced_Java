package com.xworks.collect.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworks.collect.dto.CountryDTO;
import com.xworks.collect.dto.PresidentDTO;
import com.xworks.collect.dto.WarDTO;

public class WarRunner {
	public static void main(String[] args) {
		// president data entry
		PresidentDTO pdto1 = new PresidentDTO(1, "Dritharashtra", 40, LocalDate.of(3229, 5, 3), LocalDate.of(3101, 8, 25));
		PresidentDTO pdto2 = new PresidentDTO(2, "John F. Kennedy", 50, LocalDate.of(1917, 5, 29), LocalDate.of(1963, 11, 22));
		PresidentDTO pdto3 = new PresidentDTO(3, "Deng Xiaoping", 38, LocalDate.of(1904, 8, 22), LocalDate.of(1997, 2, 19));
		PresidentDTO pdto4 = new PresidentDTO(4, "Xi Jinping", 60, LocalDate.of(1953, 6, 15), LocalDate.now());
		PresidentDTO pdto5 = new PresidentDTO(5, "Ito Hirobumi", 45, LocalDate.of(1841, 10, 16), LocalDate.of(1909, 10, 26));
		PresidentDTO pdto6 = new PresidentDTO(6, "Yamagata Aritomo", 56, LocalDate.of(1838, 6, 14), LocalDate.of(1922, 2, 1));
		PresidentDTO pdto7 = new PresidentDTO(7, "Takahashi Korekiyo", 68, LocalDate.of(1854, 7, 27), LocalDate.of(1936, 2, 26));
		PresidentDTO pdto8 = new PresidentDTO(8, "Park Chung-Hee", 39, LocalDate.of(1917, 11, 14), LocalDate.of(1979, 10, 26));
		PresidentDTO pdto9 = new PresidentDTO(9, "Roh Moo-hyun", 42, LocalDate.of(1946, 9, 1), LocalDate.of(2009, 5, 23));
		PresidentDTO pdto10 = new PresidentDTO(10, "Yoon Suk Yeol", 53, LocalDate.of(1960, 12, 18), LocalDate.now());
		PresidentDTO pdto11 = new PresidentDTO(11, "Angela Merkel", 39, LocalDate.of(1954, 7, 17), LocalDate.now());
		PresidentDTO pdto12 = new PresidentDTO(12, "Emmanuel Macron", 42, LocalDate.of(1977, 12, 21), LocalDate.now());
		PresidentDTO pdto13 = new PresidentDTO(13, "Boris Johnson", 53, LocalDate.of(1964, 6, 19), LocalDate.now());
		PresidentDTO pdto14 = new PresidentDTO(12, "Giuseppe Conte", 42, LocalDate.of(1964, 9, 5), LocalDate.now());
		PresidentDTO pdto15 = new PresidentDTO(13, "Pedro Sánchez", 53, LocalDate.of(1972, 2, 29), LocalDate.now());

		// Country data entry
		CountryDTO cdto1 = new CountryDTO(1, "India", pdto1, "Asia");
		CountryDTO cdto2 = new CountryDTO(2, "USA", pdto2, "America");
		CountryDTO cdto3 = new CountryDTO(3, "China", pdto3, "Asia");
		CountryDTO cdto4 = new CountryDTO(4, "China", pdto4, "Asia");
		CountryDTO cdto5 = new CountryDTO(5, "China", pdto5, "Asia");
		CountryDTO cdto6 = new CountryDTO(6, "Japan", pdto6, "Asia");
		CountryDTO cdto7 = new CountryDTO(7, "Japan", pdto7, "Asia");
		CountryDTO cdto8 = new CountryDTO(8, "Japan", pdto8, "Asia");
		CountryDTO cdto9 = new CountryDTO(9, "Korea", pdto9, "Asia");
		CountryDTO cdto10 = new CountryDTO(10, "Korea", pdto10, "Asia");
		CountryDTO cdto11 = new CountryDTO(11, "Korea", pdto11, "Asia");
		CountryDTO cdto12 = new CountryDTO(12, "France", pdto12, "Europe");
		CountryDTO cdto13 = new CountryDTO(13, "Germany", pdto13, "Europe");
		CountryDTO cdto14 = new CountryDTO(14, "Italy", pdto14, "Europe");
		CountryDTO cdto15 = new CountryDTO(15, "Spain", pdto15, "Europe");
		
		Collection<CountryDTO> country1 = new HashSet<CountryDTO>();
		country1.add(cdto1);
		
		Collection<CountryDTO> country2 = new HashSet<CountryDTO>();
		country2.add(cdto12);
		country2.add(cdto13);
		country2.add(cdto14);
		country2.add(cdto15);
		
		Collection<CountryDTO> country3 = new HashSet<CountryDTO>();
		country3.add(cdto9);
		country3.add(cdto10);
		country3.add(cdto11);
		
		Collection<CountryDTO> country4 = new HashSet<CountryDTO>();
		country4.add(cdto3);
		country4.add(cdto4);
		country4.add(cdto5);
		
		Collection<CountryDTO> country5 = new HashSet<CountryDTO>();
		country5.add(cdto6);
		country5.add(cdto7);
		country5.add(cdto8);
		
		Collection<CountryDTO> country6 = new HashSet<CountryDTO>();
		country6.add(cdto2);

		// war data entry
		WarDTO wdto1 = new WarDTO(1, "Kurukshetra",LocalDate.ofYearDay(1939, 53), LocalDate.ofYearDay(1945, 45), country1, "Pandavas");
		Collection<WarDTO> war1 = new HashSet<WarDTO>();
		war1.add(wdto1);
		
		WarDTO wdto2 = new WarDTO(2, "World War 2", LocalDate.ofYearDay(1789, 100), LocalDate.ofYearDay(1812, 50), country2, "France");
		Collection<WarDTO> war2 = new HashSet<WarDTO>();
		war2.add(wdto2);
		
		WarDTO wdto3 = new WarDTO(3, "World War 1", LocalDate.ofYearDay(1914, 265), LocalDate.ofYearDay(1917, 108), country4, "Britain, France, Russia");
		Collection<WarDTO> war3 = new HashSet<WarDTO>();
		war3.add(wdto3);
		
		WarDTO wdto4 = new WarDTO(4, "Korean war", LocalDate.ofYearDay(1568, 12), LocalDate.ofYearDay(1648, 5), country3, "North Korea");
		Collection<WarDTO> war4 = new HashSet<WarDTO>();
		war4.add(wdto4);
		
		WarDTO wdto5 = new WarDTO(5, "Sino Japanese war", LocalDate.ofYearDay(1701, 248), LocalDate.ofYearDay(1714, 78), country5, "Spain");
		Collection<WarDTO> war5 = new HashSet<WarDTO>();
		war5.add(wdto5);
		
		WarDTO wdto6 = new WarDTO(6, "American war", LocalDate.ofYearDay(1701, 248), LocalDate.ofYearDay(1714, 78), country6, "USA");
		Collection<WarDTO> war6 = new HashSet<WarDTO>();
		war6.add(wdto6);
		
		Collection<WarDTO> wars = new HashSet<WarDTO>();
		wars.add(wdto1);
		wars.add(wdto2);
		wars.add(wdto3);
		wars.add(wdto4);
		wars.add(wdto5);
		wars.add(wdto6);
		
		// find president by country names
		System.out.println("====================");
		System.out.println("<<<----Finding president by country names---->>>");
		List<PresidentDTO> prez1 = wars.stream()
				.flatMap(p -> p.getParticipants().stream())
				.filter(c -> c.getCountryName().equals("China"))
				.collect(Collectors.toList());
		prez1.forEach(p -> System.out.println(p));
				
		//collect countries by war
		System.out.println("====================");
		System.out.println("<<<----Collect all countries by war names---->>>");
		List<String> countriesAtWar = wars.stream()
				.filter(w -> w.getWarName().equals("Korean war"))
				.flatMap(c -> c.getParticipants().stream())
				.map(w -> w.getCountryName())
				.collect(Collectors.toList());
		countriesAtWar.forEach(c -> System.out.println(c));
		
		//collect all countries		
		System.out.println("====================");
		System.out.println("<<<----Collect all countries and print---->>>");
		List<CountryDTO> country = wars.stream()
				.flatMap(c -> c.getParticipants().stream())
				.collect(Collectors.toList());
		country.forEach(c -> System.out.println(c));
		
		System.out.println("====================");
		System.out.println("<<<----Collect all presidents and print---->>>");
		List<String> prez2 = wars.stream()
				.flatMap(p -> p.getParticipants().stream())
				.map(p -> p.getPresident().getName())
				.sorted((p1,p2) ->p1.compareTo(p2))
				.collect(Collectors.toList());
		prez2.forEach(p -> System.out.println(p));

		System.out.println("====================");
		System.out.println("<<<----Collect all by start date and end dates---->>>");
		LocalDate a = LocalDate.ofYearDay(1900, 1);
		LocalDate b = LocalDate.ofYearDay(2000, 1);
		List<String> countries = wars.stream()
				.filter(w -> w.getStartDate().isAfter(a) && w.getEndDate().isBefore(b))
				.flatMap(w -> w.getParticipants().stream())
				.map(p -> p.getCountryName())
				.collect(Collectors.toList());
		countries.forEach(w -> System.out.println(w));

	}
}
