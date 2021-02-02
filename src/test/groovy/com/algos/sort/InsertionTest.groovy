package com.algos.sort

class InsertionTest extends ParentSpec {

    Insertion insertionSort

    def setup() {
        insertionSort = Mock()
    }

    def "Insertion Sort - Ascending order"() {
        when:
        int[] output = insertionSort.increasing(input)
        then:
        output == expectedOutput
    }
}