package com.ttnd.cloud

class HibernateController extends BaseController {

    def read() {
        respond Message.read(1)
    }

    def change() {
        Message message = Message.read(1)
        message.description = "Description changed : ${System.currentTimeMillis()}"
        message.save(flush: true)
        respond message
    }
}
