package org.lanqiao.entity;

public class Image {
    private Integer imageId;

    private Integer imgPsvId;

    private String imgPath;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getImgPsvId() {
        return imgPsvId;
    }

    public void setImgPsvId(Integer imgPsvId) {
        this.imgPsvId = imgPsvId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }
}