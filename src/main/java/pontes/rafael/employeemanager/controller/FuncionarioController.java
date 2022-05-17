package pontes.rafael.employeemanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pontes.rafael.employeemanager.domain.Funcionario;
import pontes.rafael.employeemanager.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    @GetMapping()
    public ResponseEntity<List<Funcionario>> list() {
        return new ResponseEntity<>(funcionarioService.listAll(), HttpStatus.OK);
    }

}
