package ru.sskva.phraseadmin.service;

import org.springframework.http.ResponseEntity;
import ru.sskva.phraseadmin.domen.response.Response;

public interface AdminService {

    ResponseEntity<Response> test();
}
