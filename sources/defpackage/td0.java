package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class td0 {
    public static final td0 e;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;

    static {
        int i = Integer.MAX_VALUE;
        e = new td0(1, i, i, 0);
    }

    public td0() {
        this.a = 3;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                return zo5.t(qv1.p("Config(pminl=", i, ",pml=", i2, ",hml="), this.d, ")");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ td0(int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
