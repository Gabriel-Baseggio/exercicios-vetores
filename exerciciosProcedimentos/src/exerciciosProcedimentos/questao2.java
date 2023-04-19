package exerciciosProcedimentos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class questao2 {

	static Scanner sc = new Scanner(System.in);
	static LocalDate hoje = LocalDate.now();
	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
	static int dias;
	static LocalDate dataNova;
	static String dataFormatada;
	
	public static void main(String[] args) {
		
		System.out.print("Digite o número de dias: ");
		dias = sc.nextInt();
		
		adicionarDias();
		formatarData();
		
		System.out.println("Daqui a " + dias + " dias será: " + dataFormatada);		
		
		sc.close();

	}
	
	static void adicionarDias() {
		dataNova = hoje.plusDays(dias);	
	}
	
	static void formatarData() {
		dataFormatada = dataNova.format(formato);		
	}

}
