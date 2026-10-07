package defpackage;

import java.io.Serializable;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class np3 {
    public final ny8 a;
    public final ny8 b;

    public np3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, s59 s59Var, nq4 nq4Var) {
        mp3 mp3Var;
        poe poeVar;
        if (nq4Var instanceof mp3) {
            mp3Var = (mp3) nq4Var;
            int i = mp3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp3Var.f = i - Integer.MIN_VALUE;
            } else {
                mp3Var = new mp3(this, nq4Var);
            }
        } else {
            mp3Var = new mp3(this, nq4Var);
        }
        Object obj = mp3Var.d;
        int i2 = mp3Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                a6c a6cVar = (a6c) this.a.getValue();
                mp3Var.f = 1;
                sih sihVar = (sih) a6cVar.a.getValue();
                vsb vsbVar = new vsb(kfc.E1, 26);
                vsbVar.h("link", str);
                vsbVar.h("linkType", s59Var.name());
                Object objG = sihVar.a.g(vsbVar, mp3Var);
                hu4 hu4Var = hu4.a;
                if (objG == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            poeVar = null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof TamErrorException) {
                return ((TamErrorException) thA).a;
            }
            gm0.n(np3.class.getName(), "unknown error: " + thA);
            ((t1c) ((ed6) this.b.getValue())).a(thA);
        }
        if (poeVar != null) {
            return null;
        }
        return poeVar;
    }
}
