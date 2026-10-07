package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vld extends cmd {
    public final vnh b;

    public vld(vnh vnhVar) {
        this.b = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vld) && this.b.equals(((vld) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ExternalShareLink(text=" + this.b + ")";
    }
}
