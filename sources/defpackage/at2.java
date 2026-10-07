package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class at2 extends ct2 {
    public static final at2 c = new at2("CharMatcher.any()", 0);
    public static final at2 d = new at2("CharMatcher.ascii()", 1);
    public static final at2 e = new at2("CharMatcher.javaIsoControl()", 2);
    public static final at2 f = new at2("CharMatcher.none()", 3);
    public final String a;
    public final /* synthetic */ int b;

    public at2(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.gt2
    public final boolean c(char c2) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return c2 <= 127;
            case 2:
                return c2 <= 31 || (c2 >= 127 && c2 <= 159);
            default:
                return false;
        }
    }

    @Override // defpackage.ct2, defpackage.gt2
    public gt2 d() {
        switch (this.b) {
            case 0:
                return f;
            case 3:
                return c;
            default:
                return super.d();
        }
    }

    public final String toString() {
        return this.a;
    }
}
