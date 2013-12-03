package com.biu.project.client;

import com.biu.project.server.GreetingServiceImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class Biu7251 implements EntryPoint {
	
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";
	
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	
	public void onModuleLoad() {
		final Label street = new Label();
		
		greetingService.getAdress(
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						System.out.println("fail");
					}

					public void onSuccess(String result) {
						street.setText(result);
						System.out.println(result);
					}
				});
		
		 
		street.addStyleName("styl");
		
		 
		    
	/*	final Label street = new Label();
		street.setText("Ul. Malinowa 18");
	    street.addStyleName("styl");	*/
		
		
		final Label adress = new Label();
		
		
		greetingService.getCityAndPostalCode(
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						System.out.println("fail");
					}

					public void onSuccess(String result) {
						adress.setText(result);
						System.out.println(result);
					}
				});
		
		adress.addStyleName("styl");
				
		final Label telephone = new Label();
		
		greetingService.getTelephone(
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						System.out.println("fail");
					}

					public void onSuccess(String result) {
						telephone.setText(result);
						System.out.println(result);
					}
				});
	
		telephone.addStyleName("styl");
			
		final Label mail = new Label();
		
		greetingService.getMail(
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						System.out.println("fail");
					}

					public void onSuccess(String result) {
						mail.setText(result);
						System.out.println(result);
					}
				});
		
				mail.addStyleName("styl");
		
		final Image image = new Image();
    	image.setUrl("drawing.jpg");
						
		VerticalPanel vertical = new VerticalPanel();
		vertical.setSize("500px", "100px" );
		vertical.add(street);
		vertical.add(adress);
		vertical.add(telephone);
		vertical.add(mail);
	
		HorizontalPanel horizontal = new HorizontalPanel();
		horizontal.addStyleName("styl2");
		horizontal.setSize("500px", "300px");
		horizontal.add(vertical);
		horizontal.add(image);
		
		HorizontalPanel horizontal2 = new HorizontalPanel();
		horizontal2.setWidth("600px");
		horizontal2.setStyleName("styl");
					
		final Label edit = new Label();
		edit.setStyleName("styl2");
		edit.setText("Hasło: ");
		final PasswordTextBox  password = new PasswordTextBox();	
		final Label edit2 = new Label();
		edit2.setStyleName("styl2");
		edit2.setText("Login: ");
		final TextBox login = new TextBox();
		final Button button = new Button("Zaloguj");
				
		horizontal2.add(edit2);
		horizontal2.add(login);
		horizontal2.add(edit);
		horizontal2.add(password);
		horizontal2.add(button);
		
		final VerticalPanel vertical2 = new VerticalPanel();
		vertical2.setWidth("500px");
		vertical2.setStyleName("styl");
		vertical2.setVisible(false);
		
		final Label street_edit = new Label("Ulica:");
		final TextBox street_edit2 = new TextBox();
		final Label adress_edit = new Label("Miasto:");
		final TextBox adress_edit2 = new TextBox();
		final Label telephone_edit = new Label("Telefon:");
		final TextBox telephone_edit2 = new TextBox();
		final Label mail_edit = new Label("E-Mail:");
		final TextBox mail_edit2 = new TextBox();
		final Button zapisz = new Button("Zapisz");
		final Label error = new Label("Błąd autoryzacji");
		error.setWidth("700px");
		error.setStyleName("styl");
		error.setVisible(false);
		
		vertical2.add(street_edit);
		vertical2.add(street_edit2);
		vertical2.add(adress_edit);
		vertical2.add(adress_edit2);
		vertical2.add(telephone_edit);
		vertical2.add(telephone_edit2);
		vertical2.add(mail_edit);
		vertical2.add(mail_edit2);
		vertical2.add(zapisz);
		
		button.addClickHandler(new ClickHandler() {
	        @Override
			public void onClick(ClickEvent event) {
	        	if (password.getText().equals("admin") && password.getText().equals("admin")){
	        		error.setVisible(false);
	        		vertical2.setVisible(true);
	        	}
	        	else {
	        		error.setVisible(true);
	        		vertical2.setVisible(false);
	        	}	        	
	         }
	      });
	    
	    zapisz.addClickHandler(new ClickHandler() {
	    
	    	@Override
			public void onClick(ClickEvent event) {
	        	street.setText(street_edit2.getText());
	        	adress.setText(adress_edit2.getText());
	        	telephone.setText(telephone_edit2.getText());
	        	mail.setText(mail_edit2.getText());
	        	vertical2.setVisible(false);
	         }
	      });
	    
		RootPanel.get().add(horizontal);
		RootPanel.get().add(horizontal2);
		RootPanel.get().add(error);
		RootPanel.get().add(vertical2);
		
}
	}
