package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bpk {
    public static final ibg a = new ibg();
    public static final jbg b = new jbg();

    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b A[LOOP:0: B:5:0x0012->B:15:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[EDGE_INSN: B:18:0x004e->B:16:0x004e BREAK  A[LOOP:0: B:5:0x0012->B:15:0x004b], SYNTHETIC] */
    public static final ArrayList a(l8b l8bVar) {
        ArrayList arrayList = new ArrayList(l8bVar.e);
        long[] jArr = l8bVar.b;
        long[] jArr2 = l8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
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
                            arrayList.add(Long.valueOf(jArr[(i << 3) + i3]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static int b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
