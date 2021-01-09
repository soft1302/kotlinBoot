package com.lgh.controller

import com.lgh.entity.User
import com.lgh.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    val userService: UserServiceImpl? = null
    @GetMapping("/id/{id}")
    fun findUserById(@PathVariable("id") id: Long): User? = userService?.findByUId(id)
    @GetMapping("/name/{userName}")
    fun  findByUserName(@PathVariable("userName") userName:String): Collection<User>? = userService?.findByUName(userName)
}