package com.ininmm.rxgooglemap.rx

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import io.reactivex.Observable
import io.reactivex.functions.Function

/**
 * Created by User
 * on 2017/12/20.
 */
class InfoWindowClickFunction : Function<GoogleMap, Observable<Marker>>{
    override fun apply(map: GoogleMap): Observable<Marker> {
        return Observable.create { emitter ->
            map.setOnInfoWindowClickListener { marker -> emitter.onNext(marker) }
        }
    }
}