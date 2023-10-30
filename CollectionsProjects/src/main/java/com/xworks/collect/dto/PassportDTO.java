package com.xworks.collect.dto;

import java.time.LocalDate;

import com.xworks.collect.control.Type;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class PassportDTO {
	private Integer id;
	private String number;
	private LocalDate issuedDate;
	private LocalDate expiryDate;
	private String issuedBy;
	private Type type;

}
