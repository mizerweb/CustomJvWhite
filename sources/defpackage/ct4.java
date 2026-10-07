package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ct4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ et4 a;

    public ct4(et4 et4Var) {
        this.a = et4Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.p(0);
        return true;
    }
}
