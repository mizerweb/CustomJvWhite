package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zek {
    public final Context a;
    public final ifh b = new ifh(new xlf(11, this));

    public zek(Context context) {
        this.a = context;
    }

    public static boolean a() {
        Method method;
        Method method2;
        String lowerCase;
        Method method3 = (Method) cjk.e.getValue();
        if (method3 != null && (method = (Method) cjk.f.getValue()) != null && (method2 = (Method) cjk.g.getValue()) != null) {
            try {
                Object objInvoke = method3.invoke(null, null);
                Enumeration enumeration = objInvoke instanceof Enumeration ? (Enumeration) objInvoke : null;
                if (enumeration != null) {
                    while (enumeration.hasMoreElements()) {
                        Object objNextElement = enumeration.nextElement();
                        if (objNextElement != null) {
                            try {
                                Object objInvoke2 = method.invoke(objNextElement, null);
                                if (cqk.d(objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null, Boolean.TRUE)) {
                                    Object objInvoke3 = method2.invoke(objNextElement, null);
                                    String str = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                                    if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null && (r5h.L0(lowerCase, wk8.b("68afbf2551cac1"), false) || r5h.L0(lowerCase, wk8.b("68afaf88f8dfdf"), false) || r5h.L0(lowerCase, wk8.b("68afbcbbcfdddf"), false) || r5h.L0(lowerCase, wk8.b("fb1f60e28b106c9e81"), false))) {
                                        return true;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef A[Catch: Exception -> 0x0125, TryCatch #1 {Exception -> 0x0125, blocks: (B:8:0x001b, B:11:0x0027, B:13:0x0032, B:27:0x005b, B:39:0x0072, B:41:0x007c, B:44:0x0088, B:46:0x0092, B:48:0x00ba, B:51:0x00c0, B:54:0x00c8, B:56:0x00d2, B:58:0x00d8, B:60:0x00dc, B:62:0x00e1, B:69:0x00ef, B:76:0x00ff, B:81:0x010b, B:85:0x0113), top: B:101:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5 A[ADDED_TO_REGION] */
    public final int b() {
        NetworkInfo networkInfo;
        int subtype;
        Context context = this.a;
        if (context != null && context.getPackageManager().checkPermission(cjk.a(), context.getPackageName()) == 0) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getValue();
                if (connectivityManager != null) {
                    Method method = (Method) cjk.k.getValue();
                    if (method != null) {
                        Object objInvoke = method.invoke(connectivityManager, null);
                        if (objInvoke != null) {
                            try {
                                Method method2 = (Method) cjk.n.getValue();
                                Object objInvoke2 = method2 != null ? method2.invoke(connectivityManager, objInvoke) : null;
                                networkInfo = objInvoke2 instanceof NetworkInfo ? (NetworkInfo) objInvoke2 : null;
                            } catch (Exception unused) {
                            }
                            if (networkInfo != null) {
                                int subtype2 = networkInfo.getSubtype();
                                if (subtype2 == 1 || subtype2 == 2 || subtype2 == 4 || subtype2 == 7 || subtype2 == 11 || subtype2 == 16) {
                                    return 3;
                                }
                                Method method3 = (Method) cjk.m.getValue();
                                Object objInvoke3 = method3 != null ? method3.invoke(connectivityManager, objInvoke) : null;
                                if (objInvoke3 == null) {
                                    subtype = networkInfo.getSubtype();
                                    if (subtype != 1) {
                                        return 3;
                                    }
                                    return 3;
                                }
                                ifh ifhVar = cjk.h;
                                if (((Method) ifhVar.getValue()) == null) {
                                    subtype = networkInfo.getSubtype();
                                    if (subtype != 1) {
                                        return 3;
                                    }
                                    return 3;
                                }
                                Object objInvoke4 = ((Method) ifhVar.getValue()).invoke(objInvoke3, Integer.valueOf(Integer.parseInt(r5h.y1(wk8.b("68aeb73808878e")).toString())));
                                Boolean bool = objInvoke4 instanceof Boolean ? (Boolean) objInvoke4 : null;
                                if (bool != null ? bool.booleanValue() : false) {
                                    Method method4 = (Method) cjk.i.getValue();
                                    Object objInvoke5 = method4 != null ? method4.invoke(objInvoke3, null) : null;
                                    Integer num = objInvoke5 instanceof Integer ? (Integer) objInvoke5 : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    if (iIntValue >= 23000) {
                                        return 5;
                                    }
                                    if (iIntValue < 1000) {
                                        return 3;
                                    }
                                } else {
                                    subtype = networkInfo.getSubtype();
                                    if (subtype != 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11 || subtype == 16) {
                                        return 3;
                                    }
                                    int type = networkInfo.getType();
                                    if (type == 0) {
                                        int subtype3 = networkInfo.getSubtype();
                                        if (subtype3 == 13 || subtype3 == 18) {
                                            return 5;
                                        }
                                    } else {
                                        if (type == 1 || type == 9) {
                                            return 2;
                                        }
                                        if (networkInfo.isConnected()) {
                                        }
                                    }
                                }
                                return 4;
                            }
                        }
                    }
                    return 1;
                }
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public final Boolean c() {
        Method method;
        Method method2;
        Method method3;
        Object objInvoke;
        boolean zBooleanValue;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getValue();
        if (connectivityManager != null && (method = (Method) cjk.h.getValue()) != null && (method2 = (Method) cjk.m.getValue()) != null && (method3 = (Method) cjk.l.getValue()) != null) {
            int i = Integer.parseInt(r5h.y1(wk8.b("68aeb7b484838e")).toString());
            try {
                Object objInvoke2 = method3.invoke(connectivityManager, null);
                Object[] objArr = objInvoke2 instanceof Object[] ? (Object[]) objInvoke2 : null;
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            try {
                                objInvoke = method2.invoke(connectivityManager, obj);
                            } catch (Exception unused) {
                                objInvoke = null;
                            }
                            if (objInvoke == null) {
                                continue;
                            } else {
                                try {
                                    Object objInvoke3 = method.invoke(objInvoke, Integer.valueOf(i));
                                    Boolean bool = objInvoke3 instanceof Boolean ? (Boolean) objInvoke3 : null;
                                    zBooleanValue = bool != null ? bool.booleanValue() : false;
                                } catch (Exception unused2) {
                                }
                                if (zBooleanValue) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }
}
