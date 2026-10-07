package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ei7 implements fi7 {
    public final int a;

    public ei7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei7) && this.a == ((ei7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "UpdateTextStoryOffset(offsetX=", ")");
    }
}
