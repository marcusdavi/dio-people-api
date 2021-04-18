# People API
API-REST com Spring Boot - Desenvolvida no Bootcamp Code Anywhere da Digital Innovation One

## 1. Running
Após clonar o projeto;

1. Importar na IDE de sua preferência (Import Maven Projects);

2. Maven Build: clean install

3. Run as SpringBoot Application

4. Acesso:
* http://localhost:8080/api/v1/people/{endpoint}

## 2. Endpoints

### People
**1. GET /{id}** - Detalha a pessoa do id informado;

**2. GET /** - Lista todas as pessoas cadastradas;

**3. DELETE /{id}** - Deleta a pessoa do id informado;

**4. POST /category** - Cria uma pessoa.
*RequestBody:*
```
{
	"firstName": "string",
	"lastName": "string",
	"cpf": "string",
  "birthDate": "string",
	"phones": [
		{
			"type": "string",
			"number": "string"
		}
	]
}
```

**5. PUT /category** - Cria uma pessoa.
*RequestBody:*
```
{
  "id": int,
	"firstName": "string",
	"lastName": "string",
	"cpf": "string",
  "birthDate": "string",
	"phones": [
		{
      "id": int,
			"type": "string",
			"number": "string"
		}
	]
}

