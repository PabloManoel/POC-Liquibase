# POC Liquibase em um projeto java via Spring Boot

> Em desenvolvimento

---
## Build e execução

### Criação/execução do container mySQL

```bash
docker run -d -p 3306:3306\
 --name mysql_pizzaweb\
 -e MYSQL_ROOT_PASSWORD=RootPassword\
 -e MYSQL_DATABASE=pizzaweb\
 -e MYSQL_USER=admin\
 -e MYSQL_PASSWORD=admin123 mysql:5.7
```

### Parar execução do container
```
Docker stop mysql_pizzaweb
```

---
## Links úteis

---
## Autor

--- 
--- 
--- 
## tarefas

- ~~criar banco docker mysql~~
- ~~criar conexão jpa com hibernate~~
- configurar liquibase
- adicionar scripts via liquibase