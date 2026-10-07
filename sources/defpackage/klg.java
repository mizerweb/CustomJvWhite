package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class klg {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = klg.class.getName();

    public klg(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable a(String str, nq4 nq4Var) {
        jlg jlgVar;
        int i;
        int i2;
        dlg dlgVar;
        if (nq4Var instanceof jlg) {
            jlgVar = (jlg) nq4Var;
            int i3 = jlgVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jlgVar.i = i3 - Integer.MIN_VALUE;
            } else {
                jlgVar = new jlg(this, nq4Var);
            }
        } else {
            jlgVar = new jlg(this, nq4Var);
        }
        jlg jlgVar2 = jlgVar;
        Object objE = jlgVar2.g;
        int i4 = jlgVar2.i;
        hu4 hu4Var = hu4.a;
        try {
            if (i4 == 0) {
                ch3.d0(objE);
                pvb pvbVar = (pvb) this.a.getValue();
                h3b h3bVar = new h3b(str);
                ghb ghbVar = ew5.b;
                long jO = qe7.O(3, lw5.SECONDS);
                onf onfVar = (onf) this.c.getValue();
                i = 0;
                jlgVar2.e = 0;
                jlgVar2.f = 0;
                jlgVar2.i = 1;
                objE = qe7.E(pvbVar, h3bVar, "create_sticker", jO, 0, onfVar, null, jlgVar2, 88);
                if (objE != hu4Var) {
                    i2 = 0;
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                clg clgVar = jlgVar2.d;
                ch3.d0(objE);
                return clgVar;
            }
            i = jlgVar2.f;
            i2 = jlgVar2.e;
            ch3.d0(objE);
            ilg ilgVar = (ilg) objE;
            if (ilgVar == null || (dlgVar = ilgVar.c) == null) {
                return null;
            }
            clg clgVarO = pm9.o(dlgVar);
            vdh vdhVar = (vdh) this.b.getValue();
            jlgVar2.d = clgVarO;
            jlgVar2.e = i2;
            jlgVar2.f = i;
            jlgVar2.i = 2;
            return vdhVar.g(clgVarO, jlgVar2) == hu4Var ? hu4Var : clgVarO;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.d, "createSticker: failed", th);
            return null;
        }
    }
}
