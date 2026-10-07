package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o67 extends hih {
    public final String c;
    public final String d;
    public final m8b e;
    public final LinkedHashSet f;
    public final Set g;
    public final Set h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o67(String str, String str2, m8b m8bVar, LinkedHashSet linkedHashSet, Set set, Set set2, int i) {
        super(kfc.F3);
        m8bVar = (i & 8) != 0 ? ui9.a : m8bVar;
        linkedHashSet = (i & 16) != 0 ? new LinkedHashSet() : linkedHashSet;
        set2 = (i & 64) != 0 ? s37.b : set2;
        this.c = str;
        this.d = str2;
        this.e = m8bVar;
        this.f = linkedHashSet;
        this.g = set;
        this.h = set2;
        h("id", str);
        h("title", str2);
        if (m8bVar.j()) {
            this.a.put("include", m8bVar);
        }
        if (!linkedHashSet.isEmpty()) {
            this.a.put("favorites", linkedHashSet);
        }
        ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((i37) it.next()).a));
        }
        if (!arrayList.isEmpty()) {
            d("filters", arrayList);
        }
        Set set3 = this.h;
        ArrayList arrayList2 = new ArrayList(yw3.W0(set3, 10));
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((s37) it2.next()).a));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        d("options", arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o67)) {
            return false;
        }
        o67 o67Var = (o67) obj;
        return cqk.d(this.c, o67Var.c) && cqk.d(this.d, o67Var.d) && cqk.d(this.e, o67Var.e) && cqk.d(this.f, o67Var.f) && cqk.d(this.g, o67Var.g) && cqk.d(this.h, o67Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + nbh.o(this.g, (this.f.hashCode() + ((this.e.hashCode() + zo5.d(this.c.hashCode() * 31, 961, this.d)) * 31)) * 31, 31);
    }
}
