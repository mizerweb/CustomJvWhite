package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qxg {
    public final boolean a;

    public qxg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxg) && this.a == ((qxg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ShowBottomSheet(showViews=", ")", this.a);
    }
}
