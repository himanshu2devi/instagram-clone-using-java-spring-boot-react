package com.technicalinterview.instagramclone.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technicalinterview.instagramclone.Entity.Comment;
import com.technicalinterview.instagramclone.Service.CommentsService;

@RestController
@RequestMapping("/commnets")
public class CommentController {
	
	
	@Autowired
	CommentsService commentsservice;
	
	@PostMapping("")
	private Comment submitComment(@RequestBody Comment comment) {
		return commentsservice.submitCommentToDB(comment);
		
	}
	
	@GetMapping("/{postId}")
	private ArrayList<Comment> getCommentsForPost(@PathVariable("postId") String postId){
		return commentsservice.getAllCommentForDB(postId);

}
	}
