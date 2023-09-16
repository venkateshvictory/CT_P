package com.real.icrement.component;

import org.springframework.web.context.request.WebRequest;

public class BroadleafRequestContext {

	   protected WebRequest webRequest;
	private static final ThreadLocal<BroadleafRequestContext> BROADLEAF_REQUEST_CONTEXT = ThreadLocalManager.createThreadLocal(BroadleafRequestContext.class, false);
    
	 public static BroadleafRequestContext getBroadleafRequestContext() {
	        return getBroadleafRequestContext(true);
	    }
	 
	 public static BroadleafRequestContext getBroadleafRequestContext(boolean createIfAbsent) {
	        BroadleafRequestContext ctx = BROADLEAF_REQUEST_CONTEXT.get();
	        if (ctx == null && createIfAbsent) {
	            ctx = new BroadleafRequestContext();
	            BROADLEAF_REQUEST_CONTEXT.set(ctx);
	        }
	        return ctx;
	    }
	 
	    public WebRequest getWebRequest() {
	        return webRequest;
	    }
	
}
