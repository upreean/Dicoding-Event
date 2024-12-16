package lat.pam.dicodingevent.data.retrofit

import lat.pam.dicodingevent.data.response.ListEventsItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("events")
    fun getActiveEvents(
        @Query("active") isActive: Boolean
    ): Call<List<ListEventsItem>>
}