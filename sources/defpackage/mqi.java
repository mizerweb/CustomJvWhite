package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mqi extends oqi {
    public final boolean a;

    public mqi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqi) && this.a == ((mqi) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("StorySaveResult(saved=", ")", this.a);
    }
}
