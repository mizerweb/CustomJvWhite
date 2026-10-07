package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e31 implements Closeable {
    public l31 a;
    public boolean b;
    public fcf c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void b(long j) {
        l31 l31Var = this.a;
        if (l31Var == null) {
            ore.k("not attached to a buffer");
            return;
        }
        if (!this.b) {
            ore.k("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = l31Var.b;
        if (j <= j2) {
            if (j < 0) {
                c.o(zo5.j(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                fcf fcfVar = l31Var.a.g;
                int i = fcfVar.c;
                long j4 = i - fcfVar.b;
                if (j4 > j3) {
                    fcfVar.c = i - ((int) j3);
                    break;
                } else {
                    l31Var.a = fcfVar.a();
                    vcf.a(fcfVar);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                fcf fcfVarY = l31Var.Y(i2);
                int iMin = (int) Math.min(j5, 8192 - fcfVarY.c);
                int i3 = fcfVarY.c + iMin;
                fcfVarY.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.c = fcfVarY;
                    this.d = j2;
                    this.e = fcfVarY.a;
                    this.f = i3 - iMin;
                    this.g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        l31Var.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            ore.k("not attached to a buffer");
            return;
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.g = -1;
    }

    public final int g(long j) {
        l31 l31Var = this.a;
        if (l31Var == null) {
            ore.k("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = l31Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                fcf fcfVar = l31Var.a;
                fcf fcfVar2 = this.c;
                long j3 = 0;
                if (fcfVar2 != null) {
                    long j4 = this.d - ((long) (this.f - fcfVar2.b));
                    if (j4 > j) {
                        fcfVar2 = fcfVar;
                        fcfVar = fcfVar2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    fcfVar2 = fcfVar;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = ((long) (fcfVar2.c - fcfVar2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        fcfVar2 = fcfVar2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        fcfVar = fcfVar.g;
                        j2 -= (long) (fcfVar.c - fcfVar.b);
                    }
                    fcfVar2 = fcfVar;
                    j3 = j2;
                }
                if (this.b && fcfVar2.d) {
                    byte[] bArr = fcfVar2.a;
                    fcf fcfVar3 = new fcf(Arrays.copyOf(bArr, bArr.length), fcfVar2.b, fcfVar2.c, false, true);
                    if (l31Var.a == fcfVar2) {
                        l31Var.a = fcfVar3;
                    }
                    fcfVar2.b(fcfVar3);
                    fcfVar3.g.a();
                    fcfVar2 = fcfVar3;
                }
                this.c = fcfVar2;
                this.d = j;
                this.e = fcfVar2.a;
                int i = fcfVar2.b + ((int) (j - j3));
                this.f = i;
                int i2 = fcfVar2.c;
                this.g = i2;
                return i2 - i;
            }
        }
        StringBuilder sbS = qt4.s(j, "offset=", " > size=");
        sbS.append(l31Var.b);
        throw new ArrayIndexOutOfBoundsException(sbS.toString());
    }
}
