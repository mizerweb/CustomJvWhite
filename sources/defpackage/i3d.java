package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i3d {
    public final cx6 a;

    public i3d(cx6 cx6Var) {
        this.a = cx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i3d) {
            return this.a.equals(((i3d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
