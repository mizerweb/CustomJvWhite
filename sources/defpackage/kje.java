package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class kje {
    public final e5d a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final String e = kje.class.getName();
    public final int[] f = {-10, -8, -7, -5, -4, -2, 0, 2, 4, 5, 7, 8, 10, -9, -6, -3, 3, 6, 9, -8, -3, 1, 5, 8, -7, 0, 4, 7, -6, -1, 3, 6};

    public kje(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, e5d e5dVar) {
        this.a = e5dVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    public final Object a(Bitmap bitmap, jje jjeVar) {
        Object objK0 = yab.K0(((n0c) d()).a(), new dtd(bitmap, this, null, 8), jjeVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, nq4 nq4Var) {
        hje hjeVar;
        String str2;
        Object objK0;
        String str3;
        Drawable drawable;
        Object objE;
        String str4;
        a4c a4cVar;
        je9 je9Var;
        if (nq4Var instanceof hje) {
            hjeVar = (hje) nq4Var;
            int i = hjeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hjeVar.h = i - Integer.MIN_VALUE;
            } else {
                hjeVar = new hje(this, nq4Var);
            }
        } else {
            hjeVar = new hje(this, nq4Var);
        }
        Object obj = hjeVar.f;
        Object obj2 = hu4.a;
        int i2 = hjeVar.h;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            str2 = "bg_theme_" + str;
            hjeVar.d = str;
            hjeVar.e = str2;
            hjeVar.h = 1;
            objK0 = yab.K0(((n0c) d()).b(), new dtd(this, str2, lq4Var, 9), hjeVar);
            if (objK0 != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            String str5 = hjeVar.e;
            String str6 = hjeVar.d;
            ch3.d0(obj);
            str2 = str5;
            str = str6;
            objK0 = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = hjeVar.e;
            ch3.d0(obj);
        }
        drawable = (Drawable) obj;
        if (drawable == null) {
            str4 = this.e;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str4, "could not get background, aborting save to file", null);
                }
            }
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        hjeVar.d = null;
        hjeVar.e = null;
        hjeVar.h = 3;
        objE = e(str3, drawableMutate, false, hjeVar);
        if (objE != obj2) {
            return obj2;
        }
        return objE;
        File file = (File) objK0;
        if (file != null) {
            return file;
        }
        hm0 hm0Var = new hm0(str);
        xt4 xt4VarB = ((n0c) d()).b();
        k9d k9dVar = new k9d(this, 22, hm0Var);
        hjeVar.d = null;
        hjeVar.e = str2;
        hjeVar.h = 2;
        Object objV = qyj.V(xt4VarB, k9dVar, hjeVar);
        if (objV != obj2) {
            String str7 = str2;
            obj = objV;
            str3 = str7;
            drawable = (Drawable) obj;
            if (drawable == null) {
                str4 = this.e;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str4, "could not get background, aborting save to file", null);
                    }
                }
                return null;
            }
            Drawable drawableMutate2 = drawable.mutate();
            hjeVar.d = null;
            hjeVar.e = null;
            hjeVar.h = 3;
            objE = e(str3, drawableMutate2, false, hjeVar);
            if (objE != obj2) {
                return objE;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, tri triVar, nq4 nq4Var) {
        ije ijeVar;
        String str2;
        if (nq4Var instanceof ije) {
            ijeVar = (ije) nq4Var;
            int i = ijeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijeVar.h = i - Integer.MIN_VALUE;
            } else {
                ijeVar = new ije(this, nq4Var);
            }
        } else {
            ijeVar = new ije(this, nq4Var);
        }
        Object objK0 = ijeVar.f;
        int i2 = ijeVar.h;
        lq4 lq4Var = null;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            str2 = "bg_gradient_v2_" + str;
            ijeVar.d = triVar;
            ijeVar.e = str2;
            ijeVar.h = 1;
            objK0 = yab.K0(((n0c) d()).b(), new dtd(this, str2, lq4Var, 9), ijeVar);
            if (objK0 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objK0);
                return objK0;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = ijeVar.e;
        triVar = ijeVar.d;
        ch3.d0(objK0);
        File file = (File) objK0;
        if (file != null) {
            return file;
        }
        Drawable ophVar = new oph(triVar);
        ijeVar.d = null;
        ijeVar.e = null;
        ijeVar.h = 2;
        Object objE = e(str2, ophVar, true, ijeVar);
        return objE == obj ? obj : objE;
    }

    public final xhh d() {
        return (xhh) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d A[Catch: all -> 0x0098, Exception -> 0x009c, TryCatch #7 {Exception -> 0x009c, all -> 0x0098, blocks: (B:64:0x017e, B:59:0x015d, B:39:0x0093, B:54:0x0121), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e A[Catch: all -> 0x0098, Exception -> 0x009c, PHI: r4 r7 r8 r9 r12
  0x017e: PHI (r4v3 int) = (r4v5 int), (r4v6 int) binds: [B:63:0x017b, B:58:0x015b] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r7v1 int) = (r7v3 int), (r7v4 int) binds: [B:63:0x017b, B:58:0x015b] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r8v1 boolean) = (r8v3 boolean), (r8v4 boolean) binds: [B:63:0x017b, B:58:0x015b] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r9v1 java.io.File) = (r9v2 java.io.File), (r9v3 java.io.File) binds: [B:63:0x017b, B:58:0x015b] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r12v4 wfe) = (r12v5 wfe), (r12v6 wfe) binds: [B:63:0x017b, B:58:0x015b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {Exception -> 0x009c, all -> 0x0098, blocks: (B:64:0x017e, B:59:0x015d, B:39:0x0093, B:54:0x0121), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hu4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object e(String str, Drawable drawable, boolean z, nq4 nq4Var) throws Throwable {
        jje jjeVar;
        wfe wfeVar;
        Bitmap bitmap;
        Drawable drawable2;
        boolean z2;
        wfe wfeVar2;
        wfe wfeVar3;
        File file;
        Bitmap bitmap2;
        File file2;
        boolean z3;
        int i;
        int i2;
        xt4 xt4VarB;
        k9d k9dVar;
        wfe wfeVar4;
        boolean z4;
        int i3;
        Bitmap bitmap3;
        Drawable drawable3;
        File file3;
        wfe wfeVar5;
        boolean z5;
        int i4;
        xt4 xt4VarA;
        k9d k9dVar2;
        if (nq4Var instanceof jje) {
            jjeVar = (jje) nq4Var;
            int i5 = jjeVar.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jjeVar.m = i5 - Integer.MIN_VALUE;
            } else {
                jjeVar = new jje(this, nq4Var);
            }
        } else {
            jjeVar = new jje(this, nq4Var);
        }
        Object objV = jjeVar.k;
        wfe wfeVar6 = hu4.a;
        int i6 = jjeVar.m;
        try {
            if (i6 == 0) {
                ch3.d0(objV);
                xt4 xt4VarB2 = ((n0c) d()).b();
                k9d k9dVar3 = new k9d(this, 23, str);
                drawable2 = drawable;
                jjeVar.d = drawable2;
                z2 = z;
                jjeVar.h = z2;
                jjeVar.m = 1;
                objV = qyj.V(xt4VarB2, k9dVar3, jjeVar);
                if (objV != wfeVar6) {
                }
                return wfeVar6;
            }
            if (i6 != 1) {
                try {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                i2 = jjeVar.j;
                                i3 = jjeVar.i;
                                z4 = jjeVar.h;
                                wfeVar4 = jjeVar.f;
                                file2 = jjeVar.e;
                                try {
                                    ch3.d0(objV);
                                    wfeVar2 = wfeVar4;
                                    z3 = z4;
                                    i = i3;
                                    xt4VarB = ((n0c) d()).b();
                                    k9dVar = new k9d(file2, 25, wfeVar2);
                                    jjeVar.d = null;
                                    jjeVar.e = file2;
                                    jjeVar.f = wfeVar2;
                                    jjeVar.g = null;
                                    jjeVar.h = z3;
                                    jjeVar.i = i;
                                    jjeVar.j = i2;
                                    jjeVar.m = 5;
                                    if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                        file = file2;
                                        wfeVar3 = wfeVar2;
                                    }
                                    return wfeVar6;
                                } catch (Exception e) {
                                    e = e;
                                    wfeVar = wfeVar4;
                                } catch (Throwable th) {
                                    th = th;
                                    wfeVar6 = wfeVar4;
                                    bitmap = (Bitmap) wfeVar6.a;
                                    if (bitmap != null) {
                                        rel.b(bitmap);
                                    }
                                    throw th;
                                }
                            } else {
                                if (i6 != 5) {
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                wfeVar = jjeVar.f;
                                file = jjeVar.e;
                                try {
                                    ch3.d0(objV);
                                    wfeVar3 = wfeVar;
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                            String str2 = this.e;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str2, "Failed to render text background", e);
                                }
                            }
                            Bitmap bitmap4 = (Bitmap) wfeVar.a;
                            if (bitmap4 != null) {
                                rel.b(bitmap4);
                            }
                            return null;
                        }
                        i2 = jjeVar.j;
                        i = jjeVar.i;
                        z3 = jjeVar.h;
                        wfe wfeVar7 = jjeVar.f;
                        File file4 = jjeVar.e;
                        ch3.d0(objV);
                        wfeVar2 = wfeVar7;
                        file2 = file4;
                        if (z3) {
                            bitmap3 = (Bitmap) wfeVar2.a;
                            jjeVar.d = null;
                            jjeVar.e = file2;
                            jjeVar.f = wfeVar2;
                            jjeVar.g = null;
                            jjeVar.h = z3;
                            jjeVar.i = i;
                            jjeVar.j = i2;
                            jjeVar.m = 4;
                            if (a(bitmap3, jjeVar) != wfeVar6) {
                                i3 = i;
                                z4 = z3;
                                wfeVar4 = wfeVar2;
                                wfeVar2 = wfeVar4;
                                z3 = z4;
                                i = i3;
                                xt4VarB = ((n0c) d()).b();
                                k9dVar = new k9d(file2, 25, wfeVar2);
                                jjeVar.d = null;
                                jjeVar.e = file2;
                                jjeVar.f = wfeVar2;
                                jjeVar.g = null;
                                jjeVar.h = z3;
                                jjeVar.i = i;
                                jjeVar.j = i2;
                                jjeVar.m = 5;
                                if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                    file = file2;
                                    wfeVar3 = wfeVar2;
                                }
                            }
                        } else {
                            xt4VarB = ((n0c) d()).b();
                            k9dVar = new k9d(file2, 25, wfeVar2);
                            jjeVar.d = null;
                            jjeVar.e = file2;
                            jjeVar.f = wfeVar2;
                            jjeVar.g = null;
                            jjeVar.h = z3;
                            jjeVar.i = i;
                            jjeVar.j = i2;
                            jjeVar.m = 5;
                            if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                file = file2;
                                wfeVar3 = wfeVar2;
                            }
                        }
                        return wfeVar6;
                        bitmap2 = (Bitmap) wfeVar3.a;
                        if (bitmap2 != null) {
                            rel.b(bitmap2);
                        }
                        return file;
                    }
                    i2 = jjeVar.j;
                    i4 = jjeVar.i;
                    z5 = jjeVar.h;
                    wfeVar5 = jjeVar.g;
                    wfeVar2 = jjeVar.f;
                    file3 = jjeVar.e;
                    drawable3 = jjeVar.d;
                    try {
                        ch3.d0(objV);
                        wfeVar5.a = objV;
                        Canvas canvas = new Canvas((Bitmap) wfeVar2.a);
                        drawable3.setBounds(0, 0, i4, i2);
                        xt4VarA = ((n0c) d()).a();
                        k9dVar2 = new k9d(drawable3, 24, canvas);
                        jjeVar.d = null;
                        jjeVar.e = file3;
                        jjeVar.f = wfeVar2;
                        jjeVar.g = null;
                        jjeVar.h = z5;
                        jjeVar.i = i4;
                        jjeVar.j = i2;
                        jjeVar.m = 3;
                        if (qyj.V(xt4VarA, k9dVar2, jjeVar) == wfeVar6) {
                            i = i4;
                            z3 = z5;
                            file2 = file3;
                            if (z3) {
                                bitmap3 = (Bitmap) wfeVar2.a;
                                jjeVar.d = null;
                                jjeVar.e = file2;
                                jjeVar.f = wfeVar2;
                                jjeVar.g = null;
                                jjeVar.h = z3;
                                jjeVar.i = i;
                                jjeVar.j = i2;
                                jjeVar.m = 4;
                                if (a(bitmap3, jjeVar) != wfeVar6) {
                                    i3 = i;
                                    z4 = z3;
                                    wfeVar4 = wfeVar2;
                                    wfeVar2 = wfeVar4;
                                    z3 = z4;
                                    i = i3;
                                    xt4VarB = ((n0c) d()).b();
                                    k9dVar = new k9d(file2, 25, wfeVar2);
                                    jjeVar.d = null;
                                    jjeVar.e = file2;
                                    jjeVar.f = wfeVar2;
                                    jjeVar.g = null;
                                    jjeVar.h = z3;
                                    jjeVar.i = i;
                                    jjeVar.j = i2;
                                    jjeVar.m = 5;
                                    if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                        file = file2;
                                        wfeVar3 = wfeVar2;
                                        bitmap2 = (Bitmap) wfeVar3.a;
                                        if (bitmap2 != null) {
                                            rel.b(bitmap2);
                                        }
                                        return file;
                                    }
                                }
                            } else {
                                xt4VarB = ((n0c) d()).b();
                                k9dVar = new k9d(file2, 25, wfeVar2);
                                jjeVar.d = null;
                                jjeVar.e = file2;
                                jjeVar.f = wfeVar2;
                                jjeVar.g = null;
                                jjeVar.h = z3;
                                jjeVar.i = i;
                                jjeVar.j = i2;
                                jjeVar.m = 5;
                                if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                    file = file2;
                                    wfeVar3 = wfeVar2;
                                    bitmap2 = (Bitmap) wfeVar3.a;
                                    if (bitmap2 != null) {
                                        rel.b(bitmap2);
                                    }
                                    return file;
                                }
                            }
                        }
                        return wfeVar6;
                    } catch (Exception e3) {
                        e = e3;
                        wfeVar = wfeVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        wfeVar6 = wfeVar2;
                        bitmap = (Bitmap) wfeVar6.a;
                        if (bitmap != null) {
                            rel.b(bitmap);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                boolean z6 = jjeVar.h;
                Drawable drawable4 = jjeVar.d;
                ch3.d0(objV);
                z2 = z6;
                drawable2 = drawable4;
            }
            file3 = (File) objV;
            vsg vsgVar = (vsg) this.a.V4.a(e5d.S6[309]).i();
            final int i7 = vsgVar.a;
            final int i8 = vsgVar.b;
            wfe wfeVar8 = new wfe();
            xt4 xt4VarA2 = ((n0c) d()).a();
            af7 af7Var = new af7() { // from class: gje
                @Override // defpackage.af7
                public final Object invoke() {
                    return Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                }
            };
            jjeVar.d = drawable2;
            jjeVar.e = file3;
            jjeVar.f = wfeVar8;
            jjeVar.g = wfeVar8;
            jjeVar.h = z2;
            jjeVar.i = i7;
            jjeVar.j = i8;
            jjeVar.m = 2;
            Object objV2 = qyj.V(xt4VarA2, af7Var, jjeVar);
            if (objV2 != wfeVar6) {
                i2 = i8;
                objV = objV2;
                i4 = i7;
                drawable3 = drawable2;
                wfeVar5 = wfeVar8;
                z5 = z2;
                wfeVar2 = wfeVar5;
                wfeVar5.a = objV;
                Canvas canvas2 = new Canvas((Bitmap) wfeVar2.a);
                drawable3.setBounds(0, 0, i4, i2);
                xt4VarA = ((n0c) d()).a();
                k9dVar2 = new k9d(drawable3, 24, canvas2);
                jjeVar.d = null;
                jjeVar.e = file3;
                jjeVar.f = wfeVar2;
                jjeVar.g = null;
                jjeVar.h = z5;
                jjeVar.i = i4;
                jjeVar.j = i2;
                jjeVar.m = 3;
                if (qyj.V(xt4VarA, k9dVar2, jjeVar) == wfeVar6) {
                    i = i4;
                    z3 = z5;
                    file2 = file3;
                    if (z3) {
                        bitmap3 = (Bitmap) wfeVar2.a;
                        jjeVar.d = null;
                        jjeVar.e = file2;
                        jjeVar.f = wfeVar2;
                        jjeVar.g = null;
                        jjeVar.h = z3;
                        jjeVar.i = i;
                        jjeVar.j = i2;
                        jjeVar.m = 4;
                        if (a(bitmap3, jjeVar) != wfeVar6) {
                            i3 = i;
                            z4 = z3;
                            wfeVar4 = wfeVar2;
                            wfeVar2 = wfeVar4;
                            z3 = z4;
                            i = i3;
                            xt4VarB = ((n0c) d()).b();
                            k9dVar = new k9d(file2, 25, wfeVar2);
                            jjeVar.d = null;
                            jjeVar.e = file2;
                            jjeVar.f = wfeVar2;
                            jjeVar.g = null;
                            jjeVar.h = z3;
                            jjeVar.i = i;
                            jjeVar.j = i2;
                            jjeVar.m = 5;
                            if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                                file = file2;
                                wfeVar3 = wfeVar2;
                                bitmap2 = (Bitmap) wfeVar3.a;
                                if (bitmap2 != null) {
                                    rel.b(bitmap2);
                                }
                                return file;
                            }
                        }
                    } else {
                        xt4VarB = ((n0c) d()).b();
                        k9dVar = new k9d(file2, 25, wfeVar2);
                        jjeVar.d = null;
                        jjeVar.e = file2;
                        jjeVar.f = wfeVar2;
                        jjeVar.g = null;
                        jjeVar.h = z3;
                        jjeVar.i = i;
                        jjeVar.j = i2;
                        jjeVar.m = 5;
                        if (qyj.V(xt4VarB, k9dVar, jjeVar) != wfeVar6) {
                            file = file2;
                            wfeVar3 = wfeVar2;
                            bitmap2 = (Bitmap) wfeVar3.a;
                            if (bitmap2 != null) {
                                rel.b(bitmap2);
                            }
                            return file;
                        }
                    }
                }
            }
            return wfeVar6;
        } catch (Exception e4) {
            e = e4;
            wfeVar = 1;
        } catch (Throwable th4) {
            th = th4;
            wfeVar6 = 1;
        }
    }
}
