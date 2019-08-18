package org.lanqiao.entity;

public class Image {
    private Integer imageId;

    private Integer imgPsvId;

    private String imgPath;

    private Integer imgFlag;

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

    public Integer getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(Integer imgFlag) {
        this.imgFlag = imgFlag;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imgPsvId=" + imgPsvId +
                ", imgPath='" + imgPath + '\'' +
                ", imgFlag=" + imgFlag +
                '}';
    }
}