package defpackage;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ftk {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static hja b(fka fkaVar) {
        int iU;
        String strW;
        fka fkaVar2;
        String strW2;
        int iJ;
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
        if (iU == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        dja djaVar = null;
        int iIntValue = 0;
        for (int i = 0; i < iU; i++) {
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
            try {
                if (strW != null) {
                    int iHashCode = strW.hashCode();
                    if (iHashCode == -1370485892) {
                        fkaVar2 = fkaVar;
                        if (strW.equals("yourReaction")) {
                            try {
                                strW2 = ch3.W(fkaVar2);
                                if (strW2 == null) {
                                    strW2 = "";
                                }
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
                            djaVar = new dja(ija.EMOJI, strW2);
                        } else {
                            fkaVar2.x();
                        }
                    } else if (iHashCode != -731385813) {
                        if (iHashCode == -372020745 && strW.equals("counters")) {
                            try {
                                iJ = ch3.J(fkaVar);
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
                                iJ = 0;
                            }
                            for (int i2 = 0; i2 < iJ; i2++) {
                                arrayList.add(btk.b(fkaVar));
                            }
                        }
                    } else if (strW.equals("totalCount")) {
                        Integer numValueOf = 0;
                        try {
                            numValueOf = Integer.valueOf(ch3.R(fkaVar, 0));
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
                        iIntValue = numValueOf.intValue();
                    }
                }
                fkaVar2.x();
            } catch (Throwable th11) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                Iterator it6 = fjf.a.iterator();
                while (it6.hasNext()) {
                    AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th11);
                        accountInitializer6.d().i().g().a(null, th11);
                    } catch (Throwable th12) {
                        gm0.V("Payload", "failed to collect exception", th12);
                    }
                }
                int iD6 = qt4.D(pye.a);
                if (iD6 != 0) {
                    if (iD6 == 1) {
                        throw th11;
                    }
                    ore.o();
                    return null;
                }
            }
            fkaVar2 = fkaVar;
        }
        return new hja(arrayList, iIntValue, djaVar);
    }
}
