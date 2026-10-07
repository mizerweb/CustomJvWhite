package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class hd2 implements m68 {
    public final gd2 a;

    public hd2(gd2 gd2Var) {
        this.a = gd2Var;
    }

    @Override // defpackage.m68
    public final void a(ke6 ke6Var) {
        this.a.a(ke6Var);
    }

    @Override // defpackage.m68
    public final int b() {
        return 0;
    }

    @Override // defpackage.m68
    public final int c() {
        int iD = qt4.D(this.a.c());
        if (iD == 1) {
            return 2;
        }
        if (iD != 2) {
            return iD != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.m68
    public final ghh d() {
        return this.a.d();
    }

    @Override // defpackage.m68
    public final Matrix e() {
        return new Matrix();
    }

    @Override // defpackage.m68
    public final long getTimestamp() {
        return this.a.getTimestamp();
    }
}
