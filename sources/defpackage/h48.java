package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h48 implements vve {
    public final HashMap a;

    public h48(HashMap map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h48.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h48) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
