package com.example.movieapp.ui.movie

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.movieapp.data.Rating
import com.example.movieapp.remote.MovieInterface
import com.example.movieapp.utils.Constants
import java.lang.Exception

class MoviePaging(val i:String,val movieInterface:MovieInterface): PagingSource<Int, Rating>(){
    override fun getRefreshKey(state: PagingState<Int, Rating>): Int? {
        return state.anchorPosition?.let {
            val anchorPage= state?.closestPageToPosition(it)
            anchorPage?.prevKey?.plus(1)?:anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Rating> {
        val page=params.key?:1
        return try {
            val data =movieInterface.getAllMovies(i,page, Constants.API_KEY)

            LoadResult.Page(
                data=data.body()?.Ratings!!,
                prevKey = if (page==1) null else page-1,
                nextKey = if (data.body()?.Ratings?.isEmpty()!!) null else page+1
            )
        } catch (e:Exception){
            LoadResult.Error(e)
        }
    }

}