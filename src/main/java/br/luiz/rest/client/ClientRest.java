package br.luiz.rest.client;

import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class ClientRest {
	
	public static void main(String[] args) {

		ResteasyClient client = new ResteasyClientBuilder().build();		
		ResteasyWebTarget target = client.target("http://localhost:8080/Crudrest-0.0.1-SNAPSHOT/servico/teste");
		Response response = target.request().get();
        String value = response.readEntity(String.class);
        System.out.println(value);
        response.close(); 			        
    }
}
