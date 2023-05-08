package exerciciosFuncoes4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String data;

		System.out.print("Digite a data (DD/MM/AAAA) : ");
		data = sc.next();

		System.out.print("Data formatada: " + formatarData(data));

		sc.close();

	}

	static String formatarData(String data) throws ParseException {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataD = LocalDate.parse(data, formato);
		String mes = "";
		switch (dataD.getMonthValue()) {
		case 1:
			mes = "janeiro";
			break;
		case 2:
			mes = "fevereiro";
			break;
		case 3:
			mes = "março";
			break;
		case 4:
			mes = "abril";
			break;
		case 5:
			mes = "maio";
			break;
		case 6:
			mes = "junho";
			break;
		case 7:
			mes = "julho";
			break;
		case 8:
			mes = "agosto";
			break;
		case 9:
			mes = "setembro";
			break;
		case 10:
			mes = "outubro";
			break;
		case 11:
			mes = "novembro";
			break;
		case 12:
			mes = "dezembro";
			break;
		}
		return dataD.getDayOfMonth() + " de " + mes + " de " + dataD.getYear();
	}

}
