package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class luc implements Serializable {
    public boolean a;
    public int b;
    public long c;
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public String j;
    public int k;
    public String l;

    public final boolean equals(Object obj) {
        if (!(obj instanceof luc)) {
            return false;
        }
        luc lucVar = (luc) obj;
        if (this == lucVar) {
            return true;
        }
        return this.b == lucVar.b && this.c == lucVar.c && this.e.equals(lucVar.e) && this.g == lucVar.g && this.i == lucVar.i && this.j.equals(lucVar.j) && this.k == lucVar.k && this.l.equals(lucVar.l);
    }

    public final int hashCode() {
        return ((this.l.hashCode() + c0a.f(this.k, zo5.d((((zo5.d((Long.valueOf(this.c).hashCode() + ((2173 + this.b) * 53)) * 53, 53, this.e) + (this.g ? 1231 : 1237)) * 53) + this.i) * 53, 53, this.j), 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.c);
        if (this.f && this.g) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.h) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.i);
        }
        if (this.d) {
            sb.append(" Extension: ");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
