package com.ininmm.rxgooglemap

/**
 * Created by User
 * on 2017/12/21.
 */
private object AppConstant {
//    private fun AppConstant(): ??? {
//        // This class in not publicly instantiable.
//    }
    interface I1 { fun f(): I1 }
    val LINE_SEPARATOR = "\n"
    class Constant(appconstant: AppConstant) : I1{
        override fun f(): I1 {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}