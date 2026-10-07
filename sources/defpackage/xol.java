package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xol {
    public static String a(String str) {
        return c0a.o("Scope(name=\"", str, "\")");
    }

    public static final int b(int i) {
        switch (qt4.D(i)) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 3;
            default:
                ore.o();
                return 0;
        }
    }
}
