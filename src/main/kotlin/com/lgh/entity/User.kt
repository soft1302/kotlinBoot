package com.lgh.entity

import javax.persistence.*

@Entity
class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id:Long?,
        @Column(name = "user_id") val userId:Long?,
        @Column(name = "user_name") val userName:String?
)