package com.biu.project.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.biu.project.client.GreetingService;
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
			while ((temp = bfr.readLine()) != null) {

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
			while ((temp = bfr.readLine()) != null) {

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
			while ((temp = bfr.readLine()) != null) {

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
			while ((temp = bfr.readLine()) != null) {

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

	public void setAdress(String adress) {

		String linia = adress;
		FileWriter fw = null;

		try {
			fw = new FileWriter("plik.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter bw = new BufferedWriter(fw);
		try {

			bw.write(linia);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setCityAndPostalCode(String adress) {

		String linia = adress;
		FileWriter fw = null;

		try {
			fw = new FileWriter("plik2.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter bw = new BufferedWriter(fw);
		try {

			bw.write(linia);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setTelephone(String telephone) {

		String linia = telephone;
		FileWriter fw = null;

		try {
			fw = new FileWriter("plik3.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter bw = new BufferedWriter(fw);
		try {

			bw.write(linia);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setMail(String mail) {

		String linia = mail;
		FileWriter fw = null;

		try {
			fw = new FileWriter("plik4.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter bw = new BufferedWriter(fw);
		try {

			bw.write(linia);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
