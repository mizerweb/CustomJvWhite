package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vc5 {
    public final ny8 a;

    public vc5(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x010f A[LOOP:2: B:19:0x00d8->B:29:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[EDGE_INSN: B:40:0x0112->B:30:0x0112 BREAK  A[LOOP:2: B:19:0x00d8->B:29:0x010f], SYNTHETIC] */
    public final c79 a() {
        e8b e8bVar = new e8b();
        List list = (List) ch3.G(((sse) this.a.getValue()).b().a, true, false, new pyb(12));
        ArrayList<rtc> arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sse.c((stc) it.next()));
        }
        for (rtc rtcVar : arrayList) {
            int i = rtcVar.c;
            long j = rtcVar.e;
            String str = rtcVar.d;
            ktc ktcVar = (ktc) e8bVar.c(i);
            if (ktcVar == null) {
                int i2 = rtcVar.c;
            } else {
                String str2 = ktcVar.h;
                int i3 = ktcVar.a;
                String str3 = ktcVar.b;
                ArrayList arrayList2 = new ArrayList(ktcVar.e);
                ArrayList arrayList3 = new ArrayList(ktcVar.f);
                String str4 = ktcVar.g;
                arrayList2.add(str);
                arrayList3.add(Long.valueOf(j));
                if (str2 != null) {
                    r5h.X0(str2);
                }
            }
        }
        c79 c79Var = new c79(e8bVar.e);
        Object[] objArr = e8bVar.c;
        long[] jArr = e8bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            c79Var.add((ktc) objArr[(i4 << 3) + i6]);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                    if (i4 != length) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return yab.j(c79Var);
    }
}
