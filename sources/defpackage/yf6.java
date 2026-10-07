package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final class yf6 implements mwi, e4d {
    public mwi a;
    public yf6 b;

    @Override // defpackage.e4d
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (mwi) obj;
        } else if (i == 8) {
            this.b = (yf6) obj;
        } else {
            if (i != 10000) {
                return;
            }
            qt4.A(obj);
        }
    }

    @Override // defpackage.mwi
    public final void b(long j, long j2, b87 b87Var, MediaFormat mediaFormat) {
        mwi mwiVar = this.a;
        if (mwiVar != null) {
            mwiVar.b(j, j2, b87Var, mediaFormat);
        }
    }

    public final void c() {
        yf6 yf6Var = this.b;
        if (yf6Var != null) {
            yf6Var.c();
        }
    }

    public final void d() {
        yf6 yf6Var = this.b;
        if (yf6Var != null) {
            yf6Var.d();
        }
    }
}
