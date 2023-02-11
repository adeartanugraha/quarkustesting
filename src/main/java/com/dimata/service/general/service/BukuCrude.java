package com.dimata.service.general.service;

import com.dimata.service.general.model.body.BukuBody;
import com.dimata.service.general.model.entity.Buku;

import javax.enterprise.context.ApplicationScoped;
import java.util.Objects;

@ApplicationScoped
public class BukuCrude {
    public Buku create(BukuBody body){
        Objects.requireNonNull(body);
        if (!body.isValid()) {
            throw new IllegalArgumentException("ini tidak valid");
        }
        var buku = new Buku();
        buku.name = body.name();
        buku.author = body.author();
        buku.page = body.page();
        buku.persist();
        return buku;
    }
}
