package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j9a implements m9a {
    public final int a;

    public j9a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9a) && this.a == ((j9a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "OnMemberListActionClicked(id=", ")");
    }
}
