package org.hubotek.view;

import java.util.function.Supplier;

@FunctionalInterface
public interface View extends Supplier<View> {

	
	default  View newView(Supplier<View> supplier)
	{ 
		return supplier.get();
	}
	
}
