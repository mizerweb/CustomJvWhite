package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class m80 {
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public volatile i64 j;
    public final String a = m80.class.getName();
    public final ConcurrentHashMap.KeySetView i = ConcurrentHashMap.newKeySet();

    public m80(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
    }

    public static String d(long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        return zo5.w(sb, ":", str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Comparable a(Uri uri, long j, sfa sfaVar, ns5 ns5Var, String str, String str2, va0 va0Var, String str3, nq4 nq4Var) {
        h80 h80Var;
        Uri uri2;
        String str4;
        String str5;
        va0 va0Var2;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        if (nq4Var instanceof h80) {
            h80Var = (h80) nq4Var;
            int i = h80Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                h80Var.j = i - Integer.MIN_VALUE;
            } else {
                h80Var = new h80(this, nq4Var);
            }
        } else {
            h80Var = new h80(this, nq4Var);
        }
        h80 h80Var2 = h80Var;
        Object objK0 = h80Var2.h;
        hu4 hu4Var = hu4.a;
        int i2 = h80Var2.j;
        if (i2 == 0) {
            ch3.d0(objK0);
            if (uri == null || uri.equals(Uri.EMPTY)) {
                String str6 = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str6, nbh.s(j, "Update url from opcode failure. messageId:", ", url not exist"), null);
                    return null;
                }
            } else {
                String str7 = this.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str7, nbh.s(j, "Update url from opcode success. messageId:", ", url exist"), null);
                }
                x90 x90Var = (x90) this.e.getValue();
                long j2 = sfaVar.h;
                h80Var2.d = uri;
                h80Var2.e = str;
                h80Var2.f = str2;
                h80Var2.g = va0Var;
                h80Var2.j = 1;
                objK0 = yab.K0(((n0c) ((xhh) x90Var.c.getValue())).b(), new v90(x90Var, j, j2, uri, ns5Var, str3, null), h80Var2);
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
                uri2 = uri;
                str4 = str;
                str5 = str2;
                va0Var2 = va0Var;
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        va0Var2 = h80Var2.g;
        str5 = h80Var2.f;
        str4 = h80Var2.e;
        uri2 = h80Var2.d;
        ch3.d0(objK0);
        String str8 = (String) objK0;
        if (str8 == null || r5h.X0(str8)) {
            objK0 = null;
        }
        String str9 = (String) objK0;
        if (str9 == null && ((Boolean) ((f5d) ((wo6) this.g.getValue())).a.Q3.a(e5d.S6[252]).i()).booleanValue()) {
            String str10 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str10, "Fail download audio file, try play with streaming", null);
            }
            ((wa0) this.b.getValue()).b(str4, str5, va0Var2);
            return uri2;
        }
        String str11 = this.a;
        if (str9 == null) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str11, "Fail download audio file, fallback on streaming disabled", null);
                return null;
            }
            return null;
        }
        a4c a4cVar5 = gm0.f;
        if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
            a4cVar5.c(je9Var2, str11, "Download audio file success, return exist local url", null);
        }
        ((wa0) this.b.getValue()).b(str4, str9, va0Var2);
        return Uri.parse(str9);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:104:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x023e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0246  */
    /* JADX WARN: Code duplicated, block: B:111:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x025f  */
    /* JADX WARN: Code duplicated, block: B:121:0x026f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0288  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0228  */
    public final Comparable b(long j, nq4 nq4Var, ns5 ns5Var, af7 af7Var, cf7 cf7Var, String str) throws Throwable {
        k80 k80Var;
        ns5 ns5Var2;
        af7 af7Var2;
        cf7 cf7Var2;
        String str2;
        b60 b60VarN;
        sfa sfaVar;
        cf7 cf7Var3;
        ns5 ns5Var3;
        String str3;
        af7 af7Var3;
        long jA;
        vsb vsbVar;
        long j2;
        String str4;
        long j3;
        long j4;
        long j5;
        ns5 ns5Var4;
        String str5;
        k80 k80Var2;
        Comparable comparable;
        ns5 ns5Var5;
        sfa sfaVar2;
        cf7 cf7Var4;
        long j6;
        Object poeVar;
        Throwable thA;
        xa0 xa0Var;
        String str6;
        String str7;
        ylc ylcVar;
        ylc ylcVar2;
        String str8;
        Object poeVar2;
        sfa sfaVar3;
        hu4 hu4Var;
        long j7 = j;
        va0 va0Var = va0.OPUS;
        je9 je9Var = je9.f;
        if (nq4Var instanceof k80) {
            k80Var = (k80) nq4Var;
            int i = k80Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                k80Var.n = i - Integer.MIN_VALUE;
            } else {
                k80Var = new k80(this, nq4Var);
            }
        } else {
            k80Var = new k80(this, nq4Var);
        }
        k80 k80Var3 = k80Var;
        Object objF = k80Var3.l;
        hu4 hu4Var2 = hu4.a;
        int i2 = k80Var3.n;
        if (i2 == 0) {
            ch3.d0(objF);
            String str9 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str9, zo5.j(j7, "Update url from opcode. messageId:"), null);
                }
            }
            sua suaVar = (sua) this.c.getValue();
            k80Var3.f = str;
            ns5Var2 = ns5Var;
            k80Var3.g = ns5Var2;
            k80Var3.h = cf7Var;
            af7Var2 = af7Var;
            k80Var3.i = af7Var2;
            k80Var3.d = j7;
            k80Var3.n = 1;
            objF = suaVar.f(j7, k80Var3);
            if (objF != hu4Var2) {
                cf7Var2 = cf7Var;
                str2 = str;
            }
            return hu4Var2;
        }
        if (i2 == 1) {
            j7 = k80Var3.d;
            af7 af7Var4 = k80Var3.i;
            cf7Var2 = k80Var3.h;
            ns5Var2 = k80Var3.g;
            str2 = k80Var3.f;
            ch3.d0(objF);
            af7Var2 = af7Var4;
        } else if (i2 == 2) {
            j7 = k80Var3.d;
            b60VarN = k80Var3.k;
            sfa sfaVar4 = k80Var3.j;
            af7Var3 = k80Var3.i;
            cf7 cf7Var5 = k80Var3.h;
            ns5 ns5Var6 = k80Var3.g;
            String str10 = k80Var3.f;
            ch3.d0(objF);
            sfaVar = sfaVar4;
            str3 = str10;
            cf7Var3 = cf7Var5;
            ns5Var3 = ns5Var6;
            jA = ((rt2) objF).A();
            long j8 = b60VarN.a;
            j2 = sfaVar.b;
            str4 = b60VarN.e;
            vsbVar = new vsb(kfc.N3, 6);
            j3 = j7;
            vsbVar.f(j8, "audioId");
            if (jA != 0) {
                j4 = jA;
                vsbVar.f(j4, ApiProtocol.PARAM_CHAT_ID);
            } else {
                j4 = jA;
            }
            if (j2 > 0) {
                vsbVar.f(j2, "messageId");
            }
            if (str4 != null && str4.length() != 0) {
                vsbVar.h(ApiProtocol.KEY_TOKEN, str4);
            }
            af7Var3.invoke();
            try {
                pvb pvbVar = (pvb) this.f.getValue();
                String str11 = this.a;
                k80Var3.f = str3;
                k80Var3.g = ns5Var3;
                k80Var3.h = cf7Var3;
                try {
                    k80Var3.i = null;
                    k80Var3.j = sfaVar;
                    k80Var3.k = null;
                    try {
                        k80Var3.d = j3;
                        k80Var3.e = j4;
                        k80Var3.n = 3;
                        k80Var2 = k80Var3;
                        j3 = j3;
                        str5 = str3;
                        j5 = j4;
                        ns5Var4 = ns5Var3;
                        comparable = null;
                        try {
                            objF = qe7.E(pvbVar, vsbVar, str11, 0L, 0, null, null, k80Var2, 124);
                            if (objF != hu4Var2) {
                                ns5Var5 = ns5Var4;
                                sfaVar2 = sfaVar;
                                cf7Var4 = cf7Var3;
                                j6 = j3;
                                poeVar = (xa0) objF;
                                long j9 = j6;
                                sfa sfaVar5 = sfaVar2;
                                String str12 = str5;
                                long j10 = j5;
                                thA = roe.a(poeVar);
                                if (thA != null) {
                                    if (thA instanceof CancellationException) {
                                        throw thA;
                                    }
                                    gm0.V(this.a, "Fail when try request audio url by AudioPlay", thA);
                                }
                                if (poeVar instanceof poe) {
                                    poeVar = comparable;
                                }
                                xa0Var = (xa0) poeVar;
                                if (xa0Var == null) {
                                    gm0.Y(this.a, "Can't update audio url by opcode because response is null");
                                    return comparable;
                                }
                                str6 = xa0Var.c;
                                str7 = xa0Var.d;
                                if (str6 != null) {
                                    if (str7 != null) {
                                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                                    } else {
                                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                                    }
                                    ylcVar2 = ylcVar;
                                } else {
                                    if (str7 != null) {
                                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                                    } else {
                                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                                    }
                                    ylcVar2 = ylcVar;
                                }
                                str8 = (String) ylcVar2.a;
                                va0 va0Var2 = (va0) ylcVar2.b;
                                cf7Var4.invoke(va0Var2);
                                if (str8 != null) {
                                }
                                gm0.Y(this.a, "Can't update audio url by opcode because newUrl is null or empty");
                                return null;
                            }
                            return hu4Var2;
                        } catch (Throwable th) {
                            th = th;
                            ns5Var5 = ns5Var4;
                            sfaVar2 = sfaVar;
                            cf7Var4 = cf7Var3;
                            j6 = j3;
                            poeVar = new poe(th);
                            long j11 = j6;
                            sfa sfaVar6 = sfaVar2;
                            String str13 = str5;
                            long j12 = j5;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                if (thA instanceof CancellationException) {
                                    throw thA;
                                }
                                gm0.V(this.a, "Fail when try request audio url by AudioPlay", thA);
                            }
                            if (poeVar instanceof poe) {
                                poeVar = comparable;
                            }
                            xa0Var = (xa0) poeVar;
                            if (xa0Var == null) {
                                gm0.Y(this.a, "Can't update audio url by opcode because response is null");
                                return comparable;
                            }
                            str6 = xa0Var.c;
                            str7 = xa0Var.d;
                            if (str6 != null) {
                                if (str7 != null) {
                                    ylcVar = new ylc(xa0Var.e, va0.MP3);
                                } else {
                                    ylcVar = new ylc(xa0Var.e, va0.MP3);
                                }
                                ylcVar2 = ylcVar;
                            } else {
                                if (str7 != null) {
                                    ylcVar = new ylc(xa0Var.e, va0.MP3);
                                } else {
                                    ylcVar = new ylc(xa0Var.e, va0.MP3);
                                }
                                ylcVar2 = ylcVar;
                            }
                            str8 = (String) ylcVar2.a;
                            va0 va0Var3 = (va0) ylcVar2.b;
                            cf7Var4.invoke(va0Var3);
                            if (str8 != null) {
                            }
                            gm0.Y(this.a, "Can't update audio url by opcode because newUrl is null or empty");
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j5 = j4;
                        ns5Var4 = ns5Var3;
                        str5 = str3;
                        k80Var2 = k80Var3;
                        comparable = null;
                        j3 = j3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j5 = j4;
                    ns5Var4 = ns5Var3;
                    str5 = str3;
                    k80Var2 = k80Var3;
                    comparable = null;
                }
            } catch (Throwable th4) {
                th = th4;
                j5 = j4;
                ns5Var4 = ns5Var3;
                str5 = str3;
                k80Var2 = k80Var3;
                comparable = null;
            }
        } else if (i2 == 3) {
            long j13 = k80Var3.e;
            j6 = k80Var3.d;
            sfaVar2 = k80Var3.j;
            cf7Var4 = k80Var3.h;
            ns5Var5 = k80Var3.g;
            String str14 = k80Var3.f;
            try {
                ch3.d0(objF);
                j5 = j13;
                va0Var = va0Var;
                je9Var = je9Var;
                comparable = null;
                str5 = str14;
                k80Var2 = k80Var3;
                try {
                    poeVar = (xa0) objF;
                } catch (Throwable th5) {
                    th = th5;
                    poeVar = new poe(th);
                }
            } catch (Throwable th6) {
                th = th6;
                j5 = j13;
                va0Var = va0Var;
                je9Var = je9Var;
                comparable = null;
                str5 = str14;
                k80Var2 = k80Var3;
                poeVar = new poe(th);
                long j14 = j6;
                sfa sfaVar7 = sfaVar2;
                String str15 = str5;
                long j15 = j5;
                thA = roe.a(poeVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    gm0.V(this.a, "Fail when try request audio url by AudioPlay", thA);
                }
                if (poeVar instanceof poe) {
                    poeVar = comparable;
                }
                xa0Var = (xa0) poeVar;
                if (xa0Var == null) {
                    gm0.Y(this.a, "Can't update audio url by opcode because response is null");
                    return comparable;
                }
                str6 = xa0Var.c;
                str7 = xa0Var.d;
                if (str6 != null) {
                    if (str7 != null) {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    } else {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    }
                    ylcVar2 = ylcVar;
                } else {
                    if (str7 != null) {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    } else {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    }
                    ylcVar2 = ylcVar;
                }
                str8 = (String) ylcVar2.a;
                va0 va0Var4 = (va0) ylcVar2.b;
                cf7Var4.invoke(va0Var4);
                if (str8 != null) {
                }
                gm0.Y(this.a, "Can't update audio url by opcode because newUrl is null or empty");
                return null;
            }
            long j16 = j6;
            sfa sfaVar8 = sfaVar2;
            String str16 = str5;
            long j17 = j5;
            thA = roe.a(poeVar);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                gm0.V(this.a, "Fail when try request audio url by AudioPlay", thA);
            }
            if (poeVar instanceof poe) {
                poeVar = comparable;
            }
            xa0Var = (xa0) poeVar;
            if (xa0Var == null) {
                gm0.Y(this.a, "Can't update audio url by opcode because response is null");
                return comparable;
            }
            str6 = xa0Var.c;
            str7 = xa0Var.d;
            if (str6 != null || str6.length() == 0) {
                if (str7 != null || str7.length() == 0) {
                    ylcVar = new ylc(xa0Var.e, va0.MP3);
                } else {
                    ylcVar = new ylc(str7, va0.M4A);
                }
                ylcVar2 = ylcVar;
            } else {
                ylcVar2 = new ylc(xa0Var.c, va0Var);
            }
            str8 = (String) ylcVar2.a;
            va0 va0Var5 = (va0) ylcVar2.b;
            cf7Var4.invoke(va0Var5);
            if (str8 != null || r5h.X0(str8)) {
                gm0.Y(this.a, "Can't update audio url by opcode because newUrl is null or empty");
                return null;
            }
            try {
                poeVar2 = Uri.parse(str8);
            } catch (Throwable th7) {
                poeVar2 = new poe(th7);
            }
            Throwable thA2 = roe.a(poeVar2);
            if (thA2 != null) {
                String str17 = this.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    sfaVar3 = sfaVar8;
                    hu4Var = hu4Var2;
                } else {
                    sfaVar3 = sfaVar8;
                    je9 je9Var3 = je9Var;
                    hu4Var = hu4Var2;
                    if (a4cVar2.b(je9Var3)) {
                        a4cVar2.c(je9Var3, str17, "Can't update url from opcode because new url invalid", thA2);
                    }
                }
            } else {
                sfaVar3 = sfaVar8;
                hu4Var = hu4Var2;
            }
            if (poeVar2 instanceof poe) {
                poeVar2 = null;
            }
            Uri uri = (Uri) poeVar2;
            String str18 = xa0Var.f;
            k80Var2.f = null;
            k80Var2.g = null;
            k80Var2.h = null;
            k80Var2.i = null;
            k80Var2.j = null;
            k80Var2.k = null;
            k80Var2.d = j16;
            k80Var2.e = j17;
            k80Var2.n = 4;
            hu4 hu4Var3 = hu4Var;
            objF = a(uri, j16, sfaVar3, ns5Var5, str16, str8, va0Var5, str18, k80Var2);
            if (objF == hu4Var3) {
                return hu4Var3;
            }
        } else {
            if (i2 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objF);
        }
        return (Uri) objF;
        sfa sfaVar9 = (sfa) objF;
        b60VarN = sfaVar9 != null ? sfaVar9.n() : null;
        e70 e70VarK = sfaVar9 != null ? sfaVar9.k(y60.e) : null;
        if (b60VarN == null || e70VarK == null) {
            String str19 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str19, zo5.j(j7, "Can't update audio url by opcode because audio is null. messageId:"), null);
            }
            return null;
        }
        if (!((x90) this.e.getValue()).b(e70VarK)) {
            String str20 = this.a;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str20, zo5.j(j7, "Don't need fetch audio because already fetched. messageId:"), null);
            }
            ((wa0) this.b.getValue()).b(str2, e70VarK.u, va0Var);
            return Uri.parse(e70VarK.u);
        }
        xn3 xn3Var = (xn3) this.d.getValue();
        long j18 = sfaVar9.h;
        k80Var3.f = str2;
        k80Var3.g = ns5Var2;
        k80Var3.h = cf7Var2;
        k80Var3.i = af7Var2;
        k80Var3.j = sfaVar9;
        k80Var3.k = b60VarN;
        k80Var3.d = j7;
        k80Var3.n = 2;
        Object objV = xn3Var.v(j18, k80Var3);
        if (objV != hu4Var2) {
            sfaVar = sfaVar9;
            objF = objV;
            cf7Var3 = cf7Var2;
            ns5Var3 = ns5Var2;
            str3 = str2;
            af7Var3 = af7Var2;
            jA = ((rt2) objF).A();
            long j19 = b60VarN.a;
            j2 = sfaVar.b;
            str4 = b60VarN.e;
            vsbVar = new vsb(kfc.N3, 6);
            j3 = j7;
            vsbVar.f(j19, "audioId");
            if (jA != 0) {
                j4 = jA;
                vsbVar.f(j4, ApiProtocol.PARAM_CHAT_ID);
            } else {
                j4 = jA;
            }
            if (j2 > 0) {
                vsbVar.f(j2, "messageId");
            }
            if (str4 != null) {
                vsbVar.h(ApiProtocol.KEY_TOKEN, str4);
            }
            af7Var3.invoke();
            pvb pvbVar2 = (pvb) this.f.getValue();
            String str110 = this.a;
            k80Var3.f = str3;
            k80Var3.g = ns5Var3;
            k80Var3.h = cf7Var3;
            k80Var3.i = null;
            k80Var3.j = sfaVar;
            k80Var3.k = null;
            k80Var3.d = j3;
            k80Var3.e = j4;
            k80Var3.n = 3;
            k80Var2 = k80Var3;
            j3 = j3;
            str5 = str3;
            j5 = j4;
            ns5Var4 = ns5Var3;
            comparable = null;
            objF = qe7.E(pvbVar2, vsbVar, str110, 0L, 0, null, null, k80Var2, 124);
            if (objF != hu4Var2) {
                ns5Var5 = ns5Var4;
                sfaVar2 = sfaVar;
                cf7Var4 = cf7Var3;
                j6 = j3;
                poeVar = (xa0) objF;
                long j110 = j6;
                sfa sfaVar10 = sfaVar2;
                String str111 = str5;
                long j111 = j5;
                thA = roe.a(poeVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    gm0.V(this.a, "Fail when try request audio url by AudioPlay", thA);
                }
                if (poeVar instanceof poe) {
                    poeVar = comparable;
                }
                xa0Var = (xa0) poeVar;
                if (xa0Var == null) {
                    gm0.Y(this.a, "Can't update audio url by opcode because response is null");
                    return comparable;
                }
                str6 = xa0Var.c;
                str7 = xa0Var.d;
                if (str6 != null) {
                    if (str7 != null) {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    } else {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    }
                    ylcVar2 = ylcVar;
                } else {
                    if (str7 != null) {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    } else {
                        ylcVar = new ylc(xa0Var.e, va0.MP3);
                    }
                    ylcVar2 = ylcVar;
                }
                str8 = (String) ylcVar2.a;
                va0 va0Var6 = (va0) ylcVar2.b;
                cf7Var4.invoke(va0Var6);
                if (str8 != null) {
                }
                gm0.Y(this.a, "Can't update audio url by opcode because newUrl is null or empty");
                return null;
            }
        }
        return hu4Var2;
    }

    public final void c(long j, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ylc ylcVar = (ylc) obj;
            if (this.i.add(d(j, ((Number) ylcVar.a).longValue(), (String) ylcVar.b))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            gm0.n(this.a, "Don't start fetching audio messages because all already fetching");
        } else {
            yab.i0((gu4) this.h.getValue(), null, 0, new j80(this, list, arrayList, j, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r6.p(r7) == r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r18, java.lang.String r20, long r21, defpackage.ns5 r23, defpackage.cf7 r24, defpackage.af7 r25, defpackage.nq4 r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r4 = r21
            r6 = r26
            boolean r7 = r6 instanceof defpackage.l80
            if (r7 == 0) goto L1d
            r7 = r6
            l80 r7 = (defpackage.l80) r7
            int r8 = r7.l
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L1d
            int r8 = r8 - r9
            r7.l = r8
            goto L22
        L1d:
            l80 r7 = new l80
            r7.<init>(r0, r6)
        L22:
            java.lang.Object r6 = r7.j
            hu4 r8 = defpackage.hu4.a
            int r9 = r7.l
            r10 = 2
            r11 = 1
            r12 = 0
            if (r9 == 0) goto L51
            if (r9 == r11) goto L3b
            if (r9 != r10) goto L35
            defpackage.ch3.d0(r6)
            return r6
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r12
        L3b:
            long r1 = r7.e
            long r3 = r7.d
            af7 r5 = r7.i
            cf7 r9 = r7.h
            ns5 r11 = r7.g
            java.lang.String r13 = r7.f
            defpackage.ch3.d0(r6)
            r14 = r5
            r15 = r3
            r3 = r9
            r4 = r1
            r1 = r15
            r9 = r11
            goto L96
        L51:
            defpackage.ch3.d0(r6)
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = r0.i
            java.lang.String r9 = d(r1, r4, r3)
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L8d
            java.lang.String r6 = r0.a
            java.lang.String r9 = "Wait download audio before play"
            defpackage.gm0.x(r6, r9, r12)
            i64 r6 = new i64
            r6.<init>()
            r0.j = r6
            i64 r6 = r0.j
            if (r6 == 0) goto L8d
            r7.f = r3
            r9 = r23
            r7.g = r9
            r13 = r24
            r7.h = r13
            r14 = r25
            r7.i = r14
            r7.d = r1
            r7.e = r4
            r7.l = r11
            java.lang.Object r6 = r6.p(r7)
            if (r6 != r8) goto L93
            goto Lb8
        L8d:
            r9 = r23
            r13 = r24
            r14 = r25
        L93:
            r15 = r13
            r13 = r3
            r3 = r15
        L96:
            r7.f = r12
            r7.g = r12
            r7.h = r12
            r7.i = r12
            r7.d = r1
            r7.e = r4
            r7.l = r10
            r18 = r0
            r24 = r3
            r19 = r4
            r21 = r7
            r22 = r9
            r25 = r13
            r23 = r14
            java.lang.Comparable r0 = r18.f(r19, r21, r22, r23, r24, r25)
            if (r0 != r8) goto Lb9
        Lb8:
            return r8
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m80.e(long, java.lang.String, long, ns5, cf7, af7, nq4):java.lang.Object");
    }

    public final Comparable f(long j, nq4 nq4Var, ns5 ns5Var, af7 af7Var, cf7 cf7Var, String str) {
        va0 va0Var;
        ua0 ua0VarA = ((wa0) this.b.getValue()).a(str);
        if (ua0VarA == null || (va0Var = ua0VarA.b) == null) {
            va0Var = va0.UNKNOWN;
        }
        cf7Var.invoke(va0Var);
        String str2 = ua0VarA != null ? ua0VarA.a : null;
        if (str2 == null || r5h.X0(str2)) {
            String str3 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "Verify url from opcode. url don't exist in cache", null);
                }
            }
        }
        return (ua0VarA == null || r5h.X0(ua0VarA.a)) ? b(j, nq4Var, ns5Var, af7Var, cf7Var, str) : Uri.parse(ua0VarA.a);
    }
}
