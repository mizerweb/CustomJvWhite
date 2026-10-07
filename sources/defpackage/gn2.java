package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gn2 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ gn2(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
