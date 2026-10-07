package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dtl {
    public static vv9 a(u25 u25Var, String str, byte[] bArr, Map map) throws Throwable {
        a35 a35Var;
        x25 x25Var;
        Map map2;
        List list;
        lkg lkgVar = new lkg(u25Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        lvb.W(uri, "The uri must be set.");
        a35 a35Var2 = new a35(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        a35 a35VarA = a35Var2;
        int i = 0;
        while (true) {
            try {
                x25 x25Var2 = new x25(lkgVar, a35VarA);
                try {
                    byte[] bArrB = z61.b(x25Var2);
                    try {
                        a35Var = a35Var2;
                        x25Var = x25Var2;
                        try {
                            try {
                                t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, SystemClock.elapsedRealtime(), 0L, bArrB.length);
                                xp9 xp9Var = new xp9(21, bArrB);
                                xp9Var.c = t99Var;
                                vv9 vv9Var = new vv9(xp9Var);
                                vqi.h(x25Var);
                                return vv9Var;
                            } catch (Throwable th) {
                                th = th;
                                vqi.h(x25Var);
                                throw th;
                            }
                        } catch (HttpDataSource$InvalidResponseCodeException e) {
                            e = e;
                            int i2 = e.c;
                            String str2 = null;
                            if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (String) list.get(0);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i++;
                            z25 z25VarA = a35VarA.a();
                            z25VarA.a = Uri.parse(str2);
                            a35VarA = z25VarA.a();
                            try {
                                vqi.h(x25Var);
                                a35Var2 = a35Var;
                            } catch (Exception e2) {
                                e = e2;
                                throw new MediaDrmCallbackException(a35Var, lkgVar.c, lkgVar.a.p(), lkgVar.b, e);
                            }
                        }
                    } catch (HttpDataSource$InvalidResponseCodeException e3) {
                        e = e3;
                        a35Var = a35Var2;
                        x25Var = x25Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        x25Var = x25Var2;
                        vqi.h(x25Var);
                        throw th;
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e4) {
                    e = e4;
                    a35Var = a35Var2;
                    x25Var = x25Var2;
                } catch (Throwable th3) {
                    th = th3;
                    x25Var = x25Var2;
                }
                a35Var2 = a35Var;
            } catch (Exception e5) {
                e = e5;
                a35Var = a35Var2;
            }
        }
    }

    public static boolean b(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0223 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:143:0x0214, B:144:0x021d, B:146:0x0223, B:150:0x023f, B:151:0x0243, B:154:0x024d, B:155:0x0252, B:156:0x0253, B:27:0x0064, B:28:0x006d, B:30:0x0073, B:34:0x008f, B:35:0x0093, B:38:0x009d, B:39:0x00a2, B:42:0x00a7, B:23:0x005d, B:31:0x007b, B:147:0x022b), top: B:179:0x0214, inners: #1, #8, #16 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x024d A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:143:0x0214, B:144:0x021d, B:146:0x0223, B:150:0x023f, B:151:0x0243, B:154:0x024d, B:155:0x0252, B:156:0x0253, B:27:0x0064, B:28:0x006d, B:30:0x0073, B:34:0x008f, B:35:0x0093, B:38:0x009d, B:39:0x00a2, B:42:0x00a7, B:23:0x005d, B:31:0x007b, B:147:0x022b), top: B:179:0x0214, inners: #1, #8, #16 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0253 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:143:0x0214, B:144:0x021d, B:146:0x0223, B:150:0x023f, B:151:0x0243, B:154:0x024d, B:155:0x0252, B:156:0x0253, B:27:0x0064, B:28:0x006d, B:30:0x0073, B:34:0x008f, B:35:0x0093, B:38:0x009d, B:39:0x00a2, B:42:0x00a7, B:23:0x005d, B:31:0x007b, B:147:0x022b), top: B:179:0x0214, inners: #1, #8, #16 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0256 A[SYNTHETIC] */
    public static x1h d(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int i = 0;
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
        int i2 = 0;
        int iR = 0;
        int iR2 = 0;
        long jT = 0;
        while (i2 < iU) {
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
                    if (iD3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    try {
                        if (iHashCode != -1884251920) {
                            if (iHashCode != -991323327) {
                                if (iHashCode == 1010862021) {
                                    try {
                                        if (strX.equals("reactionsCount")) {
                                            try {
                                                iR2 = ch3.R(fkaVar, i);
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
                                                iR2 = i;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        try {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                            it = fjf.a.iterator();
                                            while (it.hasNext()) {
                                                AccountInitializer accountInitializer4 = ((n6) it.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th);
                                                    accountInitializer4.d().i().g().a(null, th);
                                                } catch (Throwable th9) {
                                                    gm0.V("Payload", "failed to collect exception", th9);
                                                }
                                            }
                                            iD = qt4.D(pye.a);
                                            if (iD != 0) {
                                                if (iD != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th;
                                            }
                                            i2++;
                                            i = 0;
                                        } catch (Throwable th10) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                            Iterator it5 = fjf.a.iterator();
                                            while (it5.hasNext()) {
                                                AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th10);
                                                    accountInitializer5.d().i().g().a(null, th10);
                                                } catch (Throwable th11) {
                                                    gm0.V("Payload", "failed to collect exception", th11);
                                                }
                                            }
                                            int iD5 = qt4.D(pye.a);
                                            if (iD5 != 0) {
                                                if (iD5 == 1) {
                                                    throw th10;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                        }
                                    }
                                }
                            } else if (strX.equals("viewsCount")) {
                                try {
                                    iR = ch3.R(fkaVar, i);
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
                                        if (iD6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th12;
                                    }
                                    iR = i;
                                }
                            }
                        } else if (strX.equals("storyId")) {
                            try {
                                jT = ch3.T(fkaVar, 0L);
                            } catch (Throwable th14) {
                                try {
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
                                    jT = 0;
                                } catch (Throwable th16) {
                                    th = th16;
                                    th = th;
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                    it = fjf.a.iterator();
                                    while (it.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it.next()).a;
                                        gm0.V("Payload", "error while parse payload", th);
                                        accountInitializer8.d().i().g().a(null, th);
                                    }
                                    iD = qt4.D(pye.a);
                                    if (iD != 0) {
                                        if (iD != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        fkaVar.x();
                    } catch (Throwable th17) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer9 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th17);
                                accountInitializer9.d().i().g().a(null, th17);
                            } catch (Throwable th18) {
                                gm0.V("Payload", "failed to collect exception", th18);
                            }
                        }
                        int iD8 = qt4.D(pye.a);
                        if (iD8 != 0) {
                            if (iD8 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th17;
                        }
                    }
                } catch (Throwable th19) {
                    th = th19;
                }
            }
            i2++;
            i = 0;
        }
        return new x1h(iR, iR2, jT);
    }
}
