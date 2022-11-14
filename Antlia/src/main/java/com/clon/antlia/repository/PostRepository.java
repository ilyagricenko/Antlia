package com.clon.antlia.repository;

import com.clon.antlia.model.Post;
import com.clon.antlia.model.Subreddit;
import com.clon.antlia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
