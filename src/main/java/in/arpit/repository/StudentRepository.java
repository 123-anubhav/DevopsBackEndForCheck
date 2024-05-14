package in.arpit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arpit.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
