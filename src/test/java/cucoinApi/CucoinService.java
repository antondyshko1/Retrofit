package cucoinApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CucoinService {
    @GET("/api/v1/market/allTickers")
    Call<TickerData>getTickers();
}
