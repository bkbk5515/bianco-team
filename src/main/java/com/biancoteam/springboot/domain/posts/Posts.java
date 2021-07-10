package com.biancoteam.springboot.domain.posts;

import com.biancoteam.springboot.domain.BaseTimeEntitiy;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntitiy {

    /**
     * 엔티티 어노테이션 = 테이블과 링크될 클래스임을 나타냄
     * 기본값 = Bianco_Hi -> bianco_hi 와 같이 카멜케이스로 테이블  이름 매
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 컬럼은 사용하지 않아도 되는데 varchar200 -> 500과 같은 행위를 할때 필요할 수 있음.
     */
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
