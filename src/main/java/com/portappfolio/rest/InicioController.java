
package com.portappfolio.rest;

import com.portappfolio.domain.*;
import com.portappfolio.servicio.FuncionServiceImpl;
import com.portappfolio.servicio.GrupoEmpresaServiceImpl;
import com.portappfolio.servicio.PaisServiceImpl;
import com.portappfolio.servicio.PrecioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/about")
@RequiredArgsConstructor
public class InicioController {

    private final PaisServiceImpl paisService;

    //Redirect to home page that is default page, in context path /about
    @GetMapping("")
    public void redirectAbout(HttpServletResponse response) throws IOException {
        response.sendRedirect("/about/home");
    }

    //Home Page
    @GetMapping("/home")
    public ResponseEntity<Response> getAbout(@RequestParam(required = false,name = "country") Integer country){

        Pais paisSeleccionado = paisService.encontrarPaisPorID(country != null ? country : 3);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("paises",paisService.listarPaises()
                                ,"paisSeleccionado",paisSeleccionado
                                )
                        )
                        .message("About retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    private final PrecioServiceImpl precioService;

    //Products page info
    @GetMapping("/products")
    public ResponseEntity<Response> getProducts(){

        List<Precio> precios = precioService.listarPrecios();

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("precios",precios))
                        .message("Products retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

}
