package alla.jobmanagerserver;

import alla.jobmanagerserver.model.User;
import alla.jobmanagerserver.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

//    CommandLineRunner run(UserRepo userRepo) {
//        return args -> {
//            userRepo.create(new User(1, "A", "Big A"));
//            userRepo.create(new User(2, "A", "Big B"));
//            userRepo.create(new User(3, "c", "small c"));
//        };
//    }
}
