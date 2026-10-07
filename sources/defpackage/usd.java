package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class usd {
    public final boolean a;

    public usd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usd) && this.a == ((usd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("SwitchPayload(isChecked=", ")", this.a);
    }
}
