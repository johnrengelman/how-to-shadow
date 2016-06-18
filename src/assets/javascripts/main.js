//= require /bespoke/bespoke
//= require_full_tree /bespoke/plugins/
//= require_full_tree /bespoke/themes/
//= require highlightjs/highlight.pack.min

bespoke.from("article.deck", [
    bespoke.plugins.keys(),
    bespoke.plugins.scale(),
    bespoke.plugins.classes(),
    bespoke.plugins.state(),
    bespoke.plugins.hash(),
    bespoke.plugins.progress(),
    bespoke.plugins.overview(),
    bespoke.plugins.bullets('.build,.build-items>*:not(.build-items)'),
    bespoke.plugins.backdrop()
]);

hljs.initHighlightingOnLoad();
