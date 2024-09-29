package com.alisimsek.LibraryManagementProject.mapper;

import com.alisimsek.LibraryManagementProject.dto.request.BookBorrowingRequest;
import com.alisimsek.LibraryManagementProject.dto.request.BookBorrowingUpdateRequest;
import com.alisimsek.LibraryManagementProject.entity.BookBorrowing;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookBorrowingMapperImpl implements BookBorrowingMapper {

    @Override
    public BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest) {
        if ( bookBorrowingRequest == null ) {
            return null;
        }

        BookBorrowing bookBorrowing = new BookBorrowing();

        bookBorrowing.setBorrowerMail( bookBorrowingRequest.getBorrowerMail() );
        bookBorrowing.setBorrowerName( bookBorrowingRequest.getBorrowerName() );
        bookBorrowing.setBorrowingDate( bookBorrowingRequest.getBorrowingDate() );

        return bookBorrowing;
    }

    @Override
    public BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        if ( bookBorrowingUpdateRequest == null ) {
            return null;
        }

        BookBorrowing bookBorrowing = new BookBorrowing();

        bookBorrowing.setBorrowerName( bookBorrowingUpdateRequest.getBorrowerName() );
        bookBorrowing.setBorrowingDate( bookBorrowingUpdateRequest.getBorrowingDate() );
        bookBorrowing.setReturnDate( bookBorrowingUpdateRequest.getReturnDate() );

        return bookBorrowing;
    }

    @Override
    public void update(BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        if ( bookBorrowingUpdateRequest == null ) {
            return;
        }

        entity.setBorrowerName( bookBorrowingUpdateRequest.getBorrowerName() );
        entity.setBorrowingDate( bookBorrowingUpdateRequest.getBorrowingDate() );
        entity.setReturnDate( bookBorrowingUpdateRequest.getReturnDate() );
    }
}
