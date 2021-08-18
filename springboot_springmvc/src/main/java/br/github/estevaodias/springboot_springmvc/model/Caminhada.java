package br.github.estevaodias.springboot_springmvc.model;

import java.time.LocalTime;

public class Caminhada {

    private LocalTime tempoMaximo;
    private LocalTime tempoMinimo;

    public LocalTime getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(final LocalTime tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public LocalTime getTempoMinimo() {
        return tempoMinimo;
    }

    public void setTempoMinimo(final LocalTime tempoMinimo) {
        this.tempoMinimo = tempoMinimo;
    }
}
