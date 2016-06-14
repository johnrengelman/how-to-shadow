package com.craigburke.asciidoctor

import asset.pipeline.AssetPipelineConfigHolder
import org.asciidoctor.extension.JavaExtensionRegistry

import static org.asciidoctor.Asciidoctor.Factory.create
import asset.pipeline.AbstractProcessor
import asset.pipeline.AssetCompiler
import asset.pipeline.AssetFile
import org.asciidoctor.Asciidoctor

class AsciiDoctorProcessor extends AbstractProcessor {

    private Asciidoctor asciidoctor

    AsciiDoctorProcessor(AssetCompiler precompiler) {
        super(precompiler)
        asciidoctor = create()
        JavaExtensionRegistry extensionRegistry = asciidoctor.javaExtensionRegistry()
        extensionRegistry.includeProcessor(AssetPipelineIncludeProcessor)
    }

    String process(String input, AssetFile assetFile) {
        asciidoctor.convert(input, options)
    }

    static HashMap<String, Object> getOptions() {
        AssetPipelineConfigHolder.config?.asciidoctor ?: [:]
    }

}