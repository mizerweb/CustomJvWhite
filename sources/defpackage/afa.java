package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class afa implements Serializable {
    public final int a;

    public afa(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afa) && this.a == ((afa) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "CommentsInfo{totalCount=", "}");
    }
}
