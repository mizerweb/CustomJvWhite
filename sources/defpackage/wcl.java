package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wcl {
    public static int a(Byte b) {
        if (b != null) {
            int i = 0;
            for (int i2 : qt4.H(5)) {
                byte b2 = 1;
                if (i2 == 1) {
                    b2 = 0;
                } else if (i2 != 2) {
                    b2 = 3;
                    if (i2 == 3) {
                        b2 = 2;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            throw null;
                        }
                        b2 = -128;
                    }
                }
                if (b2 == b.byteValue()) {
                    i = i2;
                    break;
                }
            }
            if (i != 0) {
                return i;
            }
        }
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static td0 b(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return td0.e;
        }
        int i = 1;
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
        int iR = 1;
        int iR2 = Integer.MAX_VALUE;
        int iR3 = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < iU) {
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
                    if (iD2 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != 77011330) {
                        if (iHashCode != 84101588) {
                            if (iHashCode == 837772152 && strX.equals("hintMaxLen")) {
                                try {
                                    iR3 = ch3.R(fkaVar, Integer.MAX_VALUE);
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
                                    iR3 = Integer.MAX_VALUE;
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
                        } else if (strX.equals("passMinLen")) {
                            try {
                                iR = ch3.R(fkaVar, 1);
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
                                iR = 1;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("passMaxLen")) {
                        try {
                            iR2 = ch3.R(fkaVar, Integer.MAX_VALUE);
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
                            iR2 = Integer.MAX_VALUE;
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
                        i2++;
                        i = 1;
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
            i2++;
            i = 1;
        }
        return new td0(iR, iR2, iR3, 0);
    }
}
