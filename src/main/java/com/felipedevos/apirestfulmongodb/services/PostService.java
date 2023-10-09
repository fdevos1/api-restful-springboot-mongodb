package com.felipedevos.apirestfulmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipedevos.apirestfulmongodb.domain.Post;
import com.felipedevos.apirestfulmongodb.repository.PostRepository;
import com.felipedevos.apirestfulmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);

		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
