package com.example.springboot.demo.model;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>名称</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2019/9/20
 */
@Entity
@Table(name = "user_info")
@Data
public class UserInfo {
    /*@SequenceGenerator(sequenceName = "seq_user", name = "seq", initialValue = 10000000, allocationSize = 1)
    @GeneratedValue(generator = "seq")*/
    /**
     * 自增
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    private Long id;

    @Column(length = 11)
    private String userName;

    @Column(length = 11)
    private String password;
}
