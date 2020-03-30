package com.hfnu.library.dao;

import com.hfnu.library.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wendy_wan
 * @date 2020/2/18 21:02
 */
public interface BookMapper {

    //user
    List<BookList> getList();

    List<BookList> getListByQuery(@Param("query") String query);

    //得到能够被预约的书
    List<Book> getRes(@Param("isbn") String isbn);

    //获得预约号
    Reservation getResId(@Param("book") Book book,@Param("user") User user);

    //根据userId获取预约记录，
    //注意返回值需要的是包装起来的书名
    List<ReservationDetail> getResById(@Param("user") User user);

    //用户还书
    void returnBookById(@Param("borrowId") Integer borrowId);

    //根据userid获取已借阅记录
    List<BorrowDetail> getBorById(@Param("user") User user);

    List<Book> getListByuId(@Param("user") User user);

    int processRes(@Param("isbn") String isbn, @Param("user") User user);


    //admin添加图书
    void addBookList(@Param("booklist") BookList bookList, @Param("location") String location, @Param("state") Integer state);

    //管理员获取所有预约记录
    //返回值需要的是包装起来的书名、预约号和用户名
    List<ReservationDetail> getResList();

    List<BorrowDetail> getBorList();

    void inserBorrow(@Param("rid") int reservationId, @Param("op") int operator);

    int deleteBookListById(@Param("isbn") String isbn);

    /*void processRes(String isbn, User user);

    List<ReservationDetail> getResById(User user);

    void returnBookById(int borrowId);

    //admin
    void addBookList(BookList bookList, int state);

    void insertBorrow(int reservationId, int operator);

    List<Reservation> getResInfo();

    List<BorrowDetail> getBorInfo(User user);

    List<ReservationDetail> getResList();

    List<BorrowDetail> getBorList();

    int deleteBookList(BookList bookList);*/
}
