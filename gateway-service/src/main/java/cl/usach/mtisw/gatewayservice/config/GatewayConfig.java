package cl.usach.mtisw.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("profesor-service", r-> r.path("/profesor/**")
                        .uri("http://localhost:8002"))
                .route("proyector-service", r-> r.path("/proyector/**")
                        .uri("http://localhost:8003"))
                .route("devolucion-service", r-> r.path("/devolucion/**")
                        .uri("http://localhost:8004"))
                .route("prestamo-service", r-> r.path("/prestamo/**")
                        .uri("http://localhost:8005"))
                .route("reporte-service", r-> r.path("/reporte/**")
                        .uri("http://localhost:8006"))
                .build();
    }
}
