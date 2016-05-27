package com.ttnd.cloud

import grails.plugin.cache.CacheEvict
import grails.plugin.cache.CachePut
import grails.plugin.cache.Cacheable
import grails.transaction.Transactional

@Transactional
class MessageCacheService {

    @Cacheable('message')
    Message getMessage(String title) {
        log.info 'Fetching message'
        Message.findByTitle(title)
    }

    @CachePut(value = 'message', key = '#message.title')
    void save(Message message) {
        log.info "Saving message $message"
        message.save()
    }

    @CacheEvict(value = 'message', key = '#message.title')
    void delete(Message message) {
        log.info "Deleting message $message"
        message.delete()
    }
}
