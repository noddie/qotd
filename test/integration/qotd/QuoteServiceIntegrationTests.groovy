package qotd

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {
    def quoteService

    @Before
    void setUp() {

    }

    @After
    void tearDown() {
    }

    @Test
    void testStaticQuote() {
        String testAuthor = "Anonymous"
        String testContent = "Real Programmers Don't eat Quiche"
        def staticQuote = quoteService.getStaticQuote()
        assertEquals(testAuthor, staticQuote.author)
        assertEquals(testContent, staticQuote.content)
    }
}
