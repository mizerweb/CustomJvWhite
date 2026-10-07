package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class rgg extends q8 implements wba {
    public final Context c;
    public final ActionBarContextView d;
    public final ih e;
    public WeakReference f;
    public boolean g;
    public final yba h;

    public rgg(Context context, ActionBarContextView actionBarContextView, ih ihVar) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = ihVar;
        yba ybaVar = new yba(actionBarContextView.getContext());
        ybaVar.l = 1;
        this.h = ybaVar;
        ybaVar.e = this;
    }

    @Override // defpackage.wba
    public final boolean F(yba ybaVar, MenuItem menuItem) {
        return ((xde) this.e.a).E(this, menuItem);
    }

    @Override // defpackage.q8
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.E(this);
    }

    @Override // defpackage.q8
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.q8
    public final yba c() {
        return this.h;
    }

    @Override // defpackage.q8
    public final MenuInflater d() {
        return new yah(this.d.getContext());
    }

    @Override // defpackage.q8
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.q8
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // defpackage.q8
    public final void g() {
        this.e.G(this, this.h);
    }

    @Override // defpackage.q8
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.q8
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.q8
    public final void j(int i) {
        k(this.c.getString(i));
    }

    @Override // defpackage.q8
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.q8
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.q8
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.q8
    public final void n(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }

    @Override // defpackage.wba
    public final void w(yba ybaVar) {
        g();
        m8 m8Var = this.d.d;
        if (m8Var != null) {
            m8Var.l();
        }
    }
}
