package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("numerosRomanos")
public class NumerosRomanos {

    @GetMapping("/{numero}")
    public String getNumeroRomano(@PathVariable("numero") int numero){
        if(numero <= 0)
            return "NUMBER MUST BE GREATER THAN 0";
        if(numero > 3999)
            return "NUMBER MUST BE LOWER THAN 4000";
        String result = "";


        for(NumerosRomanosEnum romanosEnum: NumerosRomanosEnum.values()){
            if(numero >= romanosEnum.value){
                int quantidade = numero / romanosEnum.value;
                if(quantidade > 3)quantidade = 3;
                numero -= quantidade * romanosEnum.value;
                result += romanosEnum.name.repeat(quantidade);
            }
            if (numero == 0) break;
        }

        return result;
    }
}