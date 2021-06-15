package com.app.SpringCoreAnnotationConfig;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppStartListner implements ApplicationListener<ContextClosedEvent>{

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Application closed");
	}

}
