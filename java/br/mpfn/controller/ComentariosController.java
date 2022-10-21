package br.mpfn.controller;

import br.mpfn.model.Comentarios;
import br.mpfn.model.Post;
import br.mpfn.service.ComentariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class ComentariosController {

    @Autowired
    ComentariosService comentariosService;

    @GetMapping("/comentarios/list")
    public String findAll(Model model){
        model.addAttribute("comentarios", comentariosService.findAll());
        return "comentarios/list";
    }

    @GetMapping("/comentarios/add")
    public String add(Model model){
        model.addAttribute("comentarios", new Post());
        return "comentarios/add";
    }

    @GetMapping("/comentarios/edit/{id}")
    public String edit(Model model, @PathVariable long id){
        System.out.println( comentariosService.findById(id));
        model.addAttribute("comentarios",comentariosService.findById(id));
        return "comentarios/edit";
    }


    @PostMapping("/comentarios/save")
    public String save(Comentarios comentarios, Model model){
        try{
            comentariosService.save(comentarios);
            model.addAttribute("comentarios", comentarios);
            model.addAttribute("isSaved",true);
            return "comentarios/add";
        } catch (Exception e){
            model.addAttribute("comentarios", comentarios);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "comentarios/add";
        }
    }

    @GetMapping("/comentarios/delete/{id}")
    public String delete(@PathVariable long id){
        try{
            comentariosService.deleteById(id);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return "redirect:/comentarios/list";
    }
}
