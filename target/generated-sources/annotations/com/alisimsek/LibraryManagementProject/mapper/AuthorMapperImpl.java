package com.alisimsek.LibraryManagementProject.mapper;

import com.alisimsek.LibraryManagementProject.dto.request.AuthorRequest;
import com.alisimsek.LibraryManagementProject.dto.response.AuthorResponse;
import com.alisimsek.LibraryManagementProject.entity.Author;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public Author asEntity(AuthorRequest authorRequest) {
        if ( authorRequest == null ) {
            return null;
        }

        Author author = new Author();

        author.setBirthDate( authorRequest.getBirthDate() );
        author.setCountry( authorRequest.getCountry() );
        author.setName( authorRequest.getName() );

        return author;
    }

    @Override
    public AuthorResponse asOutput(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorResponse authorResponse = new AuthorResponse();

        authorResponse.setBirthDate( author.getBirthDate() );
        authorResponse.setCountry( author.getCountry() );
        authorResponse.setId( author.getId() );
        authorResponse.setName( author.getName() );

        return authorResponse;
    }

    @Override
    public List<AuthorResponse> asOutput(List<Author> author) {
        if ( author == null ) {
            return null;
        }

        List<AuthorResponse> list = new ArrayList<AuthorResponse>( author.size() );
        for ( Author author1 : author ) {
            list.add( asOutput( author1 ) );
        }

        return list;
    }

    @Override
    public void update(Author entity, AuthorRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setBirthDate( request.getBirthDate() );
        entity.setCountry( request.getCountry() );
        entity.setName( request.getName() );
    }
}
