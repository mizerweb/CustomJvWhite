package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fp4 implements jp4 {
    public final ynh a;

    public fp4(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp4) && this.a.equals(((fp4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gallery(toolbarTitle=" + this.a + ")";
    }
}
