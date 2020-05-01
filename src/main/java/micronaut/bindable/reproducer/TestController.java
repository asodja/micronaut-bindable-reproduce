package micronaut.bindable.reproducer;

import javax.annotation.Nullable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/test")
public class TestController {

    @GET
    @Path("/path{?q}")
    public String index(@Nullable @QueryParam("q") String queryValue) {
        return queryValue;
    }
    
}