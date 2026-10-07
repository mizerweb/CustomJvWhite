package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oql {
    public static u7g a(String str) {
        String string = r5h.y1(r5h.f1(str, "a=rid:")).toString();
        if (r5h.X0(string)) {
            return null;
        }
        List listE = new lge("\\s+").e(3, string);
        String str2 = (String) listE.get(0);
        int i = 2;
        if (listE.size() > 1) {
            String str3 = (String) listE.get(1);
            str3.getClass();
            if (str3.equals("send") || !str3.equals("recv")) {
                i = 1;
            }
        }
        return new u7g(str2, i, false, 0.0d, 0, 0, 0, 0, 0, 1020);
    }

    public static final StackTraceElement b(mq0 mq0Var) {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        z45 z45Var = (z45) mq0Var.getClass().getAnnotation(z45.class);
        String str = null;
        if (z45Var == null || z45Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = mq0Var.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(mq0Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? z45Var.l()[iIntValue] : -1;
        r6a r6aVar = j8f.b;
        r6a r6aVar2 = j8f.a;
        if (r6aVar == null) {
            try {
                r6a r6aVar3 = new r6a(Class.class.getDeclaredMethod("getModule", null), mq0Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), mq0Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(SdkMetricStatEvent.NAME_KEY, null));
                j8f.b = r6aVar3;
                r6aVar = r6aVar3;
            } catch (Exception unused2) {
                j8f.b = r6aVar2;
                r6aVar = r6aVar2;
            }
        }
        if (r6aVar != r6aVar2 && (method = (Method) r6aVar.a) != null && (objInvoke = method.invoke(mq0Var.getClass(), null)) != null && (method2 = (Method) r6aVar.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) r6aVar.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = z45Var.c();
        } else {
            strC = str + '/' + z45Var.c();
        }
        return new StackTraceElement(strC, z45Var.m(), z45Var.f(), i);
    }
}
