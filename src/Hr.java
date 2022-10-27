import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hr {
	public static ArrayList<Employee> createEmployeeList() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Maria", LocalDate.parse("2000-10-18"), new BigDecimal("2009.44"), "Operador"));		
		employeeList.add(new Employee("João", LocalDate.parse("1990-05-12"), new BigDecimal("2284.38"), "Operador"));		
		employeeList.add(new Employee("Caio", LocalDate.parse("1961-05-02"), new BigDecimal("9836.14"), "Coordenador"));		
		employeeList.add(new Employee("Miguel", LocalDate.parse("1988-10-14"), new BigDecimal("19119.88"), "Diretor"));		
		employeeList.add(new Employee("Alice", LocalDate.parse("1995-01-05"), new BigDecimal("2234.68"), "Recepcionista"));		
		employeeList.add(new Employee("Heitor", LocalDate.parse("1999-11-19"), new BigDecimal("1582.72"), "Operador"));		
		employeeList.add(new Employee("Arthur", LocalDate.parse("1993-03-31"), new BigDecimal("4071.84"), "Contador"));		
		employeeList.add(new Employee("Laura", LocalDate.parse("1994-07-08"), new BigDecimal("3017.45"), "Gerente"));		
		employeeList.add(new Employee("Heloísa", LocalDate.parse("2003-05-24"), new BigDecimal("1606.85"), "Eletricista"));		
		employeeList.add(new Employee("Helena", LocalDate.parse("1996-09-02"), new BigDecimal("2799.93"), "Gerente"));		
		
		return employeeList;
	}
	
	public static ArrayList<Employee> removeEmployeeByName(ArrayList<Employee> employeeList, String name ) { 
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getName().equals(name)) {
				employeeList.remove(i);
			}
		}		
		return employeeList;
	}
	
	public static void printEmployeeList(ArrayList<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.printf(employee.toString());
		}
	}
	
	public static ArrayList<Employee> increaseSalary(ArrayList<Employee> employeeList, Double increase ) { 
		for (int i = 0; i < employeeList.size(); i++) {
			employeeList.get(i).setSalary(employeeList.get(i).getSalary().multiply( new BigDecimal(1 + increase/100)));;
		}		
		return employeeList;
	}
	
	public static void printByBirthdayEmployeeList(ArrayList<Employee> employeeList, int month) {
		for (Employee employee : employeeList) {
			if (employee.getBirthday().getMonthValue() == month ) {
				System.out.println(employee.toString());				
				
			}
			
		}
	}
	
	public static void printOldestEmployee(ArrayList<Employee> employeeList) {
//		Employee oldestEmployee = new Employee("", LocalDate.now(), new BigDecimal("0"), "");
		String name = "";
		int yearOld = 0;
		for (Employee employee : employeeList) {
			if (2022 - employee.getBirthday().getYear() > yearOld) {
				name = employee.getName();
				yearOld = 2022 - employee.getBirthday().getYear();
			}
		}
		System.out.printf("%s é o funcionário mais velho com %d anos.\n", name, yearOld);
	}

	public static void printListByOrderName(ArrayList<Employee> employeeList) {
		Collections.sort(employeeList);	
		printEmployeeList(employeeList);
	}
	
	public static void printTotalSalary(ArrayList<Employee> employeeList) {
		BigDecimal total =  new BigDecimal(0);
		
		for (Employee employee : employeeList) {
			total = total.add(employee.getSalary());							
		}
		
		System.out.printf("%.2f\n", total.floatValue());
	}
	
	public static void printHowManySalary(ArrayList<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.printf("O %s ganha %.2f salários minimos\n", employee.getName(), (employee.getSalary().floatValue() / 1212.0));							
		}

	}
	
	public static Map<String, ArrayList<Employee>> mapByFuntion(ArrayList<Employee> employeeList) {
		Map<String, ArrayList<Employee>> map = new HashMap<String, ArrayList<Employee>>();
		for (Employee employee : employeeList) {
			if (map.get(employee.getFunction()) == null) {
				ArrayList<Employee> list = new ArrayList<Employee>();
				list.add(employee);
				map.put(employee.getFunction(), list);
			}
			else {
				ArrayList<Employee> list = new ArrayList<Employee>();
				list = map.get(employee.getFunction());
				list.add(employee);
				map.put(employee.getFunction(), list);
			}
		}
		return map;
	}

	public static void printMap(Map<String, ArrayList<Employee>> map) {
		for (String key : map.keySet()) {
			System.out.println(key + ":\n");
			printEmployeeList(map.get(key));
			System.out.println("\n");
		}
		
	}
	
}
