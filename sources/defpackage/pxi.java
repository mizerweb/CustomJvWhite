package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxi implements rxi {
    public final String a;

    public pxi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxi) && cqk.d(this.a, ((pxi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("TryClearPlayer(mediaId=", this.a, ")");
    }
}
