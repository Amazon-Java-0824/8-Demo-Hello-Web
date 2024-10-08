package com.ironhack.helloweb.service;

import com.ironhack.helloweb.model.CatCode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatCodeService {

    private final List<CatCode> catCodes;

    public CatCodeService() {
        catCodes = new ArrayList<>(List.of(
                new CatCode("ok", 200, "All good, maw", "status/ok.jpg"),
                new CatCode("bad request", 400, "You did something wrong with the request", "status/bad-request.jpg"),
                new CatCode("not found", 404, "Cat not found", "status/not-found.jpg")
        ));
    }

    public List<CatCode> getAllCode(){
        return catCodes;
    }

    public CatCode getByCode(int code){
        for(CatCode catCode : catCodes){
            if (code == catCode.status())
                return catCode;
            }
            return null;
        }

}
