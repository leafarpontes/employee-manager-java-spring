package pontes.rafael.employeemanager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pontes.rafael.employeemanager.domain.Funcionario;
import pontes.rafael.employeemanager.repository.FuncionarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listAll() { return funcionarioRepository.findAll(); }
}
