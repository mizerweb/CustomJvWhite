package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jq1 implements kq1 {
    public final xnh a;

    public jq1(xnh xnhVar) {
        this.a = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq1) && this.a.equals(((jq1) obj).a);
    }

    @Override // defpackage.kq1
    public final ynh getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(text=" + this.a + ")";
    }
}
