package defpackage;

import android.content.Intent;
import com.my.tracker.MyTracker;
import one.me.android.di.ConcurrentComponent;

/* JADX INFO: loaded from: classes.dex */
public final class fab implements ctb {
    public static final fab a = new fab();
    public static final ifh b = new ifh(new j68(14));
    public static final dq4 c;
    public static final pzf d;
    public static final q8e e;

    static {
        xt4 xt4VarR0 = ((n0c) ConcurrentComponent.INSTANCE.getDispatchers()).a().R0(1, "mytracker");
        wo8 wo8VarA = vd7.a();
        xt4VarR0.getClass();
        c = cqk.a(lvb.x0(xt4VarR0, wo8VarA));
        pzf pzfVarB = e9i.b(1, 0, 2);
        d = pzfVarB;
        e = new q8e(pzfVarB);
    }

    public static String a(Intent intent) {
        try {
            String strHandleDeeplink = MyTracker.handleDeeplink(intent);
            if (strHandleDeeplink == null || strHandleDeeplink.length() == 0) {
                return null;
            }
            return strHandleDeeplink;
        } catch (Throwable th) {
            gm0.V("MyTracker", "fail to handle deep link", new aab(th));
            return null;
        }
    }
}
