package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jzh implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean d;

    public jzh(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jzh jzhVar = (jzh) obj;
        int iCompare = Long.compare(this.b, jzhVar.b);
        return iCompare == 0 ? Integer.compare(this.c, jzhVar.c) : iCompare;
    }
}
