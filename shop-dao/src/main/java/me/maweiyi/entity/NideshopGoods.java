package me.maweiyi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "nideshop_goods")
public class NideshopGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "goods_sn")
    private String goodsSn;

    private String name;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "goods_number")
    private Integer goodsNumber;

    private String keywords;

    @Column(name = "goods_brief")
    private String goodsBrief;

    @Column(name = "is_on_sale")
    private Boolean isOnSale;

    @Column(name = "add_time")
    private Integer addTime;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @Column(name = "attribute_category")
    private Integer attributeCategory;

    @Column(name = "counter_price")
    private BigDecimal counterPrice;

    @Column(name = "extra_price")
    private BigDecimal extraPrice;

    @Column(name = "is_new")
    private Boolean isNew;

    @Column(name = "goods_unit")
    private String goodsUnit;

    @Column(name = "primary_pic_url")
    private String primaryPicUrl;

    @Column(name = "list_pic_url")
    private String listPicUrl;

    @Column(name = "retail_Price")
    private BigDecimal retailPrice;

    @Column(name = "sell_volume")
    private Integer sellVolume;

    @Column(name = "primary_product_id")
    private Integer primaryProductId;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "promotion_desc")
    private String promotionDesc;

    @Column(name = "promotion_tag")
    private String promotionTag;

    @Column(name = "app_exclusive_price")
    private BigDecimal appExclusivePrice;

    @Column(name = "is_app_exclusive")
    private Boolean isAppExclusive;

    @Column(name = "is_limited")
    private Boolean isLimited;

    @Column(name = "is_hot")
    private Boolean isHot;

    @Column(name = "goods_desc")
    private String goodsDesc;
}