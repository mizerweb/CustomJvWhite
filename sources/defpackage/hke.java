package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hke {
    public final int a;
    public final int b;
    public final String c;
    public final o60 d;
    public final long e;

    public hke(int i, int i2, String str, o60 o60Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = o60Var;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hke)) {
            return false;
        }
        hke hkeVar = (hke) obj;
        return this.a == hkeVar.a && this.b == hkeVar.b && cqk.d(this.c, hkeVar.c) && cqk.d(this.d, hkeVar.d) && this.e == hkeVar.e;
    }

    public final int hashCode() {
        int iD = zo5.d(c0a.f(this.b, qt4.D(this.a) * 31, 31), 31, this.c);
        o60 o60Var = this.d;
        return Long.hashCode(this.e) + ((iD + (o60Var == null ? 0 : o60Var.hashCode())) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        if (i == 1) {
            str = "MESSAGE";
        } else if (i == 2) {
            str = "IMAGE";
        } else if (i == 3) {
            str = "CONTACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "UNKNOWN";
        } else {
            str = "LOCATION";
        }
        sb.append(str);
        sb.append(", intent=");
        int i2 = this.b;
        if (i2 == 1) {
            str2 = "DEFAULT";
        } else if (i2 == 2) {
            str2 = "POSITIVE";
        } else if (i2 != 3) {
            str2 = i2 != 4 ? "null" : "UNKNOWN";
        } else {
            str2 = "NEGATIVE";
        }
        sb.append(str2);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessageId=");
        return c0a.m(this.e, ")", sb);
    }
}
