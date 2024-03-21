package com.example;

import java.security.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "posts")

public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(name = "title", nullable = false, length = 40) //標題
    private String title;

    @Column(name = "content") //內文
    private String content;

    @Column(name = "post_image")  
    private byte[] coverImage;

    @Column(name = "publish_time", nullable = false, columnDefinition = "TIMESTAMP(0)")  // columnDefinition = "TIMESTAMP(0)"紀錄日期和時間(到秒)
    private Timestamp publishTime;
 
    @Column(name = "user_id") // 外部鍵，表示發文所屬的使用者ID
    private Long userId;
}
