package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m81 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
