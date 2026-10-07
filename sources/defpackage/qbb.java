package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class qbb {
    public final ny8 a;

    public qbb() {
        this.a = p65.a.getAccessor().d(184);
    }

    public static i65 g(cf7 cf7Var) {
        n65 n65Var = new n65();
        cf7Var.invoke(n65Var);
        return new i65(n65Var.b());
    }

    public abstract Object a(kcg kcgVar);

    public o65 b() {
        return (o65) this.a.getValue();
    }

    public abstract jcg c();

    public void d(Uri uri) {
        o65.e(b(), uri, null, null, 6);
    }

    public void e(i65 i65Var) {
        o65.c(b(), i65Var.b, null, null, 6);
    }

    public Object f(lq4 lq4Var, Object obj) {
        icg icgVar = (icg) this.a.getValue();
        Object objI = ch3.I(lq4Var, icgVar.b, false, true, new hcg(icgVar, i(obj), 0));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(nq4 nq4Var) {
        gtc gtcVar;
        if (nq4Var instanceof gtc) {
            gtcVar = (gtc) nq4Var;
            int i = gtcVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gtcVar.f = i - Integer.MIN_VALUE;
            } else {
                gtcVar = new gtc(this, nq4Var);
            }
        } else {
            gtcVar = new gtc(this, nq4Var);
        }
        Object objH = gtcVar.d;
        int i2 = gtcVar.f;
        if (i2 == 0) {
            ch3.d0(objH);
            icg icgVar = (icg) this.a.getValue();
            jcg jcgVarC = c();
            gtcVar.f = 1;
            objH = ch3.H(gtcVar, new vy6(icgVar, jcgVarC, null, 4), icgVar.b);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        u8b u8bVar = (u8b) objH;
        ArrayList arrayList = new ArrayList(u8bVar.b);
        Object[] objArr = u8bVar.a;
        int i3 = u8bVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(a((kcg) objArr[i4]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract kcg i(Object obj);

    public qbb(ny8 ny8Var) {
        this.a = ny8Var;
    }
}
