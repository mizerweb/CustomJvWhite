package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwf implements Comparable {
    public static final qwf c = new qwf("FATAL", 9000);
    public static final qwf d = new qwf("ERROR", 6000);
    public static final qwf e = new qwf("WARNING", 5000);
    public static final qwf f = new qwf("NOTICE", y5g.CLOSE_SOCKET_CODE_TIMEOUT);
    public static final qwf g = new qwf("INFO", 3000);
    public static final qwf h = new qwf("DEBUG", 2000);
    public final String a;
    public final int b;

    public qwf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cqk.i(this.b, ((qwf) obj).b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
