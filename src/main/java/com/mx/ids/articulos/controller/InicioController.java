package com.mx.ids.articulos.controller;

import com.mx.ids.articulos.domain.articulos.Articulo;
import com.mx.ids.articulos.domain.articulos.ropa.Ropa;
import com.mx.ids.articulos.service.articulos.ArticulosService;
import com.mx.ids.articulos.service.articulos.accesorios.AccesorioService;
import com.mx.ids.articulos.service.articulos.calzado.CalzadoService;
import com.mx.ids.articulos.service.articulos.ropa.RopaService;
import com.mx.ids.articulos.service.clientes.ClienteService;
import com.mx.ids.articulos.service.facturas.FacturaService;
import com.mx.ids.articulos.service.facturas.detalles.FacturaDetalleService;
import com.mx.ids.articulos.service.files.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;


@Controller
public class InicioController {
    @Autowired
    private ArticulosService articulosService;

    @Autowired
    private RopaService ropaService;

    @Autowired
    private AccesorioService accesorioService;

    @Autowired
    private CalzadoService calzadoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private FacturaDetalleService facturaDetalleService;

    @Autowired
    private FileService fileService;

    @GetMapping("/")
    public String inicio(Model model){
        var articulos=articulosService.listarArticulos();
        model.addAttribute("articulos",articulos);
        fileService.updateFile("consultas.txt","Query: SELECT * FROM db_indumentaria.articulos;");
        return "articulos";
    }

    @GetMapping("/ropa")
    public String ropa_index(Model model){
        fileService.updateFile("consultas.txt","Query: SELECT * FROM db_indumentaria.articulos_ropa_detalles;");
        var ropas=ropaService.listarRopa();
        model.addAttribute("ropas",ropas);
        return "ropa";
    }
    @PreAuthorize("hasRole('ADMIN')")//Expresion que indica que significa que solo se permitirá el acceso a los usuarios con el rol ROLE_ADMIN
    @GetMapping("/ropa/id")
    public String ropa_id_index(Model model){
        var ropasId=ropaService.listarRopaId();
        model.addAttribute("ropasid",ropasId);
        return "ropa_id";
    }

    @GetMapping("/accesorios")
    public String accesorios_index(Model model){
        fileService.updateFile("consultas.txt","SELECT * FROM db_indumentaria.articulos_accesorios_detalles;");
        var accesorios=accesorioService.listarArticulosAccesorios();
        model.addAttribute("accesorios",accesorios);
        return "accesorios";
    }

    @GetMapping("/calzado")
    public String calzado_index(Model model){
        fileService.updateFile("consultas.txt","SELECT * FROM db_indumentaria.articulos_calzados_detalles;");
        var calzados=calzadoService.listarCalzado();
        model.addAttribute("calzados",calzados);
        return "calzado";
    }

    @GetMapping("/clientes")
    public String clientes_index(Model model){
        fileService.updateFile("consultas.txt","SELECT * FROM db_indumentaria.clientes;");
        var clientes=clienteService.listarClientes();
        model.addAttribute("clientes",clientes);
        return "clientes";
    }

    @GetMapping("/facturas")
    public String facturas_index(Model model){
        fileService.updateFile("consultas.txt","SELECT * FROM db_indumentaria.facturas;");
        var facturas=facturaService.listarFacturas();
        model.addAttribute("facturas",facturas);
        return "facturas";
    }

    @GetMapping("/facturas/detalles")
    public String factura_detalle_index(Model model){
        fileService.updateFile("consultas.txt","SELECT * FROM db_indumentaria.facturas_detalles;");
        var facturasDetalles=facturaDetalleService.listarFacturaDetalles();
        model.addAttribute("facturasDetalles",facturasDetalles);
        return "facturas_detalles";
    }




    @GetMapping("/agregar")
    public String agregar(Articulo articulo){
        return "modificar";
    }

    @GetMapping("/guardar")
    public String guardar(Articulo articulo){
        articulosService.guardar(articulo);
        return "redirect:/";
    }

    @GetMapping("/editar/{idArticulo}")
    public String editar(Articulo articulo, Model model){
        articulo=articulosService.encontrarArticulo(articulo);
        model.addAttribute("articulo",articulo);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Articulo articulo){
        articulosService.eliminar(articulo);
        return "redirect:/";
    }

}

