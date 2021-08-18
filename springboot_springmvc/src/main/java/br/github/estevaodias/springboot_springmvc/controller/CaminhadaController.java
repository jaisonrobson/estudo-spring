package br.github.estevaodias.springboot_springmvc.controller;

import br.github.estevaodias.springboot_springmvc.model.CalculadorDeTempoDeCaminhada;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CaminhadaController {

    private CalculadorDeTempoDeCaminhada calculadorDeTempoDeCaminhada = new CalculadorDeTempoDeCaminhada();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtemValores() {

        return "/obtemValores";
    }

    @RequestMapping(value = "/exibeResultado", method = RequestMethod.GET)
    public String exibeResultado(@RequestParam(value = "distanciaEmKm", required = true) final Float distanciaEmKm, final Model model) {
        var caminhada = calculadorDeTempoDeCaminhada.calcularTempo(distanciaEmKm);

        model.addAttribute("tempoMaximo", caminhada.getTempoMaximo());
        model.addAttribute("tempoMinimo", caminhada.getTempoMinimo());

        return "/exibeResultado";
    }
}
