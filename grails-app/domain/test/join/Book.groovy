package test.join

class Book {

    String title

    static constraints = {
    }

    Set<Author> getAuthors(Map queryArgs) {
        Long bookId = this.id
        Author.where { books { id == bookId } }.list(queryArgs)
    }
}
