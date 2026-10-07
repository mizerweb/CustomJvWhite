package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yph {
    public final boolean a;

    public yph(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yph) && this.a == ((yph) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Selection(isSelected=", ")", this.a);
    }
}
