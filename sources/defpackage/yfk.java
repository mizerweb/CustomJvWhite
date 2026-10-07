package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yfk {
    public final String a;
    public final String b;

    public yfk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfk)) {
            return false;
        }
        yfk yfkVar = (yfk) obj;
        return cqk.d(this.a, yfkVar.a) && cqk.d(this.b, yfkVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageKey(id=");
        sb.append(this.a);
        sb.append(", token=");
        return x05.i(sb, this.b, ')');
    }
}
