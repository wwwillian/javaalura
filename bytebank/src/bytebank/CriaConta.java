package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new  Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("Saldo da Segunda conta é " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);
	}
}
