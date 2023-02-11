package com.dimata.service.general.controller;

import com.dimata.service.general.model.body.BukuBody;
import com.dimata.service.general.model.entity.Buku;
import com.dimata.service.general.service.BukuCrude;
import org.jboss.resteasy.reactive.server.spi.RuntimeConfiguration;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Objects;

@Path("api/buku")
public class BukuController {

    @Inject
    BukuCrude bukuCrude;

    @POST
    public Buku createdBuku(BukuBody body) {
        return bukuCrude.create(body);
    }
}
