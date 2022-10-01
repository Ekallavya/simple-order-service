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
	
	
	private static final Map<Integer, Mango> mangoData = new HashMap<Integer, Mango>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3970206781360313502L;

		{
			put(1,new Mango(1,"Banish"));
			put(2,new Mango(2,"Ratnagiri"));
			put(3,new Mango(3,"Sindhuri"));
			put(4,new Mango(4,"Thotapuri"));
			put(5,new Mango(5,"Kobban"));
		}
 
    };
 
    @RequestMapping(value = "/mango/{Id}", method = RequestMethod.GET)
    public Mango getEmployeeDetails(@PathVariable int Id) {
        System.out.println("Getting Mango details for " + Id);
 
        Mango mango = mangoData.get(Id);
        if (mango == null) {
            
        	mango = new Mango(0, "N/A");
            
        }
        
        return mango;
    }

}
