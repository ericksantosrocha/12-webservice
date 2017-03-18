package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {

	private ProdutoBO bo = new ProdutoBO();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO buscar(@PathParam("id")int codigo){
		ProdutoTO produto = bo.buscar(codigo);
		return produto;
	}
	
	//Listar
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> listar(){
		return bo.listar();
	}
	
}
