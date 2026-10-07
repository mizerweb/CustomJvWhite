package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kjc {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final kh c;
    public final LinkedHashMap d;

    public kjc(ArrayList arrayList, LinkedHashMap linkedHashMap, kh khVar, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = khVar;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjc)) {
            return false;
        }
        kjc kjcVar = (kjc) obj;
        return this.a.equals(kjcVar.a) && this.b.equals(kjcVar.b) && cqk.d(this.c, kjcVar.c) && this.d.equals(kjcVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kh khVar = this.c;
        return this.d.hashCode() + ((iHashCode + (khVar == null ? 0 : khVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
