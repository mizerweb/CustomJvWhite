package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bz0 implements ez0 {
    public final bk4 a;

    public bz0(bk4 bk4Var) {
        this.a = bk4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz0) && this.a == ((bz0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
