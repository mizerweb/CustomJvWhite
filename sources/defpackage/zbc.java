package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zbc implements bcc {
    public final hcc a;

    public zbc(hcc hccVar) {
        this.a = hccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbc) && this.a.equals(((zbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
