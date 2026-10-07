package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cz0 implements ez0 {
    public final so4 a;

    public cz0(so4 so4Var) {
        this.a = so4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz0) && this.a == ((cz0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(event=" + this.a + ")";
    }
}
