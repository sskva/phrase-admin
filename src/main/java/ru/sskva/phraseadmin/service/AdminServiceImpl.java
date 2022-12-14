package ru.sskva.phraseadmin.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.sskva.phraseadmin.domen.response.Response;
import ru.sskva.phraseadmin.domen.response.SuccessResponse;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

    @Override
    public ResponseEntity<Response> test() {

        return new ResponseEntity<>(SuccessResponse.builder().build(), HttpStatus.OK);
    }
}
