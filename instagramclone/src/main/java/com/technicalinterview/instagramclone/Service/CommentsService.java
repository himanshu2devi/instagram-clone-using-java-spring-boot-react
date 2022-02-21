package com.technicalinterview.instagramclone.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalinterview.instagramclone.Entity.Comment;
import com.technicalinterview.instagramclone.Entity.Status;
import com.technicalinterview.instagramclone.Repository.CommentsRepo;

@Service
public class CommentsService {
	
	@Autowired
	CommentsRepo commentsrepo;
	
	@Autowired
	UserService userservice;
	
	public Comment submitCommentToDB(Comment comment) {
		return commentsrepo.save(comment);
		
	}

	
	public ArrayList<Comment> getAllCommentForDB(String postId){
		ArrayList<Comment> commentList=commentsrepo.findAllByPostId(postId); //storing all status in array
		
		for(int i=0;i<commentList.size();i++)
		{
			Comment commentItem=commentList.get(i);
			//this is simple project so,microservice is implemented in this way.otherwise this is not good approach
		commentItem.setUserName(userservice.displayUserMetaData(commentItem.getUserId()).getUserName()); //getting userrname from user service and send it to status response
		//this will attach username also in output in form of payload	
		}
		
		return commentList;
		
	}
}
