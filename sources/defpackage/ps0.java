package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ps0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ps0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        a54 a54VarC = a54.a;
        switch (i) {
            case 0:
                return ((b87) obj2).j - ((b87) obj).j;
            case 1:
                ws0 ws0Var = (ws0) obj;
                ws0 ws0Var2 = (ws0) obj2;
                int iCompare = Integer.compare(ws0Var.c, ws0Var2.c);
                return iCompare != 0 ? iCompare : ws0Var.b.compareTo(ws0Var2.b);
            case 2:
                return Long.compare(((fda) obj2).getC(), ((fda) obj).getC());
            case 3:
                return Integer.compare(((ko2) obj2).b, ((ko2) obj).b);
            case 4:
                return Long.compare(((ex2) obj).a, ((ex2) obj2).a);
            case 5:
                return 0;
            case 6:
                return ((lve) obj2).f - ((lve) obj).f;
            case 7:
                return Integer.compare(((me5) ((List) obj).get(0)).f, ((me5) ((List) obj2).get(0)).f);
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                return y44.g(ue5.d((ue5) Collections.max(list, new ps0(11)), (ue5) Collections.max(list2, new ps0(11)))).a(list.size(), list2.size()).c((ue5) Collections.max(list, new ps0(12)), (ue5) Collections.max(list2, new ps0(12)), new ps0(12)).f();
            case 9:
                return ((le5) Collections.max((List) obj)).compareTo((le5) Collections.max((List) obj2));
            case 10:
                return ((re5) ((List) obj).get(0)).compareTo((re5) ((List) obj2).get(0));
            case 11:
                return ue5.d((ue5) obj, (ue5) obj2);
            case 12:
                ue5 ue5Var = (ue5) obj;
                ue5 ue5Var2 = (ue5) obj2;
                boolean z = ue5Var.e;
                int i2 = ue5Var.j;
                ohc ohcVarA = (z && ue5Var.h) ? ve5.k : ve5.k.a();
                if (ue5Var.f.F) {
                    a54VarC = a54VarC.c(Integer.valueOf(i2), Integer.valueOf(ue5Var2.j), ve5.k.a());
                }
                return a54VarC.c(Integer.valueOf(ue5Var.k), Integer.valueOf(ue5Var2.k), ohcVarA).c(Integer.valueOf(i2), Integer.valueOf(ue5Var2.j), ohcVarA).f();
            case 13:
                return Long.compare(((rp5) obj).c, ((rp5) obj2).c);
            case 14:
                return tre.P(((l71) obj).c, ((l71) obj2).c);
            case 15:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 16:
                return ((kx7) obj).a.compareTo(((kx7) obj2).a);
            case 17:
                i69 i69Var = (i69) obj;
                i69 i69Var2 = (i69) obj2;
                int i4 = i69Var.c;
                int i5 = i69Var2.c;
                if (i4 < i5) {
                    return -1;
                }
                if (i4 > i5) {
                    return 1;
                }
                return Integer.compare(i69Var2.d, i69Var.d);
            case 18:
                ((ayh) obj).getClass();
                ((ayh) obj2).getClass();
                return Integer.compare(1, 1);
            case 19:
                return Integer.compare(((efc) obj).a.b, ((efc) obj2).a.b);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Long.compare(((suj) obj).b, ((suj) obj2).b);
            case 21:
                return ((bh0) obj).a.compareTo(((bh0) obj2).a);
            case 22:
                w5e w5eVar = (w5e) obj;
                w5e w5eVar2 = (w5e) obj2;
                if (w5eVar == null || w5eVar2 == null) {
                    return 0;
                }
                return w5eVar2.getCount() - w5eVar.getCount();
            case 23:
                jja jjaVar = (jja) obj;
                jja jjaVar2 = (jja) obj2;
                int i6 = cqk.i(jjaVar2.b, jjaVar.b);
                if (i6 == 0) {
                    return jjaVar.a.b.a.toString().compareTo(jjaVar2.a.b.a.toString());
                }
                return i6;
            case 24:
                bbg bbgVar = (bbg) obj;
                bbg bbgVar2 = (bbg) obj2;
                return a54VarC.b(bbgVar.a, bbgVar2.a).b(bbgVar.b, bbgVar2.b).a(bbgVar.c, bbgVar2.c).f();
            case 25:
                return ((rtc) obj2).n().compareTo(((rtc) obj).n());
            case 26:
                return Integer.compare(((tuj) obj).a.b, ((tuj) obj2).a.b);
            case 27:
                return Long.compare(((suj) obj).b, ((suj) obj2).b);
            case 28:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return ((zbk) obj).b.p().compareTo(((zbk) obj2).b.p());
        }
    }
}
