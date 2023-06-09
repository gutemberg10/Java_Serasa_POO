package classesAbstratas;

public abstract class Veiculo {
	
	private int velocidade;
	private boolean status;
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public void mostrasStatus() {
		System.out.println("Mostrar Status = " + isStatus());
	}
	
	public abstract void acelerar();

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
