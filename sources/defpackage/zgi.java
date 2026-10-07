package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.util.List;
import one.me.sdk.transfer.domain.UploadException;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zgi {
    public final u1i a;
    public final ny8 b;
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
    public final b9b p;
    public final String c = zgi.class.getName();
    public final l9b o = new l9b();

    public zgi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, u1i u1iVar, ny8 ny8Var12) {
        this.a = u1iVar;
        this.b = ny8Var12;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        this.l = ny8Var9;
        this.m = ny8Var10;
        this.n = ny8Var11;
        long[] jArr = q1f.a;
        this.p = new b9b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(zgi zgiVar, ahi ahiVar, nq4 nq4Var) {
        ggi ggiVar;
        Object poeVar;
        Object poeVar2;
        je9 je9Var = je9.d;
        if (nq4Var instanceof ggi) {
            ggiVar = (ggi) nq4Var;
            int i = ggiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggiVar.g = i - Integer.MIN_VALUE;
            } else {
                ggiVar = new ggi(zgiVar, nq4Var);
            }
        } else {
            ggiVar = new ggi(zgiVar, nq4Var);
        }
        Object objG = ggiVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ggiVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(objG);
                qki qkiVar = (qki) zgiVar.h.getValue();
                ggiVar.d = ahiVar;
                ggiVar.g = 1;
                objG = qkiVar.g(ahiVar, ggiVar);
                if (objG == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ahiVar = ggiVar.d;
                ch3.d0(objG);
            }
            poeVar = (vfi) objG;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        vfi vfiVar = (vfi) poeVar;
        String str = zgiVar.c;
        if (vfiVar != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null || !a4cVar.b(je9Var)) {
                return vfiVar;
            }
            a4cVar.c(je9Var, str, "Found upload in repository = " + vfiVar, null);
            return vfiVar;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str, "No upload in repository, created new", null);
        }
        int i3 = vfi.l;
        ufi ufiVar = new ufi();
        ufiVar.a = ahiVar;
        ufiVar.g = jji.UPLOADING;
        try {
            poeVar2 = Long.valueOf(new File(ahiVar.a).length());
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        if (poeVar2 instanceof poe) {
            poeVar2 = 0L;
        }
        ufiVar.f = ((Number) poeVar2).longValue();
        ufiVar.j = System.currentTimeMillis();
        return new vfi(ufiVar);
    }

    public static final Object b(zgi zgiVar, vfi vfiVar, nq4 nq4Var) {
        je9 je9Var = je9.d;
        String str = zgiVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "prepareFilesForUpload of upload=" + vfiVar, null);
        }
        String str2 = vfiVar.b;
        if (str2 != null && str2.length() != 0) {
            String str3 = zgiVar.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, qv1.k("prepareFilesForUpload: path already prepared=", vfiVar.b), null);
            }
            return vfiVar;
        }
        kp4 kp4VarB = ((h4c) ((c2a) zgiVar.a.e.getValue())).b(vfiVar.a.a);
        if (kp4VarB == null) {
            gm0.Y(zgiVar.c, "ContentUriParams are null during preparing");
            qrc.m(zgiVar.h(), lii.URI_PARAMS_NULL, vfiVar.a.d, null, 28);
            throw new UploadException("failed to prepare upload files");
        }
        if (kp4VarB.a == 0) {
            gm0.Y(zgiVar.c, "ContentUriParams are created with zero length");
            qrc.m(zgiVar.h(), lii.URI_PARAMS_EMPTY, vfiVar.a.d, null, 28);
            throw new UploadException("content is zero length");
        }
        String str4 = kp4VarB.d;
        if (str4 != null && str4.length() != 0) {
            ufi ufiVarB = vfiVar.b();
            ufiVarB.c = kp4VarB.b;
            ufiVarB.b = kp4VarB.d;
            ufiVarB.f = kp4VarB.a;
            return new vfi(ufiVarB);
        }
        String str5 = zgiVar.c;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str5, "prepareFilesForUpload: need copy for upload=" + vfiVar.a, null);
        }
        return zgiVar.g(vfiVar, kp4VarB, nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object c(zgi zgiVar, vfi vfiVar, nq4 nq4Var) throws Throwable {
        igi igiVar;
        hih lrgVar;
        hih h3bVar;
        vfi vfiVar2;
        vfi vfiVar3;
        Integer num;
        vfi vfiVar4 = vfiVar;
        je9 je9Var = je9.d;
        if (nq4Var instanceof igi) {
            igiVar = (igi) nq4Var;
            int i = igiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                igiVar.g = i - Integer.MIN_VALUE;
            } else {
                igiVar = new igi(zgiVar, nq4Var);
            }
        } else {
            igiVar = new igi(zgiVar, nq4Var);
        }
        Object objO = igiVar.e;
        Object obj = hu4.a;
        int i2 = igiVar.g;
        int i3 = 2;
        if (i2 == 0) {
            ch3.d0(objO);
            String str = vfiVar4.d;
            if (str != null && str.length() != 0) {
                String str2 = zgiVar.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "requestUploadUrl: already has upload url for=" + vfiVar4, null);
                }
                mii miiVarH = zgiVar.h();
                String str3 = vfiVar4.a.d;
                Object objN = n(vfiVar4);
                miiVarH.getClass();
                long[] jArr = q1f.a;
                b9b b9bVar = new b9b();
                b9bVar.k("warm_url", 1);
                if (objN != null) {
                    b9bVar.k(CandidateTypeHintConfig.TYPE_HOST, objN);
                }
                miiVarH.h(b9bVar, str3);
                Integer numM = m(vfiVar4);
                if (numM != null) {
                    mii miiVarH2 = zgiVar.h();
                    String str4 = vfiVar4.a.d;
                    miiVarH2.getClass();
                    miiVarH2.h(p90.O(numM, "backend"), str4);
                }
                return vfiVar4;
            }
            String str5 = zgiVar.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str5, "requestUploadUrl: requesting uploadUrl for=" + vfiVar4, null);
            }
            ahi ahiVar = vfiVar4.a;
            oji ojiVar = ahiVar.c;
            String str6 = ahiVar.a;
            switch (ojiVar.ordinal()) {
                case 1:
                    lrgVar = new lrg(1, 0);
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 2:
                    h3bVar = new h3b(1, 1, Boolean.FALSE);
                    lrgVar = h3bVar;
                    ghb ghbVar2 = ew5.b;
                    long jO2 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO2, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 3:
                    h3bVar = new h3b(1, 1, Boolean.TRUE);
                    lrgVar = h3bVar;
                    ghb ghbVar3 = ew5.b;
                    long jO3 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO3, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 4:
                    lrgVar = new wy2((kfc) null, 26);
                    lrgVar.c(1, "count");
                    ghb ghbVar4 = ew5.b;
                    long jO4 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO4, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 5:
                    h3bVar = new lrg(3, (((Boolean) ((e5d) zgiVar.f.getValue()).A4.a(e5d.S6[288]).i()).booleanValue() && str6.endsWith(".ogg")) ? 1 : 0);
                    lrgVar = h3bVar;
                    ghb ghbVar5 = ew5.b;
                    long jO5 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO5, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 6:
                    lrgVar = new h3b((kfc) null, 25);
                    ghb ghbVar6 = ew5.b;
                    long jO6 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO6, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 7:
                    h3bVar = new lrg(2, ((Boolean) ((e5d) zgiVar.f.getValue()).B4.a(e5d.S6[289]).i()).booleanValue() ? 1 : 0);
                    lrgVar = h3bVar;
                    ghb ghbVar7 = ew5.b;
                    long jO7 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO7, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 8:
                    lrgVar = new h3b(2, 1, (Boolean) null);
                    ghb ghbVar8 = ew5.b;
                    long jO8 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO8, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                case 9:
                    lrgVar = new lrg(4, 0);
                    ghb ghbVar9 = ew5.b;
                    long jO9 = qe7.O(1, lw5.SECONDS);
                    igiVar.d = vfiVar4;
                    igiVar.g = 1;
                    objO = zgiVar.o(lrgVar, jO9, igiVar);
                    if (objO == obj) {
                        return obj;
                    }
                    break;
                default:
                    throw new UploadException("tamRequestFromUploadType, can't request url for unknown media type=" + ojiVar);
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vfiVar4 = igiVar.d;
            ch3.d0(objO);
        }
        kih kihVar = (kih) objO;
        if (kihVar instanceof f5j) {
            f5j f5jVar = (f5j) kihVar;
            List list = f5jVar.c;
            if (list == null) {
                ore.p("Required value was null.");
                return null;
            }
            g5j g5jVar = (g5j) list.get(0);
            ufi ufiVarB = vfiVar4.b();
            ufiVarB.d = g5jVar.a;
            bo boVar = new bo();
            boVar.a = g5jVar.c;
            boVar.b = g5jVar.b;
            ufiVarB.h = new zii(boVar);
            if (vfiVar4.a.c == oji.STORY_VIDEO || ((num = f5jVar.d) != null && num.intValue() == 1)) {
                i3 = 3;
            } else if (num != null) {
                num.intValue();
            }
            ufiVarB.i = new aji(i3);
            vfiVar3 = new vfi(ufiVarB);
        } else {
            if (kihVar instanceof ft6) {
                jt6 jt6Var = (jt6) ((ft6) kihVar).c.get(0);
                ufi ufiVarB2 = vfiVar4.b();
                String str7 = jt6Var.c;
                zgiVar.i(str7);
                ufiVarB2.d = str7;
                bo boVar2 = new bo();
                boVar2.a = jt6Var.b;
                boVar2.b = jt6Var.a;
                ufiVarB2.h = new zii(boVar2);
                vfiVar2 = new vfi(ufiVarB2);
            } else if (kihVar instanceof wvc) {
                ufi ufiVarB3 = vfiVar4.b();
                String str8 = ((wvc) kihVar).c;
                zgiVar.i(str8);
                ufiVarB3.d = str8;
                vfiVar2 = new vfi(ufiVarB3);
            } else {
                if (!(kihVar instanceof vmg)) {
                    qrc.m(zgiVar.h(), lii.UPLOAD_URL_RETRIEVE, vfiVar4.a.d, null, 28);
                    throw new UploadException("can't request url for unknown media type=" + vfiVar4.a.c);
                }
                ufi ufiVarB4 = vfiVar4.b();
                ufiVarB4.d = ((vmg) kihVar).c;
                vfiVar2 = new vfi(ufiVarB4);
            }
            vfiVar3 = vfiVar2;
        }
        mii miiVarH3 = zgiVar.h();
        String str9 = vfiVar3.a.d;
        String strN = n(vfiVar3);
        miiVarH3.getClass();
        long[] jArr2 = q1f.a;
        b9b b9bVar2 = new b9b();
        if (strN != null) {
            b9bVar2.k(CandidateTypeHintConfig.TYPE_HOST, strN);
        }
        qrc.k(miiVarH3, "url_retrieved", 1, str9, false, null, b9bVar2, 88);
        Integer numM2 = m(vfiVar3);
        if (numM2 != null) {
            mii miiVarH4 = zgiVar.h();
            String str10 = vfiVar3.a.d;
            miiVarH4.getClass();
            miiVarH4.h(p90.O(numM2, "backend"), str10);
        }
        return vfiVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024c, code lost:
    
        if (defpackage.rx8.u(r1, r9) == r10) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
    
        if (defpackage.rx8.u(r1, r9) == r10) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if (defpackage.e9i.N(r0, r9) == r10) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cc, code lost:
    
        if (defpackage.rx8.u(r1, r9) == r10) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.zgi r44, defpackage.vfi r45, java.lang.Throwable r46, long r47, defpackage.nq4 r49) {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgi.d(zgi, vfi, java.lang.Throwable, long, nq4):java.lang.Object");
    }

    public static final Integer m(vfi vfiVar) {
        aji ajiVar = vfiVar.i;
        int i = ajiVar != null ? ajiVar.a : 0;
        int i2 = i == 0 ? -1 : cgi.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 != 3) {
                ore.o();
                return null;
            }
        }
        return null;
    }

    public static final String n(vfi vfiVar) {
        Object poeVar;
        try {
            poeVar = URI.create(vfiVar.d).getHost();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        return (String) poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (k(r10, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.ahi r10, defpackage.nq4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dgi
            if (r0 == 0) goto L13
            r0 = r11
            dgi r0 = (defpackage.dgi) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            dgi r0 = new dgi
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.e
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ch3.d0(r11)
            goto L70
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r3
        L31:
            ahi r10 = r0.d
            defpackage.ch3.d0(r11)
            goto L65
        L37:
            defpackage.ch3.d0(r11)
            java.lang.String r11 = r9.c
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L41
            goto L5a
        L41:
            je9 r6 = defpackage.je9.d
            boolean r7 = r2.b(r6)
            if (r7 == 0) goto L5a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cancelling upload="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.c(r6, r11, r7, r3)
        L5a:
            r0.d = r10
            r0.g = r5
            java.lang.Object r11 = r9.l(r10, r0)
            if (r11 != r1) goto L65
            goto L6f
        L65:
            r0.d = r3
            r0.g = r4
            java.lang.Object r9 = r9.k(r10, r0)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgi.e(ahi, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) throws Throwable {
        egi egiVar;
        j9b j9bVar;
        int i;
        Throwable th;
        j9b j9bVar2;
        if (nq4Var instanceof egi) {
            egiVar = (egi) nq4Var;
            int i2 = egiVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                egiVar.h = i2 - Integer.MIN_VALUE;
            } else {
                egiVar = new egi(this, nq4Var);
            }
        } else {
            egiVar = new egi(this, nq4Var);
        }
        Object obj = egiVar.f;
        hu4 hu4Var = hu4.a;
        int i3 = egiVar.h;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                j9bVar = this.o;
                egiVar.d = j9bVar;
                i = 0;
                egiVar.e = 0;
                egiVar.h = 1;
                if (j9bVar.b(egiVar) != hu4Var) {
                }
                return hu4Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = egiVar.d;
                try {
                    ch3.d0(obj);
                    sbi sbiVar = sbi.a;
                    j9bVar2.g(null);
                    return sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = egiVar.e;
            j9b j9bVar3 = egiVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Clearing controller", null);
                }
            }
            this.p.g();
            qki qkiVar = (qki) this.h.getValue();
            egiVar.d = j9bVar;
            egiVar.e = i;
            egiVar.h = 2;
            if (qkiVar.d(egiVar) != hu4Var) {
                j9bVar2 = j9bVar;
                sbi sbiVar2 = sbi.a;
                j9bVar2.g(null);
                return sbiVar2;
            }
            return hu4Var;
        } catch (Throwable th3) {
            j9b j9bVar4 = j9bVar;
            th = th3;
            j9bVar2 = j9bVar4;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(vfi vfiVar, kp4 kp4Var, nq4 nq4Var) {
        fgi fgiVar;
        je9 je9Var = je9.d;
        if (nq4Var instanceof fgi) {
            fgiVar = (fgi) nq4Var;
            int i = fgiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fgiVar.h = i - Integer.MIN_VALUE;
            } else {
                fgiVar = new fgi(this, nq4Var);
            }
        } else {
            fgiVar = new fgi(this, nq4Var);
        }
        Object objV = fgiVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = fgiVar.h;
        if (i2 == 0) {
            ch3.d0(objV);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.k("copyFromUri: started for uri=", vfiVar.a.a), null);
            }
            i8f i8fVar = new i8f(this, vfiVar, kp4Var, 9);
            fgiVar.d = vfiVar;
            fgiVar.e = kp4Var;
            fgiVar.h = 1;
            objV = qyj.V(k66.a, i8fVar, fgiVar);
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kp4Var = fgiVar.e;
            vfiVar = fgiVar.d;
            ch3.d0(objV);
        }
        String str2 = (String) objV;
        if (!ku6.p(str2)) {
            qrc.m(h(), lii.URI_PARAMS_COPY_ERROR, vfiVar.a.d, null, 28);
            throw new UploadException("failed to copy file");
        }
        String str3 = this.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str3, qv1.k("copyFromUri: finished for uri=", vfiVar.a.a), null);
        }
        ufi ufiVarB = vfiVar.b();
        ufiVarB.b = str2;
        ufiVarB.c = kp4Var.b;
        ufiVarB.f = kp4Var.a;
        return new vfi(ufiVarB);
    }

    public final mii h() {
        return (mii) this.k.getValue();
    }

    public final void i(String str) {
        String host;
        try {
            host = Uri.parse(str).getHost();
        } catch (NullPointerException e) {
            String name = str.getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Не смогли извлечь host ".concat(str), e);
                }
            }
            host = null;
        }
        if (host != null) {
            ((bd5) this.b.getValue()).getClass();
        }
    }

    public final Object j(vfi vfiVar, lq4 lq4Var) {
        c01 c01Var;
        je9 je9Var = je9.d;
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "putInRepository: " + vfiVar, null);
        }
        qki qkiVar = (qki) this.h.getValue();
        String str2 = qkiVar.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "putUpload " + vfiVar, null);
        }
        qkiVar.f().a.put(vfiVar.a, vfiVar);
        kki kkiVarE = qkiVar.e();
        kkiVarE.getClass();
        sbi sbiVar = sbi.a;
        chi chiVar = new chi();
        ahi ahiVar = vfiVar.a;
        chiVar.b = ahiVar.d;
        bhi bhiVar = new bhi();
        bhiVar.a = ahiVar.a;
        bhiVar.c = ahiVar.c;
        bhiVar.b = ahiVar.b;
        chiVar.a = bhiVar;
        chiVar.c = vfiVar.b;
        chiVar.d = vfiVar.c;
        chiVar.e = vfiVar.d;
        chiVar.f = vfiVar.e;
        chiVar.g = vfiVar.f;
        chiVar.h = vfiVar.g;
        zii ziiVar = vfiVar.h;
        if (ziiVar == null) {
            c01Var = null;
        } else {
            c01Var = new c01();
            c01Var.c = ziiVar.b;
            c01Var.a = ziiVar.a;
            c01Var.b = ziiVar.c;
        }
        chiVar.i = c01Var;
        aji ajiVar = vfiVar.i;
        chiVar.j = ajiVar != null ? new bji(ajiVar.a) : null;
        chiVar.k = vfiVar.j;
        chiVar.l = vfiVar.k;
        nki nkiVar = (nki) kkiVarE;
        Object objI = ch3.I(lq4Var, nkiVar.a, false, true, new bad(nkiVar, 25, chiVar));
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ahi ahiVar, nq4 nq4Var) {
        hgi hgiVar;
        l9b l9bVar;
        if (nq4Var instanceof hgi) {
            hgiVar = (hgi) nq4Var;
            int i = hgiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hgiVar.h = i - Integer.MIN_VALUE;
            } else {
                hgiVar = new hgi(this, nq4Var);
            }
        } else {
            hgiVar = new hgi(this, nq4Var);
        }
        Object obj = hgiVar.f;
        int i2 = hgiVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            hgiVar.d = ahiVar;
            l9bVar = this.o;
            hgiVar.e = l9bVar;
            hgiVar.h = 1;
            Object objB = l9bVar.b(hgiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = hgiVar.e;
            ahi ahiVar2 = hgiVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            ahiVar = ahiVar2;
        }
        try {
            return (xx6) this.p.m(ahiVar);
        } finally {
            l9bVar.g(null);
        }
    }

    public final Object l(ahi ahiVar, nq4 nq4Var) {
        je9 je9Var = je9.d;
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "removeFromRepository: " + ahiVar, null);
        }
        qki qkiVar = (qki) this.h.getValue();
        sbi sbiVar = sbi.a;
        String str2 = qkiVar.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "removeUpload " + ahiVar, null);
        }
        kki kkiVarE = qkiVar.e();
        kkiVarE.getClass();
        Object objI = ch3.I(nq4Var, ((nki) kkiVarE).a, false, true, new lki(ahiVar.a, ahiVar.c, ahiVar.b));
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (defpackage.e9i.N(r8, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (defpackage.rx8.u(r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00be -> B:43:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d3 -> B:43:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.hih r11, long r12, defpackage.nq4 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgi.o(hih, long, nq4):java.lang.Object");
    }
}
