package com.chase.domain;

/**
 * Created by student on 2016/04/10.
 */
public class ItemData {
    private String name;
    private String itemCode;
    private int quantity;

    private ItemData(){}

    public ItemData(Builder build) {
        this.name = build.name;
        this.itemCode = build.itemCode;
        this.quantity = build.quantity;
    }

    public String getName() {
        return name;
    }



    public String getItemCode() {
        return itemCode;
    }


    public int getQuantity() {
        return quantity;
    }


    public static class Builder {
        private String name;
        private String itemCode;
        private int quantity;

        public Builder setName(String name) {
        this.name = name;
        return this;
        }

        public Builder setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public ItemData build(){
            return new ItemData(this);
        }

        public Builder copyItemData(ItemData itemToBeCopied){
            this.name = itemToBeCopied.name;
            this.itemCode = itemToBeCopied.itemCode;
            this.quantity = itemToBeCopied.quantity;
            return this;
        }


    }





}
