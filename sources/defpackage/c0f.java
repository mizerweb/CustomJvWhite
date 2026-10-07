package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c0f implements e0f {
    public final Map a;
    public final long b;

    public c0f(Map map, long j) {
        this.a = map;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0f)) {
            return false;
        }
        c0f c0fVar = (c0f) obj;
        return this.a.equals(c0fVar.a) && this.b == c0fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiBulkDownload(items=" + this.a + ", chatId=" + this.b + ")";
    }
}
