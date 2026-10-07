package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class upc {
    public final azg a;
    public final Map b;
    public final long c;
    public final boolean d;

    public upc(azg azgVar, Map map, long j, boolean z) {
        this.a = azgVar;
        this.b = map;
        this.c = j;
        this.d = z;
    }

    public static upc a(upc upcVar, LinkedHashMap linkedHashMap, long j, boolean z, int i) {
        Map map = linkedHashMap;
        azg azgVar = upcVar.a;
        if ((i & 2) != 0) {
            map = upcVar.b;
        }
        if ((i & 4) != 0) {
            j = upcVar.c;
        }
        if ((i & 8) != 0) {
            z = upcVar.d;
        }
        upcVar.getClass();
        long j2 = j;
        return new upc(azgVar, map, j2, z);
    }

    public final long b() {
        return this.c;
    }

    public final azg c() {
        return this.a;
    }

    public final Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upc)) {
            return false;
        }
        upc upcVar = (upc) obj;
        return cqk.d(this.a, upcVar.a) && cqk.d(this.b, upcVar.b) && this.c == upcVar.c && this.d == upcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qt4.g(v0h.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "PeerStoriesModel(owner=" + this.a + ", stories=" + this.b + ", cachedAtMs=" + this.c + ", isComplete=" + this.d + ")";
    }

    public /* synthetic */ upc(azg azgVar, LinkedHashMap linkedHashMap) {
        this(azgVar, linkedHashMap, 0L, true);
    }
}
