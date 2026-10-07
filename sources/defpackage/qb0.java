package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qb0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof qb0) {
            return this.a == ((qb0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("AudioRestrictionMode(value=", this.a, ')');
    }
}
