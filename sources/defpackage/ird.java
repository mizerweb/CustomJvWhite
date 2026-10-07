package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ird implements krd {
    public final ynh a;

    public ird(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ird) && this.a.equals(((ird) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowRestoreMembersSnackbar(caption=" + this.a + ")";
    }
}
