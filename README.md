grails-fixtures-demo
====================

Grails fixtures plugin demo

Unfortunately this great plugin has several bugs:

* When fixtures used with Spock they are not cleaned after tests http://stackoverflow.com/questions/16597488/grails-tests-loading-fixture-data-multiple-times-when-using-named-datasource
* Fixtures are crated in rundom order
* Uniq email fields are fixtured incorrectly by default. Actually it's not a bug, but very inconvenient. 
