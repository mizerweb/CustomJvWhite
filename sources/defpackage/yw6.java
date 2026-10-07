package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class yw6 {
    public final hw0 a;
    public final lw0 b;
    public iw0 c;
    public final int d;

    public yw6(jw0 jw0Var, lw0 lw0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = lw0Var;
        this.d = i;
        this.a = new hw0(jw0Var, j, j2, j3, j4, j5);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(kj6 kj6Var, long j, s8 s8Var) {
        if (j == kj6Var.getPosition()) {
            return 0;
        }
        s8Var.a = j;
        return 1;
    }

    public final int b(kj6 kj6Var, s8 s8Var) {
        while (true) {
            iw0 iw0Var = this.c;
            iw0Var.getClass();
            long j = iw0Var.f;
            long j2 = iw0Var.g;
            long j3 = iw0Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            lw0 lw0Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                lw0Var.i();
                return c(kj6Var, j, s8Var);
            }
            long position = j3 - kj6Var.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return c(kj6Var, j3, s8Var);
            }
            kj6Var.E((int) position);
            kj6Var.q();
            kw0 kw0VarE = lw0Var.e(kj6Var, iw0Var.b);
            int i = kw0VarE.c;
            long j6 = kw0VarE.a;
            long j7 = kw0VarE.b;
            if (i == -3) {
                this.c = null;
                lw0Var.i();
                return c(kj6Var, j3, s8Var);
            }
            if (i == -2) {
                iw0Var.d = j6;
                iw0Var.f = j7;
                iw0Var.h = iw0.a(iw0Var.b, j6, iw0Var.e, j7, iw0Var.g, iw0Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        ore.k("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - kj6Var.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        kj6Var.E((int) position2);
                    }
                    this.c = null;
                    lw0Var.i();
                    return c(kj6Var, j7, s8Var);
                }
                iw0Var.e = j6;
                iw0Var.g = j7;
                iw0Var.h = iw0.a(iw0Var.b, iw0Var.d, j6, iw0Var.f, j7, iw0Var.c);
            }
        }
    }

    public final void d(long j) {
        iw0 iw0Var = this.c;
        if (iw0Var == null || iw0Var.a != j) {
            hw0 hw0Var = this.a;
            this.c = new iw0(j, hw0Var.a.g(j), hw0Var.c, hw0Var.d, hw0Var.e, hw0Var.f);
        }
    }
}
