package com.build.logic.util

import kotlin.test.Test
import kotlin.test.assertEquals

class ProjectDirectoryNameManagerTest {

    @Test
    fun `should return camelCase for dash separated lowercase words`() {
        val directoryName = "trying-kotlin"
        val expectedResult = "tryingKotlin"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle single word project name`() {
        val directoryName = "kotlin"
        val expectedResult = "kotlin"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle uppercase letters in input`() {
        val directoryName = "TRYING-KOTLIN"
        val expectedResult = "tryingKotlin"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle mixed case input`() {
        val directoryName = "TryINg-KotlIN"
        val expectedResult = "tryingKotlin"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return empty string when input is empty`() {
        val directoryName = ""
        val expectedResult = ""
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle multiple dashes`() {
        val directoryName = "hello-world-from-kotlin"
        val expectedResult = "helloWorldFromKotlin"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle leading and trailing dashes`() {
        val directoryName = "-leading-trailing-"
        val expectedResult = "LeadingTrailing"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle consecutive dashes`() {
        val directoryName = "consecutive--dashes"
        val expectedResult = "consecutiveDashes"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = directoryName
        )
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
