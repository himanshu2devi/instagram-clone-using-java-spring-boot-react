package com.technicalinterview.instagramclone.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Repository.StatusRepo;

@Service
public class StatusService {
	
	@Autowired
	StatusRepo statusrepo;
	
	@Autowired
	UserService userservice;
	
	public Status submitDataIntoDB(Status status) {
		return statusrepo.save(status);
	}
	
	public ArrayList<Status> retriveStatus(){
		
		ArrayList<Status> statusList=statusrepo.findAll(); //storing all status in array
		
		for(int i=0;i<statusList.size();i++)
		{
			Status statusItem=statusList.get(i);
			//this is simple project so,microservice is implemented in this way.otherwise this is not good approach
		statusItem.setUserName(userservice.displayUserMetaData(statusItem.getUserId()).getUserName()); //getting userrname from user service and send it to status response
		//this will attach username also in output in form of payload	
		}
		
		return statusList;
	}

}
