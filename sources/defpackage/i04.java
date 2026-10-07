package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i04 implements k04 {
    public final boolean a;

    public i04(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i04) && this.a == ((i04) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Empty(isSearchActive=", ")", this.a);
    }
}
