package com.biu.project.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void getAdress(AsyncCallback<String> callback) throws IllegalArgumentException;
	void getCityAndPostalCode(AsyncCallback<String> callback) throws IllegalArgumentException;
	void getTelephone(AsyncCallback<String> callback) throws IllegalArgumentException;
	void getMail(AsyncCallback<String> callback) throws IllegalArgumentException;
	void setAdress(String street, AsyncCallback<Void> asyncCallback);
	void setCityAndPostalCode(String adress, AsyncCallback<Void> callback);
	void setTelephone(String telephone, AsyncCallback<Void> callback);
	void setMail(String mail, AsyncCallback<Void> callback);
}
