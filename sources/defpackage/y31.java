package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y31 {
    public static final phf a;
    public static final ThreadLocal b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        a = zEquals ? mqh.a : null;
        b = new ThreadLocal();
    }
}
