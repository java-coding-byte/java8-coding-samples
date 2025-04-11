package com.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPersonInYears {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1978, 02, 01);

		System.out.println("Birthday.." + birthday);

		LocalDate today = LocalDate.now();

		System.out.println("Today.." + today);

		System.out.println(ChronoUnit.YEARS.between(birthday, today));

	}

}
