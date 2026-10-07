package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class noj implements koj {
    public final boolean a;

    public noj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof noj) && this.a == ((noj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ShowWebView(showBackButton=", ")", this.a);
    }
}
