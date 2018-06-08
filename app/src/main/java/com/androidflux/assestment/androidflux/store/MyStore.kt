package com.androidflux.assestment.androidflux.store

import android.util.Log
import com.hardsoftstudio.rxflux.action.RxAction
import com.hardsoftstudio.rxflux.dispatcher.Dispatcher
import com.hardsoftstudio.rxflux.store.RxStore
import com.hardsoftstudio.rxflux.store.RxStoreChange

/**
 *
 *   Created by Dilip Maharjan on 07-06-2018
 */
class MyStore(dispatcher: Dispatcher) : RxStore(dispatcher) {
    private val TAG = "MyStore"


    override fun onRxAction(action: RxAction) {
        when (action.type) {
            "WIFI_CONNECTION" -> {
                val connected: Boolean = action.get("status")
            }
        }
        postChange(RxStoreChange("MY_STORE", action))
    }
}