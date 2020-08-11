package book;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;

//JAX-RS API for REST Webservice.


@Path("/book")
public class Book {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String Hello() {
		String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				" <para>hello world</para>\n" ;
				
		return response;
	}

}
	