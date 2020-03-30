package com.hfnu.library.controller;

import com.hfnu.library.pojo.BookList;
import com.hfnu.library.pojo.ProcessResult;
import com.hfnu.library.pojo.User;
import com.hfnu.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Author : wendy_wan
 * Created : 2020/3/25 16:22
 */
@Controller
@RequestMapping("/library")
public class ReaderController {
    @Autowired
    BookService bookService;

    //admin
    @GetMapping(value = "/admin/books")
    public String showBook(Model model, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        List<BookList> list = bookService.getList();
        model.addAttribute("list",list);
        return "admin_addbook";
    }

    //添加图书到数据库
    @RequestMapping(path = "/admin/books",
                    method = RequestMethod.POST,
                    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ProcessResult addbook(HttpServletRequest request, @RequestBody BookList bookList){
        User user = (User) request.getSession().getAttribute("user");
        bookList.setOperator(user.getUserId());
        ProcessResult pr;
        try {
            bookService.addBookList(bookList,0);
            pr = new ProcessResult(true);
        } catch (Exception e) {
            pr = new ProcessResult(false);
        }
        return pr;
        //return "admin_addbook";
    }

    //根据isbn删除图书
    @GetMapping(path = "/admin/delete")
    @ResponseBody
    public ProcessResult delBookList(Model model, HttpServletRequest request, @RequestBody BookList bookList){
        User user = (User)request.getSession().getAttribute("user");
        ProcessResult pr;
        try {
            bookService.deleteBookList(bookList);
            pr = new ProcessResult(true);
        } catch (Exception e) {
            pr = new ProcessResult(false);
        }
        return pr;
    }
}
