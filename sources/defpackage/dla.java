package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dla implements ela {
    public final tnh a;

    public dla(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dla) && this.a.equals(((dla) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSendScheduledMenu(actionText=", this.a, ")");
    }
}
