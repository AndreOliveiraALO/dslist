# DsList

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/AndreOliveiraALO/dslist/blob/main/LICENSE)

## 📌 Sobre o projeto

**DsList** é uma aplicação **API REST** construída em Java com Spring Boot, desenvolvida durante a **Semana DevSuperior**, promovida pela [DevSuperior](https://devsuperior.com).

A proposta é simular uma plataforma de catálogo e ranqueamento de jogos, com funcionalidades como listagem de games, categorização, detalhamento e movimentação de itens em listas. O sistema está estruturado em backend puro, preparado para integração com aplicações frontend (web/mobile).

---

## ✨ Funcionalidades e habilidades aplicadas no projeto

### 🔧 Estrutura e Arquitetura

* Backend em **Java 17** com **Spring Boot**
* Arquitetura **MVC** dividida em `Controller`, `Service`, `Repository`, `Domain`, `DTO`
* Implementação de **ORM** com JPA / Hibernate
* Projeto modular, pronto para escalabilidade e manutenção

### 🗓️ Banco de Dados e JPA

* Mapeamento de entidades e relacionamentos complexos, incluindo **Many-to-Many** com classe de associação (`@EmbeddedId`)
* Uso de **Projections** para otimizar consultas específicas
* **Seed de dados SQL** automatizado para ambiente de desenvolvimento

### 🌐 API RESTful

* Design de endpoints seguindo o padrão **REST**
* Implementação de verbos HTTP: `GET`, `POST`, `PUT`
* Operação especial de **reordenação de games na lista** via `sourceIndex` e `destinationIndex`
* Retorno estruturado com uso de **DTOs** para segurança e performance

### 🧩 Ambientes e Deploy

* Perfis configurados:

  * `test`: Banco H2 em memória. (Desenvolvimento e teste)
  * `dev`: PostgreSQL com Docker Compose local. (Homologação)
  * `prod`: Deploy via **Railway** com CI/CD configurado e banco PostgreSQL em container. (Produção) Obs.: Usando plano free no Railway, no qual há uma limitação mensal, que pode ser modificada pelo Railway.  
* Configuração de **CORS** para integração com aplicações frontend
* Processo de **CI/CD** para publicação contínua

---

## ✅ Endpoints disponíveis (produção)

### 📃 Buscar todos os games (resumido)

📌 `GET` [http://dslist-production-0079.up.railway.app/games](http://dslist-production-0079.up.railway.app/games)
![Todos games](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/EndPointBuscarTodosGames.png)

### 🔍 Buscar game por ID (detalhado)

📌 `GET` [http://dslist-production-0079.up.railway.app/games/1](http://dslist-production-0079.up.railway.app/games/1)
![Detalhes game](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/EndPointBuscaGameDetalhe.png)

### 📚 Buscar listas de categorias

📌 `GET` [http://dslist-production-0079.up.railway.app/lists](http://dslist-production-0079.up.railway.app/lists)
![Categorias](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/EndPointBuscaLista.png)

### 🗂️ Buscar games por categoria (id da lista)

📌 `GET` [http://dslist-production-0079.up.railway.app/lists/2/games](http://dslist-production-0079.up.railway.app/lists/2/games)
![Games por lista](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/EndPointGamesPorLista.png)

### 🔁 Reordenar game na lista (via JSON)

📌 `POST` [http://dslist-production-0079.up.railway.app/lists/2/replacement](http://dslist-production-0079.up.railway.app/lists/2/replacement)
![Reordenar game](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/EndPointMoveGameNaLista.png)

💡 Exemplo de JSON no `body` da requisição:

```json
{
  "sourceIndex": 1,
  "destinationIndex": 3
}
```

---

## 🧐 Modelo Conceitual

![Modelo MER](https://github.com/AndreOliveiraALO/Projetos/blob/main/Imagens/DSList/MER_ModeloEntidaRelacionamento.png)

---

## 🔧 Tecnologias utilizadas

### 🖥️ Back end

* Java 17+
* Spring Boot
* Spring Data JPA / Hibernate
* Maven

### 🛆 Infra e Deploy

* Railway
* PostgreSQL
* H2 Database (test)
* Docker Compose

---

## ▶️ Como executar o projeto

### Pré-requisitos: Java 17, Git

```bash
# Clonar o repositório
git clone https://github.com/AndreOliveiraALO/dslist

# Entrar na pasta do projeto
cd dslist

# Rodar o projeto
./mvnw spring-boot:run
```

---

## 👨‍💼 Autor

[![LinkedIn](https://img.shields.io/badge/-André%20Luiz%20de%20Oliveira-blue?logo=linkedin\&style=flat-square)](https://www.linkedin.com/in/andre-oliveira-a9a4281b0/)
