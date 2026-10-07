package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xld extends cmd {
    public final vnh b;

    public xld(vnh vnhVar) {
        this.b = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xld) && this.b.equals(((xld) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLinkToChat(text=" + this.b + ")";
    }
}
