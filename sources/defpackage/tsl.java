package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tsl {
    public static int a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static wyg b(fka fkaVar) {
        int iU;
        String strX;
        byte bN;
        Object next;
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
        long j = 0;
        ezg ezgVar = ezg.USER;
        long jT = 0;
        ezg ezgVar2 = ezgVar;
        int i = 0;
        while (i < iU) {
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
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("ownerId")) {
                        try {
                            jT = ch3.T(fkaVar, j);
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
                                if (iD3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                            jT = j;
                        }
                    } else if (strX.equals("type")) {
                        try {
                            bN = ch3.N(fkaVar);
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
                                if (iD4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                            bN = 0;
                        }
                        Iterator it5 = ezg.f.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it5.next();
                        } while (((ezg) next).a != bN);
                        ezg ezgVar3 = (ezg) next;
                        ezgVar2 = ezgVar3 == null ? ezgVar : ezgVar3;
                    } else {
                        try {
                            fkaVar.x();
                        } catch (Throwable th9) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th9);
                                    accountInitializer5.d().i().g().a(null, th9);
                                } catch (Throwable th10) {
                                    gm0.V("Payload", "failed to collect exception", th10);
                                }
                            }
                            int iD5 = qt4.D(pye.a);
                            if (iD5 != 0) {
                                if (iD5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th9;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                        Iterator it7 = fjf.a.iterator();
                        while (it7.hasNext()) {
                            AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th11);
                                accountInitializer6.d().i().g().a(null, th11);
                            } catch (Throwable th12) {
                                gm0.V("Payload", "failed to collect exception", th12);
                            }
                        }
                        int iD6 = qt4.D(pye.a);
                        if (iD6 != 0) {
                            if (iD6 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th11;
                        }
                    } catch (Throwable th13) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer7 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th13);
                                accountInitializer7.d().i().g().a(null, th13);
                            } catch (Throwable th14) {
                                gm0.V("Payload", "failed to collect exception", th14);
                            }
                        }
                        int iD7 = qt4.D(pye.a);
                        if (iD7 != 0) {
                            if (iD7 == 1) {
                                throw th13;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
            i++;
            j = 0;
        }
        return new wyg(jT, ezgVar2);
    }

    public static boolean c(int i, Drawable drawable) {
        return drawable.setLayoutDirection(i);
    }
}
