package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@mif(with = ddb.class)
public final class edb {
    public static final ddb d = new ddb();
    public static final edb e = new edb(r66.a, s66.a, c76.a);
    public static final fw f;
    public static final fif g;
    public final List a;
    public final Set b;
    public final Map c;

    static {
        fw fwVar = new fw(n5h.a);
        f = fwVar;
        g = fwVar.b;
    }

    public edb(List list, Map map, Set set) {
        this.a = list;
        this.b = set;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edb)) {
            return false;
        }
        return this.a.equals(((edb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("NetworkStatParamsConfig(raw=", ")", this.a);
    }
}
