package ru.sskva.phraseadmin.domen.response.error;

import lombok.Builder;
import lombok.Data;
import ru.sskva.phraseadmin.domen.response.Response;


@Data
@Builder
public class ErrorResponse implements Response {

    private Error error;
}
