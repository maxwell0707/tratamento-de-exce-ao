package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Reservas;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner( System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Digite o numero do Quarto: ");
		 int numeroQuarto = sc.nextInt();
		 System.out.print("Digite a data de checking : ");
		 Date checking = sdf.parse(sc.next());
		 System.out.print("Digite a data de checkout: ");
		 Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checking)) {
			System.out.println("A data do checking não pode ser posterior ao checkout!");
		} 
			
			Reservas reserva = new Reservas(numeroQuarto, checking, checkout) ;
			System.out.println("Reserva: "+ reserva);
		
		
		System.out.println("Atualização de reserva: ");
		
		
		 System.out.print("Digite a data de checking : ");
		  checking = sdf.parse(sc.next());
		 System.out.print("Digite a data de checkout: ");
		  checkout = sdf.parse(sc.next());
		
		
		Date hoje = new Date();
		if(checking.before(hoje)|| checkout.before(hoje)) {
			 System.out.println("As datas pra reservas devem ser futuras!");
		} 
		else {
			reserva.atualizarDatas(checking, checkout);
			System.out.println("Reserva: "+ reserva);
		}
		
		
		
		
	}

}
