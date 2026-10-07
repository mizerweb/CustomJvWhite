package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class pm9 {
    public static final /* synthetic */ int a = 0;

    public static int a(c46 c46Var) {
        if (c46Var != null) {
            if (c46Var.i() == 1) {
                e70 e70VarH = c46Var.h(0);
                switch (e70VarH.a.ordinal()) {
                    case 1:
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 2:
                        return 1;
                    case 3:
                        return e70VarH.d.b == 2 ? 11 : 3;
                    case 4:
                        return 2;
                    case 5:
                        return 10;
                    case 6:
                        return 5;
                    case 7:
                        return 8;
                    case 9:
                        return 7;
                    case 12:
                        return 9;
                    default:
                        gm0.q("pm9", "new attach type " + c46Var.h(0).a + " in calcMediaType method. developer, please add mapping logic for it");
                        return 0;
                }
            } else if (c46Var.i() > 1) {
                return 4;
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX WARN: Code duplicated, block: B:83:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r25v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList] */
    public static l40 b(e70 e70Var, wo6 wo6Var) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        int iD;
        int i5;
        ?? arrayList;
        o5d o5dVar;
        ed7 ed7Var;
        Object obj = null;
        if (e70Var != null) {
            int i6 = 6;
            long j = 0;
            switch (e70Var.a.ordinal()) {
                case 0:
                    return new ubi(false, false);
                case 1:
                    h60 h60Var = e70Var.c;
                    int i7 = h60Var.a;
                    r60 r60Var = h60Var.h;
                    switch (qt4.D(i7)) {
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = i6;
                            break;
                        case 6:
                            i6 = 7;
                            i = i6;
                            break;
                        case 7:
                            i6 = 9;
                            i = i6;
                            break;
                        case 8:
                            i6 = 10;
                            i = i6;
                            break;
                        case 9:
                        default:
                            i = 1;
                            break;
                        case 10:
                            i6 = 12;
                            i = i6;
                            break;
                    }
                    return new oq4(i, Long.valueOf(h60Var.b), h60Var.c, h60Var.d, h60Var.e, h60Var.f, h60Var.g, r60Var != null ? new r60(r60Var.b(), r60Var.d(), r60Var.c(), r60Var.a(), 2) : null, h60Var.i, h60Var.j, h60Var.k, h60Var.l, null, h60Var.o, false, false);
                case 2:
                    return w(e70Var.b);
                case 3:
                    d70 d70Var = e70Var.d;
                    if (d70Var.b == 2 && wo6Var != null && ((Boolean) ((f5d) wo6Var).a.B4.a(e5d.S6[289]).i()).booleanValue()) {
                        byte[] bArr2 = d70Var.t;
                        j = d70Var.c;
                        bArr = bArr2;
                    } else {
                        bArr = null;
                    }
                    int i8 = d70Var.b;
                    return new eti(d70Var.a, qt4.D(i8), Long.valueOf(j), 0L, null, null, null, false, null, null, null, i8 == 2 ? d70Var.l : null, null, false, d70Var.o, null, false, bArr, null);
                case 4:
                    b60 b60Var = e70Var.e;
                    if (wo6Var != null && ((Boolean) ((f5d) wo6Var).a.A4.a(e5d.S6[288]).i()).booleanValue()) {
                        obj = b60Var.d;
                        j = b60Var.c;
                    }
                    return new n70(b60Var.a, null, j, obj, false, b60Var.e, false);
                case 5:
                    w60 w60Var = e70Var.f;
                    long jI = w60Var.i();
                    int iO = w60Var.o();
                    int iB = w60Var.b();
                    String strM = w60Var.m();
                    long jL = w60Var.l();
                    String strD = w60Var.d();
                    String strA = w60Var.a();
                    List listK = w60Var.k();
                    String strE = w60Var.e();
                    int iD2 = qt4.D(w60Var.j());
                    if (iD2 == 1) {
                        i2 = 2;
                    } else if (iD2 != 2) {
                        i2 = iD2 != 3 ? 1 : 4;
                    } else {
                        i2 = 3;
                    }
                    long jG = w60Var.g();
                    String strC = w60Var.c();
                    boolean zP = w60Var.p();
                    int iD3 = qt4.D(w60Var.h());
                    return new glg(jI, iO, iB, strM, jL, strD, strA, listK, strE, i2, jG, strC, zP, iD3 != 1 ? iD3 != 2 ? 1 : 3 : 2, false, false, w60Var.n());
                case 6:
                    t60 t60Var = e70Var.g;
                    return new lxf(t60Var.f(), t60Var.h(), t60Var.g(), t60Var.a(), t60Var.c(), w(t60Var.d()), b(t60Var.e(), null), false, false, t60Var.k());
                case 7:
                    e60 e60Var = e70Var.i;
                    if (e60Var.a() == 0) {
                        i3 = 1;
                    } else {
                        int iD4 = qt4.D(e60Var.a());
                        if (iD4 == 1) {
                            i3 = 3;
                        } else if (iD4 != 2) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    }
                    if (e60Var.e() == 0 || (iD = qt4.D(e60Var.e())) == 0) {
                        i4 = 1;
                    } else if (iD == 1) {
                        i4 = 2;
                    } else if (iD == 2) {
                        i4 = 3;
                    } else if (iD == 3) {
                        i4 = 4;
                    } else if (iD != 4) {
                        i4 = 1;
                    } else {
                        i4 = 5;
                    }
                    return new xb1(e60Var.c(), e60Var.f(), i3, i4, Long.valueOf(e60Var.d()), e60Var.b(), false, false);
                case 9:
                    j60 j60Var = e70Var.j;
                    return new mp6(j60Var.a, j60Var.b, j60Var.c, b(j60Var.d, null), false, j60Var.e, false);
                case 10:
                    f60 f60Var = e70Var.k;
                    return new hh4(f60Var.h(), f60Var.a(), f60Var.e(), f60Var.b(), f60Var.c(), f60Var.f(), f60Var.g(), false, false);
                case 11:
                    p60 p60Var = e70Var.l;
                    int iG = p60Var.g();
                    if (iG == 0) {
                        i5 = 1;
                    } else {
                        int iD5 = qt4.D(iG);
                        if (iD5 == 1) {
                            i5 = 2;
                        } else if (iD5 == 2) {
                            i5 = 3;
                        } else if (iD5 == 3) {
                            i5 = 4;
                        } else if (iD5 == 4) {
                            i5 = 5;
                        } else if (iD5 != 5) {
                            i5 = 1;
                        } else {
                            i5 = 6;
                        }
                    }
                    return new bgd(Long.valueOf(p60Var.c()), Long.valueOf(p60Var.b()), Long.valueOf(p60Var.f()), Long.valueOf(p60Var.e()), i5, p60Var.d(), false, false);
                case 12:
                    l60 l60Var = e70Var.m;
                    List<m60> listG = l60Var.g();
                    if (listG != null) {
                        arrayList = new ArrayList();
                        for (m60 m60Var : listG) {
                            arrayList.add(new wc9(m60Var.a, m60Var.b));
                        }
                    } else {
                        arrayList = Collections.EMPTY_LIST;
                    }
                    return new uc9(l60Var.e(), l60Var.d(), l60Var.f(), l60Var.b(), arrayList, l60Var.a(), l60Var.h(), l60Var.i(), false, false);
                case 14:
                    o5d o5dVar2 = e70Var.o;
                    long jC = o5dVar2.c();
                    String strF = o5dVar2.f();
                    u8b u8bVarB = o5dVar2.b();
                    u8b u8bVar = new u8b(u8bVarB.b);
                    Object[] objArr = u8bVarB.a;
                    int i9 = u8bVarB.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        k5d k5dVar = (k5d) objArr[i10];
                        u8bVar.b(new r5d(k5dVar.b(), k5dVar.a()));
                    }
                    int iD6 = o5dVar2.d();
                    n5d n5dVarE = o5dVar2.e();
                    if (n5dVarE == null) {
                        o5dVar = o5dVar2;
                        ed7Var = null;
                    } else {
                        int iB2 = n5dVarE.b();
                        u8b u8bVarA = n5dVarE.a();
                        u8b u8bVar2 = new u8b(u8bVarA.b);
                        Object[] objArr2 = u8bVarA.a;
                        int i11 = u8bVarA.b;
                        int i12 = 0;
                        while (i12 < i11) {
                            m5d m5dVar = (m5d) objArr2[i12];
                            u8b u8bVarF = m5dVar.f();
                            o5d o5dVar3 = o5dVar2;
                            u8b u8bVar3 = new u8b(u8bVarF.b);
                            Object[] objArr3 = u8bVarF.a;
                            int i13 = u8bVarF.b;
                            int i14 = 0;
                            while (i14 < i13) {
                                l5d l5dVar = (l5d) objArr3[i14];
                                u8bVar3.b(new b6d(l5dVar.b(), l5dVar.a()));
                                i14++;
                                n5dVarE = n5dVarE;
                                i11 = i11;
                                objArr2 = objArr2;
                                i12 = i12;
                            }
                            u8bVar2.b(new aad(m5dVar.a(), m5dVar.e(), u8bVar3, m5dVar.d(), m5dVar.b()));
                            i12++;
                            o5dVar2 = o5dVar3;
                        }
                        o5dVar = o5dVar2;
                        ed7Var = new ed7(iB2, u8bVar2, n5dVarE.c());
                    }
                    return new q6d(jC, strF, u8bVar, iD6, ed7Var, o5dVar.g(), false, false);
                case 15:
                    ntg ntgVar = e70Var.p;
                    return new m1h(yab.E0(ntgVar.b()), ntgVar.d(), ntgVar.c() != null ? ntgVar.c() : null, ntgVar.a() > 0 ? ntgVar.a() : 0L, false, false);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0266  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [d] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kzi] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [kg8] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, jvj] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static e70 c(l40 l40Var, m7f m7fVar, long j, long j2) {
        int i;
        List list;
        ?? r7;
        ?? dVar;
        ?? r16;
        ?? r12;
        ?? r14;
        ?? r17;
        ?? r6;
        ?? r15;
        ?? T;
        l40 l40VarB;
        int i2 = 6;
        int i3 = 0;
        int i4 = 4;
        int i5 = 3;
        ?? r13 = 0;
        switch (l40Var.a.ordinal()) {
            case 1:
                oq4 oq4Var = (oq4) l40Var;
                int i6 = oq4Var.d;
                int i7 = h60.p;
                g60 g60Var = new g60();
                List list2 = oq4Var.f;
                switch (qt4.D(i6)) {
                    case 0:
                        g60Var.a = 1;
                        break;
                    case 1:
                        g60Var.a = 2;
                        break;
                    case 2:
                        g60Var.a = 3;
                        break;
                    case 3:
                        g60Var.a = 4;
                        break;
                    case 4:
                        g60Var.a = 5;
                        break;
                    case 5:
                        g60Var.a = 6;
                        break;
                    case 6:
                        g60Var.a = 7;
                        break;
                    case 8:
                        g60Var.a = 8;
                        break;
                    case 9:
                        g60Var.a = 9;
                        break;
                    case 10:
                        g60Var.a = 10;
                        break;
                    case 11:
                        g60Var.a = 11;
                        break;
                }
                Long l = oq4Var.e;
                if (l != null) {
                    g60Var.b = l.longValue();
                }
                if (list2 != null && list2.size() > 0) {
                    if (g60Var.c == null) {
                        g60Var.c = new ArrayList();
                    }
                    g60Var.c.addAll(list2);
                }
                String str = oq4Var.g;
                if (str != null) {
                    g60Var.d = str;
                }
                String str2 = oq4Var.h;
                if (str2 != null) {
                    g60Var.e = str2;
                }
                String str3 = oq4Var.i;
                if (str3 != null) {
                    g60Var.f = str3;
                }
                String str4 = oq4Var.j;
                if (str4 != null) {
                    g60Var.g = str4;
                }
                r60 r60Var = oq4Var.k;
                if (r60Var != null) {
                    g60Var.h = new r60(r60Var.b, r60Var.c, r60Var.d, r60Var.e, 0);
                }
                String str5 = oq4Var.l;
                if (str5 != null) {
                    g60Var.i = str5;
                }
                String str6 = oq4Var.m;
                if (str6 != null) {
                    g60Var.j = str6;
                }
                g60Var.k = oq4Var.n;
                int i8 = oq4Var.o;
                if (i8 != 0) {
                    g60Var.l = i8;
                }
                if (i6 == 11) {
                    g60Var.m = j;
                    g60Var.n = j2;
                }
                g60Var.o = oq4Var.q;
                c60 c60Var = new c60();
                c60Var.l = UUID.randomUUID().toString();
                c60Var.a = y60.b;
                c60Var.c = g60Var.a();
                c60Var.n = oq4Var.b;
                c60Var.A = oq4Var.c;
                return c60Var.a();
            case 2:
                return v((puc) l40Var, m7fVar);
            case 3:
                eti etiVar = (eti) l40Var;
                d70 d70Var = d70.w;
                z60 z60Var = new z60();
                Long l2 = etiVar.f;
                if (l2 != null) {
                    z60Var.b = l2.longValue();
                }
                z60Var.c = etiVar.g;
                Integer num = etiVar.j;
                if (num != null) {
                    z60Var.f = num.intValue();
                }
                Integer num2 = etiVar.i;
                if (num2 != null) {
                    z60Var.e = num2.intValue();
                }
                byte[] bArr = etiVar.n;
                if (bArr != null && bArr.length > 0) {
                    try {
                        m7fVar.getClass();
                        z60Var.j = bArr;
                    } catch (Throwable th) {
                        qr7.o(th);
                        return null;
                    }
                    break;
                }
                byte[] bArr2 = etiVar.o;
                if (bArr2 != null && bArr2.length > 0) {
                    z60Var.k = bArr2;
                }
                String str7 = etiVar.h;
                if (str7 != null) {
                    z60Var.d = str7;
                }
                z60Var.g = etiVar.k;
                String str8 = etiVar.l;
                if (str8 != null) {
                    z60Var.h = str8;
                }
                String str9 = etiVar.m;
                if (str9 != null) {
                    z60Var.i = str9;
                }
                Long l3 = etiVar.d;
                if (l3 != null) {
                    z60Var.a = l3.longValue();
                }
                Integer num3 = etiVar.e;
                if (num3 != null) {
                    z60Var.s = qt4.a(num3.intValue());
                }
                Long l4 = etiVar.p;
                if (l4 != null) {
                    z60Var.l = l4.longValue();
                }
                z60Var.n = etiVar.q;
                kui kuiVar = etiVar.r;
                if (kuiVar != null) {
                    z60Var.o = new c70(kuiVar.a, kuiVar.b, kuiVar.c, kuiVar.d, kuiVar.e);
                }
                byte[] bArr3 = etiVar.s;
                if (bArr3 != null) {
                    z60Var.t = bArr3;
                }
                c60 c60Var2 = new c60();
                c60Var2.l = UUID.randomUUID().toString();
                c60Var2.a = y60.d;
                c60Var2.n = etiVar.b;
                c60Var2.A = etiVar.c;
                c60Var2.d = new d70(z60Var);
                return c60Var2.a();
            case 4:
                n70 n70Var = (n70) l40Var;
                b60 b60Var = b60.j;
                a60 a60Var = new a60();
                Long l5 = n70Var.d;
                if (l5 != null) {
                    a60Var.a = l5.longValue();
                }
                Long l6 = n70Var.f;
                if (l6 != null) {
                    a60Var.c = l6.longValue();
                }
                String str10 = n70Var.e;
                if (str10 != null) {
                    a60Var.b = str10;
                }
                byte[] bArr4 = n70Var.g;
                if (bArr4 != null) {
                    a60Var.d = bArr4;
                }
                a60Var.e = n70Var.h;
                c60 c60Var3 = new c60();
                c60Var3.l = UUID.randomUUID().toString();
                c60Var3.a = y60.e;
                c60Var3.n = n70Var.b;
                c60Var3.A = n70Var.c;
                c60Var3.e = new b60(a60Var);
                return c60Var3.a();
            case 5:
                glg glgVar = (glg) l40Var;
                v60 v60VarQ = w60.q();
                long j3 = glgVar.d;
                String str11 = glgVar.l;
                String str12 = glgVar.j;
                v60VarQ.k(j3);
                v60VarQ.o(glgVar.g);
                v60VarQ.q(glgVar.e);
                v60VarQ.e(glgVar.f);
                v60VarQ.n(glgVar.h);
                String str13 = glgVar.i;
                if (!ch3.r(str13)) {
                    v60VarQ.g(str13);
                }
                if (!ch3.r(str12)) {
                    v60VarQ.d(str12);
                }
                v60VarQ.a(glgVar.k);
                if (!ch3.r(str11)) {
                    v60VarQ.h(str11);
                }
                int i9 = glgVar.m;
                if (i9 != 0) {
                    int iD = qt4.D(i9);
                    if (iD == 1) {
                        i4 = 2;
                    } else if (iD == 2) {
                        i4 = 3;
                    } else if (iD != 3) {
                        i4 = 1;
                    }
                    v60VarQ.l(i4);
                }
                v60VarQ.i(glgVar.n);
                v60VarQ.f(glgVar.o);
                v60VarQ.c(glgVar.p);
                int i10 = glgVar.q;
                if (i10 != 0) {
                    int iD2 = qt4.D(i10);
                    if (iD2 == 1) {
                        i5 = 2;
                    } else if (iD2 != 2) {
                        i5 = 1;
                    }
                    v60VarQ.j(i5);
                } else {
                    v60VarQ.j(1);
                }
                v60VarQ.p(glgVar.r);
                c60 c60Var4 = new c60();
                c60Var4.l = UUID.randomUUID().toString();
                c60Var4.a = y60.f;
                c60Var4.f = v60VarQ.b();
                c60Var4.n = glgVar.b;
                c60Var4.A = glgVar.c;
                return c60Var4.a();
            case 6:
                lxf lxfVar = (lxf) l40Var;
                s60 s60VarM = t60.m();
                long j4 = lxfVar.d;
                boolean z = lxfVar.b;
                s60VarM.p(j4);
                String str14 = lxfVar.f;
                if (str14 != null) {
                    s60VarM.r(str14);
                }
                String str15 = lxfVar.e;
                if (str15 != null) {
                    s60VarM.s(str15);
                }
                if (str14 != null) {
                    s60VarM.r(str14);
                }
                String str16 = lxfVar.g;
                if (str16 != null) {
                    s60VarM.h(str16);
                }
                String str17 = lxfVar.h;
                if (str17 != null) {
                    s60VarM.k(str17);
                }
                puc pucVar = lxfVar.i;
                if (pucVar != null) {
                    s60VarM.l(v(pucVar, m7fVar).b);
                }
                l40 l40Var2 = lxfVar.j;
                if (l40Var2 != null) {
                    s60VarM.n(c(l40Var2, m7fVar, 0L, 0L));
                }
                s60VarM.g(z);
                s60VarM.e(lxfVar.k);
                c60 c60Var5 = new c60();
                c60Var5.l = UUID.randomUUID().toString();
                c60Var5.a = y60.g;
                c60Var5.g = s60VarM.a();
                c60Var5.n = z;
                c60Var5.A = lxfVar.c;
                return c60Var5.a();
            case 7:
                iq iqVar = (iq) l40Var;
                y50 y50Var = new y50();
                y50Var.b(iqVar.d);
                y50Var.f(iqVar.e);
                y50Var.d(iqVar.f);
                y50Var.e(iqVar.g);
                y50Var.g(iqVar.h);
                y50Var.h(iqVar.i);
                z50 z50VarA = y50Var.a();
                c60 c60Var6 = new c60();
                c60Var6.l = UUID.randomUUID().toString();
                c60Var6.a = y60.i;
                c60Var6.n = iqVar.b;
                c60Var6.A = iqVar.c;
                c60Var6.h = z50VarA;
                return c60Var6.a();
            case 8:
                xb1 xb1Var = (xb1) l40Var;
                d60 d60Var = new d60();
                d60Var.e(xb1Var.d);
                d60Var.h(xb1Var.e);
                int i11 = xb1Var.f;
                if (i11 != 0) {
                    int iD3 = qt4.D(i11);
                    i = iD3 != 1 ? iD3 != 2 ? 1 : 2 : 3;
                } else {
                    i = 0;
                }
                d60Var.c(i);
                int i12 = xb1Var.g;
                if (i12 != 0) {
                    int iD4 = qt4.D(i12);
                    if (iD4 == 1) {
                        i3 = 2;
                    } else if (iD4 == 2) {
                        i3 = 3;
                    } else if (iD4 != 3) {
                        i3 = iD4 != 4 ? 1 : 5;
                    } else {
                        i3 = 4;
                    }
                }
                d60Var.g(i3);
                Long l7 = xb1Var.h;
                d60Var.f(l7 != null ? l7.longValue() : 0L);
                d60Var.d(xb1Var.i);
                e60 e60VarA = d60Var.a();
                c60 c60Var7 = new c60();
                c60Var7.l = UUID.randomUUID().toString();
                c60Var7.a = y60.h;
                c60Var7.q = e60VarA;
                c60Var7.n = xb1Var.b;
                c60Var7.A = xb1Var.c;
                return c60Var7.a();
            case 9:
                mp6 mp6Var = (mp6) l40Var;
                i60 i60Var = new i60();
                i60Var.a = mp6Var.d;
                i60Var.b = mp6Var.e;
                i60Var.c = mp6Var.f;
                l40 l40Var3 = mp6Var.g;
                i60Var.d = l40Var3 != null ? c(l40Var3, m7fVar, 0L, 0L) : null;
                i60Var.e = mp6Var.h;
                j60 j60Var = new j60(i60Var);
                c60 c60Var8 = new c60();
                c60Var8.l = UUID.randomUUID().toString();
                c60Var8.a = y60.j;
                c60Var8.r = j60Var;
                c60Var8.n = mp6Var.b;
                c60Var8.A = mp6Var.c;
                return c60Var8.a();
            case 10:
                hh4 hh4Var = (hh4) l40Var;
                c30 c30Var = new c30();
                c30Var.i(hh4Var.d);
                c30Var.b(hh4Var.e);
                c30Var.f(hh4Var.f);
                c30Var.g(hh4Var.i);
                c30Var.h(hh4Var.j);
                c30Var.c(hh4Var.g);
                c30Var.d(hh4Var.h);
                f60 f60VarA = c30Var.a();
                c60 c60Var9 = new c60();
                c60Var9.l = UUID.randomUUID().toString();
                c60Var9.a = y60.k;
                c60Var9.s = f60VarA;
                c60Var9.n = hh4Var.b;
                c60Var9.A = hh4Var.c;
                return c60Var9.a();
            case 11:
                bgd bgdVar = (bgd) l40Var;
                p60 p60Var = new p60();
                p60Var.i(bgdVar.d.longValue());
                p60Var.h(bgdVar.e.longValue());
                p60Var.l(bgdVar.f.longValue());
                p60Var.k(bgdVar.g.longValue());
                int i13 = bgdVar.h;
                if (i13 != 0) {
                    int iD5 = qt4.D(i13);
                    if (iD5 == 1) {
                        i2 = 2;
                    } else if (iD5 == 2) {
                        i2 = 3;
                    } else if (iD5 == 3) {
                        i2 = 4;
                    } else if (iD5 == 4) {
                        i2 = 5;
                    } else if (iD5 != 5) {
                        i2 = 1;
                    }
                } else {
                    i2 = 1;
                }
                p60Var.m(i2);
                p60Var.j(bgdVar.i);
                p60 p60VarA = p60Var.a();
                c60 c60Var10 = new c60();
                c60Var10.l = UUID.randomUUID().toString();
                c60Var10.a = y60.l;
                c60Var10.t = p60VarA;
                c60Var10.n = bgdVar.b;
                c60Var10.A = bgdVar.c;
                return c60Var10.a();
            case 12:
            case 14:
            case 15:
            default:
                c60 c60Var11 = new c60();
                c60Var11.a = y60.a;
                c60Var11.l = UUID.randomUUID().toString();
                c60Var11.n = l40Var.b;
                c60Var11.A = l40Var.c;
                return c60Var11.a();
            case 13:
                uc9 uc9Var = (uc9) l40Var;
                k60 k60Var = new k60();
                k60Var.g(uc9Var.d);
                k60Var.f(uc9Var.e);
                k60Var.h(uc9Var.f);
                k60Var.d(uc9Var.g);
                List<wc9> list3 = uc9Var.h;
                if (list3 == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(list3.size());
                    for (wc9 wc9Var : list3) {
                        arrayList.add(new m60(wc9Var.a, wc9Var.b));
                    }
                    list = arrayList;
                }
                k60Var.i(list);
                k60Var.c(uc9Var.i);
                k60Var.j(uc9Var.j);
                k60Var.b(uc9Var.k);
                l60 l60VarA = k60Var.a();
                c60 c60Var12 = new c60();
                c60Var12.l = UUID.randomUUID().toString();
                c60Var12.a = y60.m;
                c60Var12.v = l60VarA;
                c60Var12.n = uc9Var.b;
                c60Var12.A = uc9Var.c;
                return c60Var12.a();
            case 16:
                rvj rvjVar = (rvj) l40Var;
                List list4 = rvjVar.d;
                ArrayList arrayList2 = new ArrayList(list4.size());
                while (i3 < list4.size()) {
                    vvj vvjVar = (vvj) list4.get(i3);
                    switch (vvjVar.d().ordinal()) {
                        case 0:
                        case 6:
                            r7 = r13;
                            break;
                        case 1:
                            r7 = jvj.a;
                            break;
                        case 2:
                            r7 = jvj.b;
                            break;
                        case 3:
                            r7 = jvj.c;
                            break;
                        case 4:
                            r7 = jvj.d;
                            break;
                        case 5:
                            r7 = jvj.e;
                            break;
                        case 7:
                            r7 = jvj.f;
                            break;
                        default:
                            throw new RuntimeException(r13, r13);
                    }
                    if (r7 == 0) {
                        gm0.m("pm9", "Can't map widget content because unsupported type, type: %s", vvjVar.d());
                        r17 = r13;
                    } else {
                        int iOrdinal = vvjVar.d().ordinal();
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            d dVarA = vvjVar.a();
                            if (dVarA != null) {
                                r16 = r13;
                                dVar = new d(dVarA.a, dVarA.b, dVarA.c);
                            } else {
                                ?? r18 = r13;
                                dVar = r18;
                                r16 = r18;
                            }
                            r12 = dVar;
                            ?? r8 = r16;
                            r14 = r8;
                            r6 = r8;
                            r17 = r16;
                        } else if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                            ewe eweVarC = vvjVar.c();
                            ?? kziVar = eweVarC != null ? new kzi((String) eweVarC.b, r((List) eweVarC.c)) : r13;
                            ?? r9 = r13;
                            r17 = r9;
                            r6 = r9;
                            r12 = r13;
                            r14 = kziVar;
                        } else {
                            if (iOrdinal == 7 && (l40VarB = vvjVar.b()) != null && l40VarB.a == w50.INLINE_KEYBOARD) {
                                r15 = r13;
                                T = t((lg8) l40VarB);
                            } else {
                                ?? r10 = r13;
                                r15 = r10;
                                T = r10;
                            }
                            r17 = r15;
                            r6 = T;
                            r12 = r13;
                            r14 = r15;
                        }
                        if (r14 == 0 && r6 == 0 && r12 == 0) {
                            gm0.m("pm9", "Can't map widget content because content is empty, type: %s", r7);
                        } else {
                            arrayList2.add(new kvj(r7, r14, r6, r12));
                        }
                    }
                    i3++;
                    r13 = r17;
                }
                qvj qvjVar = new qvj(arrayList2);
                c60 c60Var13 = new c60();
                c60Var13.l = UUID.randomUUID().toString();
                c60Var13.a = y60.n;
                c60Var13.w = qvjVar;
                c60Var13.n = rvjVar.b;
                c60Var13.A = rvjVar.c;
                return c60Var13.a();
            case 17:
                q6d q6dVar = (q6d) l40Var;
                o5d o5dVarA = iil.a(q6dVar.d, q6dVar.e, yab.o0(q6dVar.f), q6dVar.g, yab.p0(q6dVar.h), q6dVar.i);
                c60 c60Var14 = new c60();
                c60Var14.l = UUID.randomUUID().toString();
                c60Var14.a = y60.o;
                c60Var14.x = o5dVarA;
                c60Var14.n = q6dVar.b;
                c60Var14.A = q6dVar.c;
                return c60Var14.a();
            case 18:
                m1h m1hVar = (m1h) l40Var;
                azg azgVarG0 = yab.G0(m1hVar.d);
                long j5 = m1hVar.e;
                long j6 = m1hVar.g;
                long j7 = j6 > 0 ? j6 : 0L;
                String str18 = m1hVar.f;
                ntg ntgVar = new ntg(azgVarG0, j5, str18 != null ? str18 : null, j7);
                c60 c60Var15 = new c60();
                c60Var15.l = UUID.randomUUID().toString();
                c60Var15.a = y60.p;
                c60Var15.C = ntgVar;
                c60Var15.n = m1hVar.b;
                c60Var15.A = m1hVar.c;
                return c60Var15.a();
        }
    }

    public static b50 d(c46 c46Var, wo6 wo6Var) {
        int i;
        b61 b61Var;
        if (c46Var == null) {
            return null;
        }
        b50 b50Var = new b50();
        Iterator it = ((List) c46Var.a).iterator();
        while (it.hasNext()) {
            l40 l40VarB = b((e70) it.next(), wo6Var);
            if (l40VarB != null) {
                b50Var.add(l40VarB);
            }
        }
        kg8 kg8Var = (kg8) c46Var.b;
        if (kg8Var != null) {
            jw8 jw8Var = new jw8();
            ArrayList<h61> arrayList = kg8Var.a;
            ArrayList arrayList2 = new ArrayList();
            for (h61<c61> h61Var : arrayList) {
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                for (c61 c61Var : h61Var) {
                    String str = c61Var.b.a;
                    b61[] b61VarArr = b61.c;
                    int length = b61VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            b61Var = b61.UNKNOWN;
                            break;
                        }
                        b61Var = b61VarArr[i2];
                        if (b61Var.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i2++;
                    }
                    a61 a61Var = a61.UNKNOWN;
                    int iD = qt4.D(c61Var.c);
                    if (iD == 0) {
                        a61Var = a61.DEFAULT;
                    } else if (iD == 1) {
                        a61Var = a61.POSITIVE;
                    } else if (iD == 2) {
                        a61Var = a61.NEGATIVE;
                    }
                    z51 z51Var = new z51();
                    z51Var.a = b61Var;
                    z51Var.c = a61Var;
                    z51Var.b = c61Var.a;
                    z51Var.d = c61Var.d;
                    z51Var.e = c61Var.e;
                    z51Var.f = c61Var.f;
                    z51Var.g = c61Var.g;
                    arrayList3.add(new d61(z51Var));
                }
            }
            jw8Var.a = arrayList2;
            b50Var.add(new lg8(new lw8(jw8Var), kg8Var.b, false, false));
        }
        kke kkeVar = (kke) c46Var.c;
        if (kkeVar != null) {
            ArrayList<jke> arrayList4 = kkeVar.a;
            ArrayList arrayList5 = new ArrayList();
            for (jke<hke> jkeVar : arrayList4) {
                ArrayList arrayList6 = new ArrayList();
                arrayList5.add(arrayList6);
                for (hke hkeVar : jkeVar) {
                    int iG = iic.g(iic.k(hkeVar.a));
                    int iD2 = qt4.D(hkeVar.b);
                    if (iD2 == 0) {
                        i = 1;
                    } else if (iD2 != 1) {
                        i = iD2 != 2 ? 4 : 3;
                    } else {
                        i = 2;
                    }
                    arrayList6.add(new ike(iG, i, hkeVar.c, w(hkeVar.d), null));
                }
            }
            b50Var.add(new mke(kkeVar.b, new lke(arrayList5), false, false));
        }
        return b50Var;
    }

    public static c46 e(b50 b50Var, m7f m7fVar) {
        return f(b50Var, m7fVar, 0L, 0L, null);
    }

    public static c46 f(b50 b50Var, m7f m7fVar, long j, long j2, tg4 tg4Var) {
        Iterator it;
        int i;
        long j3;
        f70 f70Var = new f70();
        if (b50Var == null) {
            return f70Var.c();
        }
        Iterator it2 = b50Var.iterator();
        while (it2.hasNext()) {
            l40 l40Var = (l40) it2.next();
            int iOrdinal = l40Var.a.ordinal();
            if (iOrdinal == 12) {
                it = it2;
                f70Var.b = t((lg8) l40Var);
            } else if (iOrdinal != 14) {
                f70Var.a(c(l40Var, m7fVar, j, j2));
                it = it2;
            } else {
                mke mkeVar = (mke) l40Var;
                lke lkeVar = mkeVar.e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (List<ike> list : lkeVar.a) {
                    jke jkeVar = new jke();
                    arrayList.add(jkeVar);
                    for (ike ikeVar : list) {
                        ps3 ps3Var = new ps3(3, arrayList2);
                        int i2 = ikeVar.a;
                        zic zicVar = ikeVar.e;
                        String strF = iic.f(i2);
                        int[] iArrH = qt4.H(5);
                        int length = iArrH.length;
                        int i3 = 0;
                        Iterator it3 = it2;
                        int i4 = 0;
                        while (i4 < length) {
                            int i5 = iArrH[i4];
                            int i6 = i4;
                            if (iic.k(i5).equals(strF)) {
                                i3 = i5;
                                break;
                            }
                            i4 = i6 + 1;
                        }
                        int i7 = i3 == 0 ? 5 : i3;
                        int iD = qt4.D(ikeVar.b);
                        int i8 = 1;
                        if (iD == 0) {
                            i = i8;
                        } else if (iD == 1) {
                            i = 2;
                        } else if (iD != 2) {
                            i8 = 4;
                            i = i8;
                        } else {
                            i = 3;
                        }
                        puc pucVar = ikeVar.d;
                        o60 o60Var = pucVar != null ? v(pucVar, null).b : null;
                        if (zicVar != null) {
                            ps3Var.accept(zicVar);
                            j3 = zicVar.a;
                        } else {
                            j3 = -1;
                        }
                        jkeVar.add(new hke(i7, i, ikeVar.c, o60Var, j3));
                        it2 = it3;
                    }
                }
                it = it2;
                if (tg4Var != null) {
                    tg4Var.accept(arrayList2);
                }
                f70Var.c = new kke(arrayList, mkeVar.d);
            }
            it2 = it;
        }
        return f70Var.c();
    }

    public static ax2 g(ka3 ka3Var) {
        if (ka3Var == null) {
            return null;
        }
        ax2 ax2Var = new ax2();
        ax2Var.i(ka3Var.b);
        ax2Var.g(ka3Var.d);
        ax2Var.k(ka3Var.c);
        ax2Var.j(ka3Var.f);
        ax2Var.h(ka3Var.e);
        return ax2Var.a();
    }

    public static cx2 h(ge3 ge3Var, cx2 cx2Var) {
        cx2 cx2Var2 = cx2.h;
        bx2 bx2Var = new bx2();
        bx2Var.a = ge3Var.b;
        Long l = ge3Var.c;
        if (l != null) {
            bx2Var.e = l.longValue();
        }
        ArrayList arrayList = ge3Var.a;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((a93) it.next()).ordinal();
                if (iOrdinal == 0) {
                    arrayList2.add(xw2.a);
                } else if (iOrdinal == 1) {
                    arrayList2.add(xw2.b);
                } else if (iOrdinal == 2) {
                    arrayList2.add(xw2.c);
                }
            }
        }
        if (bx2Var.b == null) {
            bx2Var.b = new ArrayList();
        }
        bx2Var.b.addAll(arrayList2);
        bx2Var.c = cx2Var.c;
        bx2Var.d = cx2Var.d;
        bx2Var.f = cx2Var.f;
        bx2Var.g = cx2Var.g;
        return new cx2(bx2Var);
    }

    public static ArrayList i(List list) {
        ei4 ei4Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ll4 ll4Var = (ll4) it.next();
            String str = ll4Var.a;
            String str2 = ll4Var.c;
            int iOrdinal = ll4Var.b.ordinal();
            if (iOrdinal == 0) {
                ei4Var = ei4.a;
            } else if (iOrdinal != 2) {
                ei4Var = iOrdinal != 3 ? null : ei4.d;
            } else {
                ei4Var = ei4.c;
            }
            arrayList.add(new fi4(str, ei4Var, str2));
        }
        return arrayList;
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        if (!p90.D(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dae daeVar = (dae) it.next();
                cae caeVar = daeVar.b;
                String str = daeVar.c;
                if (caeVar == cae.EMOJI && ch3.s(str)) {
                    arrayList.add(new e56(str));
                } else if (daeVar.b == cae.ANIMOJI) {
                    long j = daeVar.a;
                    if (j != 0) {
                        arrayList.add(new im(j));
                    }
                }
            }
        }
        return arrayList;
    }

    public static int k(eka ekaVar) {
        int iOrdinal;
        if (ekaVar == null || (iOrdinal = ekaVar.ordinal()) == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    public static ArrayList l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xw2 xw2Var = (xw2) it.next();
            if (xw2Var == xw2.a) {
                arrayList.add(a93.SOUND);
            } else if (xw2Var == xw2.b) {
                arrayList.add(a93.VIBRATION);
            } else if (xw2Var == xw2.c) {
                arrayList.add(a93.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList m(List list, m7f m7fVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fae faeVar = (fae) it.next();
                int i = faeVar.a;
                long j = faeVar.b;
                int iD = qt4.D(i);
                if (iD == 1) {
                    arrayList.add(new cmg(faeVar.c, j));
                } else if (iD != 2) {
                    Locale locale = Locale.ENGLISH;
                    gm0.q("pm9", "Unknown RecentItem " + faeVar);
                } else {
                    arrayList.add(new qm7(v(faeVar.d, m7fVar).b, j));
                }
            }
        }
        return arrayList;
    }

    public static wja n(xja xjaVar) {
        int iOrdinal;
        wja wjaVar = wja.ACTIVE;
        if (xjaVar == null || (iOrdinal = xjaVar.ordinal()) == 0) {
            return wjaVar;
        }
        if (iOrdinal == 1) {
            return wja.EDITED;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? wjaVar : wja.DELAYED_FIRE_ERROR;
        }
        return wja.DELETED;
    }

    public static clg o(dlg dlgVar) {
        int i;
        blg blgVar = new blg();
        blgVar.a = dlgVar.a;
        blgVar.b = dlgVar.b;
        blgVar.c = dlgVar.c;
        blgVar.d = dlgVar.d;
        blgVar.e = dlgVar.e;
        blgVar.f = dlgVar.f;
        blgVar.g = dlgVar.g;
        blgVar.h = dlgVar.h;
        blgVar.i = dlgVar.i;
        int iD = qt4.D(dlgVar.j);
        int i2 = 3;
        if (iD == 1) {
            i = 2;
        } else if (iD != 2) {
            i = iD != 3 ? 1 : 4;
        } else {
            i = 3;
        }
        blgVar.j = i;
        blgVar.k = dlgVar.k;
        blgVar.l = dlgVar.l;
        blgVar.m = dlgVar.m;
        int iD2 = qt4.D(dlgVar.n);
        if (iD2 == 1) {
            i2 = 2;
        } else if (iD2 != 2) {
            i2 = 1;
        }
        blgVar.n = i2;
        blgVar.o = dlgVar.o;
        return blgVar.a();
    }

    public static w60 p(clg clgVar) {
        int i;
        v60 v60Var = new v60();
        v60Var.k(clgVar.a);
        v60Var.o(clgVar.d);
        v60Var.q(clgVar.b);
        v60Var.e(clgVar.c);
        v60Var.g(clgVar.f);
        v60Var.d(clgVar.g);
        v60Var.m(clgVar.i);
        v60Var.h(clgVar.h);
        v60Var.n(clgVar.e);
        int iD = qt4.D(clgVar.j);
        int i2 = 3;
        if (iD == 1) {
            i = 2;
        } else if (iD != 2) {
            i = iD != 3 ? 1 : 4;
        } else {
            i = 3;
        }
        v60Var.l(i);
        v60Var.i(clgVar.k);
        v60Var.f(clgVar.l);
        v60Var.c(clgVar.m);
        int iD2 = qt4.D(clgVar.n);
        if (iD2 == 1) {
            i2 = 2;
        } else if (iD2 != 2) {
            i2 = 1;
        }
        v60Var.j(i2);
        v60Var.p(clgVar.o);
        return v60Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    public static pj4 q(vg4 vg4Var) {
        int i;
        int i2;
        int i3;
        gi4 gi4Var;
        kl4 kl4Var;
        long jV = vg4Var.v();
        li4 li4Var = vg4Var.a;
        ki4 ki4Var = li4Var.b;
        long j = ki4Var.g;
        String str = ki4Var.c;
        String str2 = ki4Var.d;
        List<fi4> list = ki4Var.f;
        ArrayList arrayList = new ArrayList();
        for (fi4 fi4Var : list) {
            String str3 = fi4Var.a;
            String str4 = fi4Var.b;
            int iOrdinal = fi4Var.c.ordinal();
            kl4 kl4Var2 = kl4.c;
            if (iOrdinal == 0) {
                kl4Var = kl4.a;
            } else if (iOrdinal != 2) {
                kl4Var = iOrdinal != 3 ? null : kl4Var2;
            } else {
                kl4Var = kl4.b;
            }
            if (kl4Var == null) {
                kl4Var = kl4Var2;
            }
            arrayList.add(new ll4(str3, kl4Var, str4));
        }
        zba zbaVar = null;
        long j2 = ki4Var.e;
        long j3 = ki4Var.h;
        ii4 ii4Var = li4Var.b.i;
        if (ii4Var == null) {
            i = 0;
        } else {
            int iOrdinal2 = ii4Var.ordinal();
            if (iOrdinal2 == 0) {
                i = 1;
            } else {
                if (iOrdinal2 != 1) {
                    qr7.i(ii4Var, " in ContactStatus", "No such value for ");
                    return null;
                }
                i = 2;
            }
        }
        int i4 = li4Var.b.j;
        if (i4 == 0) {
            i4 = 1;
        }
        int iD = qt4.D(i4);
        int i5 = iD != 1 ? iD != 2 ? 1 : 3 : 2;
        int i6 = li4Var.b.l;
        int iD2 = qt4.D(i6);
        if (iD2 != 0) {
            i2 = i;
            if (iD2 == 1) {
                i3 = 2;
            } else {
                if (iD2 != 2) {
                    c.f(tt2.m(i6), " in ContactInfo.Gender", "No such value for ");
                    return null;
                }
                i3 = 3;
            }
            String str5 = ki4Var.n;
            String str6 = ki4Var.o;
            String str7 = ki4Var.p;
            gi4Var = ki4Var.t;
            if (gi4Var == null) {
                zbaVar = new zba(gi4Var.a());
            }
            return new pj4(jV, j, str, str2, arrayList, j2, j3, i2, i5, i3, str5, str6, str7, zbaVar, ki4Var.u, ki4Var.w, vg4Var.s(), li4Var.b.y, ki4Var.z);
        }
        i2 = i;
        i3 = 1;
        String str8 = ki4Var.n;
        String str9 = ki4Var.o;
        String str10 = ki4Var.p;
        gi4Var = ki4Var.t;
        if (gi4Var == null) {
            zbaVar = new zba(gi4Var.a());
        }
        return new pj4(jV, j, str, str2, arrayList, j2, j3, i2, i5, i3, str8, str9, str10, zbaVar, ki4Var.u, ki4Var.w, vg4Var.s(), li4Var.b.y, ki4Var.z);
    }

    public static ArrayList r(List list) {
        bga bgaVar;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aga agaVar = (aga) it.next();
            if (agaVar != null) {
                Map map = agaVar.f;
                switch (agaVar.c.ordinal()) {
                    case 1:
                        bgaVar = bga.a;
                        break;
                    case 2:
                        bgaVar = bga.b;
                        break;
                    case 3:
                        bgaVar = bga.c;
                        break;
                    case 4:
                        bgaVar = bga.d;
                        break;
                    case 5:
                        bgaVar = bga.e;
                        break;
                    case 6:
                        bgaVar = bga.f;
                        break;
                    case 7:
                        bgaVar = bga.g;
                        break;
                    case 8:
                        bgaVar = bga.i;
                        break;
                    case 9:
                        bgaVar = bga.j;
                        break;
                    case 10:
                        bgaVar = bga.h;
                        break;
                    case 11:
                        bgaVar = bga.k;
                        break;
                    case 12:
                        bgaVar = bga.l;
                        break;
                    default:
                        continue;
                }
                arrayList.add(new cga(agaVar.a, agaVar.b, bgaVar, agaVar.d, agaVar.e, map == null ? null : new HashMap(map)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.HashMap] */
    public static ArrayList s(List list) {
        ega egaVar;
        ?? map;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cga cgaVar = (cga) it.next();
            if (cgaVar.b() == null) {
                gm0.W("pm9", "MessageElement is not valid -> %s", cgaVar.toString());
            } else {
                switch (cgaVar.c.ordinal()) {
                    case 0:
                        egaVar = ega.b;
                        break;
                    case 1:
                        egaVar = ega.c;
                        break;
                    case 2:
                        egaVar = ega.d;
                        break;
                    case 3:
                        egaVar = ega.e;
                        break;
                    case 4:
                        egaVar = ega.f;
                        break;
                    case 5:
                        egaVar = ega.g;
                        break;
                    case 6:
                        egaVar = ega.h;
                        break;
                    case 7:
                        egaVar = ega.k;
                        break;
                    case 8:
                        egaVar = ega.i;
                        break;
                    case 9:
                        egaVar = ega.j;
                        break;
                    case 10:
                        egaVar = ega.l;
                        break;
                    case 11:
                        egaVar = ega.m;
                        break;
                    default:
                        continue;
                }
                ega egaVar2 = egaVar;
                long j = cgaVar.a;
                String str = cgaVar.b;
                short s = (short) cgaVar.d;
                short s2 = (short) cgaVar.e;
                Map map2 = cgaVar.f;
                if (map2 == null || map2.size() == 0) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = new HashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (!(entry.getValue() instanceof Serializable)) {
                            ore.k("attribute must be Serializable");
                            return null;
                        }
                        map.put((String) entry.getKey(), (Serializable) entry.getValue());
                    }
                }
                arrayList.add(new aga(j, str, egaVar2, s, s2, map));
            }
        }
        return arrayList;
    }

    public static kg8 t(lg8 lg8Var) {
        j61 j61Var;
        jg8 jg8Var = new jg8();
        ArrayList<List> arrayList = (ArrayList) lg8Var.d.a;
        ArrayList arrayList2 = new ArrayList();
        for (List<d61> list : arrayList) {
            h61 h61Var = new h61();
            arrayList2.add(h61Var);
            for (d61 d61Var : list) {
                String str = d61Var.a.a;
                j61[] j61VarArr = j61.k;
                int length = j61VarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        j61Var = j61.UNKNOWN;
                        break;
                    }
                    j61Var = j61VarArr[i];
                    if (j61Var.a.equalsIgnoreCase(str)) {
                        break;
                    }
                    i++;
                }
                int iOrdinal = d61Var.c.ordinal();
                int i2 = 1;
                if (iOrdinal != 0) {
                    i2 = iOrdinal != 1 ? iOrdinal != 2 ? 4 : 3 : 2;
                }
                y51 y51Var = new y51(d61Var.b, j61Var, i2);
                y51Var.d = d61Var.d;
                y51Var.e = d61Var.e;
                y51Var.f = d61Var.f;
                y51Var.h = d61Var.g;
                h61Var.add(new c61(y51Var));
            }
        }
        jg8Var.a = arrayList2;
        jg8Var.b = lg8Var.e;
        return new kg8(jg8Var);
    }

    public static o60 u(puc pucVar, m7f m7fVar) {
        o60 o60Var = o60.l;
        n60 n60Var = new n60();
        String str = pucVar.d;
        byte[] bArr = pucVar.i;
        if (str != null) {
            n60Var.a = str;
        }
        String str2 = pucVar.e;
        if (str2 != null) {
            n60Var.b = str2;
        }
        Integer num = pucVar.f;
        if (num != null) {
            n60Var.c = num.intValue();
        }
        Integer num2 = pucVar.g;
        if (num2 != null) {
            n60Var.d = num2.intValue();
        }
        n60Var.e = pucVar.h;
        if (bArr != null && bArr.length > 0) {
            try {
                m7fVar.getClass();
                n60Var.f = bArr;
            } catch (Throwable unused) {
                n60Var.f = bArr;
            }
        }
        byte[] bArr2 = pucVar.j;
        if (bArr2 != null && bArr2.length > 0) {
            n60Var.g = bArr2;
        }
        Long l = pucVar.m;
        if (l != null) {
            n60Var.i = l.longValue();
        }
        String str3 = pucVar.l;
        if (str3 != null) {
            n60Var.j = str3;
        }
        String str4 = pucVar.k;
        if (str4 != null) {
            n60Var.h = str4;
        }
        n60Var.k = pucVar.n;
        return new o60(n60Var);
    }

    public static e70 v(puc pucVar, m7f m7fVar) {
        o60 o60VarU = u(pucVar, m7fVar);
        c60 c60Var = new c60();
        c60Var.l = UUID.randomUUID().toString();
        c60Var.a = y60.c;
        c60Var.n = pucVar.b;
        c60Var.A = pucVar.c;
        c60Var.b = o60VarU;
        return c60Var.a();
    }

    public static puc w(o60 o60Var) {
        if (o60Var == null) {
            return null;
        }
        String str = o60Var.a;
        String str2 = o60Var.k;
        String str3 = o60Var.h;
        String str4 = o60Var.j;
        String str5 = o60Var.b;
        String str6 = !ch3.r(str) ? o60Var.a : null;
        String str7 = !ch3.r(str5) ? str5 : null;
        int i = o60Var.c;
        Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = o60Var.d;
        Integer numValueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        boolean z = o60Var.e;
        byte[] bArr = o60Var.f;
        byte[] bArr2 = (bArr == null || bArr.length <= 0) ? null : bArr;
        byte[] bArr3 = o60Var.g;
        return new puc(str6, str7, numValueOf, numValueOf2, z, bArr2, (bArr3 == null || bArr3.length <= 0) ? null : bArr3, Long.valueOf(o60Var.i), !ch3.r(str4) ? str4 : null, !ch3.r(str3) ? str3 : null, false, false, !ch3.r(str2) ? str2 : null);
    }

    public static byte[] x(kja kjaVar) {
        if (kjaVar == null) {
            return null;
        }
        byte[] bArr = a.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        int size = kjaVar.b().size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            jja jjaVar = (jja) kjaVar.b().get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = jjaVar.b().a().toString();
            reactionData.type = jjaVar.b().b().h();
            messageReactionWithCount.count = jjaVar.a();
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = kjaVar.c();
        if (kjaVar.d() != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = kjaVar.d().a().toString();
            reactionData2.type = kjaVar.d().b().h();
            messageReactions.yourReaction = reactionData2;
        }
        return sia.toByteArray(messageReactions);
    }

    public static kja y(hja hjaVar, lja ljaVar) {
        if (hjaVar != null) {
            ArrayList arrayList = (ArrayList) hjaVar.a();
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    arrayList2.add(new jja(ljaVar.e(((eja) arrayList.get(i)).b()), ((eja) arrayList.get(i)).a()));
                }
                return new kja(arrayList2, hjaVar.b(), hjaVar.c() != null ? ljaVar.e(hjaVar.c()) : null);
            }
        }
        return null;
    }
}
