package com.real.icrement.component;

import org.springframework.web.context.request.WebRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface BroadleafRequestCustomerResolver {

	 public Object getCustomer(HttpServletRequest request);

	    public Object getCustomer();

	    public Object getCustomer(WebRequest request);

	    public void setCustomer(Object customer);

	    public String getCustomerRequestAttributeName();

	    public void setCustomerRequestAttributeName(String customerRequestAttributeName);

}

