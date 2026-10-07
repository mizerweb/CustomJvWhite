package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lod implements mod {
    public final boolean a;

    public lod(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lod) && this.a == ((lod) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("SwitchPayload(isChecked=", ")", this.a);
    }
}
