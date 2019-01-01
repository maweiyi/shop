package me.maweiyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
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
@Table(name = "nideshop_brand")
public class NideshopBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Column(name = "list_pic_url")
    private String listPicUrl;

    @Column(name = "simple_desc")
    private String simpleDesc;

    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @Column(name = "is_show")
    private Boolean isShow;

    @Column(name = "floor_price")
    private BigDecimal floorPrice;

    @Column(name = "app_list_pic_url")
    private String appListPicUrl;

    @Column(name = "is_new")
    private Boolean isNew;

    @Column(name = "new_pic_url")
    private String newPicUrl;

    @Column(name = "new_sort_order")
    private Integer newSortOrder;
}