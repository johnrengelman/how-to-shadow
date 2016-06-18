import static ratpack.groovy.Groovy.ratpack

import asset.pipeline.ratpack.AssetPipelineHandler
import asset.pipeline.ratpack.AssetPipelineModule

ratpack {
    serverConfig {
        json('assets.json')
    }
    bindings {
        def config = serverConfig.get("/assets", AssetPipelineModule.Config)
        println config.properties
        moduleConfig(AssetPipelineModule, config)
    }
    handlers {
        all(AssetPipelineHandler)
    }
}