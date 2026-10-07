package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tq9 implements cr9 {
    public final boolean a;

    public tq9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq9) && this.a == ((tq9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Close(withClear=", ")", this.a);
    }
}
