package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

}
