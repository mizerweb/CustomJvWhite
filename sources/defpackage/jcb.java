package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jcb implements aw8 {
    public static kcb e() {
        return kcb.d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT, PHI: r7
  0x0053: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x002c, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001e->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[EDGE_INSN: B:19:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001e->B:15:0x0055], SYNTHETIC] */
    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        nhd nhdVar = kj8.a;
        f8b f8bVar = ((kcb) obj).a;
        nhd nhdVar2 = kj8.a;
        x74 x74VarR = u76Var.r(nhdVar2, f8bVar.d);
        int[] iArr = f8bVar.b;
        long[] jArr = f8bVar.a;
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
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            x74VarR.y(i2, iArr[(i << 3) + i4], nhdVar2);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
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
        f8b f8bVarE = kj8.e(r55Var);
        f8bVarE.b(kcb.c);
        return new kcb(f8bVarE);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return kcb.e;
    }

    public final aw8 serializer() {
        return kcb.b;
    }
}
