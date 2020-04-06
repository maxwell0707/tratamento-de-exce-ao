package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {

	private int numeroQuarto;
	private Date checking;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservas() {

	}

	public Reservas(int numeroQuarto, Date checking, Date checkout) {

		this.numeroQuarto = numeroQuarto;
		this.checking = checking;
		this.checkout = checkout;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getChecking() {
		return checking;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duracao() {
		long diff = checkout.getTime() - checking.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void atualizarDatas(Date checking, Date checkout) {

		this.checking = checking;
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		return " \nnumero do quarto: "+ getNumeroQuarto()+
				"\n"+"Checking: "+ sdf.format(getChecking())+
				"\n"+ "Checkout: "+ sdf.format(getCheckout())+
				"\n "+ duracao()+ " noites";
	}

}
