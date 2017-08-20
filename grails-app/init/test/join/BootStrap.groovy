package test.join

class BootStrap {

    def init = { servletContext ->
        new Author(name: "Sally").addToBooks(title: "Book 1").addToBooks(title: "Book 2").save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
