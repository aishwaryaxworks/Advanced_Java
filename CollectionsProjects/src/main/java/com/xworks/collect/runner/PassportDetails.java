package com.xworks.collect.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.xworks.collect.control.Type;
import com.xworks.collect.dto.PassportDTO;
import com.xworks.collect.dto.PersonDTO;

public class PassportDetails {

	public static void main(String[] args) {
		PersonDTO person1 = new PersonDTO(1,"Aishwarya","vnaish040697@gmail.com",987654321L);
		PersonDTO person2 = new PersonDTO(2,"Ravi","abc@gmail.com",8754621984L);
		PersonDTO person3 = new PersonDTO(3,"Sarvesh","xyz@gmail.com",987654821L);
		PersonDTO person4 = new PersonDTO(4,"Hari","cde@gmail.com",854654321L);
		PersonDTO person5 = new PersonDTO(5,"Sagar","jkl@gmail.com",668765321L);
		
		PassportDTO passport1 = new PassportDTO(1, "R987654", LocalDate.of(2012, 1, 12), LocalDate.of(2022, 1, 11), "Govt. of India", Type.DIPLOMATIC);
		PassportDTO passport2 = new PassportDTO(2, "S862656", LocalDate.of(2012, 1, 12), LocalDate.of(2024, 1, 11), "Govt. of India", Type.DIPLOMATIC);
		PassportDTO passport3 = new PassportDTO(3, "T326216", LocalDate.of(2012, 1, 12), LocalDate.of(2023, 1, 11), "Govt. of India", Type.DIPLOMATIC);
		PassportDTO passport4 = new PassportDTO(4, "U146541", LocalDate.of(2012, 1, 12), LocalDate.of(2022, 1, 11), "Govt. of India", Type.DIPLOMATIC);
		PassportDTO passport5 = new PassportDTO(5, "V686515", LocalDate.of(2012, 1, 12), LocalDate.of(2025, 1, 11), "Govt. of India", Type.DIPLOMATIC);
		
		Map<PersonDTO, PassportDTO> pp = new HashMap<PersonDTO, PassportDTO>();
		pp.put(person1, passport1);
		pp.put(person2, passport2);
		pp.put(person3, passport3);
		pp.put(person4, passport4);
		pp.put(person5, passport5);
		
		Collection<Entry<PersonDTO,PassportDTO>> pp1 = pp.entrySet();
		
		//collect all persons dtos
		pp1.stream().map(c -> c.getKey()).forEach(p -> System.out.println(p));
		
		//collect all passport dtos
		pp1.stream().map(c -> c.getValue()).forEach(p -> System.out.println(p));
		
		//finding first person
		Optional<PersonDTO> pers1 = pp.keySet().stream().filter(p -> p.getName().equals("Abd")).findFirst();
		if(pers1.isPresent()) {
			PersonDTO dto = pers1.get();
		}
		
		//collect passport by type
		pp.values().stream().filter(p -> p.getType().equals(Type.DIPLOMATIC)).forEach(p -> System.out.println(p));
		
		// all passport by issue date < today's date & not expired
		pp.values().stream().filter(p -> p.getIssuedDate().isBefore(LocalDate.now()) && p.getExpiryDate().isAfter(LocalDate.now()))
		.forEach(p -> System.out.println(p));
		
		//Collect all expired passports
		pp.values().stream().filter(p -> p.getExpiryDate().isBefore(LocalDate.now())).forEach(p -> System.out.println(p));
		
		//person by name
		pp.keySet().stream().filter(n -> n.getName().equals("Aishwarya")).forEach(n -> System.out.println(n));
		
		//passport by number
		pp.values().stream().filter(p -> p.getNumber().equals("V686515")).forEach(p -> System.out.println(p));
	}

}
