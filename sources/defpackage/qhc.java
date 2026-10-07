package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class qhc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:192:0x02b0 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #3 {all -> 0x00a2, blocks: (B:189:0x02a1, B:190:0x02aa, B:192:0x02b0, B:196:0x02cd, B:197:0x02d1, B:201:0x02dc, B:202:0x02e1, B:203:0x02e2, B:27:0x0063, B:28:0x006c, B:30:0x0072, B:34:0x008e, B:35:0x0092, B:38:0x009c, B:39:0x00a1, B:42:0x00a6, B:23:0x005c, B:193:0x02b8, B:31:0x007a), top: B:232:0x02a1, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x02dc A[Catch: all -> 0x00a2, TryCatch #3 {all -> 0x00a2, blocks: (B:189:0x02a1, B:190:0x02aa, B:192:0x02b0, B:196:0x02cd, B:197:0x02d1, B:201:0x02dc, B:202:0x02e1, B:203:0x02e2, B:27:0x0063, B:28:0x006c, B:30:0x0072, B:34:0x008e, B:35:0x0092, B:38:0x009c, B:39:0x00a1, B:42:0x00a6, B:23:0x005c, B:193:0x02b8, B:31:0x007a), top: B:232:0x02a1, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x02e2 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #3 {all -> 0x00a2, blocks: (B:189:0x02a1, B:190:0x02aa, B:192:0x02b0, B:196:0x02cd, B:197:0x02d1, B:201:0x02dc, B:202:0x02e1, B:203:0x02e2, B:27:0x0063, B:28:0x006c, B:30:0x0072, B:34:0x008e, B:35:0x0092, B:38:0x009c, B:39:0x00a1, B:42:0x00a6, B:23:0x005c, B:193:0x02b8, B:31:0x007a), top: B:232:0x02a1, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0131 A[Catch: all -> 0x0107, TryCatch #5 {all -> 0x0107, blocks: (B:45:0x00aa, B:79:0x0115, B:80:0x0118, B:82:0x011e, B:86:0x012d, B:88:0x0131, B:71:0x0101, B:72:0x0106, B:75:0x010b, B:94:0x013b, B:119:0x019c, B:102:0x0157, B:103:0x0160, B:105:0x0166, B:109:0x0183, B:111:0x0188, B:115:0x0193, B:116:0x0198, B:117:0x0199, B:123:0x01aa, B:131:0x01bd, B:132:0x01c6, B:134:0x01cc, B:138:0x01e9, B:139:0x01ed, B:143:0x01f8, B:144:0x01fd, B:145:0x01fe, B:147:0x0202, B:173:0x025d, B:174:0x0266, B:176:0x026c, B:180:0x0289, B:181:0x028d, B:185:0x0298, B:186:0x029d, B:187:0x029e, B:153:0x0211, B:154:0x021a, B:156:0x0220, B:160:0x023d, B:161:0x0241, B:165:0x024c, B:166:0x0251, B:167:0x0252, B:106:0x016e, B:53:0x00c0, B:177:0x0274, B:135:0x01d4, B:149:0x020a, B:98:0x0148, B:169:0x0254, B:127:0x01b4, B:157:0x0228), top: B:235:0x00aa, inners: #2, #4, #6, #7, #10, #12, #17, #18, #19 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static rhc a(fka fkaVar) {
        int iU;
        rhc rhcVar;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int iR;
        Object next;
        uhc uhcVar;
        long j;
        long jT;
        int i = 1;
        String str = null;
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
        uhc uhcVar2 = null;
        String strX2 = null;
        Long lValueOf = null;
        String strX3 = null;
        int i2 = 0;
        while (i2 < iU) {
            try {
                strX = ch3.X(fkaVar, str);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(str, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = str;
            }
            if (strX != null) {
                try {
                    switch (strX.hashCode()) {
                        case -1587556021:
                            if (!strX.equals("startParam")) {
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
                                    strX3 = ch3.X(fkaVar, null);
                                } catch (Throwable th8) {
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
                                    strX3 = null;
                                }
                            }
                            break;
                        case 116079:
                            if (!strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
                                } catch (Throwable th10) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                    Iterator it6 = fjf.a.iterator();
                                    while (it6.hasNext()) {
                                        AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th10);
                                            accountInitializer5.d().i().g().a(null, th10);
                                        } catch (Throwable th11) {
                                            gm0.V("Payload", "failed to collect exception", th11);
                                        }
                                    }
                                    int iD6 = qt4.D(pye.a);
                                    if (iD6 != 0) {
                                        if (iD6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th10;
                                    }
                                    strX2 = null;
                                }
                            }
                            break;
                        case 93028124:
                            if (!strX.equals("appId")) {
                                fkaVar.x();
                            } else {
                                try {
                                    j = 0;
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th12) {
                                    j = 0;
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                    Iterator it7 = fjf.a.iterator();
                                    while (it7.hasNext()) {
                                        AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th12);
                                            accountInitializer6.d().i().g().a(null, th12);
                                        } catch (Throwable th13) {
                                            gm0.V("Payload", "failed to collect exception", th13);
                                        }
                                    }
                                    int iD7 = qt4.D(pye.a);
                                    if (iD7 != 0) {
                                        if (iD7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th12;
                                    }
                                    jT = 0;
                                }
                                lValueOf = jT != j ? Long.valueOf(jT) : null;
                            }
                            break;
                        case 1792938725:
                            try {
                                if (strX.equals("placement")) {
                                    thc thcVar = uhc.Companion;
                                    try {
                                        iR = ch3.R(fkaVar, -1);
                                    } catch (Throwable th14) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                        try {
                                            Iterator it8 = fjf.a.iterator();
                                            while (it8.hasNext()) {
                                                AccountInitializer accountInitializer7 = ((n6) it8.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th14);
                                                    accountInitializer7.d().i().g().a(str, th14);
                                                } catch (Throwable th15) {
                                                    gm0.V("Payload", "failed to collect exception", th15);
                                                }
                                            }
                                            int iD8 = qt4.D(pye.a);
                                            if (iD8 != 0) {
                                                if (iD8 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th14;
                                            }
                                            iR = -1;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            try {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                it = fjf.a.iterator();
                                                while (it.hasNext()) {
                                                    AccountInitializer accountInitializer8 = ((n6) it.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th);
                                                        accountInitializer8.d().i().g().a(null, th);
                                                    } catch (Throwable th17) {
                                                        gm0.V("Payload", "failed to collect exception", th17);
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
                                                i = 1;
                                                str = null;
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
                                                    if (iD9 == 1) {
                                                        throw th18;
                                                    }
                                                    ore.o();
                                                    return null;
                                                }
                                                rhcVar = 0;
                                            }
                                        }
                                    }
                                    thcVar.getClass();
                                    y1 y1Var = new y1(0, uhc.c);
                                    do {
                                        if (y1Var.hasNext()) {
                                            next = y1Var.next();
                                            ((uhc) next).getClass();
                                        } else {
                                            next = null;
                                        }
                                        uhcVar = (uhc) next;
                                        if (uhcVar == null) {
                                            uhcVar = uhc.a;
                                        }
                                        uhcVar2 = uhcVar;
                                    } while (iR != 0);
                                    uhcVar = (uhc) next;
                                    if (uhcVar == null) {
                                        uhcVar = uhc.a;
                                    }
                                    uhcVar2 = uhcVar;
                                } else {
                                    fkaVar.x();
                                }
                            } catch (Throwable th20) {
                                th = th20;
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th21) {
                    th = th21;
                    th = th;
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    it = fjf.a.iterator();
                    while (it.hasNext()) {
                        AccountInitializer accountInitializer10 = ((n6) it.next()).a;
                        gm0.V("Payload", "error while parse payload", th);
                        accountInitializer10.d().i().g().a(null, th);
                    }
                    iD = qt4.D(pye.a);
                    if (iD != 0) {
                        if (iD != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th;
                    }
                    i2++;
                    i = 1;
                    str = null;
                }
            }
            i2++;
            i = 1;
            str = null;
        }
        rhcVar = str;
        return uhcVar2 == null ? rhcVar : new rhc(uhcVar2, strX2, lValueOf, strX3);
    }

    public final aw8 serializer() {
        return phc.a;
    }
}
