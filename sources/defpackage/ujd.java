package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ujd {
    public final pj4 a;
    public final LinkedHashMap b;
    public final ArrayList c;

    public ujd(pj4 pj4Var, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.a = pj4Var;
        this.b = linkedHashMap;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujd)) {
            return false;
        }
        ujd ujdVar = (ujd) obj;
        return this.a.equals(ujdVar.a) && this.b.equals(ujdVar.b) && this.c.equals(ujdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Profile(contactInfo=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ")";
    }
}
