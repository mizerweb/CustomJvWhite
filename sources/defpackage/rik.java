package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class rik {
    public final Context a;
    public final ifh b = new ifh(new xlf(12, this));

    public rik(Context context) {
        this.a = context;
    }

    public final boolean a() {
        Method method;
        Method method2;
        Object objInvoke;
        Context context = this.a;
        if (context != null) {
            if (context.getPackageManager().checkPermission(cjk.a(), context.getPackageName()) == 0) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getValue();
                    if (connectivityManager != null && (method = (Method) cjk.k.getValue()) != null) {
                        Object objInvoke2 = method.invoke(connectivityManager, null);
                        if (objInvoke2 != null && (method2 = (Method) cjk.m.getValue()) != null && (objInvoke = method2.invoke(connectivityManager, objInvoke2)) != null) {
                            ifh ifhVar = cjk.j;
                            Method method3 = (Method) ifhVar.getValue();
                            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke, Integer.valueOf(Integer.parseInt(r5h.y1(wk8.b("68aebb3706898e")).toString()))) : null;
                            Boolean bool = objInvoke3 instanceof Boolean ? (Boolean) objInvoke3 : null;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            Method method4 = (Method) ifhVar.getValue();
                            Object objInvoke4 = method4 != null ? method4.invoke(objInvoke, Integer.valueOf(Integer.parseInt(r5h.y1(wk8.b("68aebed9eb8f8e")).toString()))) : null;
                            Boolean bool2 = objInvoke4 instanceof Boolean ? (Boolean) objInvoke4 : null;
                            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                            if (!zBooleanValue || !zBooleanValue2) {
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return true;
        }
        return false;
    }
}
