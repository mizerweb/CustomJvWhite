package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v77 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public v77(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v77 v77Var = (v77) obj;
        int i = this.a - v77Var.a;
        return i == 0 ? this.b - v77Var.b : i;
    }
}
