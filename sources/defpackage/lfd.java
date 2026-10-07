package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lfd {
    public final String a = lfd.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final e5d g;
    public final ifh h;

    public lfd(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, e5d e5dVar) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = e5dVar;
        this.h = new ifh(new a8d(8, e5dVar));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0264  */
    /* JADX WARN: Code duplicated, block: B:103:0x0268 A[Catch: all -> 0x0262, TryCatch #1 {all -> 0x0262, blocks: (B:92:0x0242, B:98:0x025d, B:103:0x0268, B:106:0x0271, B:109:0x027a), top: B:210:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0271 A[Catch: all -> 0x0262, TryCatch #1 {all -> 0x0262, blocks: (B:92:0x0242, B:98:0x025d, B:103:0x0268, B:106:0x0271, B:109:0x027a), top: B:210:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:109:0x027a A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #1 {all -> 0x0262, blocks: (B:92:0x0242, B:98:0x025d, B:103:0x0268, B:106:0x0271, B:109:0x027a), top: B:210:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x027f  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd A[Catch: all -> 0x02e1, TRY_ENTER, TryCatch #0 {all -> 0x02e1, blocks: (B:124:0x02cd, B:127:0x02d4, B:129:0x02da, B:147:0x030e, B:148:0x0316, B:149:0x031b), top: B:209:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d4 A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:124:0x02cd, B:127:0x02d4, B:129:0x02da, B:147:0x030e, B:148:0x0316, B:149:0x031b), top: B:209:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0305 A[Catch: all -> 0x036c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x036c, blocks: (B:122:0x02c5, B:143:0x0305, B:150:0x031c), top: B:224:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x030b  */
    /* JADX WARN: Code duplicated, block: B:147:0x030e A[Catch: all -> 0x02e1, TRY_ENTER, TryCatch #0 {all -> 0x02e1, blocks: (B:124:0x02cd, B:127:0x02d4, B:129:0x02da, B:147:0x030e, B:148:0x0316, B:149:0x031b), top: B:209:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0316 A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:124:0x02cd, B:127:0x02d4, B:129:0x02da, B:147:0x030e, B:148:0x0316, B:149:0x031b), top: B:209:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:150:0x031c A[Catch: all -> 0x036c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x036c, blocks: (B:122:0x02c5, B:143:0x0305, B:150:0x031c), top: B:224:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x035c  */
    /* JADX WARN: Code duplicated, block: B:164:0x035e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0361  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:210:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0257  */
    /* JADX WARN: Code duplicated, block: B:98:0x025d A[Catch: all -> 0x0262, TRY_ENTER, TryCatch #1 {all -> 0x0262, blocks: (B:92:0x0242, B:98:0x025d, B:103:0x0268, B:106:0x0271, B:109:0x027a), top: B:210:0x0242 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [au3] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29, types: [au3] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v12, types: [au3] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v18 */
    public final Comparable a(d3h d3hVar, f3h f3hVar, m06 m06Var, nq4 nq4Var) throws Throwable {
        kfd kfdVar;
        qx6 qx6Var;
        f3h f3hVar2;
        cf7 cf7Var;
        qx6 qx6Var2;
        d3h d3hVar2;
        e3h e3hVar;
        File file;
        e3h e3hVar2;
        sfe sfeVar;
        cf7 cf7Var2;
        f3h f3hVar3;
        e3h e3hVar3;
        File file2;
        ?? r4;
        au3 au3Var;
        String str;
        a4c a4cVar;
        File fileP;
        File file3;
        long jLongValue;
        i6a i6aVar;
        float f;
        float f2;
        float f3;
        float f4;
        Object objK0;
        e3h e3hVar4;
        au3 au3Var2;
        File file4;
        int iOrdinal;
        Uri uriFromFile;
        String str2;
        a4c a4cVar2;
        File file5;
        ?? r7;
        File file6;
        je9 je9Var = je9.f;
        if (nq4Var instanceof kfd) {
            kfdVar = (kfd) nq4Var;
            int i = kfdVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfdVar.n = i - Integer.MIN_VALUE;
            } else {
                kfdVar = new kfd(this, nq4Var);
            }
        } else {
            kfdVar = new kfd(this, nq4Var);
        }
        Object objK1 = kfdVar.l;
        hu4 hu4Var = hu4.a;
        int i2 = kfdVar.n;
        if (i2 == 0) {
            ch3.d0(objK1);
            long j = d3hVar.b;
            float f5 = d3hVar.c;
            float f6 = d3hVar.d;
            long jLongValue2 = ((Number) this.h.getValue()).longValue();
            float fU = oc9.u(f5, 0.0f, 1.0f);
            float fU2 = oc9.u(f6, 0.0f, 1.0f);
            if (j > 0 && fU2 > fU) {
                float f7 = j;
                float f8 = jLongValue2;
                if ((fU2 - fU) * f7 <= f8) {
                    qx6Var = new qx6(qx6.a(fU, fU2));
                } else {
                    float fU3 = oc9.u((f8 / f7) + fU, 0.0f, 1.0f);
                    qx6Var = new qx6(qx6.a(fU, fU3));
                    if (fU3 <= fU) {
                        qx6Var = null;
                    }
                }
            } else {
                qx6Var = null;
            }
            if (qx6Var == null) {
                String str3 = this.a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 == null || !a4cVar3.b(je9Var)) {
                    return null;
                }
                a4cVar3.c(je9Var, str3, "prepare video: invalid trim range", null);
                return null;
            }
            vh vhVar = (vh) this.d.getValue();
            Uri uri = d3hVar.a;
            kfdVar.d = d3hVar;
            f3hVar2 = f3hVar;
            kfdVar.e = f3hVar2;
            kfdVar.f = m06Var;
            kfdVar.g = qx6Var;
            kfdVar.n = 1;
            objK1 = yab.K0(((n0c) ((xhh) vhVar.c.getValue())).b(), new dn0(vhVar, uri, (lq4) null, 4), kfdVar);
            if (objK1 != hu4Var) {
                cf7Var = m06Var;
                qx6Var2 = qx6Var;
                d3hVar2 = d3hVar;
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                sfeVar = (sfe) kfdVar.i;
                e3hVar3 = kfdVar.h;
                qx6Var2 = kfdVar.g;
                cf7 cf7Var3 = kfdVar.f;
                f3h f3hVar4 = kfdVar.e;
                d3hVar2 = kfdVar.d;
                try {
                    ch3.d0(objK1);
                    f3hVar3 = f3hVar4;
                    cf7Var2 = cf7Var3;
                    try {
                        au3Var = (au3) objK1;
                        if (au3Var == null) {
                            try {
                                str = this.a;
                                a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "prepare video: overlay render failed", null);
                                }
                                au3.E(au3Var);
                                rel.b(e3hVar3.a);
                                boolean z = sfeVar.a;
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                r4 = au3Var;
                                e3hVar2 = e3hVar3;
                                file2 = null;
                                file = null;
                                au3.E(r4);
                                rel.b(e3hVar2.a);
                                if (!sfeVar.a) {
                                    if (file2.exists()) {
                                        file5 = file2;
                                    } else {
                                        file5 = file;
                                    }
                                    if (file5 != null) {
                                        file5.delete();
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            fileP = ((ju6) ((rs6) this.f.getValue())).p("story_video_" + System.currentTimeMillis(), "mp4");
                            try {
                                j3h j3hVar = (j3h) this.c.getValue();
                                Uri uri2 = d3hVar2.a;
                                Bitmap bitmap = (Bitmap) au3Var.K();
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (qx6Var2.a >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qx6Var2.a & 4294967295L));
                                boolean z2 = d3hVar2.e;
                                if (((Boolean) this.g.B().i()).booleanValue()) {
                                    try {
                                        jLongValue = ((Number) this.h.getValue()).longValue();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        file2 = fileP;
                                        e3hVar2 = e3hVar3;
                                        file = null;
                                        r4 = au3Var;
                                    }
                                } else {
                                    jLongValue = 0;
                                }
                                i6aVar = d3hVar2.i;
                                if (i6aVar != null) {
                                    f = i6aVar.c;
                                } else {
                                    f = 1.0f;
                                }
                                if (i6aVar != null) {
                                    f2 = i6aVar.d;
                                } else {
                                    f2 = 0.0f;
                                }
                                if (i6aVar != null) {
                                    f3 = i6aVar.a;
                                } else {
                                    f3 = 0.0f;
                                }
                                if (i6aVar != null) {
                                    f4 = i6aVar.b;
                                } else {
                                    f4 = 0.0f;
                                }
                                int i3 = d3hVar2.g;
                                int i4 = d3hVar2.h;
                                file = null;
                                try {
                                    kfdVar.d = null;
                                    kfdVar.e = f3hVar3;
                                    kfdVar.f = null;
                                    kfdVar.g = null;
                                    kfdVar.h = e3hVar3;
                                    kfdVar.i = au3Var;
                                    kfdVar.j = fileP;
                                    kfdVar.k = sfeVar;
                                    kfdVar.n = 3;
                                    try {
                                        file3 = fileP;
                                        try {
                                            objK0 = yab.K0(((tv9) j3hVar.c.getValue()).a, new i3h(j3hVar, uri2, file3, bitmap, z2, fIntBitsToFloat, fIntBitsToFloat2, jLongValue, f, f2, f3, f4, i3, i4, cf7Var2, null), kfdVar);
                                            if (objK0 != hu4Var) {
                                                e3hVar4 = e3hVar3;
                                                au3Var2 = au3Var;
                                                objK1 = objK0;
                                                file4 = file3;
                                                if (!((Boolean) objK1).booleanValue()) {
                                                    str2 = this.a;
                                                    a4cVar2 = gm0.f;
                                                    if (a4cVar2 == null) {
                                                        a4cVar2.c(je9Var, str2, "prepare video: transcode failed", null);
                                                    }
                                                    au3.E(au3Var2);
                                                    rel.b(e3hVar4.a);
                                                    if (sfeVar.a) {
                                                        return null;
                                                    }
                                                    return null;
                                                }
                                                iOrdinal = f3hVar3.ordinal();
                                                if (iOrdinal == 0) {
                                                    k0f k0fVar = (k0f) this.e.getValue();
                                                    file = null;
                                                    kfdVar.d = null;
                                                    kfdVar.e = null;
                                                    kfdVar.f = null;
                                                    kfdVar.g = null;
                                                    kfdVar.h = e3hVar4;
                                                    kfdVar.i = au3Var2;
                                                    kfdVar.j = file4;
                                                    kfdVar.k = sfeVar;
                                                    kfdVar.n = 4;
                                                    objK1 = k0fVar.a(file4, kfdVar);
                                                    if (objK1 != hu4Var) {
                                                        file2 = file4;
                                                        r4 = au3Var2;
                                                        e3hVar2 = e3hVar4;
                                                        uriFromFile = (Uri) objK1;
                                                        r7 = r4;
                                                        e3hVar4 = e3hVar2;
                                                        file4 = file2;
                                                    }
                                                } else {
                                                    if (iOrdinal != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    uriFromFile = Uri.fromFile(file4);
                                                    sfeVar.a = true;
                                                    file = null;
                                                    r7 = au3Var2;
                                                }
                                                au3.E(r7);
                                                rel.b(e3hVar4.a);
                                                if (!sfeVar.a) {
                                                    if (file4.exists()) {
                                                        file6 = file4;
                                                    } else {
                                                        file6 = file;
                                                    }
                                                    if (file6 != null) {
                                                        file6.delete();
                                                    }
                                                }
                                                return uriFromFile;
                                            }
                                            return hu4Var;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            file = null;
                                            r4 = au3Var;
                                            e3hVar2 = e3hVar3;
                                            file2 = file3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        file3 = fileP;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    file3 = fileP;
                                    r4 = au3Var;
                                    e3hVar2 = e3hVar3;
                                    file2 = file3;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                file3 = fileP;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            file = null;
                            r4 = au3Var;
                            e3hVar2 = e3hVar3;
                            file2 = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        file = null;
                        e3hVar2 = e3hVar3;
                        file2 = file;
                        r4 = file2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    e3hVar2 = e3hVar3;
                    file2 = null;
                    r4 = 0;
                    file = null;
                }
            } else if (i2 == 3) {
                sfeVar = kfdVar.k;
                file4 = kfdVar.j;
                au3 au3Var3 = (au3) kfdVar.i;
                e3hVar4 = kfdVar.h;
                f3hVar3 = kfdVar.e;
                try {
                    ch3.d0(objK1);
                    au3Var2 = au3Var3;
                    try {
                        try {
                            if (!((Boolean) objK1).booleanValue()) {
                                str2 = this.a;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null && a4cVar2.b(je9Var)) {
                                    a4cVar2.c(je9Var, str2, "prepare video: transcode failed", null);
                                }
                                au3.E(au3Var2);
                                rel.b(e3hVar4.a);
                                if (sfeVar.a || file4 == null) {
                                    return null;
                                }
                                if (!file4.exists()) {
                                    file4 = null;
                                }
                                if (file4 == null) {
                                    return null;
                                }
                                file4.delete();
                                return null;
                            }
                            iOrdinal = f3hVar3.ordinal();
                            if (iOrdinal == 0) {
                                k0f k0fVar2 = (k0f) this.e.getValue();
                                file = null;
                                try {
                                    kfdVar.d = null;
                                    kfdVar.e = null;
                                    kfdVar.f = null;
                                    kfdVar.g = null;
                                    kfdVar.h = e3hVar4;
                                    kfdVar.i = au3Var2;
                                    kfdVar.j = file4;
                                    kfdVar.k = sfeVar;
                                    kfdVar.n = 4;
                                    objK1 = k0fVar2.a(file4, kfdVar);
                                    if (objK1 != hu4Var) {
                                        file2 = file4;
                                        r4 = au3Var2;
                                        e3hVar2 = e3hVar4;
                                        uriFromFile = (Uri) objK1;
                                        r7 = r4;
                                        e3hVar4 = e3hVar2;
                                        file4 = file2;
                                    }
                                    return hu4Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    file2 = file4;
                                    r4 = au3Var2;
                                    e3hVar2 = e3hVar4;
                                }
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uriFromFile = Uri.fromFile(file4);
                                sfeVar.a = true;
                                file = null;
                                r7 = au3Var2;
                            }
                            au3.E(r7);
                            rel.b(e3hVar4.a);
                            if (!sfeVar.a) {
                                if (file4.exists()) {
                                    file6 = file4;
                                } else {
                                    file6 = file;
                                }
                                if (file6 != null) {
                                    file6.delete();
                                }
                            }
                            return uriFromFile;
                        } catch (Throwable th11) {
                            th = th11;
                            file2 = file4;
                            r4 = au3Var2;
                            e3hVar2 = e3hVar4;
                            file = null;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        file = null;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    file2 = file4;
                    r4 = au3Var3;
                    file = null;
                }
            } else {
                if (i2 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sfeVar = kfdVar.k;
                file2 = kfdVar.j;
                r4 = (au3) kfdVar.i;
                e3hVar2 = kfdVar.h;
                try {
                    ch3.d0(objK1);
                    file = null;
                    r4 = r4;
                    try {
                        uriFromFile = (Uri) objK1;
                        r7 = r4;
                        e3hVar4 = e3hVar2;
                        file4 = file2;
                        au3.E(r7);
                        rel.b(e3hVar4.a);
                        if (!sfeVar.a && file4 != null) {
                            if (file4.exists()) {
                                file6 = file4;
                            } else {
                                file6 = file;
                            }
                            if (file6 != null) {
                                file6.delete();
                            }
                        }
                        return uriFromFile;
                    } catch (Throwable th14) {
                        th = th14;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    file = null;
                }
            }
            au3.E(r4);
            rel.b(e3hVar2.a);
            if (!sfeVar.a && file2 != null) {
                if (file2.exists()) {
                    file5 = file2;
                } else {
                    file5 = file;
                }
                if (file5 != null) {
                    file5.delete();
                }
            }
            throw th;
        }
        qx6 qx6Var3 = kfdVar.g;
        cf7Var = kfdVar.f;
        f3h f3hVar5 = kfdVar.e;
        d3hVar2 = kfdVar.d;
        ch3.d0(objK1);
        f3hVar2 = f3hVar5;
        qx6Var2 = qx6Var3;
        e3h e3hVar5 = (e3h) objK1;
        if (e3hVar5 == null) {
            String str4 = this.a;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 == null || !a4cVar4.b(je9Var)) {
                return null;
            }
            a4cVar4.c(je9Var, str4, "prepare video: no representative frame", null);
            return null;
        }
        sfe sfeVar2 = new sfe();
        try {
            dyg dygVar = (dyg) this.b.getValue();
            try {
                Bitmap bitmap2 = e3hVar5.a;
                int i5 = e3hVar5.b;
                int i6 = e3hVar5.c;
                List list = d3hVar2.f;
                int i7 = d3hVar2.g;
                int i8 = d3hVar2.h;
                i6a i6aVar2 = d3hVar2.i;
                kfdVar.d = d3hVar2;
                kfdVar.e = f3hVar2;
                kfdVar.f = cf7Var;
                kfdVar.g = qx6Var2;
                kfdVar.h = e3hVar5;
                kfdVar.i = sfeVar2;
                e3hVar = e3hVar5;
                try {
                    kfdVar.n = 2;
                    try {
                        Object objK2 = yab.K0(((n0c) ((xhh) dygVar.d.getValue())).a(), new byg(dygVar, bitmap2, i5, i6, list, i7, i8, i6aVar2, null), kfdVar);
                        if (objK2 != hu4Var) {
                            objK1 = objK2;
                            sfeVar = sfeVar2;
                            cf7Var2 = cf7Var;
                            f3hVar3 = f3hVar2;
                            e3hVar3 = e3hVar;
                            au3Var = (au3) objK1;
                            if (au3Var == null) {
                                str = this.a;
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, str, "prepare video: overlay render failed", null);
                                }
                                au3.E(au3Var);
                                rel.b(e3hVar3.a);
                                boolean z3 = sfeVar.a;
                                return null;
                            }
                            fileP = ((ju6) ((rs6) this.f.getValue())).p("story_video_" + System.currentTimeMillis(), "mp4");
                            j3h j3hVar2 = (j3h) this.c.getValue();
                            Uri uri3 = d3hVar2.a;
                            Bitmap bitmap3 = (Bitmap) au3Var.K();
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (qx6Var2.a >> 32));
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (qx6Var2.a & 4294967295L));
                            boolean z4 = d3hVar2.e;
                            if (((Boolean) this.g.B().i()).booleanValue()) {
                                jLongValue = ((Number) this.h.getValue()).longValue();
                            } else {
                                jLongValue = 0;
                            }
                            i6aVar = d3hVar2.i;
                            if (i6aVar != null) {
                                f = i6aVar.c;
                            } else {
                                f = 1.0f;
                            }
                            if (i6aVar != null) {
                                f2 = i6aVar.d;
                            } else {
                                f2 = 0.0f;
                            }
                            if (i6aVar != null) {
                                f3 = i6aVar.a;
                            } else {
                                f3 = 0.0f;
                            }
                            if (i6aVar != null) {
                                f4 = i6aVar.b;
                            } else {
                                f4 = 0.0f;
                            }
                            int i9 = d3hVar2.g;
                            int i10 = d3hVar2.h;
                            file = null;
                            kfdVar.d = null;
                            kfdVar.e = f3hVar3;
                            kfdVar.f = null;
                            kfdVar.g = null;
                            kfdVar.h = e3hVar3;
                            kfdVar.i = au3Var;
                            kfdVar.j = fileP;
                            kfdVar.k = sfeVar;
                            kfdVar.n = 3;
                            file3 = fileP;
                            objK0 = yab.K0(((tv9) j3hVar2.c.getValue()).a, new i3h(j3hVar2, uri3, file3, bitmap3, z4, fIntBitsToFloat3, fIntBitsToFloat4, jLongValue, f, f2, f3, f4, i9, i10, cf7Var2, null), kfdVar);
                            if (objK0 != hu4Var) {
                                e3hVar4 = e3hVar3;
                                au3Var2 = au3Var;
                                objK1 = objK0;
                                file4 = file3;
                                if (!((Boolean) objK1).booleanValue()) {
                                    str2 = this.a;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 == null) {
                                        a4cVar2.c(je9Var, str2, "prepare video: transcode failed", null);
                                    }
                                    au3.E(au3Var2);
                                    rel.b(e3hVar4.a);
                                    if (sfeVar.a) {
                                        return null;
                                    }
                                    return null;
                                }
                                iOrdinal = f3hVar3.ordinal();
                                if (iOrdinal == 0) {
                                    k0f k0fVar3 = (k0f) this.e.getValue();
                                    file = null;
                                    kfdVar.d = null;
                                    kfdVar.e = null;
                                    kfdVar.f = null;
                                    kfdVar.g = null;
                                    kfdVar.h = e3hVar4;
                                    kfdVar.i = au3Var2;
                                    kfdVar.j = file4;
                                    kfdVar.k = sfeVar;
                                    kfdVar.n = 4;
                                    objK1 = k0fVar3.a(file4, kfdVar);
                                    if (objK1 != hu4Var) {
                                        file2 = file4;
                                        r4 = au3Var2;
                                        e3hVar2 = e3hVar4;
                                        uriFromFile = (Uri) objK1;
                                        r7 = r4;
                                        e3hVar4 = e3hVar2;
                                        file4 = file2;
                                    }
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    uriFromFile = Uri.fromFile(file4);
                                    sfeVar.a = true;
                                    file = null;
                                    r7 = au3Var2;
                                }
                                au3.E(r7);
                                rel.b(e3hVar4.a);
                                if (!sfeVar.a) {
                                    if (file4.exists()) {
                                        file6 = file4;
                                    } else {
                                        file6 = file;
                                    }
                                    if (file6 != null) {
                                        file6.delete();
                                    }
                                }
                                return uriFromFile;
                                file2 = file4;
                                r4 = au3Var2;
                                e3hVar2 = e3hVar4;
                                au3.E(r4);
                                rel.b(e3hVar2.a);
                                if (!sfeVar.a) {
                                    if (file2.exists()) {
                                        file5 = file2;
                                    } else {
                                        file5 = file;
                                    }
                                    if (file5 != null) {
                                        file5.delete();
                                    }
                                }
                                throw th;
                            }
                        }
                        return hu4Var;
                    } catch (Throwable th16) {
                        th = th16;
                        file = null;
                        e3hVar2 = e3hVar;
                        sfeVar = sfeVar2;
                        file2 = file;
                        r4 = file2;
                        au3.E(r4);
                        rel.b(e3hVar2.a);
                        if (!sfeVar.a) {
                            if (file2.exists()) {
                                file5 = file2;
                            } else {
                                file5 = file;
                            }
                            if (file5 != null) {
                                file5.delete();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th17) {
                    th = th17;
                }
            } catch (Throwable th18) {
                th = th18;
                e3hVar = e3hVar5;
            }
        } catch (Throwable th19) {
            th = th19;
            e3hVar = e3hVar5;
        }
    }
}
