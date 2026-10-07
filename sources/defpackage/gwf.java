package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gwf extends mk0 {
    public final vnh b;

    public gwf(vnh vnhVar) {
        super(20);
        this.b = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwf) && this.b.equals(((gwf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ")";
    }
}
