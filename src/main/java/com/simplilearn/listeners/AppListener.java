package com.simplilearn.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class AppListener {

	@EventListener
	public void contextStarted(ContextStartedEvent event) {
		System.out.println("### context is started ###");
	}

	@EventListener
	public void contextStarted1(ContextStartedEvent event) {
		System.out.println("$$$ context is started $$$");
	}
	
	@EventListener
	public void contextStopped1(ContextStoppedEvent event) {
		System.out.println("$$$ context is stopped $$$");
	}
	
	@EventListener
	public void pavanReceivedSweet(SweetEvent event) {
		System.out.println("Pavan Received sweet....");
	}
	
	@EventListener
	public void rituReceivedSweet(SweetEvent event) {
		System.out.println("Ritu Received sweet....");
	}
	
	@EventListener
	public void AmitReceivedSweet(SweetEvent event) {
		System.out.println("Amit Received sweet....");
	}
	
	@EventListener
	public void yadavReceivedSweet(SweetEvent event) {
		System.out.println("Yadav Received sweet....");
	}
}