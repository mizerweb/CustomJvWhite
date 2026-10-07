package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class ak2 extends mwl {
    public final Typeface a;
    public final zj2 b;
    public boolean c;

    public ak2(zj2 zj2Var, Typeface typeface) {
        this.a = typeface;
        this.b = zj2Var;
    }

    @Override // defpackage.mwl
    public final void b(int i) {
        if (this.c) {
            return;
        }
        this.b.J(this.a);
    }

    @Override // defpackage.mwl
    public final void c(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.J(typeface);
    }
}
