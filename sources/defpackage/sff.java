package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sff implements tff {
    public final tnh a;

    public sff(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sff) && this.a.equals(((sff) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSendScheduledMenu(actionText=", this.a, ")");
    }
}
