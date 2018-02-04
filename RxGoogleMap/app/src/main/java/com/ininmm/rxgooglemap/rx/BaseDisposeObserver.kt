package com.ininmm.rxgooglemap.rx

import android.util.Log
import io.reactivex.observers.DisposableObserver

/**
 * Created by User
 * on 2017/12/22.
 */
abstract class BaseDisposeObserver<T> : DisposableObserver<T>() {

    companion object {
        val TAG = BaseDisposeObserver::class.simpleName
    }

    override fun onError(e: Throwable) {
        Log.e(TAG, "onError: " + e.message)
    }

    override fun onComplete() {
        System.out.println("onComplete: " + TAG)
    }
}
