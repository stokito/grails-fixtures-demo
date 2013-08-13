grails-fixtures-demo
====================

Grails fixtures plugin demo

Unfortunately this great plugin has several bugs:
1. When fixtures used with Spock they are not cleaned after tests
http://stackoverflow.com/questions/16597488/grails-tests-loading-fixture-data-multiple-times-when-using-named-datasource
2. Fixtures are crated in rundom order
3. Uniq email fields can't be fixtured
