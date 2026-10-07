package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dx6 {
    public final String a;
    public final String b;

    public dx6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx6)) {
            return false;
        }
        dx6 dx6Var = (dx6) obj;
        return this.a.equals(dx6Var.a) && this.b.equals(dx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
        sb.append(this.a);
        sb.append(", model=");
        return x05.i(sb, this.b, ')');
    }
}
