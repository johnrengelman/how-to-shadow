//= require /bespoke/bespoke
//= require_full_tree /bespoke/plugins/
//= require_full_tree /bespoke/themes/

bespoke.from("#presentation", [
    bespoke.themes.nebula(),
    bespoke.plugins.keys(),
    bespoke.plugins.hash(),
    bespoke.plugins.backdrop(),
    bespoke.plugins.progress()
]);
