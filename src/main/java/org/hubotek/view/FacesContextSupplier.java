package org.hubotek.view;

import java.util.function.Supplier;

import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
public class FacesContextSupplier implements Supplier<FacesContext>{

	@Override
	public FacesContext get() {
		return FacesContext.getCurrentInstance();
	}

}
