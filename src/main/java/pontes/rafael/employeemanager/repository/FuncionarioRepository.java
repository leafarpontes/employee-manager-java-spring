package pontes.rafael.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pontes.rafael.employeemanager.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
