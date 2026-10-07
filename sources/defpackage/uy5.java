package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uy5 implements vy5 {
    public final tnh a;

    public uy5(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy5) && this.a.equals(((uy5) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowSendScheduledMenu(actionText=", this.a, ")");
    }
}
