package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ccl {
    public static final ccl c = new ccl(false, jnk.g(new Object[4], 0));
    public final boolean a;
    public final jnk b;

    static {
        Object[] objArrCopyOf = new Object[4];
        gxk gxkVar = new gxk();
        int length = objArrCopyOf.length;
        if (length < 1) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, j8f.g(length, 1));
        }
        objArrCopyOf[0] = gxkVar;
        jnk.g(objArrCopyOf, 1 + 0);
        jnk.g(new Object[4], 0);
    }

    public /* synthetic */ ccl(boolean z, lok lokVar) {
        this.a = z;
        this.b = lokVar;
    }
}
