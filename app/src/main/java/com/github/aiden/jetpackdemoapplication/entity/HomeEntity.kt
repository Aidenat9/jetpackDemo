package com.github.aiden.jetpackdemoapplication.entity

/**
 * @author sunwei
 * email：tianmu19@gmail.com
 * date：2019/7/29 17:21
 * package：com.github.aiden.jetpackdemoapplication.entity
 * version：1.0
 *
 * description：
 */
class HomeEntity {
    var name: String? = null
        get() = if (field == null) "" else field
    var des: String? = null
        get() = if (field == null) "" else field
    var age: Int = 0
}
