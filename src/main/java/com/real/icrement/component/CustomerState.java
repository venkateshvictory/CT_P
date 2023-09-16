package com.real.icrement.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.real.icrement.model.Customer;

import jakarta.servlet.http.HttpServletRequest;


@Component("blCustomerState")
public class CustomerState {

	 public static Customer getCustomer(HttpServletRequest request) {
	        return (Customer) BroadleafRequestCustomerResolverImpl.getRequestCustomerResolver().getCustomer(request);
	    }
	    
	    public static Customer getCustomer(WebRequest request) {
	        return (Customer) BroadleafRequestCustomerResolverImpl.getRequestCustomerResolver().getCustomer(request);
	    }
	    
	    public static Customer getCustomer() {
	        if (BroadleafRequestContext.getBroadleafRequestContext() == null
	                || BroadleafRequestContext.getBroadleafRequestContext().getWebRequest() == null) {
	            return null;
	        }
	        return (Customer) BroadleafRequestCustomerResolverImpl.getRequestCustomerResolver().getCustomer();
	    }
	    
	    public static void setCustomer(Customer customer) {
	        BroadleafRequestCustomerResolverImpl.getRequestCustomerResolver().setCustomer(customer);
	    }
}
