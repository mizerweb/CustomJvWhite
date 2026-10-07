package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n49 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = n49.class.getName();

    public n49(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var;
    }

    public static d39 c(int i, Integer num) {
        return new d39(new tnh(i), num, null, 4);
    }

    public final Object a(String str, l49 l49Var, Long l, boolean z, nq4 nq4Var) {
        rt2 rt2Var;
        String str2 = this.d;
        a4c a4cVar = gm0.f;
        rt2 rt2Var2 = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "handleLink " + r5h.u1(20, str) + "... result is " + l49Var, null);
            }
        }
        if (l49Var instanceof i39) {
            h39 h39Var = h39.b;
            i39 i39Var = (i39) l49Var;
            long j = i39Var.a;
            String str3 = i39Var.b;
            h39Var.getClass();
            n65 n65Var = new n65();
            n65Var.a = ":join";
            n65Var.d(Long.valueOf(j), "id");
            n65Var.c("link", str3);
            Boolean bool = Boolean.TRUE;
            n65Var.d(bool, "no_anim");
            n65Var.d(bool, "replace_top");
            return new y29(new i65(n65Var.b()), l49Var.i());
        }
        if (l49Var instanceof w39) {
            return new a39(((w39) l49Var).a.toString());
        }
        if (l49Var instanceof s39) {
            return new x29(((s39) l49Var).a);
        }
        if (l49Var instanceof i49) {
            h39 h39Var2 = h39.b;
            long j2 = ((i49) l49Var).a;
            h39Var2.getClass();
            return new y29(new i65(":stickers/set?set_id=" + j2), l49Var.i());
        }
        if (l49Var instanceof a49) {
            h39 h39Var3 = h39.b;
            a49 a49Var = (a49) l49Var;
            long j3 = a49Var.a;
            String str4 = a49Var.b;
            String str5 = z ? "push" : MLFeatureConfigProviderBase.URL_KEY;
            h39Var3.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(ewi.d(j3, ":webapp:root?bot_id=", "&entry_point=", str5));
            if (l != null) {
                sb.append("&source_id=" + l.longValue());
            }
            if (str4 != null) {
                sb.append("&start_param=".concat(str4));
            }
            return new y29(new i65(sb.toString()), l49Var.i());
        }
        if (l49Var instanceof x39) {
            h39 h39Var4 = h39.b;
            String str6 = ((x39) l49Var).a;
            h39Var4.getClass();
            return new y29(new i65(":chat-list?folder_id=".concat(str6)), l49Var.i());
        }
        if (l49Var instanceof h49) {
            return new c39(((h49) l49Var).a);
        }
        if (l49Var instanceof z39) {
            return new y29(d2g.b, l49Var.i());
        }
        if (l49Var instanceof f49) {
            f49 f49Var = (f49) l49Var;
            if (l != null) {
                rt2Var = (rt2) ((xn3) this.c.getValue()).k(l.longValue()).a.getValue();
            } else {
                rt2Var = null;
            }
            return (rt2Var == null || rt2Var.a != f49Var.a || rt2Var.b0()) ? new y29(h39.j(h39.b, f49Var.a, f49Var.b, null, null, 12), f49Var.c) : c(R.string.link_on_this_profile, null);
        }
        if (l49Var instanceof k39) {
            return c(R.string.link_info_error, new Integer(R.drawable.icon_link_brake));
        }
        if (l49Var instanceof r39) {
            return c(R.string.snackbar_web_app_not_found_error_title, new Integer(R.drawable.icon_report));
        }
        if (l49Var instanceof l39) {
            return c(R.string.link_info_error_invalid_link, new Integer(R.drawable.icon_link_brake));
        }
        if (l49Var instanceof p39) {
            return c(R.string.link_interceptor_error_private_channel, new Integer(R.drawable.icon_privacy_fill));
        }
        if (l49Var instanceof o39) {
            return c(R.string.link_interceptor_error_post_not_found, new Integer(R.drawable.icon_warning_fill));
        }
        if (l49Var instanceof q39) {
            return c(R.string.link_interceptor_error_private_chat, new Integer(R.drawable.icon_privacy_fill));
        }
        if (l49Var instanceof n39) {
            return c(R.string.link_interceptor_error_message_not_found, new Integer(R.drawable.icon_warning_fill));
        }
        if (l49Var instanceof m39) {
            return c(R.string.common_network_error, new Integer(R.drawable.icon_warning));
        }
        if (l49Var instanceof c49) {
            c49 c49Var = (c49) l49Var;
            if (l != null) {
                rt2Var2 = (rt2) ((xn3) this.c.getValue()).k(l.longValue()).a.getValue();
            }
            if (rt2Var2 == null || rt2Var2.a != c49Var.a) {
                return new y29(h39.j(h39.b, c49Var.a, null, Boolean.valueOf(c49Var.c), c49Var.d, 2), c49Var.f);
            }
            Long l2 = c49Var.d;
            if (l2 != null) {
                return new b39(l2.longValue());
            }
            if (c49Var.e) {
                return c(rt2Var2.d0() ? R.string.link_on_this_channel : R.string.link_on_this_chat, Integer.valueOf(R.drawable.icon_warning_fill));
            }
            return new z29(c49Var);
        }
        if (l49Var instanceof d49) {
            h39 h39Var5 = h39.b;
            d49 d49Var = (d49) l49Var;
            long j4 = d49Var.b;
            q24 q24Var = d49Var.a;
            long j5 = q24Var.a;
            long j6 = q24Var.b;
            Long l3 = new Long(d49Var.c);
            if (l3.longValue() <= 0) {
                l3 = null;
            }
            Long l4 = new Long(d49Var.d);
            Long l5 = l4.longValue() > 0 ? l4 : null;
            h39Var5.getClass();
            return new y29(qbb.g(new f39(j4, j5, j6, l3, l5)), d49Var.f);
        }
        if (l49Var instanceof e49) {
            return b((e49) l49Var, nq4Var);
        }
        if (cqk.d(l49Var, t39.a)) {
            return c(R.string.self_profile_click, null);
        }
        if (cqk.d(l49Var, g49.a)) {
            return c(R.string.link_interceptor_contact_removed, null);
        }
        if (l49Var instanceof k49) {
            return new d39(new tnh(R.string.link_interceptor_folder_error_title), null, new tnh(R.string.link_interceptor_folder_error_description), 2);
        }
        if (cqk.d(l49Var, j39.a)) {
            return c(R.string.link_interceptor_content_level_error, new Integer(R.drawable.icon_eye_crossed_fill));
        }
        if ((l49Var instanceof y39) || (l49Var instanceof u39) || cqk.d(l49Var, b49.a)) {
            return new z29(l49Var);
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(e49 e49Var, nq4 nq4Var) {
        m49 m49Var;
        if (nq4Var instanceof m49) {
            m49Var = (m49) nq4Var;
            int i = m49Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                m49Var.g = i - Integer.MIN_VALUE;
            } else {
                m49Var = new m49(this, nq4Var);
            }
        } else {
            m49Var = new m49(this, nq4Var);
        }
        Object objA = m49Var.e;
        int i2 = m49Var.g;
        if (i2 == 0) {
            ch3.d0(objA);
            hk7 hk7Var = (hk7) this.a.getValue();
            long j = e49Var.a;
            m49Var.d = e49Var;
            m49Var.g = 1;
            objA = hk7.a(hk7Var, j, m49Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e49Var = m49Var.d;
            ch3.d0(objA);
        }
        vg4 vg4Var = (vg4) objA;
        if (e49Var.a == ((s7f) ((et3) this.b.getValue())).t()) {
            return c(R.string.self_profile_click, null);
        }
        if (vg4Var == null || !vg4Var.B() || vg4Var.I()) {
            return c(R.string.link_interceptor_contact_removed, null);
        }
        h39 h39Var = h39.b;
        long j2 = e49Var.a;
        h39Var.getClass();
        return new y29(new i65(":profile?id=" + j2 + "&type=contact"), e49Var.b);
    }
}
