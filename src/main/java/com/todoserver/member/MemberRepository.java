package com.todoserver.member;

import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA repos are interfaces with methods supporting
// creating, reading, updating, and deleting records against a back-end
// data store.
// Automatically get access to: Creating new Members, Updating Existing ones,
// Deleting Members, and Finding Members

public interface MemberRepository extends JpaRepository<Member, Long> {

}
