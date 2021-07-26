
package edu.ups.practicadocker.dao;



import edu.ups.practicadocker.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDao extends JpaRepository<user, Long> {



}
