package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m5i {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public m5i(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        ore.k("generateNewId() must be called before retrieving ids.");
    }

    public m5i(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
