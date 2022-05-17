package pontes.rafael.employeemanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(path = "/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable long id) {
        return new ResponseEntity<>(funcionarioService.findByIdOrThrowBadRequestException(id), HttpStatus.OK);
    }

    @GetMapping(path = "/find-by-cep")
    public ResponseEntity<List<Funcionario>> findByCep(@RequestParam String cep) {
        return new ResponseEntity<>(funcionarioService.findByCep(cep), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {
        return new ResponseEntity<>(funcionarioService.save(funcionario), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        funcionarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
