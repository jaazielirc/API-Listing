package com.jaax.edsa.controller.shopping

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.shopping.Producto
import com.jaax.edsa.services.shopping.ProductoService
import com.jaax.edsa.utils.Constantes
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping( Constantes.ENDPOINT_SHOPPING_PRODUCTO )
class ProductController( productoService: ProductoService ): BasicController<Producto, String>( productoService )