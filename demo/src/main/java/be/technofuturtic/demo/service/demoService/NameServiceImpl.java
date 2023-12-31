package be.technofuturtic.demo.service.demoService;

import be.technofuturtic.demo.models.forms.NameCreateForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NameServiceImpl implements NameService {
    @Override
    public void create(NameCreateForm form) {
        List<String> names  = this.generateNames(form.getQtt(), form.getLength());
    }

    @Override
    public List<String> generateNames(int quantity, int length) {
        Random rdm = new Random();
        char carac;
        List<String> names = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                sb.append(carac = (char) rdm.nextInt('a','z'));
            }
            names.add(sb.toString());
        }

        return names;
    }
}
