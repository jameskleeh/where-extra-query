package test.join

class AuthorController {

    def index() {
        println '---------------- RELEVANT SQL HERE ----------------------'
        Book book = Book.first()
        Set authors = book.getAuthors(fetch: [books: 'join'])
        render(text: "${authors[0].name}: books(${authors[0].books*.title})")
    }
}
