package com.ttnd.cloud

class BaseController {
    static responseFormats = ['json', 'xml']

    def index() {
        respond status: "I am working fine",
                currentTime: new Date().time,
                controller: controllerName,
                action: actionName,
                params: params
    }
}
