package org.hubotek.view;

import java.util.Map;
import java.util.function.Supplier;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class HeaderValuesMapSupplier implements Supplier<Map<String,String[]>>{

	@Override
	public Map<String, String[]> get() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderValuesMap();
	}

}
