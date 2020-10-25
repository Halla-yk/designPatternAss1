/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hala
 */
public class EmployeeCache {
        private static Map<String, Employee> employeeMap =
            new HashMap<>();
    public static void addEmployee(String id, String name, String type){
        if(type.equalsIgnoreCase("senior"))
            employeeMap.put(id, new Senior(id, name));
        else if(type.equalsIgnoreCase("junior"))
            employeeMap.put(id, new Junior(id, name));
        else if(type.equalsIgnoreCase("supervisor"))
            employeeMap.put(id, new Supervisor(id, name));        
    }
    
    public static Employee getEmployee(String id){
        Employee cachedEmployee = employeeMap.get(id);
        return (Employee) cachedEmployee.clone();
    }
}
