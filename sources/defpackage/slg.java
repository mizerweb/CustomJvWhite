package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class slg {
    public final boolean a;

    public slg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slg) && this.a == ((slg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("SetSelection(selected=", ")", this.a);
    }
}
