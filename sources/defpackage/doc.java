package defpackage;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class doc implements ActionMode.Callback {
    public final Context a;
    public final gc4 b;
    public final int c;
    public final int d;

    public doc(Context context, gc4 gc4Var, int i, int i2) {
        this.a = context;
        this.b = gc4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence charSequenceC;
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 16908322 && (charSequenceC = it3.c(this.a)) != null) {
            StringBuilder sb = new StringBuilder();
            int length = charSequenceC.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequenceC.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = r5h.t1(this.d, sb).toString();
            this.b.I0(this.c, string);
            if (string.length() > 0) {
                return true;
            }
        }
        return false;
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
