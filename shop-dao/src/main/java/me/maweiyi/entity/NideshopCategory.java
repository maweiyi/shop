package me.maweiyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

@Data
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "nideshop_category")
public class NideshopCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String keywords;

    @Column(name = "front_desc")
    private String frontDesc;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "sort_order")
    private Boolean sortOrder;

    @Column(name ="show_index")
    private Boolean showIndex;

    @Column(name = "is_show")
    private Boolean isShow;

    @Column(name = "banner_url")
    private String bannerUrl;

    @Column(name = "icon_url")
    private String iconUrl;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "wap_banner_url")
    private String wapBannerUrl;

    private String level;

    private Integer type;

    @Column(name = "front_name")
    private String frontName;

    @OneToMany( mappedBy = "categoryId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NideshopGoods> nideshopGoods = new ArrayList<>();

    @Transient
    private NideshopCategory nideshopCategory;
}