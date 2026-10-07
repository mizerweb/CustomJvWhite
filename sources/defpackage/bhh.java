package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class bhh {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public bhh(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.g = r5h.L0(upperCase, "INT", false) ? 3 : (r5h.L0(upperCase, "CHAR", false) || r5h.L0(upperCase, "CLOB", false) || r5h.L0(upperCase, "TEXT", false)) ? 2 : r5h.L0(upperCase, "BLOB", false) ? 5 : (r5h.L0(upperCase, "REAL", false) || r5h.L0(upperCase, "FLOA", false) || r5h.L0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bhh) {
                boolean z = this.d > 0;
                bhh bhhVar = (bhh) obj;
                int i = bhhVar.f;
                if (z == (bhhVar.d > 0) && cqk.d(this.a, bhhVar.a) && this.c == bhhVar.c) {
                    String str = bhhVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || qvl.a(str2, str)) && ((i2 != 2 || i != 1 || str == null || qvl.a(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : qvl.a(str2, str))) && this.g == bhhVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return s5h.w0(s5h.y0(sb.toString()));
    }
}
