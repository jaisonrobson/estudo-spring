package br.github.estevaodias.springboot_springmvc.model;

import java.time.LocalTime;

public class CalculadorDeTempoDeCaminhada {

    private final float MIN_VELOCIDADE_MEDIA_POR_HORA_EM_KM = 5.f;
    private final float MAX_VELOCIDADE_MEDIA_POR_HORA_EM_KM = 6.5f;

    public Caminhada calcularTempo(final float distanciaEmKm) {
        var tempoMaximo = distanciaEmKm / MIN_VELOCIDADE_MEDIA_POR_HORA_EM_KM;
        var tempoMinimo = distanciaEmKm / MAX_VELOCIDADE_MEDIA_POR_HORA_EM_KM;

        var horaMaximo = LocalTime.of((int) tempoMaximo, (int) (60 * (tempoMaximo - ((int) tempoMaximo))));
        var horaMinima = LocalTime.of((int) tempoMinimo, (int) (60 * (tempoMinimo - ((int) tempoMinimo))));

        var caminhada = new Caminhada();
        caminhada.setTempoMaximo(horaMaximo);
        caminhada.setTempoMinimo(horaMinima);

        return caminhada;
    }
}
