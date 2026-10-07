package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class g7h extends yba implements SubMenu {
    public final cca A;
    public final yba z;

    public g7h(Context context, yba ybaVar, cca ccaVar) {
        super(context);
        this.z = ybaVar;
        this.A = ccaVar;
    }

    @Override // defpackage.yba
    public final boolean e(cca ccaVar) {
        return this.z.e(ccaVar);
    }

    @Override // defpackage.yba
    public final boolean f(yba ybaVar, MenuItem menuItem) {
        return super.f(ybaVar, menuItem) || this.z.f(ybaVar, menuItem);
    }

    @Override // defpackage.yba
    public final boolean g(cca ccaVar) {
        return this.z.g(ccaVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.yba
    public final String k() {
        cca ccaVar = this.A;
        int i = ccaVar != null ? ccaVar.a : 0;
        if (i == 0) {
            return null;
        }
        return zo5.h(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.yba
    public final yba l() {
        return this.z.l();
    }

    @Override // defpackage.yba
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.yba
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.yba
    public final boolean p() {
        return this.z.p();
    }

    @Override // defpackage.yba, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.yba, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // defpackage.yba
    public final void v(wba wbaVar) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }
}
