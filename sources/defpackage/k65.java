package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class k65 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public k65(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, String str2, String str3, nq4 nq4Var) {
        j65 j65Var;
        v78 v78VarB;
        Throwable th;
        qlb qlbVar;
        String name;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof j65) {
            j65Var = (j65) nq4Var;
            int i = j65Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                j65Var.h = i - Integer.MIN_VALUE;
            } else {
                j65Var = new j65(this, nq4Var);
            }
        } else {
            j65Var = new j65(this, nq4Var);
        }
        j65 j65Var2 = j65Var;
        Object obj = j65Var2.f;
        hu4 hu4Var = hu4.a;
        int i2 = j65Var2.h;
        Bitmap bitmap = null;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                g5c g5cVar = (g5c) this.a.getValue();
                ((d95) this.b.getValue()).getClass();
                qlb qlbVarJ = g5cVar.j("ru.oneme.app.misc", false);
                if (str2 != null && str2.length() != 0) {
                    qlbVarJ.e = qlb.c(str2);
                }
                if (str != null && str.length() != 0) {
                    qlbVarJ.d(str);
                    olb olbVar = new olb();
                    olbVar.e = qlb.c(str);
                    qlbVarJ.i(olbVar);
                }
                if (str3 != null && str3.length() != 0 && (v78VarB = v78.b(str3)) != null) {
                    try {
                        b78 b78Var = (b78) this.c.getValue();
                        try {
                            j65Var2.d = str3;
                            j65Var2.e = qlbVarJ;
                            j65Var2.h = 1;
                            Object objS = vd7.s(b78Var, v78VarB, 1000L, j65Var2, 28);
                            if (objS == hu4Var) {
                                return hu4Var;
                            }
                            obj = objS;
                            qlbVar = qlbVarJ;
                        } catch (Throwable th2) {
                            th = th2;
                            qlbVar = qlbVarJ;
                            name = k65.class.getName();
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, qv1.k("fail to fetch bitmap for ", str3), th);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qlbVar = j65Var2.e;
            str3 = j65Var2.d;
            try {
                ch3.d0(obj);
            } catch (Throwable th4) {
                th = th4;
                name = k65.class.getName();
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, qv1.k("fail to fetch bitmap for ", str3), th);
                    }
                }
            }
            Bitmap bitmap2 = (Bitmap) obj;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap = bitmap2;
            }
            if (bitmap != null) {
                qlbVar.g(bitmap);
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
