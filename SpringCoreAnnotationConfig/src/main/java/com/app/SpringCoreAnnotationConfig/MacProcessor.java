package com.app.SpringCoreAnnotationConfig;

import org.springframework.stereotype.Component;

@Component("macProcessor")
public class MacProcessor implements IProcessor {
	
	private String version;
	private String core;
	
	public MacProcessor() {
	}
	public MacProcessor(String version, String core) {
		super();
		this.version = version;
		this.core = core;
	}

	public void execute() {
		System.out.println( "MacProcessor : "+core+" "+version);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}
	
	

}
