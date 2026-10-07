package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class q0k {
    public static final q0k b;
    public jv4 a;

    static {
        q0k q0kVar = new q0k();
        q0kVar.a = null;
        b = q0kVar;
    }

    public static jv4 a(Context context) {
        jv4 jv4Var;
        q0k q0kVar = b;
        synchronized (q0kVar) {
            try {
                if (q0kVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    q0kVar.a = new jv4(context);
                }
                jv4Var = q0kVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jv4Var;
    }
}
