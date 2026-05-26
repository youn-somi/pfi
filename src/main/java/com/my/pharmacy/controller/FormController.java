package com.my.pharmacy.controller;

import com.my.pharmacy.dto.DocumentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class FormController {

    @GetMapping
    public String mainFoorm() {
        return "main";

    }
 @GetMapping("/output")
    public String outputForm() {
        return "output";
 }
@PostMapping("/search")
    public  String searchAddress(@RequestParam("address")String address) {
        log.info("결과 : " + kakaoApiResponseDto);

        //결과 중 Documents  만 빼서 dto 저장
    DocumentDto documentDto = kakaoApiResponseDto
            .getDocumentList().get(0);
    log.info("도큐먼트만 출력 : " + documentDto);
        return "output";

}

}
