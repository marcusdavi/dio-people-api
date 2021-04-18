package one.digitalinovation.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import one.digitalinovation.personapi.dto.PersonDTO;
import one.digitalinovation.personapi.dto.PhoneDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.entity.Phone;
import one.digitalinovation.personapi.enums.PhoneType;

public class EntityUtils {
	
	private static final PhoneType TYPE_PHONE = PhoneType.HOME;
	private static final String PHONE_NUMBER = "71999783688";
	private static final String BIRTH_DATE = "30-05-1986";
	private static final String CPF = "93580882066";
	private static final String LAST_NAME = "Argolo";
	private static final String FIRST_NAME = "Marcus";

	public static PersonDTO buildFakePersonDTO() {
		return PersonDTO.builder()
				.firstName(FIRST_NAME)
				.lastName(LAST_NAME)
				.cpf(CPF)
				.birthDate(BIRTH_DATE)
				.phones(Collections.singletonList(buildFakePhoneDTO()))
				.build();
	}

	public static PhoneDTO buildFakePhoneDTO() {
		return PhoneDTO.builder()
			.number(PHONE_NUMBER)
			.type(TYPE_PHONE)
			.build();
	}
	
	public static Person buildFakePerson() {
		return Person.builder()
				.id(1L)
				.firstName(FIRST_NAME)
				.lastName(LAST_NAME)
				.cpf(CPF)
				.birthDate(LocalDate.of(1986, 05, 30))
				.phones(Collections.singletonList(buildFakePhone()))
				.build();
	}

	public static Phone buildFakePhone() {
		return Phone.builder()
			.id(2L)
			.number(PHONE_NUMBER)
			.type(TYPE_PHONE)
			.build();
	}

}
