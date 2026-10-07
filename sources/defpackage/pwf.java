package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pwf {
    public static final pwf b = new pwf("FATAL");
    public static final pwf c = new pwf("ERROR");
    public static final pwf d = new pwf("WARNING");
    public static final pwf e = new pwf("NOTICE");
    public static final pwf f = new pwf("INFO");
    public final String a;

    public pwf(String str) {
        this.a = str;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
