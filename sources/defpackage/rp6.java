package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class rp6 {
    public final String a = rp6.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;

    public rp6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var10;
        this.l = ny8Var11;
        this.m = ny8Var12;
        this.n = ny8Var13;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(long j, long j2, String str, String str2, String str3, bq6 bq6Var, nq4 nq4Var) throws Throwable {
        op6 op6Var;
        String str4;
        File fileK;
        Object poeVar;
        String str5;
        Object poeVar2;
        int iIntValue;
        Long lValueOf;
        int iY0;
        wfc wfcVar = wfc.a;
        if (nq4Var instanceof op6) {
            op6Var = (op6) nq4Var;
            int i = op6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                op6Var.f = i - Integer.MIN_VALUE;
            } else {
                op6Var = new op6(this, nq4Var);
            }
        } else {
            op6Var = new op6(this, nq4Var);
        }
        op6 op6Var2 = op6Var;
        Object obj = op6Var2.d;
        hu4 hu4Var = hu4.a;
        int i2 = op6Var2.f;
        Integer numValueOf = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return wfcVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            gm0.n(this.a, "File attach click. Start process open file");
            if (str3 == null || str3.length() == 0) {
                str4 = str2;
                fileK = ((ju6) this.c.getValue()).k(str4);
            } else {
                fileK = new File(str3);
                str4 = str2;
            }
            if (!fileK.exists()) {
                gm0.Y(this.a, "file attach not found");
                ifi ifiVar = (ifi) this.e.getValue();
                u60 u60Var = u60.a;
                op6Var2.f = 1;
                return ifiVar.a(j, j2, str, u60Var, op6Var2) == hu4Var ? hu4Var : wfcVar;
            }
            try {
                String name = fileK.getName();
                if (name == null || name.length() == 0 || (iY0 = r5h.Y0(name, '.', 0, 6)) < 0) {
                    str5 = null;
                } else {
                    String strSubstring = name.substring(iY0 + 1);
                    if (MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.toLowerCase(Locale.ROOT)) != null) {
                        str5 = strSubstring;
                    } else {
                        str5 = null;
                    }
                }
                if (str5 != null) {
                    try {
                        ps8 ps8Var = qs8.d;
                        u9c u9cVar = (u9c) this.m.getValue();
                        poeVar2 = kt8.g(ps8Var.c((String) u9cVar.e.m(u9cVar, u9c.l[0])));
                    } catch (Throwable th) {
                        poeVar2 = new poe(th);
                    }
                    Object cu8Var = new cu8(new LinkedHashMap());
                    if (poeVar2 instanceof poe) {
                        poeVar2 = cu8Var;
                    }
                    cu8 cu8Var2 = (cu8) poeVar2;
                    String lowerCase = str5.toLowerCase(Locale.ROOT);
                    jt8 jt8Var = (jt8) cu8Var2.get(lowerCase);
                    if (jt8Var != null) {
                        try {
                            lValueOf = Long.valueOf(new vyh(kt8.h(jt8Var).a()).k());
                        } catch (JsonDecodingException unused) {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                                numValueOf = Integer.valueOf((int) jLongValue);
                            }
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    } else {
                        iIntValue = 0;
                    }
                    u9c u9cVar2 = (u9c) this.m.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : cu8Var2.a.entrySet()) {
                    }
                    u9cVar2.e.B(u9cVar2, u9c.l[0], new cu8(linkedHashMap).toString());
                }
                poeVar = sbi.a;
            } catch (Throwable th2) {
                poeVar = new poe(th2);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String str6 = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str6, "Got error during increment file stats", thA);
                    }
                }
            }
            int iOrdinal = bq6Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Uri uriI = ((ju6) this.c.getValue()).i((Context) this.d.getValue(), fileK);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                String strI = l21.i(str4);
                if (strI == null) {
                    strI = "*/*";
                }
                intent.setDataAndType(uriI, strI);
                return new xfc(intent, uriI);
            }
            return new yfc(j2, str);
        } catch (Throwable th3) {
            Throwable thA2 = roe.a(new poe(th3));
            if (thA2 != null) {
                if (thA2 instanceof CancellationException) {
                    throw thA2;
                }
                gm0.V(this.a, "cant open file attach", thA2);
                return wfcVar;
            }
        }
    }

    public final Object b(long j, long j2, long j3, String str, long j4, nq4 nq4Var) {
        hu4 hu4Var = hu4.a;
        String str2 = this.a;
        if (j3 == 0) {
            gm0.n(str2, "File attach click. Start process delete message");
            Object objB = wfa.b((wfa) this.f.getValue(), true, j2, nq4Var);
            if (objB == hu4Var) {
                return objB;
            }
        } else {
            gm0.n(str2, "File attach click. Start process cancel download");
            ((i50) this.l.getValue()).a(new l5e(j2, j4, str, null));
            Object objA = ((ifi) this.e.getValue()).a(j, j2, str, u60.b, nq4Var);
            if (objA == hu4Var) {
                return objA;
            }
        }
        return sbi.a;
    }

    public final Object c(long j, long j2, long j3, long j4, String str, String str2, long j5, nq4 nq4Var) {
        return !((ju6) this.c.getValue()).a() ? yhg.a : yab.K0(((n0c) ((xhh) this.g.getValue())).b(), new qp6(this, j3, j4, str, j5, j, j2, str2, null), nq4Var);
    }
}
