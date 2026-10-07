package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k27 implements n27 {
    public final boolean a;

    public k27(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k27) && this.a == ((k27) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Close(afterCreate=", ")", this.a);
    }
}
