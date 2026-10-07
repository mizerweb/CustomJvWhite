package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tqa implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;

    public /* synthetic */ tqa(jsa jsaVar, t50 t50Var, j44 j44Var, long j, r8e r8eVar, String str) {
        this.c = jsaVar;
        this.d = t50Var;
        this.e = j44Var;
        this.b = j;
        this.f = r8eVar;
        this.g = str;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Serializable serializable = this.g;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                jsa jsaVar = (jsa) obj4;
                String str = (String) serializable;
                return yab.h0(jsaVar.b, jsaVar.w, 2, new mra((t50) obj3, jsaVar, (j44) obj2, this.b, (gjg) obj, str, null));
            default:
                ose oseVar = (ose) obj4;
                ArrayList arrayList = (ArrayList) obj;
                gda gdaVar = (gda) serializable;
                toa toaVar = (toa) oseVar.h();
                long jLongValue = ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 7, (gga) obj3))).longValue();
                Long lA = v7e.a((Long) obj2);
                if (lA != null) {
                    ch3.G(((toa) oseVar.h()).a, false, true, new x14(6, lA.longValue(), jLongValue));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    oseVar.j((zic) it.next(), this.b);
                }
                if (((f5d) ((wo6) oseVar.b.getValue())).q()) {
                    oseVar.F(jLongValue, gdaVar);
                }
                return Long.valueOf(jLongValue);
        }
    }

    public /* synthetic */ tqa(ose oseVar, gga ggaVar, Long l, ArrayList arrayList, gda gdaVar, long j) {
        this.c = oseVar;
        this.d = ggaVar;
        this.e = l;
        this.f = arrayList;
        this.g = gdaVar;
        this.b = j;
    }
}
