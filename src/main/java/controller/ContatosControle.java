package controller;

import com.example.Simpli_Contato.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ContatosControle {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("1", "Luan", "+55 (81) 98888-8888"));
        LISTA_CONTATOS.add(new Contato("2", "Lucca", "+55 (81) 97777-7777"));
        LISTA_CONTATOS.add(new Contato("3", "Mario", "+55 (81) 96666-6666"));
        LISTA_CONTATOS.add(new Contato("4", "Kalina", "+55 (81) 95555-5555"));
        LISTA_CONTATOS.add(new Contato("5", "Leticia", "+55 (81) 94444-4444"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("listar");

        modelAndView.addObject("contatos", LISTA_CONTATOS);

        return modelAndView;
    }

}
