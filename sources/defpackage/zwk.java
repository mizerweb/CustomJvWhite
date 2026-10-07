package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zwk {
    public static final dk1 a(kk1 kk1Var) {
        long j = kk1Var.a;
        String str = kk1Var.b;
        String str2 = kk1Var.c;
        long j2 = kk1Var.d;
        Long l = kk1Var.e;
        long j3 = kk1Var.f;
        String str3 = kk1Var.g.a;
        ik1 ik1Var = kk1Var.h;
        String str4 = ik1Var != null ? ik1Var.a : null;
        String str5 = kk1Var.i;
        String str6 = str4;
        Integer numValueOf = null;
        long j4 = kk1Var.j;
        Long l2 = kk1Var.k;
        hk1 hk1Var = kk1Var.l;
        if (hk1Var != null) {
            numValueOf = Integer.valueOf(hk1Var.a);
        }
        return new dk1(j, str, str2, j2, l, j3, str3, str6, str5, j4, l2, numValueOf);
    }

    public static final kk1 b(dk1 dk1Var) {
        Object next;
        ok1 ok1Var;
        Object next2;
        ik1 ik1Var;
        long j;
        Object obj;
        hk1 hk1Var;
        long j2 = dk1Var.a;
        String str = dk1Var.b;
        String str2 = dk1Var.c;
        long j3 = dk1Var.d;
        Long l = dk1Var.e;
        long j4 = dk1Var.f;
        String str3 = dk1Var.g;
        if (str3 == null) {
            ok1Var = null;
        } else {
            Iterator it = ok1.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ok1) next).a.equals(str3));
            ok1Var = (ok1) next;
        }
        if (ok1Var == null) {
            ok1Var = ok1.AUDIO;
        }
        String str4 = dk1Var.h;
        if (str4 == null) {
            ik1Var = null;
        } else {
            Iterator it2 = ik1.f.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((ik1) next2).a.equals(str4));
            ik1Var = (ik1) next2;
        }
        String str5 = dk1Var.i;
        ok1 ok1Var2 = ok1Var;
        long j5 = dk1Var.j;
        Long l2 = dk1Var.k;
        Integer num = dk1Var.l;
        if (num == null) {
            hk1Var = null;
        } else {
            Iterator it3 = hk1.d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    j = j2;
                    obj = null;
                    break;
                }
                Object next3 = it3.next();
                Integer num2 = num;
                j = j2;
                if (((hk1) next3).a == num2.intValue()) {
                    obj = next3;
                    break;
                }
                num = num2;
                j2 = j;
            }
            hk1Var = (hk1) obj;
            j2 = j;
        }
        return new kk1(j2, str, str2, j3, l, j4, ok1Var2, ik1Var, str5, j5, l2, hk1Var);
    }

    /* JADX WARN: Code duplicated, block: B:171:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static cd0 c(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return null;
        }
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
        String strX2 = null;
        String strX3 = null;
        boolean zL = false;
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
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1609594047) {
                        if (iHashCode != 3202695) {
                            if (iHashCode == 96619420 && strX.equals("email")) {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                    strX3 = null;
                                }
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
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th7;
                                    }
                                }
                            }
                        } else if (strX.equals("hint")) {
                            try {
                                strX2 = ch3.X(fkaVar, null);
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
                                    if (iD5 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th9;
                                }
                                strX2 = null;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("enabled")) {
                        try {
                            zL = ch3.L(fkaVar);
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
                                if (iD6 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th11;
                            }
                            zL = false;
                        }
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th13) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                        Iterator it7 = fjf.a.iterator();
                        while (it7.hasNext()) {
                            AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th13);
                                accountInitializer7.d().i().g().a(null, th13);
                            } catch (Throwable th14) {
                                gm0.V("Payload", "failed to collect exception", th14);
                            }
                        }
                        int iD7 = qt4.D(pye.a);
                        if (iD7 != 0) {
                            if (iD7 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th13;
                        }
                    } catch (Throwable th15) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th15);
                                accountInitializer8.d().i().g().a(null, th15);
                            } catch (Throwable th16) {
                                gm0.V("Payload", "failed to collect exception", th16);
                            }
                        }
                        int iD8 = qt4.D(pye.a);
                        if (iD8 != 0) {
                            if (iD8 == 1) {
                                throw th15;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new cd0(zL, strX2, strX3);
    }
}
