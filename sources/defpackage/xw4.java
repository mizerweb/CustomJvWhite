package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class xw4 {
    public final String a = xw4.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public xw4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public final Serializable a(String str, Rect rect, nq4 nq4Var) {
        uw4 uw4Var;
        Serializable poeVar;
        Throwable thA;
        String str2;
        a4c a4cVar;
        je9 je9Var;
        Object obj;
        int i;
        int i2;
        Throwable th;
        Bitmap bitmap;
        if (nq4Var instanceof uw4) {
            uw4Var = (uw4) nq4Var;
            int i3 = uw4Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uw4Var.j = i3 - Integer.MIN_VALUE;
            } else {
                uw4Var = new uw4(this, nq4Var);
            }
        } else {
            uw4Var = new uw4(this, nq4Var);
        }
        Object objV = uw4Var.h;
        hu4 hu4Var = hu4.a;
        int i4 = uw4Var.j;
        int i5 = 0;
        try {
            if (i4 == 0) {
                ch3.d0(objV);
                xt4 xt4VarB = ((n0c) ((xhh) this.e.getValue())).b();
                vw4 vw4Var = new vw4(str, rect, this);
                uw4Var.d = str;
                uw4Var.f = 0;
                uw4Var.g = 0;
                uw4Var.j = 1;
                Object objV2 = qyj.V(xt4VarB, vw4Var, uw4Var);
                if (objV2 != hu4Var) {
                    obj = objV2;
                    i = 0;
                    i2 = 0;
                }
                return hu4Var;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bitmap = uw4Var.e;
                try {
                    ch3.d0(objV);
                    poeVar = (File) objV;
                    rel.b(bitmap);
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str2 = this.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str2, qv1.k("cropAndSave failed: ", thA.getMessage()), null);
                            }
                        }
                    }
                    if (poeVar instanceof poe) {
                        return null;
                    }
                    return poeVar;
                } catch (Throwable th2) {
                    th = th2;
                    rel.b(bitmap);
                    throw th;
                }
            }
            int i6 = uw4Var.g;
            int i7 = uw4Var.f;
            String str3 = uw4Var.d;
            ch3.d0(objV);
            i = i6;
            str = str3;
            obj = objV;
            i2 = i7;
            Bitmap bitmap2 = (Bitmap) obj;
            if (bitmap2 == null) {
                String str4 = this.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str4, "cropped image result is null", null);
                    }
                }
                poeVar = null;
            } else {
                try {
                    try {
                        xt4 xt4VarB2 = ((n0c) ((xhh) this.e.getValue())).b();
                        try {
                            vw4 vw4Var2 = new vw4(this, str, bitmap2, i5);
                            uw4Var.d = null;
                            uw4Var.e = bitmap2;
                            uw4Var.f = i2;
                            uw4Var.g = i;
                            uw4Var.j = 2;
                            objV = qyj.V(xt4VarB2, vw4Var2, uw4Var);
                            if (objV != hu4Var) {
                                bitmap = bitmap2;
                                poeVar = (File) objV;
                                rel.b(bitmap);
                            }
                            return hu4Var;
                        } catch (Throwable th3) {
                            th = th3;
                            bitmap = bitmap2;
                            rel.b(bitmap);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        bitmap = bitmap2;
                        rel.b(bitmap);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th6) {
            poeVar = new poe(th6);
        }
        thA = roe.a(poeVar);
        if (thA != null) {
            str2 = this.a;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("cropAndSave failed: ", thA.getMessage()), null);
                }
            }
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }

    public final gjf b() {
        return (gjf) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(File file, Uri uri, lq4 lq4Var) {
        ww4 ww4Var;
        File file2;
        if (lq4Var instanceof ww4) {
            ww4Var = (ww4) lq4Var;
            int i = ww4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww4Var.g = i - Integer.MIN_VALUE;
            } else {
                ww4Var = new ww4(this, lq4Var);
            }
        } else {
            ww4Var = new ww4(this, lq4Var);
        }
        ww4 ww4Var2 = ww4Var;
        Object obj = ww4Var2.e;
        int i2 = ww4Var2.g;
        ny8 ny8Var = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var2 = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            ww4Var2.d = file;
            ww4Var2.g = 1;
            Object objK0 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).b(), new jd3(uri, file, this, lq4Var2, 20), ww4Var2);
            if (objK0 != hu4Var) {
                objK0 = sbiVar;
            }
            if (objK0 != hu4Var) {
                file2 = file;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        file2 = ww4Var2.d;
        ch3.d0(obj);
        xt4 xt4VarB = ((n0c) ((xhh) ny8Var.getValue())).b();
        za2 za2Var = new za2(this, 29, file2);
        ww4Var2.d = null;
        ww4Var2.g = 2;
        return qyj.V(xt4VarB, za2Var, ww4Var2) == hu4Var ? hu4Var : sbiVar;
    }
}
