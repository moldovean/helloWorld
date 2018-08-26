package club.cheapok.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Map;

@Path("hello")
public class HelloWorldResource {

    @GET
    public Response iakaHello() {
        Map<String, String> response = Collections.singletonMap("message", "Iaka Hello World, dynamic?");
        return Response.ok(response).build();
    }
}
