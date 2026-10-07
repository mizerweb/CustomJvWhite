package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wii implements yii {
    public final String a;

    public wii(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wii) && cqk.d(this.a, ((wii) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("Error(reason=", this.a, ")");
    }
}
