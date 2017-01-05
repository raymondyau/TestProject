package retailgit

class QuoteController {

    def index() {
		
		createQuote();
	}
	
	def createQuote()
	{
		
		render "hello world"
	}
}
