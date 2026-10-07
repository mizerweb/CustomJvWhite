package defpackage;

import java.util.AbstractSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class we7 {
    public final String a;
    public final Set b;
    public final Set c;

    public we7(String str, AbstractSet abstractSet, Set set) {
        this.a = str;
        this.b = abstractSet;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we7)) {
            return false;
        }
        we7 we7Var = (we7) obj;
        if (cqk.d(this.a, we7Var.a) && cqk.d(this.b, we7Var.b)) {
            return cqk.d(this.c, we7Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.o(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return s5h.y0("\n            |FtsTableInfo {\n            |   name = '" + this.a + "',\n            |   columns = {" + qvl.b(ww3.L1(this.b)) + "\n            |   options = {" + qvl.b(ww3.L1(this.c)) + "\n            |}\n        ");
    }

    public we7(String str, LinkedHashSet linkedHashSet, String str2) {
        this(str, linkedHashSet, yok.d(str2));
    }
}
