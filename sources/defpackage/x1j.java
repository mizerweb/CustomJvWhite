package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x1j extends a2j {
    public final boolean a;

    public x1j(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1j) && this.a == ((x1j) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("FrontCamera(isTimerVisible=", ")", this.a);
    }
}
