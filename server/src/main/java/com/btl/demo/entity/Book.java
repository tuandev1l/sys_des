package com.btl.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Audited
public class Book extends Product{
  @ManyToOne
  @JoinColumn(name = "booktype_id")
  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private BookType bookType;

  private String title, author, description;
  private LocalDate published;
  private int numberOfPages;
  private float money;
  private String image;
}
