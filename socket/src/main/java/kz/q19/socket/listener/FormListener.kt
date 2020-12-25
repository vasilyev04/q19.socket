package kz.q19.socket.listener

import kz.q19.domain.model.Form

interface FormListener {
    fun onFormInit(form: Form)
    fun onFormFinal(trackId: String?, taskId: Long?, message: String?, success: Boolean)
}