package br.mpfn.controller;

import br.mpfn.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model)
    {return  "/home"; }

    @GetMapping("/login")
    public String login(Model model)
    {return  "/login"; }

    @GetMapping("/usuario/edit")
    public String edit(Model model)
    {return  "usuario/edit"; }

    @GetMapping("/materias/primeiro")
    public String primeiro(Model model)
    {return  "/materias/primeiro"; }

    @GetMapping("/materias/segundo")
    public String segundo(Model model)
    {return  "/materias/segundo"; }

    @GetMapping("/materias/terceiro")
    public String terceiro(Model model)
    {return  "/materias/terceiro"; }

    @GetMapping("/materias/visualizar")
    public String visualizar(Model model)
    {return  "/materias/visualizar"; }
}
