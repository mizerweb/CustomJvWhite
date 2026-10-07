package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class prj implements hs8 {
    public final boolean a;

    public prj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prj) && this.a == ((prj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("NeedCloseConfirmation(needConfirmation=", ")", this.a);
    }
}
