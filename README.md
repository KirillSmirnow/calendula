# Creating Spring Boot Starter with Spring Boot 3

Now auto-configurations of a starter must be registered
in `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` file,
not in `META-INF/spring.factories` as before Spring Boot 3
[(doc)](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide#auto-configuration-files)
