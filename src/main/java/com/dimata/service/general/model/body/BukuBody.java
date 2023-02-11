package com.dimata.service.general.model.body;

public record BukuBody(
        String name,
        String author,
        int page
) {
    public boolean isValid(){
        return  name != null && author != null;
    }
}
