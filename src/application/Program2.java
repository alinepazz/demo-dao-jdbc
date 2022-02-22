package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department insert ===");
		
		//Department department = new Department(null, "Beleza");
		//departmentDao.insert(department);
		//System.out.println("Inserted! New id = " +  department.getId());
		
		System.out.println("=== TESTE 2: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		sc.close();

	}

}
