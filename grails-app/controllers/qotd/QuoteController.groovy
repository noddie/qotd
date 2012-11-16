package qotd

class QuoteController {
    def quoteService
    def scaffold = true

    def random = {

        def randomQuote = quoteService.getRandomQuote()
        [quote: randomQuote]
    }

    def ajaxRandom = {

        def randomQuote = quoteService.getRandomQuote()
        render "<q>${randomQuote.content}</q>" +
                "<p>${randomQuote.author}</p>"
    }

//    def index = {
//        redirect(action: home)
//    }
//
//    def home = {
//        render "<h1> you stink </h1>"
//    }
}
