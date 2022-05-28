package services;

import main.VkInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface VkService {
    @GET("/method/wall.search")
    Call<VkInfo> getresponse (@Query("owner_id") String OWNER_ID,
                              @Query("query") String query,
                              @Query("owners_only") String owners_only,
                              @Query("count") String COUNT,
                              @Query("offset") String offset,
                              @Query("extended") String extended,
                              @Query("v") String version,
                              @Query("access_token") String access_token);
}

