package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afl {
    public static final boolean a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean b(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static void c(mv8 mv8Var, Object obj) {
        if (obj == null || (obj instanceof String)) {
            ((x1) mv8Var).g((String) obj);
            return;
        }
        if (obj == JSONObject.NULL) {
            mv8Var.J0();
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            x1 x1Var = (x1) mv8Var;
            x1Var.getClass();
            x1Var.b(String.valueOf(zBooleanValue));
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            ((x1) mv8Var).l(((Number) obj).doubleValue());
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long jLongValue = ((Number) obj).longValue();
            x1 x1Var2 = (x1) mv8Var;
            x1Var2.getClass();
            x1Var2.b(Long.toString(jLongValue));
            return;
        }
        if (obj instanceof JSONObject) {
            d(mv8Var, (JSONObject) obj);
            return;
        }
        if (!(obj instanceof JSONArray)) {
            ore.p(c0a.n(obj, "Don't know how to write "));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        mv8Var.r();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            c(mv8Var, jSONArray.opt(i));
        }
        mv8Var.q();
    }

    public static void d(mv8 mv8Var, JSONObject jSONObject) {
        mv8Var.p();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            mv8Var.a0(next);
            c(mv8Var, jSONObject.opt(next));
        }
        mv8Var.t();
    }
}
