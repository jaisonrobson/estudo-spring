package github.jaisonrobson.model;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        Date data = new Date();

        try {
            data = new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
