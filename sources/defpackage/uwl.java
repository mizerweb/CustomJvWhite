package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uwl {
    public static boolean a() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean b() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Nokia") && !Build.BRAND.equalsIgnoreCase("Nokia")) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean c() {
        return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean d() {
        return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean e() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean f() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "a05s".equalsIgnoreCase(Build.DEVICE) && r5h.L0(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false);
    }

    public static boolean g() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean h() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean i() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        String str = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str) || "SCG16".equalsIgnoreCase(str) || "SC-55C".equalsIgnoreCase(str);
    }

    public static ewe j(fka fkaVar) {
        int iU;
        String strX;
        boolean z = false;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        if (iU != 0) {
            List listA = null;
            String strX2 = null;
            for (int i = 0; i < iU; i++) {
                try {
                    strX = ch3.X(fkaVar, null);
                } catch (Throwable th3) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = fjf.a.iterator();
                    while (it2.hasNext()) {
                        AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th3);
                            accountInitializer2.d().i().g().a(null, th3);
                        } catch (Throwable th4) {
                            gm0.V("Payload", "failed to collect exception", th4);
                        }
                    }
                    int iD2 = qt4.D(pye.a);
                    if (iD2 != 0) {
                        if (iD2 == 1) {
                            throw th3;
                        }
                        ore.o();
                        return null;
                    }
                    strX = null;
                }
                if (strX != null) {
                    if (strX.equals("text")) {
                        try {
                            strX2 = ch3.X(fkaVar, null);
                        } catch (Throwable th5) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it3 = fjf.a.iterator();
                            while (it3.hasNext()) {
                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th5);
                                    accountInitializer3.d().i().g().a(null, th5);
                                } catch (Throwable th6) {
                                    gm0.V("Payload", "failed to collect exception", th6);
                                }
                            }
                            int iD3 = qt4.D(pye.a);
                            if (iD3 != 0) {
                                if (iD3 == 1) {
                                    throw th5;
                                }
                                ore.o();
                                return null;
                            }
                            strX2 = null;
                        }
                    } else if (strX.equals("elements")) {
                        listA = fjf.a(fkaVar, r66.a, new fz7(1, aga.g, zfa.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/messages/MessageElement;", 0, 26));
                    } else {
                        try {
                            fkaVar.x();
                        } catch (Throwable th7) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it4 = fjf.a.iterator();
                            while (it4.hasNext()) {
                                AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th7);
                                    accountInitializer4.d().i().g().a(null, th7);
                                } catch (Throwable th8) {
                                    gm0.V("Payload", "failed to collect exception", th8);
                                }
                            }
                            int iD4 = qt4.D(pye.a);
                            if (iD4 != 0) {
                                if (iD4 == 1) {
                                    throw th7;
                                }
                                ore.o();
                                return null;
                            }
                        }
                    }
                }
            }
            if (strX2 != null && strX2.length() != 0) {
                if (strX2 != null) {
                    return new ewe(strX2, listA, z, 7);
                }
                ore.p("Required value was null.");
            }
        }
        return null;
    }
}
