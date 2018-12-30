package me.maweiyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "nideshop_ad")
public class NideshopAd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ad_position_id")
    private Integer adPositionId;

    @Column(name = "media_type")
    private Integer mediaType;

    private String name;

    private String link;

    private String content;

    @Column(name = "end_time")
    private Integer endTime;

    private Integer enabled;

    @Column(name = "image_url")
    private String imageUrl;
}