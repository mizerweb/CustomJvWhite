package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pi8 {
    public static final c9b a;

    static {
        c9b c9bVar = r1f.a;
        a = new c9b();
    }

    public static final void a() {
        c9b c9bVar = a;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((vjg) objArr[(i << 3) + i3]).e();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
