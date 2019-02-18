package cn.edidada.scan.config;
   
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; 

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"cn.edidada.scan.controll"})
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {

	@Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("wdidada", "https://www.edidada.cn", "testedidada@icloud.com");
        return new ApiInfo("blog front end API",//main title
                "swagger test demo",//sub title
                "0.0.1",//version
                "www.edidada.cn",//termsOfServiceUrl
                contact,//author
                "Blog",//link show words
                "https://www.edidada.cn"// website link
        );
    }
	
	  
}