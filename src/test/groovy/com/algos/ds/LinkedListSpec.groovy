package com.algos.ds


import spock.lang.Specification

class LinkedListSpec extends Specification {

    def setup() {

    }

    def "List"() {
        given:
        LinkedList<String> strList = new LinkedList<>();
        when:
        strList.add("Vamsi");
        then:
        strList !== null
    }
}
