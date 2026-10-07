package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class t1a {
    public final long a;
    public final LinkedHashSet b;
    public final String c;

    public /* synthetic */ t1a(long j, LinkedHashSet linkedHashSet, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new LinkedHashSet() : linkedHashSet, (String) null);
    }

    public static t1a a(t1a t1aVar, long j, LinkedHashSet linkedHashSet, String str, int i) {
        if ((i & 1) != 0) {
            j = t1aVar.a;
        }
        if ((i & 2) != 0) {
            linkedHashSet = t1aVar.b;
        }
        if ((i & 4) != 0) {
            str = t1aVar.c;
        }
        t1aVar.getClass();
        return new t1a(j, linkedHashSet, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1a)) {
            return false;
        }
        t1a t1aVar = (t1a) obj;
        return this.a == t1aVar.a && cqk.d(this.b, t1aVar.b) && cqk.d(this.c, t1aVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistState(playingMsgId=");
        sb.append(this.a);
        sb.append(", order=");
        sb.append(this.b);
        return qt4.q(sb, ", attachId=", this.c, ")");
    }

    public t1a(long j, LinkedHashSet linkedHashSet, String str) {
        this.a = j;
        this.b = linkedHashSet;
        this.c = str;
    }
}
