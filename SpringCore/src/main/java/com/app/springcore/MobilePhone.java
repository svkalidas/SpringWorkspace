package com.app.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobilePhone3")
public class MobilePhone {
	
	@Autowired
	@Qualifier("kirin")
	private IProcessor processor;
	
	public void start() {
		processor.execute();
	}

	public IProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(IProcessor processor) {
		this.processor = processor;
	}
}
