package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eoe extends a8j {
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ic6 f = new ic6(null);

    public eoe(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
    }

    public final void B(byte b) {
        Map mapSingletonMap = Collections.singletonMap("buttonId", Byte.valueOf(b));
        ul9 ul9Var = new ul9();
        ny8 ny8Var = this.e;
        Integer numC = ((tbb) ny8Var.getValue()).c();
        if (numC != null) {
            ul9Var.put("screen", Integer.valueOf(numC.intValue()));
        }
        ul9Var.put("screen_action_id", Integer.valueOf(((tbb) ny8Var.getValue()).j.get()));
        ul9Var.put("source_meta", mapSingletonMap);
        ((ae9) this.d.getValue()).h("no_2fa_screen_click", ul9Var.b());
    }
}
