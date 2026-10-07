package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oy7 implements py7 {
    public final boolean a;

    public oy7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy7) && this.a == ((oy7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Success(isHold=", ")", this.a);
    }
}
