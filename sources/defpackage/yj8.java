package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yj8 extends e48 {
    public final String b;
    public final String c;
    public final String d;

    public yj8(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yj8.class != obj.getClass()) {
            return false;
        }
        yj8 yj8Var = (yj8) obj;
        return this.c.equals(yj8Var.c) && this.b.equals(yj8Var.b) && this.d.equals(yj8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.d(zo5.d(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
