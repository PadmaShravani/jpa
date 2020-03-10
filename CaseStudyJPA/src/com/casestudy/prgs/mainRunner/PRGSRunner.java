package com.casestudy.prgs.mainRunner;

import com.casestudy.prgs.ModelDepartment;
import com.casestudy.prgs.ModelRole;
import com.casestudy.prgs.ModelService;
import com.casestudy.prgs.ModelTicketDetails;
import com.casestudy.prgs.ModelUsers;
import com.casestudy.prgs.service.DepartmentServiceClass;
import com.casestudy.prgs.service.RoleServiceClass;
import com.casestudy.prgs.service.ServiceServiceClass;
import com.casestudy.prgs.service.ServiceTicketDetailsClass;
import com.casestudy.prgs.service.UsersServiceClass;

public class PRGSRunner {

	public static void main(String[] args) {
		ModelRole mRole=new ModelRole(2,"Admin");
		RoleServiceClass rs=new RoleServiceClass();
		rs.createModelRole(mRole); 
		
		ModelUsers mUser=new ModelUsers(1,"satish","1234","satish kumar","satish@gmail.com","22nd sep 1983",2);
		UsersServiceClass us=new UsersServiceClass();
		us.createModelUsers(mUser);
		
		ModelTicketDetails mTicket=new ModelTicketDetails(10,"complaint",2,"electric","street light not working","abcd","pic","open",6);
		ServiceTicketDetailsClass sts=new ServiceTicketDetailsClass();
		sts.createModelTicketDetails(mTicket);
		
		ModelService mService=new ModelService(6,"replace light","open",3,8);
		ServiceServiceClass ss=new ServiceServiceClass();
		ss.createModelService(mService);
		
		ModelDepartment mDepartment =new ModelDepartment(8,"electricity","abc@com","xyz@com");
		DepartmentServiceClass ds=new DepartmentServiceClass();
		ds.createModelDepartment(mDepartment);
		
	}

}
