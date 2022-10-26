import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Requisito 2
public class Employee extends People {
	private BigDecimal salary;
	private String function;

    public Employee(String nome, LocalDate dataNascimento, BigDecimal salary, String function) {
        super(nome, dataNascimento);
        this.salary = salary;
        this.function = function;
    }

  	public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String funcao) {
        this.function = funcao;
    }

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Name: " + this.getName() + ", Birthday: " + this.getBirthday().format(formatter) + ", salary: " + df.format(salary) + ", function: " + function + "\n";
	}
	
//	public int compareTo(Employee employee) { 
//		if (this.getName())
//	}

}
