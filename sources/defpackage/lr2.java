package defpackage;

import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lr2 implements spa {
    public final /* synthetic */ int a;
    public final jcd b;

    public /* synthetic */ lr2(jcd jcdVar, int i) {
        this.a = i;
        this.b = jcdVar;
    }

    public static List b(ynh ynhVar, tnh tnhVar, rt2 rt2Var) {
        String strS = rt2Var.s(us0.b, rs0.a);
        rt2Var.L0();
        return Collections.singletonList(new yx2(ynhVar, tnhVar, strS, rt2Var.m, rt2Var.q(), 96));
    }

    @Override // defpackage.spa
    public final Object a(rt2 rt2Var, opa opaVar, lq4 lq4Var) {
        ynh xnhVar;
        int i;
        CharSequence charSequence = null;
        switch (this.a) {
            case 0:
                if (rt2Var == null || !rt2Var.d0()) {
                    return r66.a;
                }
                boolean zD = jcd.d(this.b, null, rt2Var, 1);
                if (!rt2Var.z0() || zD) {
                    return (!rt2Var.w0() || zD) ? b(new xnh(rt2Var.F()), new tnh(R.string.messages_list_channel_description_public_subscriber_subtitle), rt2Var) : b(new xnh(rt2Var.F()), new tnh(R.string.messages_list_channel_description_private_subscriber_subtitle), rt2Var);
                }
                return b(new tnh(R.string.messages_list_channel_description_admin_title), new tnh(R.string.messages_list_channel_description_admin_subtitle), rt2Var);
            default:
                rs0 rs0Var = rs0.a;
                us0 us0Var = us0.b;
                boolean zD2 = jcd.d(this.b, null, rt2Var, 1);
                if (rt2Var != null && rt2Var.f0() && !zD2) {
                    tnh tnhVar = new tnh(R.string.chat_screen_group_link_call_empty_state_title);
                    xnh xnhVar2 = ynh.b;
                    String strS = rt2Var.s(us0Var, rs0Var);
                    if (!rt2Var.f0()) {
                        rt2Var.L0();
                        charSequence = rt2Var.m;
                    }
                    return Collections.singletonList(new yx2(tnhVar, xnhVar2, strS, charSequence, rt2Var.q(), rt2Var.f0(), xw3.P0(new tnh(R.string.chat_screen_group_link_call_empty_state_subtitle_1), new tnh(R.string.chat_screen_group_link_call_empty_state_subtitle_2), new tnh(R.string.chat_screen_group_link_call_empty_state_subtitle_3))));
                }
                if (rt2Var == null || !rt2Var.e0() || zD2) {
                    return r66.a;
                }
                if (rt2Var.z0()) {
                    tnh tnhVar2 = new tnh(R.string.messages_list_chat_description_view_owner_title);
                    i = R.string.messages_list_chat_description_view_owner_subtitle;
                    xnhVar = tnhVar2;
                } else {
                    xnhVar = new xnh(rt2Var.F());
                    i = R.string.messages_list_chat_description_view_subtitle;
                }
                tnh tnhVar3 = new tnh(i);
                String strS2 = rt2Var.s(us0Var, rs0Var);
                rt2Var.L0();
                return Collections.singletonList(new yx2(xnhVar, tnhVar3, strS2, rt2Var.m, rt2Var.q(), 96));
        }
    }
}
