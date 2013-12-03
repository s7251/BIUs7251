package com.biu.project.server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biu.project.client.GreetingService;
import com.biu.project.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String getAdress() throws IllegalArgumentException {
		
		
		 FileReader fr = null;
		   String linia = "";
		   String temp;
		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("plik.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((temp = bfr.readLine()) != null){
		       
		      linia += temp;
		     }
		    } catch (IOException e) {
		        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
		
		
		 

		return linia;
	}
	
	public String getCityAndPostalCode() {
		   FileReader fr = null;
		   String linia = "";
		   String temp;
		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("plik2.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((temp = bfr.readLine()) != null){
		       
		      linia += temp;
		     }
		    } catch (IOException e) {
		        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
		
		
		 

		return linia;
	}
	
	public String getTelephone() {
		   FileReader fr = null;
		   String linia = "";
		   String temp;
		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("plik3.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((temp = bfr.readLine()) != null){
		       
		      linia += temp;
		     }
		    } catch (IOException e) {
		        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
		
		
		 

		return linia;
	}
	
	public String getMail() {
		   FileReader fr = null;
		   String linia = "";
		   String temp;
		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("plik4.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((temp = bfr.readLine()) != null){
		       
		      linia += temp;
		     }
		    } catch (IOException e) {
		        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
		
		
		 

		return linia;
	}
	

}
