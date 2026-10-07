package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xg8 extends rbb {
    public final xge b;

    public xg8(xge xgeVar) {
        super(sbi.a);
        this.b = xgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg8) && this.b.equals(((xg8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}
