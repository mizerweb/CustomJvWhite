package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fle {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final pme e;
    public final di8 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fle(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, pme pmeVar, int i) {
        int i2 = i & 2;
        s66 s66Var = s66.a;
        this(list, i2 != 0 ? s66Var : linkedHashMap, (i & 4) != 0 ? s66Var : linkedHashMap2, (i & 8) != 0 ? r66.a : arrayList, (i & 16) != 0 ? null : pmeVar, (di8) null);
    }

    public final String toString() {
        String str;
        pme pmeVar = this.e;
        if (pmeVar == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) pme.b(pmeVar.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }

    public fle(List list, Map map, Map map2, List list2, pme pmeVar, di8 di8Var) {
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = list2;
        this.e = pmeVar;
        this.f = di8Var;
    }
}
