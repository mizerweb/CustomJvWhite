package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class die {
    public final Map a;
    public final cie b;

    public die(Map map, cie cieVar) {
        this.a = map;
        this.b = cieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof die)) {
            return false;
        }
        die dieVar = (die) obj;
        return cqk.d(this.a, dieVar.a) && this.b == dieVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteMessage(data=" + this.a + ", priority=" + this.b + ")";
    }
}
