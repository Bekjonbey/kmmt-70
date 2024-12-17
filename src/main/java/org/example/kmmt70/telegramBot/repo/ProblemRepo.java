package org.example.kmmt70.telegramBot.repo;

import org.example.kmmt70.telegramBot.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepo extends JpaRepository<Problem, Long> {
}
