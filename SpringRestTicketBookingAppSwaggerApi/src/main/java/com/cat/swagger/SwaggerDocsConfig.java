package com.cat.swagger;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(title = "User API", version = "1.0", description = "API for managing users"),
    servers = @Server(url = "http://localhost:1991/TicketBookingApp1", description = "Local Server")
)
public class SwaggerDocsConfig 
{
	
}
