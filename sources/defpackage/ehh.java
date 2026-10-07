package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ehh {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ehh(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehh)) {
            return false;
        }
        ehh ehhVar = (ehh) obj;
        if (!this.a.equals(ehhVar.a) || !cqk.d(this.b, ehhVar.b) || !cqk.d(this.c, ehhVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = ehhVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + v0h.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(qvl.b(ww3.M1(this.b.values(), new crg(3))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(qvl.b(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(qvl.b(set != null ? ww3.M1(set, new crg(4)) : r66.a));
        sb.append("\n            |}\n        ");
        return s5h.y0(sb.toString());
    }
}
