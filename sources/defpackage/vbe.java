package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vbe implements wbe {
    public final tnh a;

    public vbe(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbe) && this.a.equals(((vbe) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSendScheduledMenu(actionText=", this.a, ")");
    }
}
