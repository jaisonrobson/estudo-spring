package br.com.devmedia.curso.web.conversor;

import org.springframework.core.convert.converter.Converter;

import br.com.devmedia.curso.domain.TipoSexo;

public class TipoSexoConverter implements Converter<String, TipoSexo> {

	@Override
	public TipoSexo convert(String texto) {
		char sexo = texto.charAt(0);
		return sexo == TipoSexo.FEMININO.getDesc() ? TipoSexo.FEMININO : TipoSexo.MASCULINO;
	}
}
