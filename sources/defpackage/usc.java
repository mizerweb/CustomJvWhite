package defpackage;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public class usc implements gjg {
    public final String[] a;
    public final ny8 b = ysc.a.a();
    public final ifh c;
    public final f9b d;
    public final f9b e;

    public usc(String[] strArr) {
        this.a = strArr;
        ifh ifhVar = new ifh(new ap9(17, this));
        this.c = ifhVar;
        this.d = (f9b) ifhVar.getValue();
        this.e = (f9b) ifhVar.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void g(usc uscVar, yx6 yx6Var, lq4 lq4Var) {
        tsc tscVar;
        if (lq4Var instanceof tsc) {
            tscVar = (tsc) lq4Var;
            int i = tscVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tscVar.f = i - Integer.MIN_VALUE;
            } else {
                tscVar = new tsc(uscVar, lq4Var);
            }
        } else {
            tscVar = new tsc(uscVar, lq4Var);
        }
        Object obj = tscVar.d;
        int i2 = tscVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            f9b f9bVar = (f9b) uscVar.c.getValue();
            tscVar.f = 1;
            if (f9bVar.collect(yx6Var, tscVar) == hu4.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        g(this, yx6Var, lq4Var);
        return hu4.a;
    }

    @Override // defpackage.lzf
    public final List d() {
        return this.d.d();
    }

    public final void e() {
        ((f9b) this.c.getValue()).setValue(f());
    }

    public ssc f() {
        return ((wsc) this.b.getValue()).c(this.a) ? ssc.a : ssc.b;
    }

    @Override // defpackage.gjg
    public final Object getValue() {
        return (ssc) this.e.getValue();
    }

    public final boolean i() {
        return ((ssc) this.e.getValue()) == ssc.a;
    }
}
