package one.digitalinovation.personapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import one.digitalinovation.personapi.dto.PersonDTO;
import one.digitalinovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.repository.PersonRepository;
import one.digitalinovation.personapi.utils.EntityUtils;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@InjectMocks
	private PersonService personService;
	
	@Mock
	private PersonRepository personRepository;
	
	@Test
	public void testdeveRetornarMensagemDeSucessoAoCadastrarUmaPessoa() { 
		
		PersonDTO personDTO = EntityUtils.buildFakePersonDTO();
		Person person = EntityUtils.buildFakePerson();
		
		Mockito.when(personRepository.save(Mockito.any())).thenReturn(person);
		
		MessageResponseDTO response = personService.createPerson(personDTO);
		
		assertEquals("Created person with ID 1", response.getMessage());
		
	}

}
