package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lfc {
    public final wmi a;
    public final String b = lfc.class.getName();
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public lfc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, wmi wmiVar) {
        this.a = wmiVar;
        this.c = ny8Var;
        this.d = ny8Var3;
        this.e = ny8Var2;
    }

    public static final long a(lfc lfcVar, e8b e8bVar, cf7 cf7Var) {
        int i;
        int iIntValue;
        lhb lhbVar = kfc.c;
        int i2 = 0;
        long j = ((bj8) e8bVar.d(5, new bj8(bj8.a(0, 0)))).a;
        Object[] objArr = e8bVar.c;
        long[] jArr = e8bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            iIntValue = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = i2; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            iIntValue = ((Number) cf7Var.invoke(new bj8(((bj8) objArr[(i3 << 3) + i5]).a))).intValue() + iIntValue;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 != length) {
                    i3++;
                    i2 = 0;
                } else {
                    i = iIntValue;
                }
            }
            return bj8.a(((Number) cf7Var.invoke(new bj8(j))).intValue(), iIntValue);
        }
        i = 0;
        iIntValue = i;
        return bj8.a(((Number) cf7Var.invoke(new bj8(j))).intValue(), iIntValue);
    }

    public static final String b(lfc lfcVar, ArrayList arrayList) {
        du8 du8Var = new du8();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ylc ylcVar = (ylc) it.next();
            du8Var.b(kt8.b(Integer.valueOf(((Number) ylcVar.b).intValue())), (String) ylcVar.a);
        }
        return du8Var.a().toString();
    }

    public final wo6 c() {
        return (wo6) this.e.getValue();
    }
}
