package com.technicalinterview.instagramclone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.technicalinterview.instagramclone.Entity.Comment;

@Repository
public interface CommentsRepo extends CrudRepository<Comment,Integer> {
	
	Comment save(Comment comment);
	ArrayList<Comment> findAllByPostId(String postId);

}
