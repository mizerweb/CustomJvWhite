package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r8e implements gjg, fk2, ig7 {
    public final /* synthetic */ gjg a;

    public r8e(f9b f9bVar) {
        this.a = f9bVar;
    }

    @Override // defpackage.ig7
    public final xx6 b(vt4 vt4Var, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? e9i.Y(this, vt4Var, i, i2) : this;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        return this.a.collect(yx6Var, lq4Var);
    }

    @Override // defpackage.lzf
    public final List d() {
        return this.a.d();
    }

    @Override // defpackage.gjg
    public final Object getValue() {
        return this.a.getValue();
    }
}
