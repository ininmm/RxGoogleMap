package com.ininmm.rxgooglemap.rx

import io.reactivex.disposables.Disposable
import io.reactivex.functions.Function
import java.util.concurrent.atomic.AtomicReference

/**
 * Created by User
 * on 2018/2/4.
 */
abstract class BaseDisposeFunction<T, R>: Function<T, R>, Disposable {
    val s = AtomicReference<Disposable>()
}