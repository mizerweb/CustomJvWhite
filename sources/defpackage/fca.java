package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class fca implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ gca b;

    public fca(gca gcaVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = gcaVar;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.M(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.M(menuItem));
    }
}
