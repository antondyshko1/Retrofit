package cucoinApi;

import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class RetrofitCucoinTest {

    CucoinService service = CucoinManager.getManager().create(CucoinService.class);
    @Test
    public void getAllTickers()throws IOException{
        Response<TickerData> response = service.getTickers().execute();
        System.out.println(response.body());
    }

}
