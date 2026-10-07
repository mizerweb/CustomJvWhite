package defpackage;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes2.dex */
public final class p7h implements lzf {
    public final lzf a;
    public final qf7 b;

    public p7h(lzf lzfVar, qf7 qf7Var) {
        this.a = lzfVar;
        this.b = qf7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        o7h o7hVar;
        if (lq4Var instanceof o7h) {
            o7hVar = (o7h) lq4Var;
            int i = o7hVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7hVar.f = i - Integer.MIN_VALUE;
            } else {
                o7hVar = new o7h(this, lq4Var);
            }
        } else {
            o7hVar = new o7h(this, lq4Var);
        }
        Object obj = o7hVar.d;
        int i2 = o7hVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            n7h n7hVar = new n7h(yx6Var, this.b);
            o7hVar.f = 1;
            Object objCollect = this.a.collect(n7hVar, o7hVar);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.lzf
    public final List d() {
        return this.a.d();
    }
}
