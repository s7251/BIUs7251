package com.biu.project.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String getAdress() throws IllegalArgumentException;
	String getCityAndPostalCode() throws IllegalArgumentException;
	String getTelephone() throws IllegalArgumentException;
	String getMail() throws IllegalArgumentException;
	void setAdress(String street);
	void setCityAndPostalCode(String adress);
	void setTelephone(String telephone);
	void setMail(String mail);

}
