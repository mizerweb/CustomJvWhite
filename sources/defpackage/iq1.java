package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iq1 implements kq1 {
    public final xnh a;

    public iq1(xnh xnhVar) {
        this.a = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq1) && this.a.equals(((iq1) obj).a);
    }

    @Override // defpackage.kq1
    public final ynh getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(text=" + this.a + ")";
    }
}
