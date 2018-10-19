/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import entidades.Region;
import java.util.ArrayList;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author Bena
 */
public class RegionAdapter {
    
    public static ArrayList GetAll() throws JSONException{
        
        ArrayList lista_regiones = new ArrayList();
        // declaracion para conexion
        ClientConfig clientConfig = new ClientConfig();

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("howtodoinjava", "password");
        clientConfig.register( feature) ;

        clientConfig.register(JacksonFeature.class);
        // declaracion del cliente conexion
        Client client = ClientBuilder.newClient( clientConfig );
        // declaracion de recurso
        WebTarget webTarget = client.target("http://localhost:5000/api").path("region");

        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        if(response.getStatus() == 200)
        {
            
            String responseMessage = response.readEntity(String.class);
            JSONObject jsonObj = new JSONObject(responseMessage);
            JSONArray resultado = (JSONArray) jsonObj.get("respuesta");
            
            for (int i = 0; i < resultado.length(); i++) {
                JSONObject jsonRegion = (JSONObject)resultado.get(i);
                Region region = new Region();
                region.setId((int)jsonRegion.get("id"));
                region.setNombre((String)jsonRegion.get("nombre"));
                lista_regiones.add(region);
                
            }
        }
        
        return lista_regiones;
    }
    
    public static Region ReadById(int id) throws JSONException{
        // declaracion para conexion
        ClientConfig clientConfig = new ClientConfig();

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("howtodoinjava", "password");
        clientConfig.register( feature) ;

        clientConfig.register(JacksonFeature.class);
        // declaracion del cliente conexion
        Client client = ClientBuilder.newClient( clientConfig );
        // declaracion de recurso
        WebTarget webTarget = client.target("http://localhost:5000/api").path("region").path(Integer.toString(id));

        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        Region region = new Region();
        if(response.getStatus() == 200)
        {
            
            String responseMessage = response.readEntity(String.class);
            JSONObject jsonObj = new JSONObject(responseMessage);
            JSONObject jsonRegion = (JSONObject) jsonObj.get("respuesta");
            
            
            region.setId((int)jsonRegion.get("id"));
            region.setNombre((String)jsonRegion.get("nombre"));
            
            
        }
        
        return region;
    }
    
    public static boolean Create(Region region) throws JSONException{
        // declaracion para conexion
        ClientConfig clientConfig = new ClientConfig();

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("howtodoinjava", "password");
        clientConfig.register( feature) ;

        clientConfig.register(JacksonFeature.class);
        // declaracion del cliente conexion
        Client client = ClientBuilder.newClient( clientConfig );
        // declaracion de recurso
        WebTarget webTarget = client.target("http://localhost:5000/api").path("region");
        System.out.println(Entity.entity(region, MediaType.APPLICATION_JSON));
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.post(Entity.entity(region, MediaType.APPLICATION_JSON), Response.class);
        String body = response.readEntity(String.class);
        System.out.println(body);

        
        return response.getStatus() == 200;
    }
    
    public static boolean Update(Region region) throws JSONException{
        // declaracion para conexion
        ClientConfig clientConfig = new ClientConfig();

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("howtodoinjava", "password");
        clientConfig.register( feature) ;

        clientConfig.register(JacksonFeature.class);
        // declaracion del cliente conexion
        Client client = ClientBuilder.newClient( clientConfig );
        // declaracion de recurso
        WebTarget webTarget = client.target("http://localhost:5000/api").path("region").path(Integer.toString(region.getId()));
        System.out.println(Entity.entity(region, MediaType.APPLICATION_JSON));
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.put(Entity.entity(region, MediaType.APPLICATION_JSON), Response.class);
        String body = response.readEntity(String.class);
        System.out.println(body);

        
        return response.getStatus() == 200;
    }
    
    
    
    public static boolean Delete(Region region) throws JSONException{
        ClientConfig clientConfig = new ClientConfig();

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("howtodoinjava", "password");
        clientConfig.register( feature) ;

        clientConfig.register(JacksonFeature.class);
        // declaracion del cliente conexion
        Client client = ClientBuilder.newClient( clientConfig );
        // declaracion de recurso
        WebTarget webTarget = client.target("http://localhost:5000/api").path("region").path(Integer.toString(region.getId()));
        System.out.println(Entity.entity(region, MediaType.APPLICATION_JSON));
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.delete();
        String body = response.readEntity(String.class);
        System.out.println(body);

        
        return response.getStatus() == 200;
    }
    
}
