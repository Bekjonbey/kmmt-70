package org.example.kmmt70.telegramBot.repository;

import org.example.kmmt70.telegramBot.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    Optional<Group> findFirstByGroupId(String groupId);
    List<Group> findAllByDeletedIs(Boolean deleted);

    Optional<Group> findByGroupIdAndUserId(String groupId, String userId);

}
