# API Gerenciador de cadastros
 

# Sobre o projeto

API Rest desenvolvida em java, com o framework spring, o objetivo é gerenciar cadastros de pessoas,
a API possue os metodos HTTP: GET, PUT, POST E DELETE.

### GET (/pessoas)
Este método retorna um array de objetos json de pessoas cadastradas.

### POST (/pessoa/cadastrar)
Este método retorna o objeto json criado, deve-se inserir uma requestBody.
exemplo:
{
    "nome":"Alan",
    "dataNascimento": "23/06/1912",
    "endereco": {
        "logradouro":"rua",
        "cidade": "Londres",
        "cep": "123",
        "numero": "123456"
    }
}

### PUT (/pessoa/{id})
Este método retorna o objeto atualizado. 
Exemplo:
{
    "nome":"Alan Turing",
    "dataNascimento": "23/06/1912",
    "endereco": {
        "logradouro":"rua",
        "cidade": "Westminster",
        "cep": "19",
        "numero": "54"
    }
}

### DELETE (/pessoa/{id})
Este metodo deleta da base de dados um registro do id informado na requestBody.
Exemplo:
{
    "id": 1
}


# Tecnologias utilizadas
- Java 11
- Maven
- Spring
- vsCode
- H2 DataBase
- Postman


# Autor

Marcello Joaquim da Silva

linkedin.com/in/marcello-joaquim-da-silva-6814bb69