package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ap1 extends fp1 {
    public final boolean a;

    public ap1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1) && this.a == ((ap1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("LoadingState(isEnabled=", ")", this.a);
    }
}
