package com.emp.Emp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 * Hello world!
 *
 */
public class App 
{
	int ch;
	Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
       App ap=new App();
       ap.display();
      
    }
    public void DataEntrytoEmp()
    {
    	Session session=HibernateUtil.getSession();
    	Emp en=new Emp();
    	System.out.println("enter Employyee Name");
    	en.setEname(sc.next());
    	System.out.println("enter Employyee Salary");
    	en.setEsal(sc.nextInt());
    	//System.out.println("enter Employyee manager Id");
    	//en.setMid(sc.nextInt());
    	//System.out.println("enter Employyee Department Id");
    	//en.setDid(sc.nextInt());
    	 Transaction tx=session.beginTransaction();
         session.save(en);
         System.out.println(en);
         tx.commit();
         session.close();
    }
    public void DataEntrytoManager() 
    {
    	Session session=HibernateUtil.getSession();
    	Manager_data md=new Manager_data();
    	System.out.println("Enter Manager Name");
    	md.setMname(sc.next());
    	System.out.println("Enter Manager Department");
    	md.setM_department(sc.next());
    	System.out.println("Enter Manager city");
    	md.setM_city(sc.next());
    	 Transaction tx=session.beginTransaction();
         session.save(md);
         System.out.println(md);
         tx.commit();
         session.close();
    }
    public void DataEntrytoDepartment()
    {
    	Session session=HibernateUtil.getSession();
    	Department dp=new Department();
    	System.out.println("Enter Department Name");
    	dp.setD_name(sc.next());
    	 Transaction tx=session.beginTransaction();
         session.save(dp);
         System.out.println(dp);
         tx.commit();
         session.close();
    	
    }
    public void getDatabyidfromEmp()
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Emplooyee Id");
    	int id=sc.nextInt();
    	Emp en=session.get(Emp.class,id);
    	System.out.println("Emp Id:"+en.getEmpid());
    	System.out.println("Emp Name:"+en.getEname());
    	System.out.println("Emp Salary:"+en.getEsal());
    	tx.commit();
    	session.close();
    }
    public void getDatabyidfromManager()
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Emplooyee Id");
    	int id=sc.nextInt();
    	Manager_data md=session.get(Manager_data.class,id);
    	System.out.println("Manager Id:"+md.getMid());
    	System.out.println("Manager Name:"+md.getMname());
    	System.out.println("Manager Department:"+md.getM_department());
    	System.out.println("Manager City:"+md.getM_city());
    	tx.commit();
    	session.close();
    }
    public void getDatabyidDepartment() 
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Department Id");
    	int id=sc.nextInt();
    	Department dp=session.get(Department.class,id);
    	System.out.println("Department Id:"+dp.getD_id());
    	System.out.println("Department Name:"+dp.getD_name());
    	tx.commit();
    	session.close();
	}
    public void UpdatedatabyidEmpName()
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Employee Id");
    	int id=sc.nextInt();
    	Emp en=session.get(Emp.class, id);
    	System.out.println("Enter Employye name");
    	en.setEname(sc.next());
    	session.saveOrUpdate(en);
    	tx.commit();
    	session.close();
    }
    public void UpdatedatabyidEmpSalary()
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Employee Id");
    	int id=sc.nextInt();
    	Emp en=session.get(Emp.class, id);
    	System.out.println("Enter Employye Salary");
    	en.setEsal(sc.nextInt());
    	session.saveOrUpdate(en);
    	tx.commit();
    	session.close();
	}
    public void Updatedatabyidmanagername() 
    {
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Enter Manager Id");
		int id=sc.nextInt();
		Manager_data md=session.get(Manager_data.class, id);
		System.out.println("Enter Manager Name");
		md.setMname(sc.next());
		session.saveOrUpdate(md);
		tx.commit();
		session.close();
	}
    public void UpdatedatabyidmanagerDepartment()
    {
    	Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Enter Manager Id");
		int id=sc.nextInt();
		Manager_data md=session.get(Manager_data.class, id);
		System.out.println("Enter Manager Department");
		md.setM_department(sc.next());
		session.saveOrUpdate(md);
		tx.commit();
		session.close();
	}
    public void UpdatedatabyidmanagerCity() 
    {
    	Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Enter Manager Id");
		int id=sc.nextInt();
		Manager_data md=session.get(Manager_data.class, id);
		System.out.println("Enter Manager city");
		md.setM_city(sc.next());
		session.saveOrUpdate(md);
		tx.commit();
		session.close();
	}
    public void UpdatedatabyidDepartmentname() 
    {
    	Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Enter Department Id");
		int id=sc.nextInt();
		Department dp=session.get(Department.class, id);
		System.out.println("Enter department Name");
		dp.setD_name(sc.next());
		session.saveOrUpdate(dp);
		tx.commit();
		session.close();
	}
    public void DeletedatabyidEmp() 
    {
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		Emp en=session.get(Emp.class, id);
		session.delete(en);
		tx.commit();
		session.close();
	}
    public void DeletedatabyidManager() 
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Manager id");
    	int id=sc.nextInt();
    	Manager_data md=session.get(Manager_data.class, id);
    	session.delete(md);
    	tx.commit();
    	session.close();
	}
    public void DeletedatabyidDepartment() 
    {
    	Session session=HibernateUtil.getSession();
    	Transaction tx=session.beginTransaction();
    	System.out.println("Enter Manager id");
    	int id=sc.nextInt();
    	Department dp=session.get(Department.class, id);
    	session.delete(dp);
    	tx.commit();
    	session.close();
	}
    public void display()
    {
    	int ch,ch1;
    	char ans;
    	do
    	{
    	System.out.println("Management System");
    	System.out.println("Enter your Section");
    	System.out.println("1:Employee Section");
    	System.out.println("2:Manager Section");
    	System.out.println("3:Department Section");
    	ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    		System.out.println("Which Process do you want to execute");
    		System.out.println("1:Want to add the Data Of Employee");
    		System.out.println("2:Want to Show data by Employee Id ");
    		System.out.println("3:Want to Update data of Employee");
    		System.out.println("4:Want to delete data of Employee");
    		ch1=sc.nextInt();
    		switch(ch1)
    		{
    		case 1:
    			DataEntrytoEmp();
    			break;
    		case 2:
    			getDatabyidfromEmp();
    			break;
    		case 3:
    			System.out.println("Which Field do you want to update");
    			System.out.println("1:Update Name");
    			System.out.println("2:Update Salary");
    			int ch3=sc.nextInt();
    			switch(ch3)
    			{
    			case 1:
    				UpdatedatabyidEmpName();
    				break;
    			case 2:
    				UpdatedatabyidEmpSalary();
    				break;
    			default:
    				System.out.println("Sorry you entered wrong choice");
    				break;
    			}
    			break;
    		case 4:
    			DeletedatabyidEmp();
    			break;
    		default:
    			System.out.println("Sorry you entered wrong choice");
				break;
    		}
    		break;
    	case 2:
    		System.out.println("Which Process do you want to execute");
    		System.out.println("1:Want to add the Data Of Manager");
    		System.out.println("2:Want to Show data by Manager Id ");
    		System.out.println("3:Want to Update data of Manager");
    		System.out.println("4:Want to delete data of Manager");
    		int ch3=sc.nextInt();
    		switch(ch3)
    		{
    		case 1:
    			DataEntrytoManager();
    			break;
    		case 2:
    			getDatabyidfromManager();
    			break;
    		case 3:
    			System.out.println("Which Data do you want to Update");
    			System.out.println("1:Manager Name");
    			System.out.println("2:Manager Department");
    			System.out.println("3:Manager City");
    			int ch4=sc.nextInt();
    			switch(ch4)
    			{
    			case 1:
    				Updatedatabyidmanagername();
    				break;
    			case 2:
    				UpdatedatabyidmanagerDepartment();
    				break;
    			case 3:
    				UpdatedatabyidmanagerCity();
    				break;
    			default:
    				System.out.println("Sorry you entered wrong choice");
    				break;
    			}
    			break;
    		case 4:
    			DeletedatabyidManager();
    			break;
    		default:
				System.out.println("Sorry you entered wrong choice");
				break;
    		}
    		break;
    	case 3:
    		System.out.println("Which Process do you want to execute");
    		System.out.println("1:Want to add the Data Of Department");
    		System.out.println("2:Want to Show data by Department Id ");
    		System.out.println("3:Want to Update data of Department");
    		System.out.println("4:Want to delete data of Department");
    		int ch5=sc.nextInt();
    		switch(ch5) 
    		{
    		case 1:
    			DataEntrytoDepartment();
    			break;
    		case 2:
    			getDatabyidDepartment();
    			break;
    		case 3:
    			UpdatedatabyidDepartmentname();
    			break;
    		case 4:
    			DeletedatabyidDepartment();
    			break;
    		default:
				System.out.println("Sorry you entered wrong choice");
				break;
    		}
    		break;
    	default:
			System.out.println("Sorry you entered wrong choice");
			break;
    	}
    	
    	System.out.println("Do you want to perform another operation");
    	System.out.println("Y:yes"+"\n"+"N:No");
    	 ans=sc.next().charAt(0);
    }while(ans=='Y'||ans=='y');
    } 
}
