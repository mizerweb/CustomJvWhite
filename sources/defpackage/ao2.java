package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ao2 {
    public final boolean a;

    public ao2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao2) && this.a == ((ao2) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("SetSelection(selected=", ")", this.a);
    }
}
