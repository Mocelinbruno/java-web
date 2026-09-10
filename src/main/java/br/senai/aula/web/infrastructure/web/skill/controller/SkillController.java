package br.senai.aula.web.infrastructure.web.skill.controller;

import br.senai.aula.web.application.port.in.skill.CreateSkillUseCase;
import br.senai.aula.web.application.port.in.skill.DeleteSkillUseCase;
import br.senai.aula.web.domain.user.User;
import br.senai.aula.web.infrastructure.web.user.request.CreateUserRequest;
import br.senai.aula.web.infrastructure.web.user.response.UserResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final CreateSkillUseCase createSkillUseCase;
    private final DeleteSkillUseCase deleteSkillUseCase;

    public SkillController(CreateSkillUseCase createSkillUseCase, DeleteSkillUseCase deleteSkillUseCase) {
        this.createSkillUseCase = createSkillUseCase;
        this.deleteSkillUseCase = deleteSkillUseCase;
    }

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public UserResponse create(@Valid @RequestBody CreateUserRequest request) {
    User user = createSkillUseCase.create(request.name(), request.description());
    return UserResponse.from(user);
}
