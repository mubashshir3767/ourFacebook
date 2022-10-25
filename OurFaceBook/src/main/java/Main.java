import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dto.RegisterDto;
import model.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) throws IOException {
        RegisterDto registerDto = new RegisterDto();
        User user = new User();
        User user1 = registerDto.sing_up(user);
        System.out.println(user1);

    }
}
