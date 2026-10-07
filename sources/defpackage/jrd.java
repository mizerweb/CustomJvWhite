package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jrd implements krd {
    public final ynh a;

    public jrd(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrd) && this.a.equals(((jrd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowSuccessRestoredMembersSnackbar(caption=" + this.a + ")";
    }
}
