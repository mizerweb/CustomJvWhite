package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uxa {
    public final String a;
    public final Map b;
    public final long c;

    public uxa(String str, long j, Map map) {
        this.a = str;
        this.b = map;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxa)) {
            return false;
        }
        uxa uxaVar = (uxa) obj;
        return this.a.equals(uxaVar.a) && this.b.equals(uxaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
