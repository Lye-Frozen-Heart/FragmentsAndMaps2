package com.lyescorp.fragmentsandmaps.models
import com.google.gson.annotations.SerializedName

data class Point (
@SerializedName("idequipament"                ) var idequipament             : String?       = null,
@SerializedName("alies"                       ) var alies                    : String?       = null,
@SerializedName("nom"                         ) var nom                      : String?       = null,
@SerializedName("categoria"                   ) var categoria                : String?       = null,
@SerializedName("via"                         ) var via                      : String?       = null,
@SerializedName("cpostal"                     ) var cpostal                  : String?       = null,
@SerializedName("poblacio"                    ) var poblacio                 : String?       = null,
@SerializedName("codi_municipi"               ) var codiMunicipi             : String?       = null,
@SerializedName("comarca"                     ) var comarca                  : String?       = null,
@SerializedName("telefon1"                    ) var telefon1                 : String?       = null,
@SerializedName("fax"                         ) var fax                      : String?       = null,
@SerializedName("utmx"                        ) var utmx                     : String?       = null,
@SerializedName("utmy"                        ) var utmy                     : String?       = null,
@SerializedName("longitud"                    ) var longitud                 : String?       = null,
@SerializedName("latitud"                     ) var latitud                  : String?       = null,
@SerializedName("data_modificacio"            ) var dataModificacio          : String?       = null,
@SerializedName("localitzacio"                ) var localitzacio             : Localitzacio? = Localitzacio(),
@SerializedName(":@computed_region_wvic_k925" ) var computedRegionWvicK925 : String?       = null,
@SerializedName(":@computed_region_bh64_c7uy" ) var computedRegionBh64C7uy : String?       = null
)
data class Localitzacio (

    @SerializedName("type"        ) var type        : String?           = null,
    @SerializedName("coordinates" ) var coordinates : ArrayList<Double> = arrayListOf()

)