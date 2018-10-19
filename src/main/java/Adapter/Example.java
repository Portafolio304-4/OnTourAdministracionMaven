/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import entidades.Region;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jettison.json.JSONException;


/**
 *
 * @author Bena
 */
public class Example {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.codehaus.jettison.json.JSONException
     */
    public static void main(String[] args) throws IOException, JSONException
    {
        ArrayList GetAll = RegionAdapter.GetAll();
        Region region = RegionAdapter.ReadById(2);
        Region new_region = new Region();
        new_region.setId(18);
        new_region.setNombre("pepito paga doble");
        boolean insert;
        insert = RegionAdapter.Delete(new_region);
        
        
    }

    
}
