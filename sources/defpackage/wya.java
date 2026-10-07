package defpackage;

import org.apache.http.entity.ContentLengthStrategy;

/* JADX INFO: loaded from: classes4.dex */
public final class wya implements s99 {
    public final y65 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public int g;

    public wya(q21 q21Var) {
        String name = wya.class.getName();
        this.a = new y65();
        this.b = ((long) q21Var.a) * 1000;
        this.c = ((long) q21Var.b) * 1000;
        this.d = ((long) q21Var.c) * 1000;
        this.e = ((long) q21Var.d) * 1000;
        this.f = q21Var.e;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, toString(), null);
        }
    }

    @Override // defpackage.s99
    public final boolean a() {
        return false;
    }

    @Override // defpackage.s99
    public final boolean b(long j) {
        char c;
        int i;
        if (j > this.c) {
            c = 0;
        } else {
            c = j < this.b ? (char) 2 : (char) 1;
        }
        y65 y65Var = this.a;
        synchronized (y65Var) {
            i = y65Var.d * y65Var.b;
        }
        return c == 2 || (c == 1 && !(i >= this.g));
    }

    @Override // defpackage.s99
    public final boolean c(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // defpackage.s99
    public final long d() {
        return 0L;
    }

    @Override // defpackage.s99
    public final qf e(z3d z3dVar) {
        return this.a;
    }

    @Override // defpackage.s99
    public final void f(r99 r99Var, rg6[] rg6VarArr) {
        int i;
        this.g = 0;
        for (rg6 rg6Var : rg6VarArr) {
            if (rg6Var != null) {
                b87 b87VarS = rg6Var.s();
                int i2 = this.g;
                int i3 = b87VarS.o;
                if (i3 == -1) {
                    int i4 = rg6Var.m().c;
                    switch (i4) {
                        case ContentLengthStrategy.CHUNKED /* -2 */:
                            i = 0;
                            break;
                        case -1:
                        default:
                            ore.p(zo5.h(i4, "Unexpected type of the track="));
                            return;
                        case 0:
                            i = 5373952;
                            break;
                        case 1:
                        case 3:
                            i = 65536;
                            break;
                        case 2:
                            i = 5242880;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i = 131072;
                            break;
                    }
                } else {
                    i = this.f * i3;
                }
                this.g = i2 + i;
            }
        }
        this.a.b(this.g);
    }

    @Override // defpackage.s99
    public final void h(z3d z3dVar) {
        this.g = 0;
        this.a.a();
    }

    @Override // defpackage.s99
    public final void i(z3d z3dVar) {
        this.g = 0;
        this.a.a();
    }

    @Override // defpackage.s99
    public final void j(z3d z3dVar) {
        this.g = 0;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "MinSizeLoadControl(\n        minBufferUs=", "\n        maxBufferUs=");
        sbS.append(this.c);
        qt4.z(this.d, "\n        playbackBufferUs=", "\n        playbackBufferAfterRebufferUs=", sbS);
        c0a.w(sbS, this.e, "\n        formatMaxInputSizeScaleUpFactor=", this.f);
        sbS.append("\n        )\n        ");
        return sbS.toString();
    }
}
