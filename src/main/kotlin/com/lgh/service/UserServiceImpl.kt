package com.lgh.service

import com.lgh.entity.User
import com.lgh.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl {
    @Autowired
    val userRepository: UserRepository? = null

    fun findByUName(uName: String): Collection<User>? = userRepository?.findByUserNameLike(uName?.plus("%"))

    fun findByUId(id:Long): User? = userRepository?.findByUserId(id)
}