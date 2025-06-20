package com.build.logic.util

internal object ProjectDirectoryNameManager {

    fun getFormattedProjectDirectoryName(projectDirectoryName: String): String {

        val nameSeparatedByDashList = projectDirectoryName.split("-")
        var formattedName = ""

        nameSeparatedByDashList.forEachIndexed { index, name ->
            formattedName += if (index == 0) {
                name.lowercase()
            } else {
                getStringWithFirstLetterCapitalized(value = name)
            }
        }

        return formattedName
    }

    private fun getStringWithFirstLetterCapitalized(value: String): String {

        var formattedString = ""
        value.forEachIndexed { index, character ->
            formattedString += if (index == 0) {
                character.uppercase()
            } else {
                character.lowercase()
            }
        }

        return formattedString
    }
}