package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class px2 implements h65 {
    public final ny8 a;
    public final ny8 b;
    public final rx2 c = rx2.c;

    public px2(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var2;
        this.b = ny8Var;
    }

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        yj1 yj1Var;
        if (!((LinkedHashSet) this.c.b).contains(m65Var)) {
            return null;
        }
        boolean zEquals = m65Var.equals(rx2.d);
        ny8 ny8Var = this.a;
        List listM1 = null;
        if (zEquals) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", sb8.h0(bundle, "id"));
            bundle2.putInt("type", mll.b(sb8.j0(bundle, "type")).ordinal());
            Long lY = sb8.Y(bundle, "load_mark");
            if (lY != null) {
                bundle2.putLong("load_mark", lY.longValue());
            }
            Long lY2 = sb8.Y(bundle, "message_id");
            if (lY2 != null) {
                bundle2.putLong("message_id", lY2.longValue());
            }
            if (bundle.containsKey("highlights")) {
                listM1 = r5h.m1(sb8.j0(bundle, "highlights"), new String[]{","}, 4);
            }
            if (listM1 != null) {
                bundle2.putStringArrayList("highlights", new ArrayList<>(listM1));
            }
            Boolean boolW = sb8.W(bundle, "highlight_message");
            if (boolW != null) {
                bundle2.putBoolean("highlight_message", boolW.booleanValue());
            }
            Boolean boolW2 = sb8.W(bundle, "from_forward");
            if (boolW2 != null) {
                bundle2.putBoolean("from_forward", boolW2.booleanValue());
            }
            Long lY3 = sb8.Y(bundle, "forward_cht_id");
            if (lY3 != null) {
                bundle2.putLong("forward_cht_id", lY3.longValue());
            }
            if (bundle.containsKey("forward_msg_ids")) {
                long[] jArrI0 = sb8.i0(bundle, "forward_msg_ids");
                if (jArrI0.length != 0) {
                    bundle2.putLongArray("forward_msg_ids", jArrI0);
                }
            }
            Long lY4 = sb8.Y(bundle, "forward_attach_id");
            if (lY4 != null) {
                bundle2.putLong("forward_attach_id", lY4.longValue());
            }
            Boolean boolW3 = sb8.W(bundle, "is_forward_attach");
            if (boolW3 != null) {
                bundle2.putBoolean("is_forward_attach", boolW3.booleanValue());
            }
            String string = bundle.getString(ApiProtocol.PARAM_PAYLOAD);
            if (string != null) {
                bundle2.putString(ApiProtocol.PARAM_PAYLOAD, string);
            }
            String string2 = bundle.getString("push_link");
            if (string2 != null) {
                bundle2.putString("push_link", string2);
            }
            Integer numX = sb8.X(bundle, "flow");
            if (numX != null) {
                bundle2.putInt("flow", numX.intValue());
            }
            Boolean boolW4 = sb8.W(bundle, "open_search_field");
            if (boolW4 != null) {
                bundle2.putBoolean("open_search_field", boolW4.booleanValue());
            }
            Boolean boolW5 = sb8.W(bundle, "is_preview");
            if ((boolW5 != null ? boolW5.booleanValue() : false) && ((Boolean) ((e5d) ny8Var.getValue()).Q6.a(e5d.S6[412]).i()).booleanValue()) {
                bundle2.putBoolean("is_preview", true);
            }
            String string3 = bundle.getString("source_folder");
            if (string3 != null) {
                bundle2.putString("source_folder", string3);
            }
            int i = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, -1);
            if (i != -1) {
                bundle2.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i);
            }
            yj1Var = new yj1(2, bundle2);
        } else if (m65Var.equals(rx2.f)) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("id", sb8.h0(bundle, "id"));
            bundle3.putBoolean("scheduled", true);
            bundle3.putInt("type", 0);
            Long lY5 = sb8.Y(bundle, "message_id");
            if (lY5 != null) {
                bundle3.putLong("message_id", lY5.longValue());
            }
            int i2 = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, -1);
            if (i2 != -1) {
                bundle3.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i2);
            }
            yj1Var = new yj1(3, bundle3);
        } else if (m65Var.equals(rx2.g)) {
            q24 q24Var = new q24(sb8.h0(bundle, "parent_chat_server_id"), sb8.h0(bundle, "parent_message_server_id"));
            long jH0 = sb8.h0(bundle, "parent_chat_local_id");
            Bundle bundle4 = new Bundle();
            bundle4.putLong("id", 0L);
            bundle4.putInt("type", 0);
            bundle4.putParcelable("ARG_COMMENTS_ID", q24Var);
            bundle4.putLong("ARG_PARENT_CHAT_LOCAL_ID", jH0);
            int i3 = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, -1);
            if (i3 != -1) {
                bundle4.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i3);
            }
            Long lY6 = sb8.Y(bundle, "message_id");
            if (lY6 != null) {
                bundle4.putLong("message_id", lY6.longValue());
            }
            Boolean boolW6 = sb8.W(bundle, "highlight_message");
            if (boolW6 != null) {
                bundle4.putBoolean("highlight_message", boolW6.booleanValue());
            }
            Long lY7 = sb8.Y(bundle, "load_mark");
            if (lY7 != null) {
                bundle4.putLong("load_mark", lY7.longValue());
            }
            yj1Var = new yj1(4, bundle4);
        } else {
            if (!m65Var.equals(rx2.e)) {
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            }
            rt2 value = ((r0f) this.b.getValue()).getValue();
            if (value == null) {
                ore.p("Required value was null.");
                return null;
            }
            int i4 = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("id", value.a);
            bundle5.putParcelable("type", qx2.LOCAL_ID);
            bundle5.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i4);
            yj1Var = new yj1(5, bundle5);
        }
        Boolean boolW7 = sb8.W(bundle, "is_preview");
        Object pgdVar = ((boolW7 != null ? boolW7.booleanValue() : false) && ((Boolean) ((e5d) ny8Var.getValue()).Q6.a(e5d.S6[412]).i()).booleanValue()) ? new pgd(sb8.h0(bundle, "id"), new keh(0)) : new keh(0);
        int i5 = 24;
        return new u65(str, m65Var, bundle, 0, new q65(new yk1(i5, pgdVar), new yk1(i5, pgdVar)), false, yj1Var, 40);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return this.c;
    }
}
