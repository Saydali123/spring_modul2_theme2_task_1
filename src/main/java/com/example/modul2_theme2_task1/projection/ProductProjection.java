package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.AttachmentCollection;
import com.example.modul2_theme2_task1.entity.Category;
import com.example.modul2_theme2_task1.entity.Measurement;
import com.example.modul2_theme2_task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductProjection {

    Long getId();

    String getName();

    Category getCategory();

    AttachmentCollection getAttachmentCollection();

    Integer getCode();

    Measurement getMeasurement();

    boolean getActive();

}
