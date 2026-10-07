package defpackage;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class coc implements ActionMode.Callback {
    public final Context a;
    public final g3 b;

    public coc(Context context, g3 g3Var) {
        this.a = context;
        this.b = g3Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) throws Exception {
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 16908322) {
            return false;
        }
        this.b.invoke(it3.c(this.a));
        return Boolean.TRUE.booleanValue();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.paste);
        if (menuItemFindItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, R.id.paste, 0, menuItemFindItem.getTitle());
        return true;
    }
}
