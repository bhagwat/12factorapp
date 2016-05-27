#!/usr/bin/env bash
set -e
exec java -Dgrails.env=$GRAILS_ENV -jar application.war $@