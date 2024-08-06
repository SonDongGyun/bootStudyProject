package org.boot.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class WM_SUBJECT_COUPON {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String cp_no;
    public String cp_id;
    public String cp_subject;
    public String cp_target;
    public int cp_group_code;
    public Date cp_start;
    public Date cp_end;
    public String mb_id;
    public String send_status;
    public String use_status;
    public Date use_at;
    public Date created_at;
}
