# spring_swaggerDemo

引入maven

spring 整合swagger的demo

[api doc index](http://127.0.0.1:8080/swagger-spring/swagger/index.html)
[web site index](http://127.0.0.1:8080/swagger-spring/index.jsp)

[csdn blog](https://blog.csdn.net/qq_35192741/article/details/79498675)

[swagger-ui github](https://github.com/swagger-api/swagger-ui)

[swagger-ui-dist](https://www.npmjs.com/package/swagger-ui-dist)

```

2019-11-21 16:08:14,983 Mapped "{[/v2/api-docs],methods=[GET],produces=[application/json || application/hal+json]}" onto public org.springframework.http.ResponseEntity<springfox.documentation.spring.web.json.Json> springfox.documentation.swagger2.web.Swagger2Controller.getDocumentation(java.lang.String,javax.servlet.http.HttpServletRequest) 
2019-11-21 16:08:14,987 Mapped "{[/configuration/ui]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.UiConfiguration> springfox.documentation.swagger.web.ApiResourceController.uiConfiguration() 
2019-11-21 16:08:14,988 Mapped "{[/swagger-resources]}" onto org.springframework.http.ResponseEntity<java.util.List<springfox.documentation.swagger.web.SwaggerResource>> springfox.documentation.swagger.web.ApiResourceController.swaggerResources() 
2019-11-21 16:08:14,988 Mapped "{[/configuration/security]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.SecurityConfiguration> springfox.documentation.swagger.web.ApiResourceController.securityConfiguration() 
2019-11-21 16:08:15,619 Looking for @ControllerAdvice: WebApplicationContext for namespace 'contacts-servlet': startup date [Thu Nov 21 16:08:08 CST 2019]; parent: Root WebApplicationContext 

```

SwaggerConfig集成org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

