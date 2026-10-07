package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tc5 implements esb {
    public final dsb a;
    public final long b;
    public final long c;
    public final o4h d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public tc5(o4h o4hVar, long j, long j2, long j3, long j4, boolean z) {
        lvb.R(j >= 0 && j2 > j);
        this.d = o4hVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new dsb();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.esb
    public final long b(kj6 kj6Var) throws IOException {
        long j;
        long jK;
        int i = this.e;
        long j2 = this.c;
        dsb dsbVar = this.a;
        if (i == 0) {
            long position = kj6Var.getPosition();
            this.g = position;
            this.e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    jK = -1;
                } else {
                    long position2 = kj6Var.getPosition();
                    if (dsbVar.b(kj6Var, this.j)) {
                        dsbVar.a(kj6Var, false);
                        kj6Var.q();
                        long j4 = this.h;
                        long j5 = dsbVar.b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = dsbVar.d + dsbVar.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.j = position2;
                                this.l = j5;
                            } else {
                                this.i = kj6Var.getPosition() + ((long) i2);
                                this.k = dsbVar.b;
                            }
                            long j7 = this.j;
                            long j8 = this.i;
                            if (j7 - j8 < 100000) {
                                this.j = j8;
                                jK = j8;
                            } else {
                                long position3 = kj6Var.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.j;
                                long j10 = this.i;
                                jK = vqi.k((((j9 - j10) * j6) / (this.l - this.k)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jK = -1;
                        }
                    } else {
                        jK = this.i;
                        if (jK == position2) {
                            qr7.k("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jK != -1) {
                        return jK;
                    }
                    this.e = 3;
                }
                j = 2;
                if (jK != -1) {
                    return jK;
                }
                this.e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    c.t();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                dsbVar.b(kj6Var, -1L);
                dsbVar.a(kj6Var, false);
                if (dsbVar.b > this.h) {
                    kj6Var.q();
                    this.e = 4;
                    return -(this.k + j);
                }
                kj6Var.E(dsbVar.d + dsbVar.e);
                this.i = kj6Var.getPosition();
                this.k = dsbVar.b;
            }
        }
        dsbVar.a = 0;
        dsbVar.b = 0L;
        dsbVar.c = 0;
        dsbVar.d = 0;
        dsbVar.e = 0;
        if (!dsbVar.b(kj6Var, -1L)) {
            c.n();
            return 0L;
        }
        dsbVar.a(kj6Var, false);
        kj6Var.E(dsbVar.d + dsbVar.e);
        long j11 = dsbVar.b;
        while ((dsbVar.a & 4) != 4 && dsbVar.b(kj6Var, -1L) && kj6Var.getPosition() < j2 && dsbVar.a(kj6Var, true)) {
            try {
                kj6Var.E(dsbVar.d + dsbVar.e);
                j11 = dsbVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j11;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.esb
    public final xbf c() {
        if (this.f != 0) {
            return new sc5(this);
        }
        return null;
    }

    @Override // defpackage.esb
    public final void e(long j) {
        this.h = vqi.k(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
