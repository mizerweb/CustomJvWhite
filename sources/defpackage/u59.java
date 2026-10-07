package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u59 {
    public final String a;
    public final ynh b;

    public u59(ynh ynhVar, String str) {
        this.a = str;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u59)) {
            return false;
        }
        u59 u59Var = (u59) obj;
        return cqk.d(this.a, u59Var.a) && cqk.d(this.b, u59Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkValidationState(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
