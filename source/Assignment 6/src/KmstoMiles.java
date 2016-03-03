import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ktomconversion")
public class KmstoMiles {

	  @GET
	  @Produces("application/json")
	  public Response convertKmstoM() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double kms = 2.0;
		Double miles ;
		miles = kms*1.609; 
		jsonObject.put("Kms Value", kms); 
		jsonObject.put("Miles Value", miles);

		String result = "@Produces(\"application/json\") Output: \n\nKms to Miles Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }

	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") Double f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double miles;
		miles =  f * 1.609; 
		jsonObject.put("Kms Value", f); 
		jsonObject.put("Miles Value", miles);	

		String result = "@Produces(\"application/json\") Output: \n\nKms to Miles Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  public Double convertMtoK(@PathParam("f") Double f)
		{
		  
		  Double miles;
		  miles = f*1.609;
		  return miles;
		}
	
}