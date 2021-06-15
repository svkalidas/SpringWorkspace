package com.app.SpringCoreAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {

	@Autowired
	@Qualifier("intelProcessor")
	IProcessor processor;
	
	public void getProcessorInfo() {
		processor.execute();
	}
}
