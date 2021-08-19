package github.jaisonrobson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("github.jaisonrobson")
@EnableWebMvc
public class RootConfig {

}
