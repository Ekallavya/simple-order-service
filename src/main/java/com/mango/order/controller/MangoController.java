package com.mango.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mango.order.domain.Mango;

@RestController
public class MangoController {

	private static final long serialVersionUID = -3970206781360313502L;
	private static final Map<Integer, Mango> mangoData = getMangoData();
 
    @RequestMapping(value = "/mango/{Id}", method = RequestMethod.GET)
    public Mango getEmployeeDetails(@PathVariable int Id) {
        System.out.println("Getting Mango details for " + Id);
 
        Mango mango = mangoData.get(Id);
        if (mango == null) {
            
        	mango = new Mango(0, "N/A");
            
        }
        
        return mango;
    }


	private static Map<Integer, Mango> getMangoData() {
		Map<Integer, Mango> mangoData = new HashMap<Integer, Mango>() ;

		mangoData.put(1, new Mango(1, "Banish"));
		mangoData.put(2, new Mango(2, "Alphonso"));
		mangoData.put(3, new Mango(3, "Sindhuri"));
		mangoData.put(4, new Mango(4, "Totapuri"));
		mangoData.put(5, new Mango(5, "Amrapali"));
		mangoData.put(6, new Mango(6, "Dasheri"));
		mangoData.put(7, new Mango(7, "Rumani"));
		mangoData.put(8, new Mango(8, "Himasagar"));
		mangoData.put(9, new Mango(9, "Raspuri"));
		mangoData.put(10, new Mango(10, "Kobban"));


		return mangoData;
	}
}

