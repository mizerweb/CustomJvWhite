package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vd implements xd {
    public final boolean a;

    public vd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd) && this.a == ((vd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("DisableScreenRecord(isRemoved=", ")", this.a);
    }
}
