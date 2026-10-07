package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aqi extends oqi {
    public final b68 a;

    public aqi(b68 b68Var) {
        this.a = b68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqi) && this.a.equals(((aqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshPhoto(config=" + this.a + ")";
    }
}
