package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class mic {
    public final ny8 a;

    public mic(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final Object a(u8b u8bVar, daa daaVar) {
        kic kicVar = (kic) this.a.getValue();
        ArrayList arrayList = new ArrayList(u8bVar.b);
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            yhc yhcVar = (yhc) objArr[i2];
            long j = yhcVar.a;
            String str = yhcVar.b;
            String str2 = yhcVar.d;
            Long l = yhcVar.e;
            Long l2 = yhcVar.f;
            long j2 = yhcVar.c;
            String str3 = yhcVar.g;
            u8b u8bVar2 = yhcVar.h;
            arrayList.add(new zhc(j, str, str2, l, l2, j2, str3, u8bVar2 != null ? u8bVar2.e() : null));
        }
        Object objI = ch3.I(daaVar, kicVar.a, false, true, new iaa(kicVar, 22, Collections.unmodifiableList(arrayList)));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final gfb b(long j) {
        kic kicVar = (kic) this.a.getValue();
        return new gfb(ch3.i(kicVar.a, new String[]{"organizations"}, new en3(j, kicVar, 4)), 2);
    }
}
