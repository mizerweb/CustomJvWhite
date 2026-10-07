package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class j3h {
    public final String a = j3h.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public j3h(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x030e  */
    /* JADX WARN: Code duplicated, block: B:135:0x031d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0326  */
    /* JADX WARN: Code duplicated, block: B:140:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x0351  */
    /* JADX WARN: Code duplicated, block: B:146:0x0357  */
    /* JADX WARN: Code duplicated, block: B:147:0x035a  */
    /* JADX WARN: Code duplicated, block: B:149:0x035e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0361  */
    /* JADX WARN: Code duplicated, block: B:152:0x0365  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:155:0x036c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0375  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [int] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public static final Object a(j3h j3hVar, Uri uri, Bitmap bitmap, h6a h6aVar, y5a y5aVar, long j, nq4 nq4Var) {
        h3h h3hVar;
        int i;
        ?? BooleanValue;
        int i2;
        ?? r13;
        long j2;
        x86 x86Var;
        int i3;
        ?? r22;
        Long l;
        ?? r23;
        Object poeVar;
        Throwable thA;
        Object obj;
        String str;
        g3h g3hVar;
        a4c a4cVar;
        ?? r24;
        ?? r25;
        ?? r26;
        ?? r27;
        ?? r28;
        Object obj2;
        h6a h6aVar2;
        long j3;
        int i4;
        int i5;
        stg stgVar;
        ?? r2;
        int i6;
        Object obj3;
        x86 x86Var2;
        Long l2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (nq4Var instanceof h3h) {
            h3hVar = (h3h) nq4Var;
            int i7 = h3hVar.m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                h3hVar.m = i7 - Integer.MIN_VALUE;
            } else {
                h3hVar = new h3h(j3hVar, nq4Var);
            }
        } else {
            h3hVar = new h3h(j3hVar, nq4Var);
        }
        Object obj4 = h3hVar.k;
        hu4 hu4Var = hu4.a;
        int i8 = h3hVar.m;
        if (i8 == 0) {
            ch3.d0(obj4);
            b5d b5dVar = j3hVar.c().P4;
            zv8[] zv8VarArr = e5d.S6;
            stg stgVar2 = (stg) b5dVar.a(zv8VarArr[303]).i();
            int iIntValue = ((Number) j3hVar.c().T4.a(zv8VarArr[307]).i()).intValue();
            if (y5aVar.b()) {
                if (iIntValue > 0) {
                    stgVar2 = new stg(stgVar2.a, stgVar2.b, iIntValue, stgVar2.d, stgVar2.e);
                }
                BooleanValue = 0;
                i = 0;
            } else {
                i = 1;
                BooleanValue = ((Boolean) j3hVar.c().S4.a(zv8VarArr[306]).i()).booleanValue();
            }
            stg stgVar3 = stgVar2;
            if (h6aVar.b) {
                i2 = 1;
                r13 = 0;
            } else {
                i2 = 0;
                r13 = y5aVar.c() ? false : h6aVar.c;
            }
            int width = bitmap.getWidth();
            j2 = 1000;
            int height = bitmap.getHeight();
            h3hVar.d = h6aVar;
            h3hVar.e = stgVar3;
            h3hVar.f = j;
            h3hVar.g = i;
            h3hVar.h = BooleanValue;
            h3hVar.i = i2;
            h3hVar.j = r13;
            h3hVar.m = 1;
            int i9 = stgVar3.a;
            ?? r19 = BooleanValue;
            int iMin = (int) Math.min(height >= 1080 ? 5222400 : 2304000, ((long) stgVar3.b) * 1000);
            int iMin2 = Math.min(width, height);
            if (iMin2 < 1) {
                iMin2 = 1;
            }
            int i10 = stgVar3.c;
            if (1 > i10 || i10 >= iMin2) {
                x86Var = new x86(width, height, iMin, i9);
            } else {
                float f = i10 / iMin2;
                x86Var = new x86(gm0.K(width * f), gm0.K(height * f), iMin, i9);
            }
            if (((Boolean) j3hVar.c().Q4.a(zv8VarArr[304]).i()).booleanValue()) {
                je9 je9Var = je9.f;
                try {
                    try {
                        if (s2f.d(x86Var.a, x86Var.b, "video/avc")) {
                            String str2 = j3hVar.a;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str2, "resolution fallback: encoder supporting " + x86Var.a + "x" + x86Var.b + ", using target", null);
                                }
                            }
                            i3 = i;
                            r27 = r13;
                        } else {
                            Point pointF = y3m.f((Context) j3hVar.b.getValue(), uri);
                            int i11 = pointF.x;
                            int i12 = pointF.y;
                            try {
                                if (i11 <= 0 || i12 <= 0) {
                                    i3 = i;
                                    r22 = r13;
                                    stgVar3 = stgVar3;
                                    String str3 = j3hVar.a;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        r26 = r22;
                                    } else {
                                        if (a4cVar3.b(je9Var)) {
                                            r26 = r22;
                                            l = null;
                                            try {
                                                a4cVar3.c(je9Var, str3, "resolution fallback: cannot read source dimensions, using target " + x86Var.a + "x" + x86Var.b, null);
                                                r25 = r22;
                                            } catch (Throwable th) {
                                                th = th;
                                                poeVar = new poe(th);
                                                r23 = r22;
                                            }
                                        }
                                        poeVar = x86Var;
                                        r23 = r25;
                                    }
                                    r26 = r22;
                                    l = null;
                                    r25 = r26;
                                    poeVar = x86Var;
                                    r23 = r25;
                                } else {
                                    try {
                                        long jA = bj8.a(i11, gm0.K(i11 / 0.5625f));
                                        long jA2 = bj8.a(gm0.K(i12 * 0.5625f), i12);
                                        i3 = i;
                                        if (((int) (jA & 4294967295L)) > i12) {
                                            jA = jA2;
                                        }
                                        try {
                                            int iMin3 = Math.min(x86Var.a, (int) (jA >> 32));
                                            r24 = r13;
                                            try {
                                                int iMin4 = Math.min(x86Var.b, (int) (jA & 4294967295L));
                                                boolean zD = s2f.d(iMin3, iMin4, "video/avc");
                                                String str4 = j3hVar.a;
                                                if (zD) {
                                                    a4c a4cVar4 = gm0.f;
                                                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                                        a4cVar4.c(je9Var, str4, "resolution fallback: encoder not supporting " + x86Var.a + "x" + x86Var.b + ", source=" + i11 + "x" + i12 + ", falling back to " + iMin3 + "x" + iMin4 + " (9:16, no upscale)", null);
                                                    }
                                                    l = null;
                                                    poeVar = new x86(iMin3, iMin4, x86Var.c, x86Var.d);
                                                    r23 = r24;
                                                } else {
                                                    a4c a4cVar5 = gm0.f;
                                                    if (a4cVar5 == null) {
                                                        r27 = r24;
                                                    } else if (a4cVar5.b(je9Var)) {
                                                        r27 = r24;
                                                        a4cVar5.c(je9Var, str4, "resolution fallback: fallback " + iMin3 + "x" + iMin4 + " also unsupported, using target", null);
                                                        r27 = r24;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r22 = r24;
                                                stgVar3 = stgVar3;
                                                l = null;
                                                poeVar = new poe(th);
                                                r23 = r22;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r22 = r13;
                                            stgVar3 = stgVar3;
                                            l = null;
                                            poeVar = new poe(th);
                                            r23 = r22;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                str = j3hVar.a;
                                                g3hVar = new g3h("resolution fallback: failed", thA);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, str, qt4.l("resolution fallback: target was ", x86Var.a, x86Var.b, "x"), g3hVar);
                                                }
                                            }
                                            obj = x86Var;
                                            r28 = r23;
                                            if (!(poeVar instanceof poe)) {
                                                obj = poeVar;
                                                r28 = r23;
                                            }
                                            obj2 = obj;
                                            if (obj2 == hu4Var) {
                                                return hu4Var;
                                            }
                                            h6aVar2 = h6aVar;
                                            j3 = j;
                                            i4 = i2;
                                            i5 = r19 == true ? 1 : 0;
                                            stgVar = stgVar3;
                                            r2 = r28;
                                            i6 = i3;
                                            obj3 = obj2;
                                            x86Var2 = (x86) obj3;
                                            if (j3 > 0) {
                                                long j4 = (j3 * j2) - (1000000 / ((long) x86Var2.d));
                                                l2 = new Long(j4 >= 0 ? j4 : 0L);
                                            } else {
                                                l2 = l;
                                            }
                                            boolean z6 = h6aVar2.i;
                                            boolean z7 = h6aVar2.j;
                                            if (((Boolean) j3hVar.c().R4.a(e5d.S6[305]).i()).booleanValue()) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            if (i6 != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (i5 != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (i4 != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (r2 != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            return new qzh(x86Var2, stgVar, l2, z2, z3, z, z6, z7, z4, z5);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i3 = i;
                                        r22 = r13;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                l = null;
                                poeVar = new poe(th);
                                r23 = r22;
                                thA = roe.a(poeVar);
                                if (thA != null) {
                                    str = j3hVar.a;
                                    g3hVar = new g3h("resolution fallback: failed", thA);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, str, qt4.l("resolution fallback: target was ", x86Var.a, x86Var.b, "x"), g3hVar);
                                    }
                                }
                                obj = x86Var;
                                r28 = r23;
                                if (!(poeVar instanceof poe)) {
                                    obj = poeVar;
                                    r28 = r23;
                                }
                                obj2 = obj;
                                if (obj2 == hu4Var) {
                                    return hu4Var;
                                }
                                h6aVar2 = h6aVar;
                                j3 = j;
                                i4 = i2;
                                i5 = r19 == true ? 1 : 0;
                                stgVar = stgVar3;
                                r2 = r28;
                                i6 = i3;
                                obj3 = obj2;
                                x86Var2 = (x86) obj3;
                                if (j3 > 0) {
                                    long j5 = (j3 * j2) - (1000000 / ((long) x86Var2.d));
                                    l2 = new Long(j5 >= 0 ? j5 : 0L);
                                } else {
                                    l2 = l;
                                }
                                boolean z8 = h6aVar2.i;
                                boolean z9 = h6aVar2.j;
                                if (((Boolean) j3hVar.c().R4.a(e5d.S6[305]).i()).booleanValue()) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (r2 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                return new qzh(x86Var2, stgVar, l2, z2, z3, z, z8, z9, z4, z5);
                            }
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                str = j3hVar.a;
                                g3hVar = new g3h("resolution fallback: failed", thA);
                                a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, qt4.l("resolution fallback: target was ", x86Var.a, x86Var.b, "x"), g3hVar);
                                }
                            }
                            obj = x86Var;
                            r28 = r23;
                            if (!(poeVar instanceof poe)) {
                                obj = poeVar;
                                r28 = r23;
                            }
                        }
                        r27 = r24;
                        stgVar3 = stgVar3;
                        r26 = r27;
                        r26 = r22;
                        l = null;
                        r25 = r26;
                        poeVar = x86Var;
                        r23 = r25;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i3 = i;
                }
                thA = roe.a(poeVar);
                if (thA != null) {
                    str = j3hVar.a;
                    g3hVar = new g3h("resolution fallback: failed", thA);
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str, qt4.l("resolution fallback: target was ", x86Var.a, x86Var.b, "x"), g3hVar);
                    }
                }
                obj = x86Var;
                r28 = r23;
                if (!(poeVar instanceof poe)) {
                    obj = poeVar;
                    r28 = r23;
                }
            } else {
                i3 = i;
                r28 = r13;
                stgVar3 = stgVar3;
                l = null;
                obj = x86Var;
            }
            obj2 = obj;
            if (obj2 == hu4Var) {
                return hu4Var;
            }
            h6aVar2 = h6aVar;
            j3 = j;
            i4 = i2;
            i5 = r19 == true ? 1 : 0;
            stgVar = stgVar3;
            r2 = r28;
            i6 = i3;
            obj3 = obj2;
        } else {
            if (i8 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = h3hVar.j;
            i4 = h3hVar.i;
            i5 = h3hVar.h;
            i6 = h3hVar.g;
            j3 = h3hVar.f;
            stg stgVar4 = h3hVar.e;
            h6aVar2 = h3hVar.d;
            ch3.d0(obj4);
            l = null;
            stgVar = stgVar4;
            j2 = 1000;
            obj3 = obj4;
            r2 = i13;
        }
        x86Var2 = (x86) obj3;
        if (j3 > 0) {
            long j6 = (j3 * j2) - (1000000 / ((long) x86Var2.d));
            l2 = new Long(j6 >= 0 ? j6 : 0L);
        } else {
            l2 = l;
        }
        boolean z10 = h6aVar2.i;
        boolean z11 = h6aVar2.j;
        if (((Boolean) j3hVar.c().R4.a(e5d.S6[305]).i()).booleanValue() || x86Var2.b <= x86Var2.a) {
            z = false;
        } else {
            z = true;
        }
        if (i6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i5 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new qzh(x86Var2, stgVar, l2, z2, z3, z, z10, z11, z4, z5);
    }

    public static final Object b(j3h j3hVar, w5a w5aVar, Bitmap bitmap, qzh qzhVar, i3h i3hVar) {
        j3hVar.getClass();
        x86 x86Var = qzhVar.a;
        w5aVar.d = new rx9(x86Var.a, x86Var.b, x86Var.c, 0, x86Var.d, qzhVar.f, qzhVar.d, qzhVar.e, qzhVar.i, qzhVar.j, qzhVar.g, qzhVar.h, 8);
        Long l = qzhVar.c;
        if (l != null) {
            w5aVar.g = l.longValue();
        }
        return qyj.V(k66.a, new ja1(j3hVar, w5aVar.b(), qzhVar, bitmap, 15), i3hVar);
    }

    public final e5d c() {
        return (e5d) this.d.getValue();
    }
}
