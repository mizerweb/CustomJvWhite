package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pd0 {
    public final ny8 a;
    public final ny8 b;

    public pd0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x007a A[LOOP:0: B:8:0x0043->B:18:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[EDGE_INSN: B:22:0x007d->B:19:0x007d BREAK  A[LOOP:0: B:8:0x0043->B:18:0x007a], SYNTHETIC] */
    public final void a(f2 f2Var) {
        ae9 ae9Var = (ae9) this.a.getValue();
        String str = (String) f2Var.a;
        ul9 ul9Var = new ul9();
        Integer numC = ((tbb) this.b.getValue()).c();
        if (numC != null) {
            ul9Var.put("screen", Integer.valueOf(numC.intValue()));
        }
        b9b b9bVar = (b9b) f2Var.b;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ul9Var.put((String) objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ae9.k(ae9Var, "REGISTRATION", str, ul9Var.b(), 8);
    }
}
