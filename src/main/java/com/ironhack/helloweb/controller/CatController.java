package com.ironhack.helloweb.controller;

import com.ironhack.helloweb.model.CatCode;
import com.ironhack.helloweb.service.CatCodeService;
import jakarta.websocket.server.PathParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cats/status")
@RequiredArgsConstructor
public class CatController {
    private final CatCodeService catCodeService;

    @GetMapping
    public List<CatCode> getAll(){
        return catCodeService.getAllCode();
    }


    @GetMapping("/{code}")
    public CatCode findByCode(@PathVariable(name = "code") int code){
        return catCodeService.getByCode(code);
    }

}
