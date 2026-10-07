package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kwj extends q8 implements wba {
    public final Context c;
    public final yba d;
    public ih e;
    public WeakReference f;
    public final /* synthetic */ lwj g;

    public kwj(lwj lwjVar, Context context, ih ihVar) {
        this.g = lwjVar;
        this.c = context;
        this.e = ihVar;
        yba ybaVar = new yba(context);
        ybaVar.l = 1;
        this.d = ybaVar;
        ybaVar.e = this;
    }

    @Override // defpackage.wba
    public final boolean F(yba ybaVar, MenuItem menuItem) {
        ih ihVar = this.e;
        if (ihVar != null) {
            return ((xde) ihVar.a).E(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.q8
    public final void a() {
        lwj lwjVar = this.g;
        if (lwjVar.i != this) {
            return;
        }
        if (lwjVar.p) {
            lwjVar.j = this;
            lwjVar.k = this.e;
        } else {
            this.e.E(this);
        }
        this.e = null;
        lwjVar.a(false);
        ActionBarContextView actionBarContextView = lwjVar.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        lwjVar.c.setHideOnContentScrollEnabled(lwjVar.u);
        lwjVar.i = null;
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
        return this.d;
    }

    @Override // defpackage.q8
    public final MenuInflater d() {
        return new yah(this.c);
    }

    @Override // defpackage.q8
    public final CharSequence e() {
        return this.g.f.getSubtitle();
    }

    @Override // defpackage.q8
    public final CharSequence f() {
        return this.g.f.getTitle();
    }

    @Override // defpackage.q8
    public final void g() {
        if (this.g.i != this) {
            return;
        }
        yba ybaVar = this.d;
        ybaVar.z();
        try {
            this.e.G(this, ybaVar);
        } finally {
            ybaVar.y();
        }
    }

    @Override // defpackage.q8
    public final boolean h() {
        return this.g.f.s;
    }

    @Override // defpackage.q8
    public final void i(View view) {
        this.g.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.q8
    public final void j(int i) {
        k(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.q8
    public final void k(CharSequence charSequence) {
        this.g.f.setSubtitle(charSequence);
    }

    @Override // defpackage.q8
    public final void l(int i) {
        m(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.q8
    public final void m(CharSequence charSequence) {
        this.g.f.setTitle(charSequence);
    }

    @Override // defpackage.q8
    public final void n(boolean z) {
        this.b = z;
        this.g.f.setTitleOptional(z);
    }

    @Override // defpackage.wba
    public final void w(yba ybaVar) {
        if (this.e == null) {
            return;
        }
        g();
        m8 m8Var = this.g.f.d;
        if (m8Var != null) {
            m8Var.l();
        }
    }
}
