package org.hubotek.view;

import java.util.function.Supplier;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.ResourceHandler;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ResourceHandlerSupplier implements Supplier<ResourceHandler>{

	@Override
	public ResourceHandler get() {
		return  FacesContext.getCurrentInstance().getApplication().getResourceHandler();
	}

}
