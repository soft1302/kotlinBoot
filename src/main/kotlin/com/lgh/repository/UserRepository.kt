package com.lgh.repository

import com.lgh.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User,Long>{
    fun findByUserNameLike(uName:String):Collection<User>?
    fun findByUserId(uId:Long):User?
}