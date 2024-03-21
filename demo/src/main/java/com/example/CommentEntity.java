package com.example;

import java.security.Timestamp;

import javax.persistence.*;

public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(name = "content")
    private String content;

    @Column(name = "comment_time", nullable = false, columnDefinition = "TIMESTAMP(0)")  // columnDefinition = "TIMESTAMP(0)"紀錄日期和時間(到秒)
    private Timestamp commentTime;

    @Column(name = "user_id") // 外部鍵，表示發文所屬的使用者ID
    private Long userId;

    @Column(name = "post_id") // 外部鍵，表示發文所屬的使用者ID
    private Long postId;

}
