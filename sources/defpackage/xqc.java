package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xqc implements aw8 {
    public static yqc e() {
        return yqc.c;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0072 A[DONT_INVERT, PHI: r7
  0x0072: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x002b, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0074 A[LOOP:0: B:5:0x001d->B:17:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[EDGE_INSN: B:21:0x0077->B:18:0x0077 BREAK  A[LOOP:0: B:5:0x001d->B:17:0x0074], SYNTHETIC] */
    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        p1f p1fVar = ((yqc) obj).a;
        x74 x74VarR = u76Var.r(yqc.d, p1fVar.e);
        Object[] objArr = p1fVar.b;
        Object[] objArr2 = p1fVar.c;
        long[] jArr = p1fVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8;
                    int i4 = 8 - ((~(i - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i << 3) + i5;
                            Object obj2 = objArr[i6];
                            int i7 = ((wqc) objArr2[i6]).a;
                            xt7 xt7Var = yqc.d;
                            int i8 = i2 + 1;
                            x74VarR.i(xt7Var, i2, n5h.a, (String) obj2);
                            i2 += 2;
                            x74VarR.i(xt7Var, i8, ij8.a, Integer.valueOf(i7));
                        }
                        j >>= i3;
                        i5++;
                        i3 = i3;
                    }
                    if (i4 != i3) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        x74VarR.c();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        b9b b9bVar = new b9b();
        v74 v74VarA = r55Var.a(yqc.d);
        while (true) {
            xt7 xt7Var = yqc.d;
            int iV = v74VarA.v(xt7Var);
            if (iV == -1) {
                v74VarA.j(xt7Var);
                return new yqc(b9bVar);
            }
            b9bVar.o((String) v74VarA.x(xt7Var, iV, n5h.a, null), new wqc(((Number) v74VarA.x(xt7Var, v74VarA.v(xt7Var), ij8.a, null)).intValue()));
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        return yqc.d;
    }

    public final aw8 serializer() {
        return yqc.b;
    }
}
