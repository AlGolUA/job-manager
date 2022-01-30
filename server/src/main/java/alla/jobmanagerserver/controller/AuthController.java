package alla.jobmanagerserver.controller;

import alla.jobmanagerserver.model.AuthData;
import alla.jobmanagerserver.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping(path = "auth")
    public ResponseEntity<Response> auth(@RequestBody @Valid AuthData authData) {
        boolean ok = authData.getEmail() != null && authData.getPassword() != null && authData.getEmail().contains("123");
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("result", ok));
        response.setMessage("Users retrieved");
        response.setStatus(OK);
        response.setStatusCode(OK.value());
        return ResponseEntity.ok(response);
    }
}
