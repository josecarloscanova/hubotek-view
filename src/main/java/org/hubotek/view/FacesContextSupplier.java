package org.hubotek.view;

import java.util.function.Supplier;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Model
public class FacesContextSupplier implements Supplier<FacesContext>{

	@Override
	public FacesContext get() {
		return FacesContext.getCurrentInstance();
	}

}
