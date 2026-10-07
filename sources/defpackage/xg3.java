package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xg3 implements yg3 {
    public final int a;

    public xg3(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg3) && this.a == ((xg3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "ShowSuggestion(type=", ")");
    }
}
