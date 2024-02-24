package com.sanket.newsapp.apputils

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

object Constants {

    const val API_KEY = "c5fb8da0aa4c4e818e1db97a06162d7d"
    const val COUNTRY = "us"

    const val FILE_COUNTRIES = "countries.json"
    const val FILE_LANGUAGES = "languages.json"

    sealed class NewsType : Parcelable {
        @Parcelize
        data class COUNTRY(var countryCode: String) : NewsType()

        @Parcelize
        data class SOURCE(var sounrceId: String) : NewsType()

        @Parcelize
        data class LANGUAGE(var languageId: String) : NewsType()
    }

    val COUNTRIES_SUPPORTED_BY_NEWS_API = arrayListOf<String>(
        "ae",
        "ar",
        "at",
        "au",
        "be",
        "bg",
        "br",
        "ca",
        "ch",
        "cn",
        "co",
        "cu",
        "cz",
        "de",
        "eg",
        "fr",
        "gb",
        "gr",
        "hk",
        "hu",
        "id",
        "ie",
        "il",
        "in",
        "it",
        "jp",
        "kr",
        "lt",
        "lv",
        "ma",
        "mx",
        "my",
        "ng",
        "nl",
        "no",
        "nz",
        "ph",
        "pl",
        "pt",
        "ro",
        "rs",
        "ru",
        "sa",
        "se",
        "sg",
        "si",
        "sk",
        "th",
        "tr",
        "tw",
        "ua",
        "us",
        "ve",
        "za"
    )

    interface ApiHeaders {
        interface Key {
            companion object {
                const val API_KEY = "X-Api-Key"
            }
        }

        interface Value {
            companion object {
                const val API_KEY = "c5fb8da0aa4c4e818e1db97a06162d7d"
            }
        }

    }
}