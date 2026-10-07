package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pol {
    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[LOOP:0: B:5:0x0012->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[EDGE_INSN: B:19:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0047], SYNTHETIC] */
    public static final List a(c9b c9bVar) {
        ArrayList arrayList = new ArrayList(c9bVar.d);
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
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
                            arrayList.add(objArr[(i << 3) + i3]);
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
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8 == r6) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [qf7] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ppe] */
    /* JADX WARN: Type inference failed for: r8v0, types: [fd4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [fd4] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ppe] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [fd4] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ppe] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.fd4 r8, defpackage.ppe r9, defpackage.qf7 r10, defpackage.nq4 r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.je4
            if (r0 == 0) goto L13
            r0 = r11
            je4 r0 = (defpackage.je4) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            je4 r0 = new je4
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.g
            int r1 = r0.h
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L36
            if (r1 == r2) goto L30
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r5
        L30:
            java.lang.Throwable r8 = r0.f
            defpackage.ch3.d0(r11)
            goto L77
        L36:
            defpackage.ch3.d0(r11)
            goto L65
        L3a:
            ppe r9 = r0.e
            fd4 r8 = r0.d
            defpackage.ch3.d0(r11)     // Catch: java.lang.Throwable -> L42
            goto L58
        L42:
            r10 = move-exception
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L68
        L48:
            defpackage.ch3.d0(r11)
            r0.d = r8     // Catch: java.lang.Throwable -> L42
            r0.e = r9     // Catch: java.lang.Throwable -> L42
            r0.h = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r10.invoke(r8, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto L58
            goto L76
        L58:
            r0.d = r5
            r0.e = r5
            r0.h = r3
            java.lang.Object r8 = r9.c(r8, r0)
            if (r8 != r6) goto L65
            goto L76
        L65:
            sbi r8 = defpackage.sbi.a
            return r8
        L68:
            r0.d = r5
            r0.e = r5
            r0.f = r8
            r0.h = r2
            java.lang.Object r9 = r10.c(r9, r0)
            if (r9 != r6) goto L77
        L76:
            return r6
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pol.b(fd4, ppe, qf7, nq4):java.lang.Object");
    }
}
