package com.example.demomap;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.demomap", "com.apus.base"})
@SecurityScheme(name = "Authorization", scheme = "basic", type = SecuritySchemeType.APIKEY, in = SecuritySchemeIn.HEADER)
@OpenAPIDefinition(info = @Info(title = "EXAMPLE API", version = "1.0"),
        servers = {@Server(url = "/", description = "Default Server URL")},
        security = {@SecurityRequirement(name = "Authorization")})
@EnableFeignClients
@EnableDiscoveryClient
public class DemoMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMapApplication.class, args);
    }

}
