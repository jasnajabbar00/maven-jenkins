package com.example.demo.entity;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name="jasna1_employee_details")
public class EmployeeDetails {

	@Id
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@SequenceGenerator(name = "jasnaSeq1", sequenceName = "sequence", initialValue = 101, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jasnaSeq1")
	@Column(name="emp_designation_id")
	int empDesignationId;
	
    @DateTimeFormat(iso=ISO.DATE)
	@Column(name="date_of_joining")
    LocalDate dateOfJoining;
	
//	@OneToOne(cascade=CascadeType.ALL) 
//	@JoinColumn(name="emp_designation_id")
//	EmployeeDesignation empDesig;
}
