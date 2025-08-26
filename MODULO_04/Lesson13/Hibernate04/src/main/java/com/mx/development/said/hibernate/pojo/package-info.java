@AnyMetaDef(name = "EntityDescriptionMetaDef", metaType = "string", idType = "int",
        metaValues = {
                @MetaValue(value = "Employee", targetEntity = Employee.class),
                @MetaValue(value = "Phone", targetEntity = Phone.class)
        })
package com.mx.development.said.hibernate.pojo;

import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;