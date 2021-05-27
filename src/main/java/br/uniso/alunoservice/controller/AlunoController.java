package br.uniso.alunoservice.controller;


import br.uniso.alunoservice.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    private static List<Aluno> alunos = new ArrayList<>();

    static {
        Aluno a1 = new Aluno();
        a1.setNome("Bert");
        a1.setRa(34343);

        Aluno a2 = new Aluno();
        a2.setNome("Paola Zanchetta");
        a2.setRa(11111);

        alunos.add(a1);
        alunos.add(a2);
    }
    @GetMapping("/listarAlunos")
    public List<Aluno> getTodosAlunos(){
        return alunos;
    }
}
