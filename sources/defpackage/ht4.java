package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ht4 implements it4 {
    public final ynh a;

    public ht4(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht4) && cqk.d(this.a, ((ht4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(message=" + this.a + ")";
    }
}
