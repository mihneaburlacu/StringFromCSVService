import com.Mihnea.DTO.NewStringRequest;
import com.Mihnea.impl.NewString;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        NewString newString = new NewString();
        NewStringRequest request = new NewStringRequest();
        request.setInputString("full_name, email, location\nAnita, anita@email.com, California\nAron, aron.bla@email.com, California\nAron, aron.bla@email.com, California\nCosmin, kox@bla.com, Giurgiu\nCrina, ggl@test.com, Letcani\nBogdan, vox@example.com, Resita");
        System.out.println(newString.service(request).toString());
    }
}
