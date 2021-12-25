package alla.jobmanagerserver.resource;

import alla.jobmanagerserver.model.Response;
import alla.jobmanagerserver.model.User;
import alla.jobmanagerserver.service.UserService;
import alla.jobmanagerserver.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {
    private final UserServiceImpl userService;

    @GetMapping("/list")
    public ResponseEntity<Response> getUsers() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("users", userService.list(30)))
                        .message("Users retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Response> getUser(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userService.get(id)))
                        .message("User retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("deleted", userService.delete(id)))
                        .message("User deleted")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @PostMapping("/save")
    public ResponseEntity<Response> saveUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userService.create(user)))
                        .message("User created")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build());
    }

    @PutMapping("/update")
    public ResponseEntity<Response> updateUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userService.update(user)))
                        .message("User created")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build());
    }



}
