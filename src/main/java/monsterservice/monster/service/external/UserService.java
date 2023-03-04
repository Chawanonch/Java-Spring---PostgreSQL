package monsterservice.monster.service.external;

import monsterservice.monster.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplatee;

    public User getUser() {
        return restTemplatee.getForEntity(
                "https://randomuser.me/api/?nat=US&inc=name,gender,nat&noinfo",
                User.class).getBody();
    }

}
