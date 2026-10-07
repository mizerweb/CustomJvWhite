package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yv1 implements zv1 {
    public final boolean a;

    public yv1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv1) && this.a == ((yv1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Close(showSnackbar=", ")", this.a);
    }
}
