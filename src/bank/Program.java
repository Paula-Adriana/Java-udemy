package bank;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING - sub para superclasse
		// é possível pois uma conta empresarial tb é uma conta normal
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.02);
		
		//DOWNCASTING - super para subclasse
		
		//Somente essa conversão não é segura, necessário explicitar o cast
		//BusinessAccount acc4 = acc2;
		
		//Colocar entre parenteses o tipo da subclasse
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		// Esse downcasting não funcionará, pois acc3 embora seja do tipo account,
		// foi instanciada como savingsAccount, a classe saving é do tipo account
		// e não do tipo Business (business e savings são filhas de account)
		// portanto não é possível atribuir dessa forma. 
		//
		// = BusinessAccount acc5 = (BusinessAccount) acc3;
		
		// O casting só será possível se for uma instancia daquele objeto
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Esse aqui nunca funcionará -  o compilador aceita mas nao printa,
		//se estiver fora do if lançará o erro
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		BusinessAccount acc5 = (BusinessAccount) acc3;
		
		
	}
}
