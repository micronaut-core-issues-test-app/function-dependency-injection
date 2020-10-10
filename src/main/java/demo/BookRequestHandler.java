package demo;

import io.micronaut.function.aws.MicronautRequestHandler;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.UUID;

//@Introspected
@Singleton
public class BookRequestHandler extends MicronautRequestHandler<Book, BookSaved> {

    @Inject
    HelloService helloService;

    @Override
    public BookSaved execute(Book input) {
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(helloService.hello());
//        bookSaved.setName(input.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }
}
