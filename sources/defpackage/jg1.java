package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class jg1 implements h65 {
    public static final jg1 a = new jg1();
    public static final kg1 b = kg1.c;

    public static c32 c(Bundle bundle) {
        String string = bundle.getString("start_source");
        if (string == null || r5h.X0(string)) {
            return null;
        }
        return mhl.a(string);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:83:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        Object z02Var;
        Object obj;
        x02 x02VarI;
        ha9 ha9VarL;
        af7 hg1Var = tt.c;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        kg1.c.getClass();
        int i = 1;
        boolean z = false;
        if (m65Var.equals(kg1.e)) {
            String strB = v3e.b(sb8.j0(bundle, "link"));
            boolean zA = afl.a(sb8.W(bundle, "video_enabled"));
            boolean zA2 = afl.a(sb8.W(bundle, "is_video_call"));
            boolean zA3 = afl.a(sb8.W(bundle, "microphone_enabled"));
            boolean zB = afl.b(sb8.W(bundle, "front_camera_enabled"));
            boolean zA4 = afl.a(sb8.W(bundle, "is_new"));
            boolean zB2 = afl.b(sb8.W(bundle, "animated"));
            c32 c32VarC = c(bundle);
            if (zB2) {
                hg1Var = new hg1(2, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(2, 0)), false, new dg1(strB, zA2, zA, zA3, zB, zA4, ha9Var, c32VarC), 40);
        }
        if (m65Var.equals(kg1.d)) {
            long jH0 = sb8.h0(bundle, "opponent_id");
            boolean zA5 = afl.a(sb8.W(bundle, "video_enabled"));
            boolean zB3 = afl.b(sb8.W(bundle, "microphone_enabled"));
            String string = bundle.getString("conversation_id");
            if (string == null) {
                string = (String) ns4.b.getValue();
            }
            boolean zB4 = afl.b(sb8.W(bundle, "animated"));
            c32 c32VarC2 = c(bundle);
            if (zB4) {
                hg1Var = new hg1(2, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(2, 0)), false, new eg1(jH0, string, zA5, zB3, ha9Var, c32VarC2), 40);
        }
        if (m65Var.equals(kg1.f)) {
            long jH1 = sb8.h0(bundle, "chat_id");
            boolean zA6 = afl.a(sb8.W(bundle, "video_enabled"));
            boolean zA7 = afl.a(sb8.W(bundle, "microphone_enabled"));
            boolean zB5 = afl.b(sb8.W(bundle, "animated"));
            c32 c32VarC3 = c(bundle);
            if (zB5) {
                hg1Var = new hg1(2, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(2, 0)), false, new fg1(jH1, zA6, zA7, ha9Var, c32VarC3), 40);
        }
        int i2 = 4;
        if (m65Var.equals(kg1.h)) {
            String string2 = bundle.getString("place");
            if (string2 == null || r5h.X0(string2)) {
                string2 = null;
            }
            if (string2 == null) {
                string2 = "OTHER";
            }
            int iE = bc1.e(string2);
            String string3 = bundle.getString("action");
            if (string3 == null || r5h.X0(string3)) {
                string3 = null;
            }
            boolean zB6 = afl.b(sb8.W(bundle, "animated"));
            String string4 = bundle.getString("conversation_id");
            if (string4 == null) {
                x02VarI = null;
            } else {
                if (r5h.X0(string4)) {
                    string4 = null;
                }
                if (string4 != null) {
                    x02VarI = new ga2().a().i(string4);
                } else {
                    x02VarI = null;
                }
            }
            if (x02VarI != null && (ha9VarL = x02VarI.l()) != null) {
                obj = ha9VarL.equals(ha9.c) ? null : ha9VarL;
                if (obj != null) {
                    ha9Var = obj;
                }
            }
            c32 c32VarC4 = c(bundle);
            if (zB6) {
                hg1Var = new hg1(iE, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(iE, 0)), false, new euc(string3, ha9Var, c32VarC4, i2), 40);
        }
        int i3 = 5;
        if (m65Var.equals(kg1.m)) {
            if (afl.b(sb8.W(bundle, "animated"))) {
                hg1Var = new hg1(4, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(4, 0)), false, new vn7(i3, ha9Var), 40);
        }
        if (m65Var.equals(kg1.g)) {
            String strJ0 = sb8.j0(bundle, "call_name");
            String string5 = bundle.getString("call_avatar");
            long jH2 = sb8.h0(bundle, "chat_id");
            boolean zA8 = afl.a(Boolean.valueOf(sb8.f0(bundle, "video_enabled")));
            boolean zB7 = afl.b(sb8.W(bundle, "animated"));
            String string6 = bundle.getString("conversation_id");
            if (string6 == null) {
                z02Var = new z02(((x02) new ga2().a().i.a.getValue()).s());
            } else {
                obj = r5h.X0(string6) ? null : string6;
                if (obj == null) {
                    z02Var = new z02(((x02) new ga2().a().i.a.getValue()).s());
                } else {
                    z02Var = obj;
                }
            }
            if (zB7) {
                hg1Var = new hg1(3, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(3, 0)), false, new gg1(jH2, strJ0, string5, zA8, ha9Var, z02Var), 40);
        }
        if (m65Var.equals(kg1.i)) {
            return new u65(str, m65Var, bundle, 0, null, false, new oo(v3e.b(sb8.j0(bundle, "link")), sb8.W(bundle, "is_video_call"), ha9Var, i), 56);
        }
        if (m65Var.equals(kg1.j)) {
            ry7 ry7Var = new ry7(0);
            return new u65(str, m65Var, bundle, 0, new q65(new ig1(ry7Var, 0), new ig1(ry7Var, 1)), false, new zo7(i3, ha9Var), 40);
        }
        if (m65Var.equals(kg1.k)) {
            ry7 ry7Var2 = new ry7(0);
            return new u65(str, m65Var, bundle, 0, new q65(new ig1(ry7Var2, 0), new ig1(ry7Var2, 1)), false, new ex8(i3, ha9Var), 40);
        }
        if (m65Var.equals(kg1.l)) {
            ry7 ry7Var3 = new ry7(0);
            return new u65(str, m65Var, bundle, 0, new q65(new ig1(ry7Var3, 0), new ig1(ry7Var3, 1)), false, new ks9(i3, ha9Var), 40);
        }
        if (m65Var.equals(kg1.o)) {
            if (afl.b(sb8.W(bundle, "animated"))) {
                hg1Var = new hg1(3, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(3, 0)), false, new uvc(bundle, 6, ha9Var), 40);
        }
        if (m65Var.equals(kg1.p)) {
            if (afl.b(sb8.W(bundle, "animated"))) {
                hg1Var = new hg1(3, 1);
            }
            return new u65(str, m65Var, bundle, 0, new q65(hg1Var, new hg1(3, 0)), false, new kzi(bundle, ha9Var, z), 40);
        }
        if (m65Var.equals(kg1.n)) {
            return new u65(str, m65Var, bundle, 0, null, false, new i(3, ha9Var), 56);
        }
        ore.k(qt4.m("invalid route ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
