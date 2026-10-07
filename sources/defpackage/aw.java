package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class aw implements pt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj6 b;

    public aw(wj6 wj6Var, int i) {
        this.b = wj6Var;
        this.a = i;
    }

    @Override // defpackage.pt5
    public final Drawable d(Drawable drawable) {
        return this.b.e(this.a, drawable);
    }

    @Override // defpackage.pt5
    public final Drawable k() {
        return this.b.d(this.a);
    }
}
