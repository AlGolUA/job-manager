package alla.jobmanagerserver.resource;

import alla.jobmanagerserver.model.Response;
import alla.jobmanagerserver.model.User;
import alla.jobmanagerserver.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/user")
public class UserResource {
    private final UserServiceImpl userService;

    public UserResource(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public ResponseEntity<Response> getUsers() {
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("user", userService.list(30)));
        response.setMessage("Users retrieved");
        response.setStatus(OK);
        response.setStatusCode(OK.value());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Response> getUser(@PathVariable("id") Integer id) {
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("user", userService.get(id)));
        response.setMessage("User retrieved");
        response.setStatus(OK);
        response.setStatusCode(OK.value());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable("id") Integer id) {
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("deleted", userService.delete(id)));
        response.setMessage("User deleted");
        response.setStatus(OK);
        response.setStatusCode(OK.value());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/save")
    public ResponseEntity<Response> saveUser(@RequestBody @Valid User user) {
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("user", userService.create(user)));
        response.setMessage("User created");
        response.setStatus(CREATED);
        response.setStatusCode(CREATED.value());
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update")
    public ResponseEntity<Response> updateUser(@RequestBody @Valid User user) {
        Response response = new Response();
        response.setTimeStamp(now());
        response.setData(of("user", userService.update(user)));
        response.setMessage("User updated");
        response.setStatus(OK);
        response.setStatusCode(OK.value());
        return ResponseEntity.ok(response);
    }



}
