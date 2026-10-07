package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k3g extends vgd {
    public final tnh a;

    public k3g(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3g) && this.a.equals(((k3g) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSendScheduledMenu(actionText=", this.a, ")");
    }
}
