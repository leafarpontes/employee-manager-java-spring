package pontes.rafael.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pontes.rafael.employeemanager.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByCep(String cep);
}
