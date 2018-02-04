package com.ininmm.rxgooglemap.rx

import com.google.android.gms.maps.GoogleMap
import io.reactivex.Observable
import io.reactivex.functions.Function

/**
 * Created by User
 * on 2017/12/20.
 */
class MapLoadFunction : Function<GoogleMap, Observable<GoogleMap>>{
    override fun apply(map: GoogleMap): Observable<GoogleMap> {
        return Observable.create {
            map.setOnMapLoadedCallback { it.onNext(map) }
        }
    }
}