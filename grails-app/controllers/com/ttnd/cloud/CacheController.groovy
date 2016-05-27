package com.ttnd.cloud

class CacheController extends BaseController {
    MessageCacheService messageCacheService

    def save(Message message) {
        messageCacheService.save(message)
        respond message
    }

    def find(String title) {
        respond messageCacheService.getMessage(title)
    }

    def delete(String title) {
        Message message = Message.findByTitle(title)
        messageCacheService.delete(message)
        respond status: "message with tile : ${title} got deleted."
    }

    def test() {
//        import com.ttnd.cloud.*
//Message message=new Message(title: 't5', description: 'd4')
//ctx.messageCacheService.save(message)

//        Message message1=ctx.messageCacheService.getMessage('t5')
//        println message1.dump()
//message1.description="modified"
//ctx.messageCacheService.save(message1)

    }
}
