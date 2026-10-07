package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fv8 extends dv8 {
    public final cu8 j;
    public final List k;
    public final int l;
    public int m;

    public fv8(qs8 qs8Var, cu8 cu8Var) {
        super(qs8Var, cu8Var, (String) null, 12);
        this.j = cu8Var;
        List listT1 = ww3.T1(cu8Var.a.keySet());
        this.k = listT1;
        this.l = listT1.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.dv8, defpackage.v1
    public final jt8 F(String str) {
        return this.m % 2 == 0 ? kt8.c(str) : (jt8) wm9.N0(this.j, str);
    }

    @Override // defpackage.dv8, defpackage.v1
    public final String R(fif fifVar, int i) {
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.dv8, defpackage.v1
    public final jt8 T() {
        return this.j;
    }

    @Override // defpackage.dv8
    /* JADX INFO: renamed from: Y */
    public final cu8 T() {
        return this.j;
    }

    @Override // defpackage.dv8, defpackage.v1, defpackage.v74
    public final void j(fif fifVar) {
    }

    @Override // defpackage.dv8, defpackage.v74
    public final int v(fif fifVar) {
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
