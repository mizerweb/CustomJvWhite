package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class oif implements Serializable {
    public final String a = " ";

    static {
        int i = bv8.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != oif.class) {
            return false;
        }
        return this.a.equals(((oif) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
