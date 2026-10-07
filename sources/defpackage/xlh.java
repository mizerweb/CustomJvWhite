package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes4.dex */
public final class xlh extends gm0 {
    public final /* synthetic */ mwl k;
    public final /* synthetic */ zlh l;

    public xlh(zlh zlhVar, mwl mwlVar) {
        this.l = zlhVar;
        this.k = mwlVar;
    }

    @Override // defpackage.gm0
    public final void G(int i) {
        this.l.m = true;
        this.k.b(i);
    }

    @Override // defpackage.gm0
    public final void H(Typeface typeface) {
        zlh zlhVar = this.l;
        Typeface typefaceCreate = Typeface.create(typeface, zlhVar.c);
        zlhVar.n = typefaceCreate;
        zlhVar.m = true;
        this.k.c(typefaceCreate, false);
    }
}
