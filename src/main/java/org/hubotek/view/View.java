package org.hubotek.view;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Supplier;

@FunctionalInterface
public interface View<T> extends Supplier<T> , Serializable{

	
	default  T newAnyType(Supplier<T> supplier)
	{ 
		return supplier.get();
	}
	
	default  T ofNullable(T dest , Supplier<T> viewSupplier) 
	{ 
		return Optional.ofNullable(dest).orElseGet(viewSupplier); 
	}
	
}
