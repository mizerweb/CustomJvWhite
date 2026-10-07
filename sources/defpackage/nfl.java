package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nfl {
    public static final ed7 a = new ed7("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i1m.b0(context).Y();
        Set set = ukk.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((ukk) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (jo7.q) {
            try {
                jo7 jo7Var = jo7.r;
                if (jo7Var != null) {
                    jo7Var.i.incrementAndGet();
                    bmk bmkVar = jo7Var.m;
                    bmkVar.sendMessageAtFrontOfQueue(bmkVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
