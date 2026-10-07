package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gfc implements Comparable {
    public final int a;
    public final ruj b;

    public gfc(int i, ruj rujVar) {
        this.a = i;
        this.b = rujVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((gfc) obj).a);
    }
}
