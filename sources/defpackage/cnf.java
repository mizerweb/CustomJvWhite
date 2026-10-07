package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cnf implements dnf {
    public final int a;

    public cnf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnf) && this.a == ((cnf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Room(id=", ")");
    }
}
