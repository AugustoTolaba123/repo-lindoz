package ar.edu.unju.fi.tp4.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;



@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	Producto producto;
	
	List<Producto> productos = new ArrayList<Producto>();
	
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);
	
	@Override
	public void addProducto(Producto producto) {
		this.productos.add(producto);
		LOGGER.info("METHOD: agregarProducto -se agregó un nuevo producto ->"+productos.get(productos.size()-1));	
	}

	@Override
	public Producto getUltimoProducto() {
		int indiceUltimoProducto = productos.size()-1;
		Producto producto = productos.get(indiceUltimoProducto);
		LOGGER.info("METHOD: getUltimoProducto -Se visualizó el ultimo producto agregado ->"+productos.get(productos.size()-1));
		return producto;
		
	}

	@Override
	public Producto getProducto() {
		//LOGGER.info("METHOD: agregarProducto -se agrego un nuevo productoB ->"+productos.get(productos.size()-1));
		return this.producto;
	}

}
