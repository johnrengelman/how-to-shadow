//= require /bespoke/bespoke
//= require_full_tree /bespoke/plugins/
//= require highlightjs/highlight.pack.min

bespoke.from("article.deck", [
    bespoke.plugins.classes(),
    bespoke.plugins.nav(),
    bespoke.plugins.keys(),
    bespoke.plugins.scale('transform'),
    bespoke.plugins.state(),
    bespoke.plugins.hash(),
    bespoke.plugins.overview({ margin: 300, title: true, numbers: true }),
    bespoke.plugins.bullets('.build,.build-items>*:not(.build-items)'),
    bespoke.plugins.backdrop(),
    bespoke.plugins.progress(),
    bespoke.plugins.fullscreen()
]);

hljs.initHighlightingOnLoad();