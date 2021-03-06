import grails.util.BuildSettings
import grails.util.Environment

appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}

root(INFO, ['STDOUT'])

logger 'grails.app.controllers', INFO, ['STDOUT'], false
logger 'grails.app.services', INFO, ['STDOUT'], false
logger 'com.ttnd.cloud', INFO, ['STDOUT'], false

def targetDir = BuildSettings.TARGET_DIR
if (Environment.isDevelopmentMode() && targetDir) {
    appender("FULL_STACKTRACE", FileAppender) {
        file = "${targetDir}/stacktrace.log"
        append = true
        encoder(PatternLayoutEncoder) {
            pattern = "%level %logger - %msg%n"
        }
    }
    logger("StackTrace", ERROR, ['FULL_STACKTRACE'], false)
}
