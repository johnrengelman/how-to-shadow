//= require /bespoke/bespoke
//= require_full_tree /bespoke/plugins/
//= require_full_tree /bespoke/themes/
//= require highlightjs/highlight.pack

bespoke.from("#presentation", [
    bespoke.themes.nebula(),
    bespoke.plugins.keys(),
    bespoke.plugins.hash(),
    bespoke.plugins.backdrop(),
    bespoke.plugins.bullets(),
    bespoke.plugins.backdrop()
]);

hljs.initHighlightingOnLoad();
