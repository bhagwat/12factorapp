package com.ttnd.cloud

import grails.core.GrailsApplication

class BootStrap {
    GrailsApplication grailsApplication

    def init = { servletContext ->
        if (Message.count < 1) {
            log.info "Bootstrapping Quotes"
            grailsApplication.mainContext.getResource("/taglines.txt")
                    .file
                    .readLines()
                    .eachWithIndex { String line, Integer index ->
                if (line.trim().length()) {
                    new Message(title: "Quote : ${index + 1}", description: line).save()
                }
            }
        }
    }
    def destroy = {
    }
}
