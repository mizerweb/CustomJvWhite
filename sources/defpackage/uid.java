package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class uid {
    public final Context a;
    public final ny8 b;
    public final t51 c;
    public final ny8 d;

    public uid(Context context, ny8 ny8Var, t51 t51Var, ny8 ny8Var2) {
        this.a = context;
        this.b = ny8Var;
        this.c = t51Var;
        this.d = ny8Var2;
    }

    public static b70 a(fvi fviVar) {
        if (fviVar == null) {
            return null;
        }
        int i = b70.f;
        a70 a70Var = new a70(0);
        a70Var.a = fviVar.a;
        a70Var.b = fviVar.b;
        a70Var.c = fviVar.c;
        a70Var.d = fviVar.d;
        a70Var.e = fviVar.e;
        return new b70(a70Var);
    }

    public final boolean b(kp4 kp4Var) {
        return kp4Var.a <= ((long) ((Number) ((g5d) ((gjf) this.d.getValue())).a.q.a(e5d.S6[8]).i()).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0217  */
    /* JADX WARN: Code duplicated, block: B:112:0x0234  */
    /* JADX WARN: Code duplicated, block: B:114:0x0246  */
    /* JADX WARN: Code duplicated, block: B:117:0x0256  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x027d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x028d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:152:0x033b  */
    /* JADX WARN: Code duplicated, block: B:154:0x034b  */
    /* JADX WARN: Code duplicated, block: B:156:0x034f  */
    /* JADX WARN: Code duplicated, block: B:157:0x037b  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:164:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:166:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0426  */
    /* JADX WARN: Code duplicated, block: B:169:0x0469  */
    /* JADX WARN: Code duplicated, block: B:175:0x01c0 A[EDGE_INSN: B:175:0x01c0->B:85:0x01c0 BREAK  A[LOOP:0: B:78:0x01a7->B:83:0x01b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4 A[LOOP:0: B:78:0x01a7->B:83:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x037b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x01ea, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final zlc c(t2 t2Var, boolean z) {
        kp4 kp4VarB;
        boolean zB;
        String[] strArr;
        int i;
        a4c a4cVar;
        t2 qr6Var;
        String strA;
        int i2;
        zlc zlcVar;
        t2 q90Var;
        ny8 ny8Var;
        y60 y60Var;
        u60 u60Var;
        int i3;
        e70 e70VarA;
        b70 b70Var;
        mxi mxiVar;
        fvi fviVar;
        b70 b70VarA;
        if (t2Var instanceof q50) {
            return new zlc(t2Var, ((q50) t2Var).c);
        }
        je9 je9Var = je9.f;
        String strA2 = t2Var.a();
        if (ch3.r(strA2)) {
            gm0.q("uid", "uri string is empty or null");
            kp4VarB = null;
        } else {
            kp4VarB = ((h4c) ((c2a) this.b.getValue())).b(strA2);
        }
        boolean z2 = false;
        if (kp4VarB == null) {
            gm0.W("uid", "ContentUriParams is null, possibly not found file", new Object[0]);
            this.c.c(new rgf("file.local.get.content.uri"));
        } else if (kp4VarB.a == 0 && t2Var.a != 11) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "uid", "ContentUriParams not valid, file is empty: " + kp4VarB, null);
            }
            this.c.c(new rgf("file.local.max.zero.size"));
        } else {
            int i4 = t2Var.a;
            if (i4 == 1) {
                zB = b(kp4VarB);
            } else {
                zB = i4 == 3 || i4 == 11 || (!(z && (kp4VarB.a() || kp4VarB.b())) ? kp4VarB.a > ((Number) ((g5d) ((gjf) this.d.getValue())).a.G.a(e5d.S6[25]).i()).longValue() : kp4VarB.a() && !b(kp4VarB));
            }
            if (zB) {
                if (!ch3.r(kp4VarB.b)) {
                    Iterator it = ((List) ((g5d) ((gjf) this.d.getValue())).a.H.a(e5d.S6[26]).i()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            if (kp4VarB.b.toLowerCase().endsWith("." + str.toLowerCase())) {
                                this.c.c(new rgf("file.local.unsupported.media.type"));
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, "uid", "ContentUriParams not valid, unsupported media type: " + kp4VarB, null);
                                }
                            }
                        } else if (l21.k(this.a, Uri.parse(strA2))) {
                            strArr = rs6.a;
                            i = 0;
                            while (true) {
                                if (i < 12) {
                                    gm0.W("uid", "try to share private file", new Object[0]);
                                } else {
                                    if (strA2.contains(strArr[i])) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                } else if (t2Var.a == 7) {
                    this.c.c(new rgf("file.local.unsupported.media.type"));
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "uid", "ContentUriParams not valid, unsupported media type: " + kp4VarB, null);
                    }
                } else if (l21.k(this.a, Uri.parse(strA2))) {
                    strArr = rs6.a;
                    i = 0;
                    while (true) {
                        if (i < 12) {
                            gm0.W("uid", "try to share private file", new Object[0]);
                        } else {
                            if (strA2.contains(strArr[i])) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (kp4VarB == null) {
                    return null;
                }
                if (t2Var.a != 4) {
                    qr6Var = t2Var;
                } else if (kp4VarB.a()) {
                    qr6Var = new w6g(1, t2Var.a());
                } else if (kp4VarB.b()) {
                    qr6Var = new w6g(3, t2Var.a());
                } else {
                    gm0.W("uid", "resolveMultiMediaType: non-media content in collage, fallback to file: " + kp4VarB.c, new Object[0]);
                    qr6Var = new qr6(kp4VarB.a, t2Var.a(), kp4VarB.b);
                }
                if (ch3.r(kp4VarB.d)) {
                    strA = qr6Var.a();
                } else {
                    strA = kp4VarB.d;
                }
                i2 = qr6Var.a;
                if (i2 != 1 || i2 == 3 || i2 == 11 || (i2 == 7 && z && (kp4VarB.a() || kp4VarB.b()))) {
                    strA = ((h4c) ((c2a) this.b.getValue())).c(strA, kp4VarB.b);
                    if (strA == null) {
                        this.c.c(new rgf("file.local.create.uri.copy"));
                    }
                }
                if (i2 == 7) {
                    if (qr6Var.a().equals(strA)) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                zlcVar = null;
                                q90 q90Var2 = (q90) qr6Var;
                                q90Var = new q90(strA, q90Var2.c, q90Var2.d);
                            } else if (i2 != 3) {
                                zlcVar = null;
                                if (qr6Var instanceof mxi) {
                                    mxi mxiVar2 = (mxi) qr6Var;
                                    q90Var = new mxi(3, strA, mxiVar2.c, mxiVar2.d);
                                } else {
                                    qr6Var = new w6g(3, strA);
                                }
                            } else if (i2 != 11) {
                                lzi lziVar = (lzi) qr6Var;
                                zlcVar = null;
                                qr6Var = new lzi(strA, lziVar.c, lziVar.d, lziVar.e, lziVar.f, lziVar.g, lziVar.h);
                            }
                            qr6Var = q90Var;
                        } else {
                            zlcVar = null;
                            qr6Var = new w6g(1, strA);
                        }
                    }
                    ny8Var = this.b;
                    y60Var = y60.d;
                    u60Var = u60.e;
                    i3 = qr6Var.a;
                    if (i3 != 1) {
                        c2a c2aVar = (c2a) ny8Var.getValue();
                        String strA3 = qr6Var.a();
                        ((h4c) c2aVar).getClass();
                        Point pointC = sb8.C(strA3, true);
                        int i5 = pointC.x;
                        int i6 = pointC.y;
                        h4c h4cVar = (h4c) ((c2a) ny8Var.getValue());
                        h4cVar.getClass();
                        Point point = new Point(i5, i6);
                        g5d g5dVar = (g5d) h4cVar.c;
                        Point pointH = sb8.H(point, g5dVar.o(), g5dVar.m());
                        int i7 = pointH.x;
                        int i8 = pointH.y;
                        if (!ch3.r(kp4VarB.c) && kp4VarB.c.toLowerCase().endsWith("gif")) {
                            z2 = true;
                        }
                        n60 n60Var = new n60();
                        n60Var.c = i7;
                        n60Var.d = i8;
                        n60Var.e = z2;
                        o60 o60Var = new o60(n60Var);
                        c60 c60Var = new c60();
                        c60Var.b = o60Var;
                        c60Var.a = y60.c;
                        c60Var.i = u60Var;
                        c60Var.m = qr6Var.a();
                        e70VarA = c60Var.a();
                    } else if (i3 != 2) {
                        q90 q90Var3 = (q90) qr6Var;
                        a60 a60Var = new a60();
                        a60Var.c = q90Var3.c;
                        a60Var.d = q90Var3.d;
                        b60 b60Var = new b60(a60Var);
                        c60 c60Var2 = new c60();
                        c60Var2.e = b60Var;
                        c60Var2.a = y60.e;
                        c60Var2.i = u60Var;
                        c60Var2.m = q90Var3.b;
                        e70VarA = c60Var2.a();
                    } else if (i3 != 3) {
                        String strA4 = qr6Var.a();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        gm0.n("uid", "getVideoAttach: retrieve params started");
                        v2j v2jVarG = ((h4c) ((c2a) ny8Var.getValue())).g(strA4);
                        gm0.n("uid", "getVideoAttach: retrieve params finished " + (System.currentTimeMillis() - jCurrentTimeMillis));
                        long j = v2jVarG.d;
                        String str2 = v2jVarG.a;
                        if ((qr6Var instanceof mxi) || (fviVar = (mxiVar = (mxi) qr6Var).c) == null) {
                            b70Var = zlcVar;
                        } else {
                            b70VarA = a(fviVar);
                            j = (long) ((b70VarA.b - b70VarA.a) * j);
                            String str3 = mxiVar.d;
                            if (str3 != null) {
                                b70Var = b70VarA;
                                str2 = str3;
                                b70Var = b70VarA;
                            }
                        }
                        b70Var = b70VarA;
                        z60 z60Var = new z60();
                        z60Var.s = 1;
                        z60Var.b = j;
                        z60Var.e = v2jVarG.b;
                        z60Var.f = v2jVarG.c;
                        z60Var.d = str2;
                        z60Var.m = b70Var;
                        d70 d70Var = new d70(z60Var);
                        c60 c60Var3 = new c60();
                        c60Var3.d = d70Var;
                        c60Var3.a = y60Var;
                        c60Var3.i = u60Var;
                        c60Var3.m = strA4;
                        e70VarA = c60Var3.a();
                    } else if (i3 != 7) {
                        qr6 qr6Var2 = (qr6) qr6Var;
                        i60 i60Var = new i60();
                        i60Var.b = qr6Var2.c;
                        i60Var.c = qr6Var2.d;
                        j60 j60Var = new j60(i60Var);
                        c60 c60Var4 = new c60();
                        c60Var4.m = qr6Var2.b;
                        c60Var4.r = j60Var;
                        c60Var4.a = y60.j;
                        c60Var4.i = u60Var;
                        e70VarA = c60Var4.a();
                    } else {
                        if (i3 != 10) {
                            ore.m();
                            return zlcVar;
                        }
                        if (i3 == 11) {
                            ore.k(String.format(Locale.ENGLISH, "Unknown media type %s", qr6Var));
                            return zlcVar;
                        }
                        lzi lziVar2 = (lzi) qr6Var;
                        String str4 = lziVar2.b;
                        z60 z60Var2 = new z60();
                        z60Var2.s = 2;
                        z60Var2.b = lziVar2.e;
                        z60Var2.t = lziVar2.f;
                        z60Var2.e = lziVar2.c;
                        z60Var2.f = lziVar2.d;
                        z60Var2.d = lziVar2.g;
                        z60Var2.m = a(lziVar2.h);
                        d70 d70Var2 = new d70(z60Var2);
                        c60 c60Var5 = new c60();
                        c60Var5.d = d70Var2;
                        c60Var5.a = y60Var;
                        c60Var5.i = u60Var;
                        c60Var5.m = str4;
                        e70VarA = c60Var5.a();
                    }
                    return new zlc(qr6Var, e70VarA);
                }
                boolean zA = kp4VarB.a();
                boolean zB2 = kp4VarB.b();
                if (z || !(zA || zB2)) {
                    qr6Var = new qr6(kp4VarB.a, strA, kp4VarB.b);
                } else {
                    qr6Var = new w6g(zA ? 1 : 3, strA);
                }
                zlcVar = null;
                ny8Var = this.b;
                y60Var = y60.d;
                u60Var = u60.e;
                i3 = qr6Var.a;
                if (i3 != 1) {
                    c2a c2aVar2 = (c2a) ny8Var.getValue();
                    String strA5 = qr6Var.a();
                    ((h4c) c2aVar2).getClass();
                    Point pointC2 = sb8.C(strA5, true);
                    int i9 = pointC2.x;
                    int i10 = pointC2.y;
                    h4c h4cVar2 = (h4c) ((c2a) ny8Var.getValue());
                    h4cVar2.getClass();
                    Point point2 = new Point(i9, i10);
                    g5d g5dVar2 = (g5d) h4cVar2.c;
                    Point pointH2 = sb8.H(point2, g5dVar2.o(), g5dVar2.m());
                    int i11 = pointH2.x;
                    int i12 = pointH2.y;
                    if (!ch3.r(kp4VarB.c)) {
                        z2 = true;
                    }
                    n60 n60Var2 = new n60();
                    n60Var2.c = i11;
                    n60Var2.d = i12;
                    n60Var2.e = z2;
                    o60 o60Var2 = new o60(n60Var2);
                    c60 c60Var6 = new c60();
                    c60Var6.b = o60Var2;
                    c60Var6.a = y60.c;
                    c60Var6.i = u60Var;
                    c60Var6.m = qr6Var.a();
                    e70VarA = c60Var6.a();
                } else if (i3 != 2) {
                    q90 q90Var4 = (q90) qr6Var;
                    a60 a60Var2 = new a60();
                    a60Var2.c = q90Var4.c;
                    a60Var2.d = q90Var4.d;
                    b60 b60Var2 = new b60(a60Var2);
                    c60 c60Var7 = new c60();
                    c60Var7.e = b60Var2;
                    c60Var7.a = y60.e;
                    c60Var7.i = u60Var;
                    c60Var7.m = q90Var4.b;
                    e70VarA = c60Var7.a();
                } else if (i3 != 3) {
                    String strA6 = qr6Var.a();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    gm0.n("uid", "getVideoAttach: retrieve params started");
                    v2j v2jVarG2 = ((h4c) ((c2a) ny8Var.getValue())).g(strA6);
                    gm0.n("uid", "getVideoAttach: retrieve params finished " + (System.currentTimeMillis() - jCurrentTimeMillis2));
                    long j2 = v2jVarG2.d;
                    String str5 = v2jVarG2.a;
                    if (qr6Var instanceof mxi) {
                        b70Var = zlcVar;
                    } else {
                        b70Var = zlcVar;
                    }
                    b70Var = b70VarA;
                    z60 z60Var3 = new z60();
                    z60Var3.s = 1;
                    z60Var3.b = j2;
                    z60Var3.e = v2jVarG2.b;
                    z60Var3.f = v2jVarG2.c;
                    z60Var3.d = str5;
                    z60Var3.m = b70Var;
                    d70 d70Var3 = new d70(z60Var3);
                    c60 c60Var8 = new c60();
                    c60Var8.d = d70Var3;
                    c60Var8.a = y60Var;
                    c60Var8.i = u60Var;
                    c60Var8.m = strA6;
                    e70VarA = c60Var8.a();
                } else if (i3 != 7) {
                    qr6 qr6Var3 = (qr6) qr6Var;
                    i60 i60Var2 = new i60();
                    i60Var2.b = qr6Var3.c;
                    i60Var2.c = qr6Var3.d;
                    j60 j60Var2 = new j60(i60Var2);
                    c60 c60Var9 = new c60();
                    c60Var9.m = qr6Var3.b;
                    c60Var9.r = j60Var2;
                    c60Var9.a = y60.j;
                    c60Var9.i = u60Var;
                    e70VarA = c60Var9.a();
                } else {
                    if (i3 != 10) {
                        ore.m();
                        return zlcVar;
                    }
                    if (i3 == 11) {
                        ore.k(String.format(Locale.ENGLISH, "Unknown media type %s", qr6Var));
                        return zlcVar;
                    }
                    lzi lziVar3 = (lzi) qr6Var;
                    String str6 = lziVar3.b;
                    z60 z60Var4 = new z60();
                    z60Var4.s = 2;
                    z60Var4.b = lziVar3.e;
                    z60Var4.t = lziVar3.f;
                    z60Var4.e = lziVar3.c;
                    z60Var4.f = lziVar3.d;
                    z60Var4.d = lziVar3.g;
                    z60Var4.m = a(lziVar3.h);
                    d70 d70Var4 = new d70(z60Var4);
                    c60 c60Var10 = new c60();
                    c60Var10.d = d70Var4;
                    c60Var10.a = y60Var;
                    c60Var10.i = u60Var;
                    c60Var10.m = str6;
                    e70VarA = c60Var10.a();
                }
                return new zlc(qr6Var, e70VarA);
            }
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "uid", "ContentUriParams not valid, file is bigger than max upload size: " + kp4VarB, null);
            }
            this.c.c(new rgf("file.local.max.size.reached"));
        }
        kp4VarB = null;
        if (kp4VarB == null) {
            return null;
        }
        if (t2Var.a != 4) {
            qr6Var = t2Var;
        } else if (kp4VarB.a()) {
            qr6Var = new w6g(1, t2Var.a());
        } else if (kp4VarB.b()) {
            qr6Var = new w6g(3, t2Var.a());
        } else {
            gm0.W("uid", "resolveMultiMediaType: non-media content in collage, fallback to file: " + kp4VarB.c, new Object[0]);
            qr6Var = new qr6(kp4VarB.a, t2Var.a(), kp4VarB.b);
        }
        if (ch3.r(kp4VarB.d)) {
            strA = kp4VarB.d;
        } else {
            strA = qr6Var.a();
        }
        i2 = qr6Var.a;
        if (i2 != 1) {
            strA = ((h4c) ((c2a) this.b.getValue())).c(strA, kp4VarB.b);
            if (strA == null) {
                this.c.c(new rgf("file.local.create.uri.copy"));
            }
        } else {
            strA = ((h4c) ((c2a) this.b.getValue())).c(strA, kp4VarB.b);
            if (strA == null) {
                this.c.c(new rgf("file.local.create.uri.copy"));
            }
        }
        if (i2 == 7) {
            if (qr6Var.a().equals(strA)) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        zlcVar = null;
                        q90 q90Var5 = (q90) qr6Var;
                        q90Var = new q90(strA, q90Var5.c, q90Var5.d);
                    } else if (i2 != 3) {
                        zlcVar = null;
                        if (qr6Var instanceof mxi) {
                            mxi mxiVar3 = (mxi) qr6Var;
                            q90Var = new mxi(3, strA, mxiVar3.c, mxiVar3.d);
                        } else {
                            qr6Var = new w6g(3, strA);
                        }
                    } else if (i2 != 11) {
                        lzi lziVar4 = (lzi) qr6Var;
                        zlcVar = null;
                        qr6Var = new lzi(strA, lziVar4.c, lziVar4.d, lziVar4.e, lziVar4.f, lziVar4.g, lziVar4.h);
                    }
                    qr6Var = q90Var;
                } else {
                    zlcVar = null;
                    qr6Var = new w6g(1, strA);
                }
            }
            ny8Var = this.b;
            y60Var = y60.d;
            u60Var = u60.e;
            i3 = qr6Var.a;
            if (i3 != 1) {
                c2a c2aVar3 = (c2a) ny8Var.getValue();
                String strA7 = qr6Var.a();
                ((h4c) c2aVar3).getClass();
                Point pointC3 = sb8.C(strA7, true);
                int i13 = pointC3.x;
                int i14 = pointC3.y;
                h4c h4cVar3 = (h4c) ((c2a) ny8Var.getValue());
                h4cVar3.getClass();
                Point point3 = new Point(i13, i14);
                g5d g5dVar3 = (g5d) h4cVar3.c;
                Point pointH3 = sb8.H(point3, g5dVar3.o(), g5dVar3.m());
                int i15 = pointH3.x;
                int i16 = pointH3.y;
                if (!ch3.r(kp4VarB.c)) {
                    z2 = true;
                }
                n60 n60Var3 = new n60();
                n60Var3.c = i15;
                n60Var3.d = i16;
                n60Var3.e = z2;
                o60 o60Var3 = new o60(n60Var3);
                c60 c60Var11 = new c60();
                c60Var11.b = o60Var3;
                c60Var11.a = y60.c;
                c60Var11.i = u60Var;
                c60Var11.m = qr6Var.a();
                e70VarA = c60Var11.a();
            } else if (i3 != 2) {
                q90 q90Var6 = (q90) qr6Var;
                a60 a60Var3 = new a60();
                a60Var3.c = q90Var6.c;
                a60Var3.d = q90Var6.d;
                b60 b60Var3 = new b60(a60Var3);
                c60 c60Var12 = new c60();
                c60Var12.e = b60Var3;
                c60Var12.a = y60.e;
                c60Var12.i = u60Var;
                c60Var12.m = q90Var6.b;
                e70VarA = c60Var12.a();
            } else if (i3 != 3) {
                String strA8 = qr6Var.a();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                gm0.n("uid", "getVideoAttach: retrieve params started");
                v2j v2jVarG3 = ((h4c) ((c2a) ny8Var.getValue())).g(strA8);
                gm0.n("uid", "getVideoAttach: retrieve params finished " + (System.currentTimeMillis() - jCurrentTimeMillis3));
                long j3 = v2jVarG3.d;
                String str7 = v2jVarG3.a;
                if (qr6Var instanceof mxi) {
                    b70Var = zlcVar;
                } else {
                    b70Var = zlcVar;
                }
                b70Var = b70VarA;
                z60 z60Var5 = new z60();
                z60Var5.s = 1;
                z60Var5.b = j3;
                z60Var5.e = v2jVarG3.b;
                z60Var5.f = v2jVarG3.c;
                z60Var5.d = str7;
                z60Var5.m = b70Var;
                d70 d70Var5 = new d70(z60Var5);
                c60 c60Var13 = new c60();
                c60Var13.d = d70Var5;
                c60Var13.a = y60Var;
                c60Var13.i = u60Var;
                c60Var13.m = strA8;
                e70VarA = c60Var13.a();
            } else if (i3 != 7) {
                qr6 qr6Var4 = (qr6) qr6Var;
                i60 i60Var3 = new i60();
                i60Var3.b = qr6Var4.c;
                i60Var3.c = qr6Var4.d;
                j60 j60Var3 = new j60(i60Var3);
                c60 c60Var14 = new c60();
                c60Var14.m = qr6Var4.b;
                c60Var14.r = j60Var3;
                c60Var14.a = y60.j;
                c60Var14.i = u60Var;
                e70VarA = c60Var14.a();
            } else {
                if (i3 != 10) {
                    ore.m();
                    return zlcVar;
                }
                if (i3 == 11) {
                    ore.k(String.format(Locale.ENGLISH, "Unknown media type %s", qr6Var));
                    return zlcVar;
                }
                lzi lziVar5 = (lzi) qr6Var;
                String str8 = lziVar5.b;
                z60 z60Var6 = new z60();
                z60Var6.s = 2;
                z60Var6.b = lziVar5.e;
                z60Var6.t = lziVar5.f;
                z60Var6.e = lziVar5.c;
                z60Var6.f = lziVar5.d;
                z60Var6.d = lziVar5.g;
                z60Var6.m = a(lziVar5.h);
                d70 d70Var6 = new d70(z60Var6);
                c60 c60Var15 = new c60();
                c60Var15.d = d70Var6;
                c60Var15.a = y60Var;
                c60Var15.i = u60Var;
                c60Var15.m = str8;
                e70VarA = c60Var15.a();
            }
            return new zlc(qr6Var, e70VarA);
        }
        boolean zA2 = kp4VarB.a();
        boolean zB3 = kp4VarB.b();
        if (z) {
            qr6Var = new qr6(kp4VarB.a, strA, kp4VarB.b);
        } else {
            qr6Var = new qr6(kp4VarB.a, strA, kp4VarB.b);
        }
        zlcVar = null;
        ny8Var = this.b;
        y60Var = y60.d;
        u60Var = u60.e;
        i3 = qr6Var.a;
        if (i3 != 1) {
            c2a c2aVar4 = (c2a) ny8Var.getValue();
            String strA9 = qr6Var.a();
            ((h4c) c2aVar4).getClass();
            Point pointC4 = sb8.C(strA9, true);
            int i17 = pointC4.x;
            int i18 = pointC4.y;
            h4c h4cVar4 = (h4c) ((c2a) ny8Var.getValue());
            h4cVar4.getClass();
            Point point4 = new Point(i17, i18);
            g5d g5dVar4 = (g5d) h4cVar4.c;
            Point pointH4 = sb8.H(point4, g5dVar4.o(), g5dVar4.m());
            int i19 = pointH4.x;
            int i110 = pointH4.y;
            if (!ch3.r(kp4VarB.c)) {
                z2 = true;
            }
            n60 n60Var4 = new n60();
            n60Var4.c = i19;
            n60Var4.d = i110;
            n60Var4.e = z2;
            o60 o60Var4 = new o60(n60Var4);
            c60 c60Var16 = new c60();
            c60Var16.b = o60Var4;
            c60Var16.a = y60.c;
            c60Var16.i = u60Var;
            c60Var16.m = qr6Var.a();
            e70VarA = c60Var16.a();
        } else if (i3 != 2) {
            q90 q90Var7 = (q90) qr6Var;
            a60 a60Var4 = new a60();
            a60Var4.c = q90Var7.c;
            a60Var4.d = q90Var7.d;
            b60 b60Var4 = new b60(a60Var4);
            c60 c60Var17 = new c60();
            c60Var17.e = b60Var4;
            c60Var17.a = y60.e;
            c60Var17.i = u60Var;
            c60Var17.m = q90Var7.b;
            e70VarA = c60Var17.a();
        } else if (i3 != 3) {
            String strA10 = qr6Var.a();
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            gm0.n("uid", "getVideoAttach: retrieve params started");
            v2j v2jVarG4 = ((h4c) ((c2a) ny8Var.getValue())).g(strA10);
            gm0.n("uid", "getVideoAttach: retrieve params finished " + (System.currentTimeMillis() - jCurrentTimeMillis4));
            long j4 = v2jVarG4.d;
            String str9 = v2jVarG4.a;
            if (qr6Var instanceof mxi) {
                b70Var = zlcVar;
            } else {
                b70Var = zlcVar;
            }
            b70Var = b70VarA;
            z60 z60Var7 = new z60();
            z60Var7.s = 1;
            z60Var7.b = j4;
            z60Var7.e = v2jVarG4.b;
            z60Var7.f = v2jVarG4.c;
            z60Var7.d = str9;
            z60Var7.m = b70Var;
            d70 d70Var7 = new d70(z60Var7);
            c60 c60Var18 = new c60();
            c60Var18.d = d70Var7;
            c60Var18.a = y60Var;
            c60Var18.i = u60Var;
            c60Var18.m = strA10;
            e70VarA = c60Var18.a();
        } else if (i3 != 7) {
            qr6 qr6Var5 = (qr6) qr6Var;
            i60 i60Var4 = new i60();
            i60Var4.b = qr6Var5.c;
            i60Var4.c = qr6Var5.d;
            j60 j60Var4 = new j60(i60Var4);
            c60 c60Var19 = new c60();
            c60Var19.m = qr6Var5.b;
            c60Var19.r = j60Var4;
            c60Var19.a = y60.j;
            c60Var19.i = u60Var;
            e70VarA = c60Var19.a();
        } else {
            if (i3 != 10) {
                ore.m();
                return zlcVar;
            }
            if (i3 == 11) {
                ore.k(String.format(Locale.ENGLISH, "Unknown media type %s", qr6Var));
                return zlcVar;
            }
            lzi lziVar6 = (lzi) qr6Var;
            String str10 = lziVar6.b;
            z60 z60Var8 = new z60();
            z60Var8.s = 2;
            z60Var8.b = lziVar6.e;
            z60Var8.t = lziVar6.f;
            z60Var8.e = lziVar6.c;
            z60Var8.f = lziVar6.d;
            z60Var8.d = lziVar6.g;
            z60Var8.m = a(lziVar6.h);
            d70 d70Var8 = new d70(z60Var8);
            c60 c60Var110 = new c60();
            c60Var110.d = d70Var8;
            c60Var110.a = y60Var;
            c60Var110.i = u60Var;
            c60Var110.m = str10;
            e70VarA = c60Var110.a();
        }
        return new zlc(qr6Var, e70VarA);
    }
}
