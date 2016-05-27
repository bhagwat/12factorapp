package com.ttnd.cloud

class SessionController extends BaseController {
    def counter() {
        session.counter = session.counter ?: 0
        session.counter++
        [counter: session.counter]
    }
}
