package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	//composição de objetos - associações
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
	public Worker(String name, WorkerLevel workLevel, double baseSalary, Departament departament) {
		this.name = name;
		this.level = workLevel;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel geLevel() {
		return level;
	}
	public void setWorkLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Departament getDepartament() {
		return departament;
	}
	
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	
	//salario base + o results do mes/ano do contrato daquele mes
	public double income (Integer month,Integer year) {
		double sum = baseSalary;
		//setar um calendario falso para comparaçao posterior
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); //colocar 1 pois month começa em 0
			if (year == c_year && month == c_month)
				sum += c.totalValue();
		}
		return sum; 
	}
	
}
