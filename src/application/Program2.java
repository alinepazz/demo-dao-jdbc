package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department insert ===");
		
		Department department = new Department(null, "Beleza");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " +  department.getId());
		
		System.out.println("=== TESTE 2: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TESTE 3: department update ===");
		dep = departmentDao.findById(5);
		dep.setName("Teste");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		
		System.out.println("=== TESTE 4: department delete ===");
		System.out.print("Entre com um id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
	
		
		System.out.println("\n=== TEST 5: department findAll =====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
			
		}
		
		
		sc.close();

	}

}
