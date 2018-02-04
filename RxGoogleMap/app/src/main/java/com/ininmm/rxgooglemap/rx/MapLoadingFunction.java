package com.ininmm.rxgooglemap.rx;

import com.google.android.gms.maps.GoogleMap;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/**
 * Created by User
 * on 2017/12/20.
 */

public class MapLoadingFunction implements Function<GoogleMap, Observable<GoogleMap>> {
    @Override
    public Observable<GoogleMap> apply(GoogleMap googleMap) throws Exception {
        return Observable.create(e -> {
            googleMap.setOnMapLoadedCallback(() -> {
                e.onNext(googleMap);
            });
        });
    }
}
