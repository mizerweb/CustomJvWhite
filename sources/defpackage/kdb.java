package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class kdb implements vve {
    public final HashMap a;

    public kdb(HashMap map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kdb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((kdb) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "NetworkStatusNotification{networkStatus=" + this.a + '}';
    }
}
