package com.algos.sort

class MergeTest extends ParentSpec {

    Merge mergeSort

    def setup() {
        mergeSort = Mock()
    }

    def "Merge Sort - Ascending order"() {
        when:
        int[] output = mergeSort.increasing(input)
        then:
        output == expectedOutput
    }
}