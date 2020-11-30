import com.algos.search.LinearSearch
import spock.lang.Specification

class LinearSeachTest extends Specification {

    LinearSearch linearSearch

    def setup() {
        linearSearch = Mock()
    }

    def "Linear Search - Element Found"() {
        given:
        int[] input = [5, 66, 77, 23, 2, 56, 20, 40, 11, 29, 25]
        when:
        def output = linearSearch.search(input, 25)
        then:
        output == 25
    }
}