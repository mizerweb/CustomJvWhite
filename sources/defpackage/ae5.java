package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ae5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = ae5.class.getName();

    public ae5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[Catch: all -> 0x0079, TryCatch #4 {all -> 0x0079, blocks: (B:33:0x006e, B:35:0x0074, B:38:0x007b), top: B:69:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0 A[Catch: all -> 0x00b5, TryCatch #1 {all -> 0x00b5, blocks: (B:54:0x00aa, B:56:0x00b0, B:59:0x00b7), top: B:67:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ae5 ae5Var, Bitmap bitmap, nq4 nq4Var) {
        zd5 zd5Var;
        Exception e;
        wfe wfeVar;
        File file;
        Object poeVar;
        Object obj;
        String str;
        a4c a4cVar;
        je9 je9Var;
        File file2;
        Object poeVar2;
        Object obj2;
        if (nq4Var instanceof zd5) {
            zd5Var = (zd5) nq4Var;
            int i = zd5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zd5Var.g = i - Integer.MIN_VALUE;
            } else {
                zd5Var = new zd5(ae5Var, nq4Var);
            }
        } else {
            zd5Var = new zd5(ae5Var, nq4Var);
        }
        Object obj3 = zd5Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = zd5Var.g;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj3);
            try {
                xt4 xt4VarB = ((n0c) ((xhh) ae5Var.e.getValue())).b();
                wre wreVar = new wre(ae5Var, wfeVarP, bitmap, 14);
                zd5Var.d = wfeVarP;
                zd5Var.g = 1;
                Object objV = qyj.V(xt4VarB, wreVar, zd5Var);
                if (objV == hu4Var) {
                    return hu4Var;
                }
                obj3 = objV;
                wfeVar = wfeVarP;
            } catch (CancellationException e2) {
                e = e2;
                wfeVar = wfeVarP;
                file2 = (File) wfeVar.a;
                if (file2 != null) {
                    poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                    obj2 = Boolean.FALSE;
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj2;
                    }
                }
                throw e;
            } catch (Exception e3) {
                e = e3;
                wfeVar = wfeVarP;
                file = (File) wfeVar.a;
                if (file != null) {
                    poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                    obj = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj;
                    }
                }
                str = ae5Var.f;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Failed to save story preview", e);
                    }
                }
                return null;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = zd5Var.d;
            try {
                ch3.d0(obj3);
            } catch (CancellationException e4) {
                e = e4;
                file2 = (File) wfeVar.a;
                if (file2 != null) {
                    try {
                        poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                    } catch (Throwable th) {
                        poeVar2 = new poe(th);
                    }
                    obj2 = Boolean.FALSE;
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj2;
                    }
                }
                throw e;
            } catch (Exception e5) {
                e = e5;
                file = (File) wfeVar.a;
                if (file != null) {
                    try {
                        poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                    } catch (Throwable th2) {
                        poeVar = new poe(th2);
                    }
                    obj = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj;
                    }
                }
                str = ae5Var.f;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Failed to save story preview", e);
                    }
                }
                return null;
            }
        }
        return (File) obj3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0185 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0117, B:78:0x0135, B:81:0x013c, B:82:0x013e, B:85:0x0145, B:87:0x014b, B:77:0x012f, B:90:0x0158, B:100:0x0176, B:103:0x017d, B:104:0x017f, B:106:0x0185, B:108:0x018b, B:109:0x0190, B:99:0x0170, B:27:0x0056, B:46:0x00d8, B:70:0x011d, B:72:0x0123, B:75:0x012a, B:92:0x015e, B:94:0x0164, B:97:0x016b), top: B:112:0x002a, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[ADDED_TO_REGION, Catch: all -> 0x0061, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0117, B:78:0x0135, B:81:0x013c, B:82:0x013e, B:85:0x0145, B:87:0x014b, B:77:0x012f, B:90:0x0158, B:100:0x0176, B:103:0x017d, B:104:0x017f, B:106:0x0185, B:108:0x018b, B:109:0x0190, B:99:0x0170, B:27:0x0056, B:46:0x00d8, B:70:0x011d, B:72:0x0123, B:75:0x012a, B:92:0x015e, B:94:0x0164, B:97:0x016b), top: B:112:0x002a, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0123 A[Catch: all -> 0x0128, TryCatch #3 {all -> 0x0128, blocks: (B:70:0x011d, B:72:0x0123, B:75:0x012a), top: B:113:0x011d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0145 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:68:0x0117, B:78:0x0135, B:81:0x013c, B:82:0x013e, B:85:0x0145, B:87:0x014b, B:77:0x012f, B:90:0x0158, B:100:0x0176, B:103:0x017d, B:104:0x017f, B:106:0x0185, B:108:0x018b, B:109:0x0190, B:99:0x0170, B:27:0x0056, B:46:0x00d8, B:70:0x011d, B:72:0x0123, B:75:0x012a, B:92:0x015e, B:94:0x0164, B:97:0x016b), top: B:112:0x002a, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164 A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:92:0x015e, B:94:0x0164, B:97:0x016b), top: B:115:0x015e, outer: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v40, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, wfe] */
    /* JADX WARN: Type inference failed for: r4v14, types: [wfe] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [wfe] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [wfe] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final Object b(Uri uri, bxg bxgVar, ArrayList arrayList, String str, nq4 nq4Var) throws Throwable {
        yd5 yd5Var;
        ?? r4;
        ?? r3;
        wfe wfeVar;
        wfe wfeVar2;
        String str2;
        wfe wfeVar3;
        ?? r5;
        wfe wfeVar4;
        Exception exc;
        File file;
        Object poeVar;
        Object obj;
        String str3;
        a4c a4cVar;
        CancellationException cancellationException;
        File file2;
        Object poeVar2;
        Object obj2;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        if (nq4Var instanceof yd5) {
            yd5Var = (yd5) nq4Var;
            int i = yd5Var.j;
            r4 = -2147483648;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd5Var.j = i - Integer.MIN_VALUE;
            } else {
                yd5Var = new yd5(this, nq4Var);
            }
        } else {
            yd5Var = new yd5(this, nq4Var);
        }
        yd5 yd5Var2 = yd5Var;
        Object objV = yd5Var2.h;
        hu4 hu4Var = hu4.a;
        int i2 = yd5Var2.j;
        try {
            try {
                if (i2 == 0) {
                    wfe wfeVarP = nbh.p(objV);
                    wfeVar = new wfe();
                    try {
                        dyg dygVar = (dyg) this.a.getValue();
                        int iG = bxgVar.g();
                        int iF = bxgVar.f();
                        i6a i6aVarD = bxgVar.d();
                        yd5Var2.d = str;
                        yd5Var2.e = wfeVarP;
                        yd5Var2.f = wfeVar;
                        yd5Var2.g = wfeVarP;
                        yd5Var2.j = 1;
                        Object objK0 = yab.K0(((n0c) ((xhh) dygVar.d.getValue())).a(), new tm(dygVar, uri, arrayList, iG, iF, i6aVarD, null), yd5Var2);
                        if (objK0 != hu4Var) {
                            wfe wfeVar5 = wfeVarP;
                            str2 = str;
                            objV = objK0;
                            wfeVar3 = wfeVar5;
                            r5 = wfeVar5;
                        }
                        return hu4Var;
                    } catch (CancellationException e) {
                        e = e;
                        wfeVar2 = wfeVar;
                        r4 = wfeVarP;
                        cancellationException = e;
                        file2 = (File) wfeVar2.a;
                        if (file2 != null) {
                            poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                            obj2 = Boolean.FALSE;
                            if (poeVar2 instanceof poe) {
                                poeVar2 = obj2;
                            }
                        }
                        String str4 = this.f;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null || !a4cVar2.b(je9Var)) {
                            throw cancellationException;
                        }
                        a4cVar2.c(je9Var, str4, "Cancel the image rendering", null);
                        throw cancellationException;
                    } catch (Exception e2) {
                        e = e2;
                        wfeVar2 = wfeVar;
                        r4 = wfeVarP;
                        exc = e;
                        file = (File) wfeVar2.a;
                        if (file != null) {
                            poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                            obj = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = obj;
                            }
                        }
                        str3 = this.f;
                        a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str3, "Failed to render image story", exc);
                        }
                        au3.E((au3) r4.a);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        r3 = wfeVarP;
                        au3.E((au3) r3.a);
                        throw th;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wfeVar4 = yd5Var2.f;
                    r3 = yd5Var2.e;
                    try {
                        ch3.d0(objV);
                        r3 = r3;
                        File file3 = (File) objV;
                        au3.E((au3) r3.a);
                        return file3;
                    } catch (CancellationException e3) {
                        e = e3;
                        r4 = r3;
                        wfeVar2 = wfeVar4;
                        cancellationException = e;
                        file2 = (File) wfeVar2.a;
                        if (file2 != null) {
                            try {
                                poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                            } catch (Throwable th2) {
                                poeVar2 = new poe(th2);
                            }
                            obj2 = Boolean.FALSE;
                            if (poeVar2 instanceof poe) {
                                poeVar2 = obj2;
                            }
                        }
                        String str5 = this.f;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    } catch (Exception e4) {
                        e = e4;
                        r4 = r3;
                        wfeVar2 = wfeVar4;
                        exc = e;
                        file = (File) wfeVar2.a;
                        if (file != null) {
                            try {
                                poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                            } catch (Throwable th3) {
                                poeVar = new poe(th3);
                            }
                            obj = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = obj;
                            }
                        }
                        str3 = this.f;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, str3, "Failed to render image story", exc);
                        }
                        au3.E((au3) r4.a);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        au3.E((au3) r3.a);
                        throw th;
                    }
                }
                wfe wfeVar6 = yd5Var2.g;
                wfeVar2 = yd5Var2.f;
                r4 = yd5Var2.e;
                String str6 = yd5Var2.d;
                try {
                    ch3.d0(objV);
                    wfeVar3 = wfeVar6;
                    str2 = str6;
                    r5 = r4;
                    wfeVar = wfeVar2;
                } catch (CancellationException e5) {
                    e = e5;
                    cancellationException = e;
                    file2 = (File) wfeVar2.a;
                    if (file2 != null) {
                        poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                        obj2 = Boolean.FALSE;
                        if (poeVar2 instanceof poe) {
                            poeVar2 = obj2;
                        }
                    }
                    String str7 = this.f;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        throw cancellationException;
                    }
                    throw cancellationException;
                } catch (Exception e6) {
                    e = e6;
                    exc = e;
                    file = (File) wfeVar2.a;
                    if (file != null) {
                        poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                        obj = Boolean.FALSE;
                        if (poeVar instanceof poe) {
                            poeVar = obj;
                        }
                    }
                    str3 = this.f;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str3, "Failed to render image story", exc);
                    }
                    au3.E((au3) r4.a);
                    return null;
                }
                au3 au3Var = (au3) objV;
                if (au3Var == null) {
                    au3.E((au3) r5.a);
                    return null;
                }
                wfeVar3.a = au3Var;
                xt4 xt4VarB = ((n0c) ((xhh) this.e.getValue())).b();
                wfeVar2 = wfeVar;
                r4 = r5;
                ja1 ja1Var = new ja1(this, str2, wfeVar2, r4, 4);
                yd5Var2.d = null;
                yd5Var2.e = r4;
                yd5Var2.f = wfeVar2;
                yd5Var2.g = null;
                yd5Var2.j = 2;
                objV = qyj.V(xt4VarB, ja1Var, yd5Var2);
                if (objV != hu4Var) {
                    wfeVar4 = wfeVar2;
                    r3 = r4;
                    File file4 = (File) objV;
                    au3.E((au3) r3.a);
                    return file4;
                }
                return hu4Var;
            } catch (CancellationException e7) {
                e = e7;
                wfeVar2 = wfeVar;
                r4 = r5;
                cancellationException = e;
                file2 = (File) wfeVar2.a;
                if (file2 != null) {
                    poeVar2 = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                    obj2 = Boolean.FALSE;
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj2;
                    }
                }
                String str8 = this.f;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    throw cancellationException;
                }
                throw cancellationException;
            } catch (Exception e8) {
                e = e8;
                wfeVar2 = wfeVar;
                r4 = r5;
                exc = e;
                file = (File) wfeVar2.a;
                if (file != null) {
                    poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                    obj = Boolean.FALSE;
                    if (poeVar instanceof poe) {
                        poeVar = obj;
                    }
                }
                str3 = this.f;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, str3, "Failed to render image story", exc);
                }
                au3.E((au3) r4.a);
                return null;
            } catch (Throwable th5) {
                th = th5;
                r4 = r5;
                r3 = r4;
                au3.E((au3) r3.a);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
