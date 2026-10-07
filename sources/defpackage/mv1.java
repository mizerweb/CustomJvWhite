package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mv1 {
    public final boolean a;

    public mv1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv1) && this.a == ((mv1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("CallPresettingsState(isSaveButtonAvailable=", ")", this.a);
    }
}
