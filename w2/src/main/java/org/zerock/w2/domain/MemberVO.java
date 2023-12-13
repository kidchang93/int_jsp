package org.zerock.w2.domain;


import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MemberVO {
  private String mid;
  private String mpw;
  private String mname;
}
