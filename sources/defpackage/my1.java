package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class my1 extends ry1 {
    public final boolean F;

    public my1(boolean z) {
        this.F = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my1) && this.F == ((my1) obj).F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F);
    }

    public final String toString() {
        return qv1.m("ShareScreen(isEnabled=", ")", this.F);
    }
}
