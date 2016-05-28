package com.ttnd.cloud


class RequestLoggerInterceptor {
    RequestLoggerInterceptor() {
        matchAll()
    }

    boolean before() {
        log.info "Grails Log: " + (params ?: request.requestURI)
        true
    }

    boolean after() { true }

    void afterView() {
    }
}
