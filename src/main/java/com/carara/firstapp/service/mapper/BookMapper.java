package com.carara.firstapp.service.mapper;

import com.carara.firstapp.domain.Book;
import com.carara.firstapp.service.dto.BookDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring", uses = { AuthorMapper.class })
public interface BookMapper extends EntityMapper<BookDTO, Book> {
    @Mapping(target = "author_book", source = "author_book", qualifiedByName = "name")
    BookDTO toDto(Book s);
}
