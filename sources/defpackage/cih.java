package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cih implements dih {
    public final String a;

    public cih(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cih) && cqk.d(this.a, ((cih) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Text(text=", this.a, ")");
    }
}
