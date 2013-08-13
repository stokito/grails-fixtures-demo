package grails.fixtures

import grails.fixtures.demo.User
import grails.plugin.fixtures.Fixture
import grails.plugin.spock.IntegrationSpec
import spock.lang.Shared

class UserList2Spec extends IntegrationSpec {
    @Shared
    def fixtureLoader
    @Shared
    Fixture fixture

    void setupSpec() {
        fixture = fixtureLoader.load {
            build {
                user1(User)
                user2(User)
                user3(User)
            }
        }
    }

    void 'max'() {
        when:
        def users = User.list([max: 1, sort: 'email'])
        then:
        users.size() == 1
        users.totalCount == 3
        users[0] == fixture.user1
    }

}
