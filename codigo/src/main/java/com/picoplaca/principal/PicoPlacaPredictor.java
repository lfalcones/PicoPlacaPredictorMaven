package com.picoplaca.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.picoplaca.exception.GetDigitException;
import com.picoplaca.util.Utilitario;

/**
 * @author luish.falcones
 *
 */
public class PicoPlacaPredictor {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean continuar = Boolean.TRUE;
		do {
			try {
				System.out.println("Enter license plate number  (Ej. PBC1234): ");
				String placa = scan.nextLine();
				System.out.println("Enter the day (Ej. 20170210 yyyyMMdd): ");
				String dia = scan.nextLine();
				System.out.println("Enter the time (Ej. 14:10 HH:mm): ");
				String hour = scan.nextLine();
				continuar= Boolean.FALSE;
				
				
				Utilitario utilitario = new Utilitario();
				
				
				Integer plateLastDigit = utilitario.digitLast(placa);
				Date dateT = utilitario.toDate(dia);
				
				//only for validate
				new SimpleDateFormat("HH:mm").parse(hour);
				
				System.out.println("---------");
				Boolean have = utilitario.havePicoPlaca(plateLastDigit, dateT,hour);
				
				if(have){
					System.out.println("You have pico and placa");
				}else{
					System.out.println("You have not pico and placa");
				}
				
			} catch (GetDigitException e) {
				System.out.println("Incorrect license plate number, Enter license plate number again");
				continuar = Boolean.TRUE;
			}catch (ParseException n) {
				System.out.println("Incorrect time or date values, re-enter values in the format indicated");
				continuar = Boolean.TRUE;
			}catch (Exception f) {
				System.out.println("Incorrect values, re-enter values in the format indicated");
				continuar = Boolean.TRUE;
			}
			
			
		} while (continuar);
		scan.close();

	}

}
