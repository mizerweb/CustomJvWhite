package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hr8 implements jr8 {
    public final boolean a;

    public hr8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr8) && this.a == ((hr8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Empty(isSearchActive=", ")", this.a);
    }
}
