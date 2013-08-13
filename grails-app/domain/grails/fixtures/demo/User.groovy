package grails.fixtures.demo

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includes = 'email')
class User {

    String email

    static constraints = {
        email(nullable: false, blank: false, email: true, unique: true)
    }
}
