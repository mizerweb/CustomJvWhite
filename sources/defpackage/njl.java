package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class njl {
    /* JADX WARN: Code duplicated, block: B:218:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ed7 a(fka fkaVar) {
        int iU;
        ed7 ed7Var;
        int i;
        String strX;
        int iJ;
        u8b u8bVar = cqb.b;
        int i2 = 1;
        String str = null;
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
        int i3 = -1;
        List listA = null;
        int iR = -1;
        int i4 = 0;
        while (i4 < iU) {
            try {
                strX = ch3.X(fkaVar, str);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(str, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = str;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -934426595) {
                        if (iHashCode != 110549828) {
                            if (iHashCode == 955273912 && strX.equals("voterPreviewIds")) {
                                listA = fjf.a(fkaVar, r66.a, dz7.n);
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th5) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                    Iterator it3 = fjf.a.iterator();
                                    while (it3.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th5);
                                            accountInitializer3.d().i().g().a(str, th5);
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
                                }
                            }
                        } else if (strX.equals("total")) {
                            try {
                                iR = ch3.R(fkaVar, i3);
                            } catch (Throwable th7) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it4 = fjf.a.iterator();
                                while (it4.hasNext()) {
                                    AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th7);
                                        accountInitializer4.d().i().g().a(str, th7);
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
                                iR = i3;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("result")) {
                        u8b u8bVar2 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ = ch3.J(fkaVar);
                                } catch (Throwable th9) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                    Iterator it5 = fjf.a.iterator();
                                    while (it5.hasNext()) {
                                        AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th9);
                                            accountInitializer5.d().i().g().a(str, th9);
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
                                    iJ = 0;
                                }
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i5 = 0; i5 < iJ; i5++) {
                                    aad aadVarB = qjl.b(fkaVar);
                                    if (aadVarB != null) {
                                        u8bVar3.b(aadVarB);
                                    }
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
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
                        }
                        u8bVar = u8bVar2;
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
                        i4++;
                        i2 = 1;
                        str = null;
                        i3 = -1;
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
                        ed7Var = 0;
                        i = -1;
                    }
                }
            }
            i4++;
            i2 = 1;
            str = null;
            i3 = -1;
        }
        ed7Var = str;
        i = i3;
        if (iR == i) {
            return ed7Var;
        }
        return new ed7(iR, u8bVar, listA != null ? new LinkedHashSet(listA) : ed7Var);
    }

    public static int b(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (tvj.f(2, "CameraOrientationUtil")) {
            StringBuilder sbP = qv1.p("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i2, ", isOppositeFacing=");
            sbP.append(z);
            sbP.append(", result=");
            sbP.append(i3);
            tvj.a("CameraOrientationUtil", sbP.toString());
        }
        return i3;
    }

    public static int c(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        ore.p(zo5.h(i, "Unsupported surface rotation: "));
        return 0;
    }
}
