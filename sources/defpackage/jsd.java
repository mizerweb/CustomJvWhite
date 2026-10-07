package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jsd extends mk0 {
    public final i65 b;

    public jsd(i65 i65Var) {
        super(14);
        this.b = i65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsd) && this.b == ((jsd) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenFromChatList(link=" + this.b + ")";
    }
}
