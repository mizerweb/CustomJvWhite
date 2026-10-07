package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qke {
    public final boolean a;

    public qke(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qke) && this.a == ((qke) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ReportAndLeaveState(displayBar=", ")", this.a);
    }
}
