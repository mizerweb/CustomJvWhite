package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mli {
    public final ft0 a;
    public final Map b;
    public final Set c;
    public pme d;

    public /* synthetic */ mli(ft0 ft0Var, LinkedHashMap linkedHashMap, pme pmeVar, int i) {
        this((i & 1) != 0 ? new ft0() : ft0Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : pmeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mli)) {
            return false;
        }
        mli mliVar = (mli) obj;
        return cqk.d(this.a, mliVar.a) && cqk.d(this.b, mliVar.b) && cqk.d(this.c, mliVar.c) && cqk.d(this.d, mliVar.d);
    }

    public final int hashCode() {
        int iO = nbh.o(this.c, v0h.c(this.b, this.a.hashCode() * 31, 31), 31);
        pme pmeVar = this.d;
        return iO + (pmeVar == null ? 0 : Integer.hashCode(pmeVar.a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public mli(ft0 ft0Var, Map map, Set set, pme pmeVar) {
        this.a = ft0Var;
        this.b = map;
        this.c = set;
        this.d = pmeVar;
    }
}
