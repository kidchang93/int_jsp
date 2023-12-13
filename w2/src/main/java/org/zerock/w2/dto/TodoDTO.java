package org.zerock.w2.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor // 파라미터가 없는 생성자
@AllArgsConstructor // 파라미터가 모두 있는 생성자
public class TodoDTO {
  private Long tno;
  private String title;
  private LocalDate dueDate;
  private boolean finished;
}
