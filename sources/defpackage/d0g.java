package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlinx.serialization.MissingFieldException;
import one.me.sdk.prefs.SharedPreferencesGetException;
import one.me.sdk.prefs.SharedPreferencesPutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0g {
    public static final ifh a = new ifh(new a5d(16));
    public static final Map b = wm9.Q0(new ylc(Integer.TYPE, Integer.class), new ylc(Long.TYPE, Long.class), new ylc(Boolean.TYPE, Boolean.class), new ylc(Float.TYPE, Float.class), new ylc(Double.TYPE, Double.class), new ylc(Byte.TYPE, Byte.class), new ylc(Character.TYPE, Character.class), new ylc(Short.TYPE, Short.class));

    /* JADX WARN: Code duplicated, block: B:110:0x027f A[PHI: r6
  0x027f: PHI (r6v4 ??) = 
  (r6v3 ??)
  (r6v3 ??)
  (r6v3 ??)
  (r6v39 ??)
  (r6v47 ??)
  (r6v49 ??)
  (r6v51 ??)
  (r6v3 ??)
  (r6v3 ??)
  (r6v3 ??)
  (r6v3 ??)
 binds: [B:12:0x001f, B:109:0x027d, B:56:0x0148, B:200:0x027f, B:66:0x0189, B:65:0x0179, B:60:0x0158, B:49:0x0120, B:32:0x0093, B:25:0x006c, B:17:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [m8b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v34, types: [gvd] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v39, types: [ew5] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v41, types: [gvd] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Float] */
    public static final Object a(SharedPreferences sharedPreferences, String str, Object obj, rv8 rv8Var, ny8 ny8Var, ny8 ny8Var2) throws JSONException {
        Object obj2;
        ?? m8bVar;
        String string;
        ?? r10;
        Object jSONArray;
        Object objA;
        if (!(sharedPreferences instanceof e0g)) {
            if (sharedPreferences.contains(str)) {
                obj2 = sharedPreferences.getAll().get(str);
            }
            m8bVar = obj2;
            m8bVar = objA;
            return obj;
        }
        objA = ((e0g) sharedPreferences).a(str);
        if (m8bVar != 0) {
            m8bVar = obj2;
            if (m8bVar instanceof Boolean) {
                m8bVar = objA;
                m8bVar = objA;
                m8bVar = objA;
                m8bVar = objA;
                m8bVar = objA;
                m8bVar = objA;
                m8bVar = objA;
                obj = m8bVar;
            } else {
                boolean z = m8bVar instanceof Double;
                Class cls = Float.TYPE;
                if (!z) {
                    boolean z2 = m8bVar instanceof Float;
                    Class cls2 = Double.TYPE;
                    if (z2) {
                        if (cqk.d(rv8Var, zfe.a(cls2))) {
                            obj = Double.valueOf(((Number) m8bVar).floatValue());
                        } else if (!jz4.class.isAssignableFrom(((qr3) rv8Var).d())) {
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            obj = m8bVar;
                        } else if (rv8Var.equals(zfe.a(gvd.class))) {
                            m8bVar = objA;
                            obj = new gvd(((Number) m8bVar).floatValue());
                        }
                    } else if (m8bVar instanceof Integer) {
                        if (cqk.d(rv8Var, zfe.a(Long.TYPE))) {
                            m8bVar = objA;
                            obj = Long.valueOf(((Number) m8bVar).intValue());
                        } else {
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            obj = m8bVar;
                        }
                    } else if (!(m8bVar instanceof Long)) {
                        if (m8bVar instanceof String) {
                            if (!cqk.d(rv8Var, zfe.a(String.class))) {
                                if (cqk.d(rv8Var, zfe.a(Map.class))) {
                                    m8bVar = objA;
                                    m8bVar = f55.G(new JSONObject((String) m8bVar));
                                } else if (cqk.d(rv8Var, zfe.a(List.class))) {
                                    aw8 aw8Var = (aw8) ny8Var2.getValue();
                                    if (aw8Var != null) {
                                        m8bVar = objA;
                                        m8bVar = ((qs8) ny8Var.getValue()).a(aw8Var, (String) m8bVar);
                                    } else {
                                        m8bVar = objA;
                                        m8bVar = f55.F(new JSONArray((String) m8bVar));
                                    }
                                } else {
                                    m8bVar = objA;
                                    try {
                                        if (cqk.d(rv8Var, zfe.a(JSONObject.class))) {
                                            jSONArray = new JSONObject((String) m8bVar);
                                        } else if (cqk.d(rv8Var, zfe.a(JSONArray.class))) {
                                            jSONArray = new JSONArray((String) m8bVar);
                                        } else {
                                            int i = 0;
                                            if (cqk.d(rv8Var, zfe.a(long[].class))) {
                                                JSONArray jSONArray2 = new JSONArray((String) m8bVar);
                                                int length = jSONArray2.length();
                                                r10 = new long[length];
                                                while (i < length) {
                                                    r10[i] = jSONArray2.getLong(i);
                                                    i++;
                                                }
                                            } else if (cqk.d(rv8Var, zfe.a(int[].class))) {
                                                JSONArray jSONArray3 = new JSONArray((String) m8bVar);
                                                int length2 = jSONArray3.length();
                                                r10 = new int[length2];
                                                while (i < length2) {
                                                    r10[i] = jSONArray3.getInt(i);
                                                    i++;
                                                }
                                            } else if (cqk.d(rv8Var, zfe.a(m8b.class))) {
                                                JSONArray jSONArray4 = new JSONArray((String) m8bVar);
                                                m8bVar = new m8b(jSONArray4.length());
                                                int length3 = jSONArray4.length();
                                                while (i < length3) {
                                                    Object obj3 = jSONArray4.get(i);
                                                    if (obj3 instanceof Number) {
                                                        m8bVar.a(((Number) obj3).longValue());
                                                    }
                                                    i++;
                                                }
                                            } else {
                                                try {
                                                    qs8 qs8Var = (qs8) ny8Var.getValue();
                                                    Object value = ny8Var2.getValue();
                                                    if (value == null) {
                                                        throw new IllegalArgumentException("Required value was null.");
                                                    }
                                                    obj = qs8Var.a((aw8) value, (String) m8bVar);
                                                } catch (Throwable th) {
                                                    a4c a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        je9 je9Var = je9.f;
                                                        if (a4cVar.b(je9Var)) {
                                                            a4cVar.c(je9Var, "SharedPreferences", qv1.k("fail to parse ", str), th);
                                                        }
                                                    }
                                                }
                                            }
                                            obj = r10;
                                        }
                                        obj = jSONArray;
                                    } catch (MissingFieldException unused) {
                                    }
                                }
                            }
                        } else if (!(m8bVar instanceof Set)) {
                            Class<?> cls3 = m8bVar.getClass();
                            if (gm0.c()) {
                                m8bVar = objA;
                                string = m8bVar.toString();
                            } else {
                                string = "[]";
                                if (m8bVar instanceof Collection) {
                                    Collection collection = (Collection) m8bVar;
                                    if (!collection.isEmpty()) {
                                        m8bVar = objA;
                                        string = c0a.k(collection.size(), "[**", "**]");
                                    }
                                } else if (m8bVar instanceof Map) {
                                    Map map = (Map) m8bVar;
                                    if (map.isEmpty()) {
                                        m8bVar = objA;
                                        string = "{}";
                                    } else {
                                        m8bVar = objA;
                                        string = c0a.k(map.size(), "{**", "**}");
                                    }
                                } else if (m8bVar instanceof Object[]) {
                                    Object[] objArr = (Object[]) m8bVar;
                                    if (objArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(objArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof int[]) {
                                    int[] iArr = (int[]) m8bVar;
                                    if (iArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(iArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof float[]) {
                                    float[] fArr = (float[]) m8bVar;
                                    if (fArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(fArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof long[]) {
                                    long[] jArr = (long[]) m8bVar;
                                    if (jArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(jArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof double[]) {
                                    double[] dArr = (double[]) m8bVar;
                                    if (dArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(dArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof short[]) {
                                    short[] sArr = (short[]) m8bVar;
                                    if (sArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(sArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof byte[]) {
                                    byte[] bArr = (byte[]) m8bVar;
                                    if (bArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(bArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof char[]) {
                                    char[] cArr = (char[]) m8bVar;
                                    if (cArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(cArr.length, "[**", "**]");
                                    }
                                } else if (m8bVar instanceof boolean[]) {
                                    boolean[] zArr = (boolean[]) m8bVar;
                                    if (zArr.length != 0) {
                                        m8bVar = objA;
                                        string = c0a.k(zArr.length, "[**", "**]");
                                    }
                                } else {
                                    m8bVar = objA;
                                    string = "***";
                                }
                            }
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            m8bVar = objA;
                            ore.g("Unsupported type: ", str, " ", cls3, "|", string);
                            return null;
                        }
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        obj = m8bVar;
                    } else if (cqk.d(rv8Var, zfe.a(ew5.class))) {
                        m8bVar = objA;
                        ghb ghbVar = ew5.b;
                        obj = new ew5(qe7.P(((Number) m8bVar).longValue(), lw5.NANOSECONDS));
                    } else if (cqk.d(rv8Var, zfe.a(cls2))) {
                        m8bVar = objA;
                        obj = Double.valueOf(Double.longBitsToDouble(((Number) m8bVar).longValue()));
                    } else if (cqk.d(rv8Var, zfe.a(cls))) {
                        m8bVar = objA;
                        obj = Float.valueOf((float) Double.longBitsToDouble(((Number) m8bVar).longValue()));
                    } else if (cqk.d(rv8Var, zfe.a(Integer.TYPE))) {
                        m8bVar = objA;
                        obj = Integer.valueOf((int) ((Number) m8bVar).longValue());
                    } else if (!jz4.class.isAssignableFrom(((qr3) rv8Var).d())) {
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        m8bVar = objA;
                        obj = m8bVar;
                    } else if (rv8Var.equals(zfe.a(gvd.class))) {
                        m8bVar = objA;
                        obj = new gvd(((Number) m8bVar).longValue());
                    }
                } else if (cqk.d(rv8Var, zfe.a(cls))) {
                    obj = Float.valueOf((float) ((Number) m8bVar).doubleValue());
                } else {
                    m8bVar = objA;
                    m8bVar = objA;
                    m8bVar = objA;
                    m8bVar = objA;
                    m8bVar = objA;
                    m8bVar = objA;
                    m8bVar = objA;
                    obj = m8bVar;
                }
            }
            if (obj != 0) {
                m8bVar = objA;
                if (!((qr3) rv8Var).d().isAssignableFrom(obj.getClass())) {
                    Class<?> cls4 = obj.getClass();
                    Class clsD = ((qr3) rv8Var).d();
                    Map map2 = b;
                    if (!cqk.d(map2.get(cls4), clsD) && !cqk.d(map2.get(clsD), cls4)) {
                        m8bVar = objA;
                        throw new ClassCastException("result is " + cls4 + ", clazz=" + rv8Var);
                    }
                }
            }
            m8bVar = objA;
            m8bVar = objA;
            m8bVar = objA;
            m8bVar = objA;
            m8bVar = objA;
            return obj;
        }
        m8bVar = obj2;
        m8bVar = objA;
        return obj;
    }

    public static final void b(SharedPreferences.Editor editor, String str, Object obj, rv8 rv8Var, ny8 ny8Var, ny8 ny8Var2) {
        if (cqk.d(rv8Var, zfe.a(Boolean.TYPE))) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Float.TYPE))) {
            editor.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Double.TYPE))) {
            editor.putLong(str, Double.doubleToRawLongBits(((Number) obj).doubleValue()));
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Integer.TYPE))) {
            editor.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Long.TYPE))) {
            editor.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (cqk.d(rv8Var, zfe.a(String.class))) {
            editor.putString(str, (String) obj);
            return;
        }
        if (cqk.d(rv8Var, zfe.a(long[].class))) {
            editor.putString(str, a.f1(56, (long[]) obj));
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Set.class))) {
            editor.putStringSet(str, (Set) obj);
            return;
        }
        if (cqk.d(rv8Var, zfe.a(Map.class))) {
            editor.putString(str, f55.E((Map) obj).toString());
            return;
        }
        if (cqk.d(rv8Var, zfe.a(List.class))) {
            aw8 aw8Var = (aw8) ny8Var2.getValue();
            if (aw8Var != null) {
                editor.putString(str, ((qs8) ny8Var.getValue()).b(aw8Var, obj));
                return;
            } else {
                editor.putString(str, f55.D((List) obj).toString());
                return;
            }
        }
        if (cqk.d(rv8Var, zfe.a(ew5.class))) {
            editor.putLong(str, ew5.h(((ew5) obj).a));
            return;
        }
        if (!jz4.class.isAssignableFrom(((qr3) rv8Var).d())) {
            aw8 aw8Var2 = (aw8) ny8Var2.getValue();
            if (aw8Var2 != null) {
                editor.putString(str, ((qs8) ny8Var.getValue()).b(aw8Var2, obj));
                return;
            }
            throw new IllegalStateException(("Unsupported value type:" + str + " " + rv8Var).toString());
        }
        jz4 jz4Var = obj instanceof jz4 ? (jz4) obj : null;
        if (jz4Var instanceof gvd) {
            editor.putFloat(str, ((gvd) jz4Var).a);
            return;
        }
        if (jz4Var != null) {
            ore.o();
            return;
        }
        throw new IllegalStateException(("Unsupported value type:" + str + " " + rv8Var).toString());
    }

    public static final Object c(SharedPreferences sharedPreferences, String str, Object obj, rv8 rv8Var, ny8 ny8Var, ny8 ny8Var2) {
        try {
            return a(sharedPreferences, str, obj, rv8Var, ny8Var, ny8Var2);
        } catch (Exception e) {
            String strConcat = "fail to get value for key ".concat(str);
            gm0.V("Prefs-".concat(str), strConcat, new SharedPreferencesGetException(strConcat, e));
            return obj;
        }
    }

    public static Object d(sr3 sr3Var, SharedPreferences sharedPreferences, Object obj, String str) {
        return c(sharedPreferences, str, obj, sr3Var, a, new ifh(new a5d(15)));
    }

    public static final void e(SharedPreferences.Editor editor, String str, Object obj) {
        String string;
        int length;
        if (obj == null) {
            editor.remove(str);
            return;
        }
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            editor.putLong(str, Double.doubleToRawLongBits(((Number) obj).doubleValue()));
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
            return;
        }
        boolean z = obj instanceof Map;
        if (z) {
            editor.putString(str, f55.E((Map) obj).toString());
            return;
        }
        if (obj instanceof List) {
            editor.putString(str, f55.D((List) obj).toString());
            return;
        }
        if (obj instanceof ew5) {
            editor.putLong(str, ew5.h(((ew5) obj).a));
            return;
        }
        Class<?> cls = obj.getClass();
        if (gm0.c()) {
            string = obj.toString();
        } else {
            string = "[]";
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                if (!collection.isEmpty()) {
                    length = collection.size();
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (z) {
                Map map = (Map) obj;
                string = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 0) {
                    length = objArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr.length != 0) {
                    length = iArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                if (fArr.length != 0) {
                    length = fArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr.length != 0) {
                    length = jArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                if (dArr.length != 0) {
                    length = dArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                if (sArr.length != 0) {
                    length = sArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length != 0) {
                    length = bArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                if (cArr.length != 0) {
                    length = cArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr.length != 0) {
                    length = zArr.length;
                    string = c0a.k(length, "[**", "**]");
                }
            } else {
                string = "***";
            }
        }
        ore.g("Unsupported value type: ", str, " ", cls, "|", string);
    }

    public static final void f(SharedPreferences.Editor editor, String str, Object obj, rv8 rv8Var, ny8 ny8Var, ny8 ny8Var2) {
        try {
            b(editor, str, obj, rv8Var, ny8Var, ny8Var2);
        } catch (Exception e) {
            String str2 = "fail to put value: " + str + ":" + obj;
            gm0.V("SharedPreferences", str2, new SharedPreferencesPutException(str2, e));
        }
    }
}
