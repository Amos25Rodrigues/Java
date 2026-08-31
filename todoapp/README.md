# Todo App com Swing + SQLite + Maven + jpackage

## Como executar

```bash
mvn clean package
java -jar target/todoapp-1.0.0.jar
```

## Como empacotar com jpackage

No Windows:

```powershell
jpackage --type exe --name TodoApp --input target --main-jar todoapp-1.0.0.jar --main-class com.todoapp.App --dest dist --win-console false
```

## Requisitos

- JDK 25 ou compatível
- Maven
- SQLite JDBC
