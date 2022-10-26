import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
    // Requisito 3.1
        ArrayList<Employee> employeeList = Hr.createEmployeeList();
        
     // Requisito 3.2
//        System.out.println(employeeList.get(1).getName());
        employeeList = Hr.removeEmployeeByName(employeeList, "João");
//        System.out.println(employeeList.get(1).getName());
        
     // Requisito 3.3
        Hr.printEmployeeList(employeeList);
        
     // Requisito 3.4
        employeeList = Hr.increaseSalary(employeeList, 10.0);
//        Hr.printEmployeeList(employeeList);
        
     // Requisito 3.5 e 3.6 tive dificuldade em entender o que o requisito quer.
        
        
     // Requisito 3.7 - inesistente
        
     // Requisito 3.8
        System.out.println("\nLista dos funcionários que fazem aniversário nos meses 10 e 12");
        Hr.printByBirthdayEmployeeList(employeeList, 10);
        Hr.printByBirthdayEmployeeList(employeeList, 12);
        
      // Requisito 3.9
        System.out.println("\nFuncionário mais velho"); 
        Hr.printOldestEmployee(employeeList);
        
     // Requisito 3.10
        System.out.println("\nLista em ordem alfabetica por nome: \n"); 
        Hr.printListByOrderName(employeeList);
        
     // Requisito 3.11
        System.out.println("\nSoma dos salarios do funcionários: \n"); 
        Hr.printTotalSalary(employeeList);
        
     // Requisito 3.12
    }
}