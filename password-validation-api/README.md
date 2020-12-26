# Nome do projeto

Essa API tem a função de validar a senha recebida de acordo com as regras pré requeridas:
- Nove ou mais caracteres;
- Ao menos 1 dígito;
- Ao menos 1 letra minúscula;
- Ao menos 1 letra maiúscula;
- Ao menos 1 caractere especial:
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto.

# Git

- https://github.com/AndersonMuniz/backendChallenge

# Archetype

- Java 11 com spring boot frameworks;
- Logs de aplicação produzido pelo Log4J;

# Configuração para Desenvolvimento

- A instrução para execução é copiar o projeto para a sua máquina local e testar a aplicação local
- O Start deve ser feito pela clase Application;

# Histórico de Lançamento

- 0.0.1 - Versão inicial

# Meta

- Anderson Muniz - anderson_c_m@yahoo.com.br

# Contribuição

- Fiquem a vontade para melhorar o código, crie uma nova Branch e solicite uma pull. Eu avalio e vendo que a solução irá melhorar o código aprovo.

# Endpoints

- /api/password/v1/validation?password=<valor>

# Solução

- Tentei utilizar apenas os conhecimentos adquiridos até o momento para chegar a proposta de solução. A lógica utilizada foi de armazenar a senha em um Array e validar os caracteres necessários para retornar se a String é válida ou não.
- Ao executar o projeto é criado um arquivo na pasta do projeto com o nome password-validation-api, este arquivo é onde ficam armazendos os Log (configurado inicialmente para "INFO"). O Log irá gerar um novo arquivo quando o atual atingir com o tamanho de 50 Megas com no máximo 10 versões, após isso é sobrescrita a versão mais antiga 