# Grails fixtures demo

Grails [fixtures](http://www.grails.org/plugin/fixtures) and [build test data](http://grails.org/plugin/build-test-data) plugins demo application.

## Useful links
* [Build test data plugin on GitHub](https://github.com/tednaleid/build-test-data)
* [Features](http://github.com/tednaleid/build-test-data/wiki/Features)
* [Overview Presentation](http://www.slideshare.net/tednaleid/grails-buildtestdata-plugin-1723277)
* [Installation](http://github.com/tednaleid/build-test-data/wiki/Installation)
* [Basic Usage](http://github.com/tednaleid/build-test-data/wiki/BasicUsage)
* [Unit Test Support](http://github.com/tednaleid/build-test-data/wiki/UnitTestSupport) - as of Grails 2.0
* [Sample Code](http://github.com/tednaleid/build-test-data/wiki/SampleCode)
* [Configuration using TestDataConfig](http://github.com/tednaleid/build-test-data/wiki/TestDataConfig)
* [Other Test Data Creation Patterns](http://github.com/tednaleid/build-test-data/wiki/OtherTestDataCreationStrengthsWeaknesses)
* [Release Notes/Upgrade Instructions](http://github.com/tednaleid/build-test-data/wiki/ReleaseNotes)

## Known issues
Unfortunately this great plugin has several bugs:

* When fixtures used with Spock they are not cleaned after tests http://stackoverflow.com/questions/16597488/grails-tests-loading-fixture-data-multiple-times-when-using-named-datasource
* Fixtures are created in random order
* Uniq email fields are fixtured incorrectly by default. Actually it's not a bug, but very inconvenient. 
