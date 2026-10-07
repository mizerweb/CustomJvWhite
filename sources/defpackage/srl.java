package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class srl {
    public static ng5 a(fka fkaVar) {
        int iP0;
        String strW;
        long j;
        int i = 0;
        try {
            iP0 = fkaVar.P0();
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
            iP0 = 0;
        }
        if (iP0 != 0) {
            long j2 = -1;
            boolean zBooleanValue = false;
            long jLongValue = -1;
            while (i < iP0) {
                try {
                    strW = ch3.W(fkaVar);
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
                    strW = null;
                }
                if (strW != null) {
                    if (strW.equals("timeToFire")) {
                        Long lValueOf = Long.valueOf(j2);
                        try {
                            lValueOf = Long.valueOf(ch3.T(fkaVar, j2));
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
                        }
                        jLongValue = lValueOf.longValue();
                    } else {
                        j = j2;
                        if (strW.equals("notifySender")) {
                            Boolean boolValueOf = Boolean.FALSE;
                            try {
                                boolValueOf = Boolean.valueOf(ch3.L(fkaVar));
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
                            zBooleanValue = boolValueOf.booleanValue();
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th9) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th9);
                                        accountInitializer5.d().i().g().a(null, th9);
                                    } catch (Throwable th10) {
                                        gm0.V("Payload", "failed to collect exception", th10);
                                    }
                                }
                                int iD5 = qt4.D(pye.a);
                                if (iD5 != 0) {
                                    if (iD5 == 1) {
                                        throw th9;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i++;
                    j2 = j;
                }
                j = j2;
                i++;
                j2 = j;
            }
            if (jLongValue != j2) {
                return new ng5(jLongValue, zBooleanValue);
            }
        }
        return null;
    }

    public static final boolean b(ArrayList arrayList) {
        if (((StillCaptureFlashStopRepeatingQuirk) uk5.a(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            Iterator it = arrayList.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                fle fleVar = (fle) it.next();
                pme pmeVar = fleVar.e;
                if (pmeVar != null && pmeVar.a == 2) {
                    z = true;
                }
                Integer num = (Integer) fleVar.b.get(CaptureRequest.CONTROL_AE_MODE);
                if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                    z2 = true;
                }
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}
