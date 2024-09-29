package com.alisimsek.LibraryManagementProject.mapper;

import com.alisimsek.LibraryManagementProject.dto.request.BookForBorrowingRequest;
import com.alisimsek.LibraryManagementProject.entity.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookForBorrowingMapperImpl implements BookForBorrowingMapper {

    @Override
    public Book asEntity(BookForBorrowingRequest bookForBorrowingRequest) {
        if ( bookForBorrowingRequest == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookForBorrowingRequest.getId() );
        book.setName( bookForBorrowingRequest.getName() );
        book.setPublicationYear( bookForBorrowingRequest.getPublicationYear() );
        book.setStock( bookForBorrowingRequest.getStock() );

        return book;
    }
}
