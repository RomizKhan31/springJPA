// Beginner friendly version with basic input example
package com.example.TestSpringJPA;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
