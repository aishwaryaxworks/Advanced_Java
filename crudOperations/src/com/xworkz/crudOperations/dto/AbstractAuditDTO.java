package com.xworkz.crudOperations.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public abstract class AbstractAuditDTO implements Serializable {
	private String whoCreated;
	private LocalDateTime whenCreated;
	private String whoUpdated;
	private LocalDateTime whenUpdated;
}
