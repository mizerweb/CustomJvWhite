package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class feg implements Comparable {
    public final int a;
    public final int b;

    public feg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((feg) obj).a;
    }
}
