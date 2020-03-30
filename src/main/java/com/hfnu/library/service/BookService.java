package com.hfnu.library.service;

import com.hfnu.library.pojo.*;

import java.util.List;

/**
 * @author wendy_wan
 * @date 2020/2/18 21:04
 */
public interface BookService {

    //user查询图书
    List<BookList> getList();

    List<BookList> getListByQuery(String query);

    List<Book> getListByuId(int userId);

    void processRes(String isbn, User user);

    List<ReservationDetail> getResById(User user);

    void returnBookById(int borrowId);


    //admin
    void addBookList(BookList bookList, int state);
    int deleteBookList(BookList bookList);

    void insertBorrow(int reservationId, int operator);

    List<Reservation> getResInfo();

    List<BorrowDetail> getBorInfo(User user);

    List<ReservationDetail> getResList();

    List<BorrowDetail> getBorList();



}
