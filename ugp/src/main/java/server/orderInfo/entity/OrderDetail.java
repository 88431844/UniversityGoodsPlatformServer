package server.orderInfo.entity;

public class OrderDetail {
    private Integer id;

    private Integer orderid;

    private Integer goodsid;

    private Integer goodsnum;

    private Double orderpirce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Double getOrderpirce() {
        return orderpirce;
    }

    public void setOrderpirce(Double orderpirce) {
        this.orderpirce = orderpirce;
    }
}