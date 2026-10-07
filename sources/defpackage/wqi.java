package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public enum wqi {
    ;

    public static final ByteOrder a = ByteOrder.nativeOrder();
    public static final boolean b;

    static {
        String property = System.getProperty("os.arch");
        b = property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le");
    }

    public static wqi valueOf(String str) {
        qt4.A(Enum.valueOf(wqi.class, str));
        v0h.h(null);
        throw null;
    }
}
