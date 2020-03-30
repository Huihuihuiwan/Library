package com.hfnu.library.service;

import com.hfnu.library.dao.BookMapper;
import com.hfnu.library.enumeration.ExceptionEnum;
import com.hfnu.library.exception.ServiceException;
import com.hfnu.library.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wendy_wan
 * @date 2020/2/18 21:20
 */

@Service
public class BookServiceImpl implements BookService{

    @Autowired(required = false)
    BookMapper bookMapper;

    //user图书信息
    @Override
    public List<BookList> getList() {
        return bookMapper.getList();
    }

    @Override
    public List<BookList> getListByQuery(String query) {
        return bookMapper.getListByQuery(query);
    }

    @Override
    public List<Book> getListByuId(int userId) {
      // return bookMapper.getListByuId(userId);
        return null;
    }

    @Override
    public void processRes(String isbn, User user) {
        int count = bookMapper.processRes(isbn, user);
        if (count == 0) {
            throw new ServiceException(ExceptionEnum.RESERVATION_FAILURE);
        }
    }

    @Override
    public List<ReservationDetail> getResById(User user) {
        return bookMapper.getResById(user);
    }

    @Override
    public void returnBookById(int borrowId) {
        bookMapper.returnBookById(borrowId);
    }

    @Override
    public void addBookList(BookList bookList, int state) {
        bookMapper.addBookList(bookList, "图书流通室", state);
    }

    @Override
    public void insertBorrow(int reservationId, int operator) {
        bookMapper.inserBorrow(reservationId, operator);
    }

    @Override
    public List<Reservation> getResInfo() {
        return null;
    }

    @Override
    public List<BorrowDetail> getBorInfo(User user) {
        return bookMapper.getBorById(user);
    }

    @Override
    public List<ReservationDetail> getResList() {
        return bookMapper.getResList();
    }

    @Override
    public List<BorrowDetail> getBorList() {
        return bookMapper.getBorList();
    }

    @Override
    public int deleteBookList(BookList bookList) {
        return bookMapper.deleteBookListById(bookList.getIsbn());
    }
}
