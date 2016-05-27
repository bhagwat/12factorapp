package com.ttnd.cloud

class MessageController extends BaseController {
    def index() {
        Integer total = Message.count()
        Integer offset = Math.abs(new Random().nextInt() % total)
        log.info "Getting quote ${offset}"
        respond Message.list(max: 1, offset: offset).first()
    }
}
