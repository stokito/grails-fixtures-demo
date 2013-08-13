package grails.fixtures

import grails.fixtures.demo.User
import grails.plugin.fixtures.Fixture

class UserListTest extends GroovyTestCase {
    def fixtureLoader
    Fixture fixture

    void testList() {
        fixture = fixtureLoader.load {
            build {
                user1(User)
                user2(User)
                user3(User)
            }
        }
        assert fixture.user1
        assert User.list().size() == 3
    }



}
