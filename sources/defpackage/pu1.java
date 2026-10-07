package defpackage;

import java.util.List;
import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes2.dex */
public final class pu1 {
    public final gu4 a;
    public final LongSupplier b;
    public final ny8 c;
    public final ny8 d;
    public final v8b e;
    public final c9b f;
    public final v8b g;
    public final v8b h;
    public List i;
    public c9b j;
    public sgg k;

    public pu1(ny8 ny8Var, dq4 dq4Var, ny8 ny8Var2) {
        lu1 lu1Var = new lu1(0);
        this.a = dq4Var;
        this.b = lu1Var;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = new v8b();
        this.f = new c9b();
        this.g = new v8b();
        this.h = new v8b();
        this.i = r66.a;
        this.j = new c9b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:5:0x000f->B:18:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[SYNTHETIC] */
    public final boolean a(long j) {
        v8b v8bVar = this.e;
        Object[] objArr = v8bVar.b;
        long[] jArr = v8bVar.c;
        long[] jArr2 = v8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr2[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            if (j - jArr[i4] < 2000) {
                                return true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }
}
