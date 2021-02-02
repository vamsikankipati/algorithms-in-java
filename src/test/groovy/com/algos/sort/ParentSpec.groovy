package com.algos.sort

import spock.lang.Specification

class ParentSpec extends Specification{
    int[] smallInput = [5, 66, 77, 23, 2, 56, 20, 40, 11, 29, 25]
    int[] largeInput = [200, 500, 450, 420, 350, 320, 210, 300, 290, 280, 270,
                      120, 110, 5, 66, 77, 23, 2, 56, 20, 40, 11, 29, 25]

    int[] expectedSmallOutput = [2, 5, 11, 20, 23, 25, 29, 40, 56, 66, 77]
    int[] expectedLargeOutput = [2, 5, 11, 20, 23, 25, 29, 40, 56, 66, 77, 110,
                                 120, 200, 210, 270, 280, 290, 300, 320, 350, 420, 450, 500]

    def input = largeInput
    int[] expectedOutput = expectedLargeOutput
}
