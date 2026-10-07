package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class spd extends mk0 {
    public final String b;

    public spd(String str) {
        super(13);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spd) && this.b.equals(((spd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("SendLink(link=", this.b, ")");
    }
}
