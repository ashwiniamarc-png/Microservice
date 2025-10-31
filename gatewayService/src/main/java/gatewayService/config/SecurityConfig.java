package gatewayService.config;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
	import org.springframework.security.config.web.server.ServerHttpSecurity;
	import org.springframework.security.web.server.SecurityWebFilterChain;

	@Configuration
	@EnableWebFluxSecurity
	public class SecurityConfig {

	    @Bean
	    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
	        http
	            .csrf(ServerHttpSecurity.CsrfSpec::disable)
	            .authorizeExchange(ex -> ex
	                .pathMatchers("/login").permitAll()
	                .anyExchange().authenticated()
	            )
	            .httpBasic(); // basic authentication

	        return http.build();
	    }
	}


