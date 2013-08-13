package grails.fixtures

import grails.fixtures.demo.User
import grails.plugin.fixtures.Fixture
import grails.plugin.spock.IntegrationSpec
import spock.lang.Shared

class UserListSpec extends IntegrationSpec {
    @Shared
    def fixtureLoader
    @Shared
    Fixture fixture

    void setupSpec() {
        fixture = fixtureLoader.load {
            build {
                user1(User, email: 'user1@example.com')
                user2(User, email: 'user2@example.com')
                user3(User, email: 'user3@example.com')
            }
        }
    }

    void 'max'() {
        when:
        def users = User.list([max: 1])
        then:
        users.size() == 1
        users.totalCount == 3
        users[0] == fixture.user1
    }

}
