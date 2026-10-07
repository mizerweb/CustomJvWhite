package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dzf {
    public final ny8 a;
    public final ny8 b;

    public dzf(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    public final void a(String str, String str2, List list) {
        ylc ylcVar;
        ul9 ul9Var = new ul9();
        if (str != null) {
            ul9Var.put("source", str);
        }
        Map map = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rt2 rt2Var = (rt2) it.next();
                if (rt2Var.b0()) {
                    ylcVar = new ylc(Long.valueOf(rt2Var.A()), "DIALOG_WITH_BOT");
                } else if (rt2Var.y0()) {
                    ylcVar = new ylc(Long.valueOf(((s7f) ((et3) this.b.getValue())).t()), "DIALOG_SAVED_MESSAGES");
                } else if (rt2Var.h0()) {
                    vg4 vg4VarW = rt2Var.w();
                    if (vg4VarW != null) {
                        ylcVar = new ylc(Long.valueOf(vg4VarW.v()), "DIALOG");
                    } else {
                        ylcVar = null;
                    }
                } else if (rt2Var.d0() && rt2Var.w0()) {
                    ylcVar = new ylc(Long.valueOf(rt2Var.A()), "PRIVATE_CHANNEL");
                } else if (rt2Var.d0() && rt2Var.x0()) {
                    ylcVar = new ylc(Long.valueOf(rt2Var.A()), "PUBLIC_CHANNEL");
                } else if (rt2Var.e0() && rt2Var.w0()) {
                    ylcVar = new ylc(Long.valueOf(rt2Var.A()), "PRIVATE_CHAT");
                } else if (rt2Var.e0() && rt2Var.x0()) {
                    ylcVar = new ylc(Long.valueOf(rt2Var.A()), "PUBLIC_CHAT");
                } else {
                    ylcVar = null;
                }
                if (ylcVar != null) {
                    arrayList.add(ylcVar);
                }
            }
            Map mapW0 = wm9.W0(arrayList);
            if (!mapW0.isEmpty()) {
                map = mapW0;
            }
        }
        if (map != null) {
            ul9Var.put("chatsInfo", map);
        }
        ae9.k((ae9) this.a.getValue(), "SHARE_TO_MAX", str2, ul9Var.b(), 8);
    }
}
