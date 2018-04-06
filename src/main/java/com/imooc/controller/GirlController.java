package com.imooc.controller;

import com.imooc.domain.Girl;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by sun on 2018/4/5.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return  girlRepository.findAll();
    }
}
