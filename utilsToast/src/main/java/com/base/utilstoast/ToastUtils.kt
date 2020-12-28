package com.base.utilstoast

import android.content.Context
import android.widget.Toast

/**
 * @author: chenlin
 * @date: 2020/12/28 0028
 */
object ToastUtils {
    var toast: Toast? = null

    fun showToast(context: Context,id:String){
        if(toast == null){
            toast = Toast.makeText(context,id,Toast.LENGTH_SHORT)
        }else{
            toast!!.setText(id)
        }
        toast!!.show()
    }
}