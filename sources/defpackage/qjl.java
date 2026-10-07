package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qjl {
    public static String a(me2 me2Var, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == 1) {
                ef2.a("0");
                Integer num2 = (Integer) ((qb2) me2Var.c().c.d("0")).c(CameraCharacteristics.LENS_FACING);
                if (num2 != null && num2.intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0) {
                ef2.a("1");
                Integer num3 = (Integer) ((qb2) me2Var.c().c.d("1")).c(CameraCharacteristics.LENS_FACING);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
            }
            return null;
        } catch (DoNotDisturbException unused) {
            if (!tvj.f(6, "CXCP")) {
                return null;
            }
            Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:221:0x033b A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #6 {all -> 0x00a9, blocks: (B:218:0x032c, B:219:0x0335, B:221:0x033b, B:225:0x0357, B:226:0x035b, B:230:0x0366, B:231:0x036b, B:232:0x036c, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:34:0x0095, B:35:0x0099, B:38:0x00a3, B:39:0x00a8, B:42:0x00ad, B:23:0x0063, B:31:0x0081, B:222:0x0343), top: B:269:0x032c, inners: #5, #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0366 A[Catch: all -> 0x00a9, TryCatch #6 {all -> 0x00a9, blocks: (B:218:0x032c, B:219:0x0335, B:221:0x033b, B:225:0x0357, B:226:0x035b, B:230:0x0366, B:231:0x036b, B:232:0x036c, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:34:0x0095, B:35:0x0099, B:38:0x00a3, B:39:0x00a8, B:42:0x00ad, B:23:0x0063, B:31:0x0081, B:222:0x0343), top: B:269:0x032c, inners: #5, #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x036c A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #6 {all -> 0x00a9, blocks: (B:218:0x032c, B:219:0x0335, B:221:0x033b, B:225:0x0357, B:226:0x035b, B:230:0x0366, B:231:0x036b, B:232:0x036c, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:34:0x0095, B:35:0x0099, B:38:0x00a3, B:39:0x00a8, B:42:0x00ad, B:23:0x0063, B:31:0x0081, B:222:0x0343), top: B:269:0x032c, inners: #5, #15, #18 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x036e A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static aad b(fka fkaVar) {
        int iU;
        int i;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int iJ;
        u8b u8bVar = cqb.b;
        int i2 = 1;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th2) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = fjf.a.iterator();
            while (it2.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it2.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th2);
                    accountInitializer.d().i().g().a(null, th2);
                } catch (Throwable th3) {
                    gm0.V("Payload", "failed to collect exception", th3);
                }
            }
            int iD2 = qt4.D(pye.a);
            if (iD2 != 0) {
                if (iD2 == 1) {
                    throw th2;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        int i3 = -1;
        u8b u8bVar2 = u8bVar;
        int iR = -1;
        int iR2 = -1;
        int i4 = 0;
        int iR3 = 0;
        int iR4 = 0;
        while (i4 < iU) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(null, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    switch (strX.hashCode()) {
                        case -1249474914:
                            if (!strX.equals("options")) {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th6) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                    Iterator it4 = fjf.a.iterator();
                                    while (it4.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th6);
                                            accountInitializer3.d().i().g().a(null, th6);
                                        } catch (Throwable th7) {
                                            gm0.V("Payload", "failed to collect exception", th7);
                                        }
                                    }
                                    int iD4 = qt4.D(pye.a);
                                    if (iD4 != 0) {
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th6;
                                    }
                                }
                            } else {
                                try {
                                    iR4 = ch3.R(fkaVar, 0);
                                } catch (Throwable th8) {
                                    try {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                        Iterator it5 = fjf.a.iterator();
                                        while (it5.hasNext()) {
                                            AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th8);
                                                accountInitializer4.d().i().g().a(null, th8);
                                            } catch (Throwable th9) {
                                                gm0.V("Payload", "failed to collect exception", th9);
                                            }
                                        }
                                        int iD5 = qt4.D(pye.a);
                                        if (iD5 != 0) {
                                            if (iD5 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th8;
                                        }
                                        iR4 = 0;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th = th;
                                        try {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                            it = fjf.a.iterator();
                                            while (it.hasNext()) {
                                                AccountInitializer accountInitializer5 = ((n6) it.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th);
                                                    accountInitializer5.d().i().g().a(null, th);
                                                } catch (Throwable th11) {
                                                    gm0.V("Payload", "failed to collect exception", th11);
                                                }
                                            }
                                            iD = qt4.D(pye.a);
                                            if (iD != 0) {
                                                if (iD != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th12) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                            Iterator it6 = fjf.a.iterator();
                                            while (it6.hasNext()) {
                                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th12);
                                                    accountInitializer6.d().i().g().a(null, th12);
                                                } catch (Throwable th13) {
                                                    gm0.V("Payload", "failed to collect exception", th13);
                                                }
                                            }
                                            int iD6 = qt4.D(pye.a);
                                            if (iD6 != 0) {
                                                if (iD6 == 1) {
                                                    throw th12;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                            i = -1;
                                        }
                                    }
                                }
                            }
                            break;
                        case -499560071:
                            if (!strX.equals("answerId")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, -1);
                                } catch (Throwable th14) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                    Iterator it7 = fjf.a.iterator();
                                    while (it7.hasNext()) {
                                        AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th14);
                                            accountInitializer7.d().i().g().a(null, th14);
                                        } catch (Throwable th15) {
                                            gm0.V("Payload", "failed to collect exception", th15);
                                        }
                                    }
                                    int iD7 = qt4.D(pye.a);
                                    if (iD7 != 0) {
                                        if (iD7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th14;
                                    }
                                    iR = -1;
                                }
                            }
                            break;
                        case 3493088:
                            if (!strX.equals("rate")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    iR3 = ch3.R(fkaVar, 0);
                                } catch (Throwable th16) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                    Iterator it8 = fjf.a.iterator();
                                    while (it8.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th16);
                                            accountInitializer8.d().i().g().a(null, th16);
                                        } catch (Throwable th17) {
                                            gm0.V("Payload", "failed to collect exception", th17);
                                        }
                                    }
                                    int iD8 = qt4.D(pye.a);
                                    if (iD8 != 0) {
                                        if (iD8 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th16;
                                    }
                                    iR3 = 0;
                                }
                            }
                            break;
                        case 112397001:
                            if (strX.equals("votes")) {
                                u8b u8bVar3 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
                                        } catch (Throwable th18) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                            Iterator it9 = fjf.a.iterator();
                                            while (it9.hasNext()) {
                                                AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th18);
                                                    accountInitializer9.d().i().g().a(null, th18);
                                                } catch (Throwable th19) {
                                                    gm0.V("Payload", "failed to collect exception", th19);
                                                }
                                            }
                                            int iD9 = qt4.D(pye.a);
                                            if (iD9 != 0) {
                                                if (iD9 != i2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th18;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar4 = new u8b(iJ);
                                        for (int i5 = 0; i5 < iJ; i5++) {
                                            b6d b6dVarB = ejl.b(fkaVar);
                                            if (b6dVarB != null) {
                                                u8bVar4.b(b6dVarB);
                                            }
                                        }
                                        u8bVar3 = u8bVar4;
                                    } else {
                                        fkaVar.x();
                                    }
                                } catch (Throwable th20) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                                    Iterator it10 = fjf.a.iterator();
                                    while (it10.hasNext()) {
                                        AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th20);
                                            accountInitializer10.d().i().g().a(null, th20);
                                        } catch (Throwable th21) {
                                            gm0.V("Payload", "failed to collect exception", th21);
                                        }
                                    }
                                    int iD10 = qt4.D(pye.a);
                                    if (iD10 != 0) {
                                        if (iD10 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th20;
                                    }
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 180244549:
                            try {
                                if (!strX.equals("voteCount")) {
                                    fkaVar.x();
                                    break;
                                } else {
                                    try {
                                        iR2 = ch3.R(fkaVar, i3);
                                    } catch (Throwable th22) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                                        Iterator it11 = fjf.a.iterator();
                                        while (it11.hasNext()) {
                                            AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th22);
                                                accountInitializer11.d().i().g().a(null, th22);
                                            } catch (Throwable th23) {
                                                gm0.V("Payload", "failed to collect exception", th23);
                                            }
                                        }
                                        int iD11 = qt4.D(pye.a);
                                        if (iD11 != 0) {
                                            if (iD11 != i2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th22;
                                        }
                                        iR2 = i3;
                                    }
                                }
                            } catch (Throwable th24) {
                                th = th24;
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer12 = ((n6) it.next()).a;
                                    gm0.V("Payload", "error while parse payload", th);
                                    accountInitializer12.d().i().g().a(null, th);
                                }
                                iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th;
                                }
                                i4++;
                                i2 = 1;
                                i3 = -1;
                                break;
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th25) {
                    th = th25;
                }
            }
            i4++;
            i2 = 1;
            i3 = -1;
        }
        i = i3;
        if (iR == i || iR2 == i) {
            return null;
        }
        return new aad(iR, iR2, u8bVar2, iR3, iR4);
    }
}
