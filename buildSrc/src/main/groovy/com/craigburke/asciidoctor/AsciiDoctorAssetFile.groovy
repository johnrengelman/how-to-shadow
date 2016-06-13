package com.craigburke.asciidoctor

import asset.pipeline.AbstractAssetFile
import com.craigburke.asciidoctor.AsciiDoctorProcessor

class AsciiDoctorAssetFile extends AbstractAssetFile {
    static final String contentType = 'text/html'
    static extensions = ['adoc', 'ad', 'asciidoc', 'asc']
    static final String compiledExtension = 'html'

    static processors = [AsciiDoctorProcessor]

    static String directiveForLine(String line) {
        return null
    }
}