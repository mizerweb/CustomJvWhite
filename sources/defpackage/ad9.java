package defpackage;

import java.util.List;
import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ad9 implements t65, gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ad9(long j, int i, ha9 ha9Var, String str) {
        this.b = j;
        this.a = i;
        this.c = ha9Var;
        this.d = str;
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        jv9 jv9Var = (jv9) this.c;
        List list = (List) this.d;
        sv9 sv9Var = jv9Var.c;
        z88 z88VarL = c98.l();
        for (int i2 = 0; i2 < list.size(); i2++) {
            z88VarL.c(((ry9) list.get(i2)).d(true));
        }
        e38Var.K(sv9Var, i, new m51(z88VarL.h()), this.a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // defpackage.t65
    public Object t() {
        t3f t3fVar;
        ha9 ha9Var = (ha9) this.c;
        String str = (String) this.d;
        if (str != null) {
            ha9 ha9Var2 = null;
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                t3fVar = new t3f(str, ha9Var2, 2);
            } else {
                t3fVar = t3f.e;
            }
        } else {
            t3fVar = t3f.e;
        }
        return new PickLocationScreen(this.b, this.a, ha9Var, t3fVar);
    }

    public /* synthetic */ ad9(jv9 jv9Var, List list, int i, long j) {
        this.c = jv9Var;
        this.d = list;
        this.a = i;
        this.b = j;
    }
}
