package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QryCommentList extends QryResult{

    @ToString.Exclude
    @JsonProperty("data") // json변환시 data라는 이름의 property로 변경!
    List<Comment> list;
}
