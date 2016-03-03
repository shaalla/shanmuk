import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/mtokconversion")
public class MilestoKms {

	  @GET
	  @Produces("application/json")
	  public Response convertMiltoK() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double miles = 2.0;
		Double kms ;
		kms = miles*0.621; 
		jsonObject.put("Miles Value", miles); 
		jsonObject.put("Kms Value", kms);

		String result = "@Produces(\"application/json\") Output: \n\nMiles to Kms Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }

	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") Double f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double kms;
		kms =  f * 0.621; 
		jsonObject.put("Miles Value", f); 
		jsonObject.put("Kms Value", kms);	

		String result = "@Produces(\"application/json\") Output: \n\nMiles to Kms Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  public Double convertMtoK(@PathParam("f") Double f)
		{
		  
		  Double kms;
		  kms = f*0.621;
		  return kms;
		}
	
}