package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class irh extends Throwable {
    public final Throwable a;
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irh(Throwable th, ylc... ylcVarArr) throws IllegalAccessException, InvocationTargetException {
        Iterable iterableAsList;
        Object objInvoke;
        super(th.getMessage(), th);
        Map mapQ0 = wm9.Q0((ylc[]) Arrays.copyOf(ylcVarArr, ylcVarArr.length));
        this.a = th;
        this.b = mapQ0;
        setStackTrace(th.getStackTrace());
        Integer num = eo8.a;
        if (num == null || num.intValue() >= 19) {
            iterableAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = m2d.b;
            iterableAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? r66.a : Arrays.asList((Throwable[]) objInvoke);
        }
        Iterator it = iterableAsList.iterator();
        while (it.hasNext()) {
            gm0.b(this, (Throwable) it.next());
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        String message = this.a.getMessage();
        if (message != null) {
            sb.append(message);
        }
        Map map = this.b;
        if (!map.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(new JSONObject(map).toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        Map map = this.b;
        boolean zIsEmpty = map.isEmpty();
        Throwable th = this.a;
        if (zIsEmpty) {
            return th.toString();
        }
        return th + "\n" + new JSONObject(map);
    }
}
