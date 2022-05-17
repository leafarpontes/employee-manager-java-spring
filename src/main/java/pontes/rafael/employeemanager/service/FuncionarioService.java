package pontes.rafael.employeemanager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pontes.rafael.employeemanager.domain.Funcionario;
import pontes.rafael.employeemanager.repository.FuncionarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listAll() { return funcionarioRepository.findAll(); }

    public Funcionario findByIdOrThrowBadRequestException(long id) {
        return funcionarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Funcionário não encontrado."));
    }

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
