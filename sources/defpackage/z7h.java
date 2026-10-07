package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class z7h implements jj6 {
    public final d8h a;
    public final b87 b;
    public final ArrayList c;
    public kyh f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = vqi.b;
    public final nmc d = new nmc();

    public z7h(d8h d8hVar, b87 b87Var) {
        b87 b87Var2;
        this.a = d8hVar;
        if (b87Var != null) {
            a87 a87VarA = b87Var.a();
            a87VarA.m = uya.n("application/x-media3-cues");
            a87VarA.j = b87Var.n;
            a87VarA.K = d8hVar.F();
            b87Var2 = new b87(a87VarA);
        } else {
            b87Var2 = null;
        }
        this.b = b87Var2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = vqi.c;
        this.j = -9223372036854775807L;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        lvb.b0(this.h == 0);
        kyh kyhVarG = lj6Var.G(0, 3);
        this.f = kyhVarG;
        b87 b87Var = this.b;
        if (b87Var != null) {
            kyhVarG.g(b87Var);
            lj6Var.D();
            lj6Var.r(new ad8(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    public final void a(y7h y7hVar) {
        this.f.getClass();
        byte[] bArr = y7hVar.b;
        int length = bArr.length;
        nmc nmcVar = this.d;
        nmcVar.getClass();
        nmcVar.L(bArr.length, bArr);
        this.f.f(length, nmcVar);
        this.f.a(y7hVar.a, 1, length, 0, null);
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return true;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        int i = this.h;
        lvb.b0((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00ce, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        int i;
        long j;
        c8h c8hVar;
        int i2;
        int i3 = this.h;
        lvb.b0((i3 == 0 || i3 == 5) ? false : true);
        if (this.h == 1) {
            int iB = kj6Var.getLength() != -1 ? k4m.b(kj6Var.getLength()) : 1024;
            if (iB > this.e.length) {
                this.e = new byte[iB];
            }
            this.g = 0;
            this.h = 2;
        }
        int i4 = this.h;
        ArrayList arrayList = this.c;
        if (i4 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i5 = this.g;
            int i6 = kj6Var.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.g += i6;
            }
            long length = kj6Var.getLength();
            if (length != -1) {
                i = 0;
                if (this.g == length) {
                    try {
                        j = this.j;
                        if (j != -9223372036854775807L) {
                            c8hVar = new c8h(j, true);
                        } else {
                            c8hVar = c8h.c;
                        }
                        this.a.k(this.e, 0, this.g, c8hVar, new vuf(9, this));
                        Collections.sort(arrayList);
                        this.i = new long[arrayList.size()];
                        for (i2 = i; i2 < arrayList.size(); i2++) {
                            this.i[i2] = ((y7h) arrayList.get(i2)).a;
                        }
                        this.e = vqi.b;
                        this.h = 4;
                    } catch (RuntimeException e) {
                        throw ParserException.a(e, "SubtitleParser failed.");
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.j;
                if (j != -9223372036854775807L) {
                    c8hVar = new c8h(j, true);
                } else {
                    c8hVar = c8h.c;
                }
                this.a.k(this.e, 0, this.g, c8hVar, new vuf(9, this));
                Collections.sort(arrayList);
                this.i = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.i[i2] = ((y7h) arrayList.get(i2)).a;
                }
                this.e = vqi.b;
                this.h = 4;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (kj6Var.C(kj6Var.getLength() != -1 ? k4m.b(kj6Var.getLength()) : 1024) == -1) {
                long j2 = this.j;
                for (int iF = j2 == -9223372036854775807L ? i : vqi.f(this.i, j2, true); iF < arrayList.size(); iF++) {
                    a((y7h) arrayList.get(iF));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.jj6
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }
}
