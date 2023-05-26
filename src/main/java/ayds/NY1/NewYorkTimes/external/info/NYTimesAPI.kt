package ayds.NY1.NewYorkTimes.external.info

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTimesAPI {
    @GET("articlesearch.json?api-key=fFnIAXXz8s8aJ4dB8CVOJl0Um2P96Zyx")
    fun getArtistInfo(@Query("q") artist: String): Response<String>
}