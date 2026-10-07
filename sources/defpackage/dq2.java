package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dq2 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public dq2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var4;
        this.d = ny8Var3;
    }

    public static List b() {
        return xw3.P0(new f8(R.id.profile_edit_shortlink_action_copy, new ctf(R.id.profile_edit_shortlink_action_copy, 0, new tnh(R.string.profile_edit_shortlink_action_copy), null, null, null, aql.a(R.drawable.icon_copy), null, null, false, null, 1976), 536871936), new f8(R.id.profile_edit_shortlink_action_share, new ctf(R.id.profile_edit_shortlink_action_share, 0, new tnh(R.string.share_to_max), null, null, null, aql.a(R.drawable.icon_forward), null, null, false, null, 1976), 1073742848), new f8(R.id.profile_edit_shortlink_action_share_external, new ctf(R.id.profile_edit_shortlink_action_share_external, 0, new tnh(R.string.profile_edit_shortlink_action_share_external), null, null, null, aql.a(R.drawable.icon_share_android), null, null, false, null, 1976), 1073742848), new f8(R.id.profile_edit_shortlink_action_qr_code, new ctf(R.id.profile_edit_shortlink_action_qr_code, 0, new tnh(R.string.profile_edit_shortlink_action_qr_code), null, null, null, aql.a(R.drawable.icon_qr_code), null, null, false, null, 1976), -2147482624));
    }

    public final List a(wp2 wp2Var) {
        Uri uri;
        Object h1gVar;
        rt2 rt2VarV;
        boolean z;
        rt2 rt2VarV2;
        Integer numValueOf = Integer.valueOf(R.attr.text_tertiary);
        boolean z2 = wp2Var instanceof lv2;
        ny8 ny8Var = this.a;
        String lastPathSegment = null;
        List listP0 = r66.a;
        if (z2) {
            lv2 lv2Var = (lv2) wp2Var;
            boolean zA = lv2Var.A();
            mjg mjgVar = lv2Var.i;
            kq2 kq2Var = kq2.a;
            kq2 kq2Var2 = kq2.b;
            if (zA) {
                lq2 lq2Var = (lq2) mjgVar.getValue();
                if (lq2Var != null) {
                    kq2 kq2Var3 = lq2Var.b;
                    c79 c79VarW = yab.w();
                    c79VarW.add(new kaf(new tnh(R.string.profile_edit_shortlink_channel_type_section), null, 14));
                    c79VarW.addAll(xw3.P0(new xdf(R.id.profile_edit_link_private, kq2Var3 == kq2Var2, new tnh(R.string.profile_edit_shortlink_private_type), new tnh(R.string.profile_edit_shortlink_private_channel_type_description), 536879104), new xdf(R.id.profile_edit_link_public, kq2Var3 == kq2Var, new tnh(R.string.profile_edit_shortlink_public_type), new tnh(R.string.profile_edit_shortlink_public_channel_type_description), 1073750016)));
                    String str = lq2Var.c;
                    int iOrdinal = kq2Var3.ordinal();
                    ny8 ny8Var2 = this.d;
                    if (iOrdinal == 0) {
                        b5d b5dVar = ((e5d) ny8Var2.getValue()).o6;
                        zv8[] zv8VarArr = e5d.S6;
                        String str2 = ((Boolean) b5dVar.a(zv8VarArr[380]).i()).booleanValue() ? "channel_" : "";
                        ((w69) ny8Var.getValue()).getClass();
                        String strConcat = "max.ru/".concat(str2);
                        xxd xxdVar = (xxd) this.c.getValue();
                        xxdVar.getClass();
                        String strF1 = (str == null || str.length() == 0 || !((Boolean) ((e5d) xxdVar.a.getValue()).o6.a(zv8VarArr[380]).i()).booleanValue() || !z5h.K0(str, "channel_", false)) ? str : r5h.f1(str, "channel_");
                        tnh tnhVar = new tnh(R.string.profile_edit_shortlink_public_input_placeholder);
                        ynh tnhVar2 = lq2Var.d;
                        if (tnhVar2 == null) {
                            tnhVar2 = (str == null || str.length() == 0) ? new tnh(R.string.profile_edit_shortlink_channel_public_link_empty_hint) : new tnh(R.string.profile_edit_shortlink_channel_public_link_hint);
                        }
                        ynh ynhVar = tnhVar2;
                        Integer num = lq2Var.e;
                        h1gVar = new h1g(new f1g(strConcat, strF1, tnhVar, false, ynhVar, Integer.valueOf(num != null ? num.intValue() : R.attr.text_tertiary)));
                    } else {
                        if (iOrdinal != 1) {
                            ore.o();
                            return null;
                        }
                        h1gVar = (str == null || str.length() == 0) ? new c2d(new tnh(R.string.profile_edit_shortlink_channel_private_generate_link_after_change_placeholder)) : new h1g(new g1g(new tnh(R.string.profile_edit_shortlink_channel_private_link_hint), new xnh(str), numValueOf));
                    }
                    c79VarW.add(h1gVar);
                    if (((Number) ((e5d) ny8Var2.getValue()).N6.a(e5d.S6[406]).i()).longValue() != 0 && lv2Var.j == mnd.EDIT && lv2Var.A() && (rt2VarV2 = lv2Var.v()) != null && rt2VarV2.w0()) {
                        c79VarW.add(new f8(R.id.profile_edit_action_go_to_business_bot, new ctf(b6c.a, 0, new tnh(R.string.go_to_business_bot_title), null, null, new tnh(R.string.go_to_business_bot_description), aql.a(R.drawable.icon_case), fsf.a, null, false, null, 1816), 1024));
                    }
                    if (cqk.d(lv2Var.y(), Boolean.FALSE)) {
                        c79VarW.addAll(b());
                    }
                    if (kq2Var3 == kq2Var2 && (rt2VarV = lv2Var.v()) != null && rt2VarV.B0() && ((f5d) ((wo6) this.b.getValue())).e()) {
                        long j = b6c.p;
                        tnh tnhVar3 = new tnh(R.string.join_request_toggle);
                        rt2 rt2VarV3 = lv2Var.v();
                        if (rt2VarV3 != null) {
                            z = true;
                            boolean z3 = rt2VarV3.b.I.l;
                            listP0 = xw3.P0(new f8(R.id.profile_edit_join_request_toggle, new ctf(j, 0, tnhVar3, null, null, null, null, new ksf(z3, z), null, false, null, 1848), 1024), new kaf(new tnh(R.string.join_request_toggle_desc), q9i.i, 10));
                        } else {
                            z = true;
                        }
                        listP0 = xw3.P0(new f8(R.id.profile_edit_join_request_toggle, new ctf(j, 0, tnhVar3, null, null, null, null, new ksf(z3, z), null, false, null, 1848), 1024), new kaf(new tnh(R.string.join_request_toggle_desc), q9i.i, 10));
                    }
                    c79VarW.addAll(listP0);
                    return yab.j(c79VarW);
                }
            } else {
                lq2 lq2Var2 = (lq2) mjgVar.getValue();
                if (lq2Var2 != null) {
                    String str3 = lq2Var2.c;
                    kq2 kq2Var4 = lq2Var2.b;
                    c79 c79VarW2 = yab.w();
                    c79VarW2.add(new kaf(new tnh(R.string.profile_edit_shortlink_chat_type_section), null, 14));
                    c79VarW2.add(new xdf(R.id.profile_edit_link_private, kq2Var4 == kq2Var2, new tnh(R.string.profile_edit_shortlink_private_type), new tnh(R.string.profile_edit_shortlink_private_type_description), 536879104));
                    c79VarW2.add(new xdf(R.id.profile_edit_link_public, kq2Var4 == kq2Var, new tnh(R.string.profile_edit_shortlink_public_type), new tnh(R.string.profile_edit_shortlink_public_type_description), 1073750016));
                    int iOrdinal2 = kq2Var4.ordinal();
                    if (iOrdinal2 == 0) {
                        ((w69) ny8Var.getValue()).getClass();
                        String str4 = lq2Var2.c;
                        tnh tnhVar4 = new tnh(R.string.profile_edit_shortlink_public_input_placeholder);
                        ynh tnhVar5 = lq2Var2.d;
                        if (tnhVar5 == null) {
                            tnhVar5 = (str4 == null || str4.length() == 0) ? new tnh(R.string.profile_edit_shortlink_chat_public_link_empty_hint) : new tnh(R.string.profile_edit_shortlink_chat_public_link_hint);
                        }
                        ynh ynhVar2 = tnhVar5;
                        Integer num2 = lq2Var2.e;
                        c79VarW2.add(new h1g(new f1g("max.ru/", str4, tnhVar4, false, ynhVar2, Integer.valueOf(num2 != null ? num2.intValue() : R.attr.text_tertiary))));
                    } else {
                        if (iOrdinal2 != 1) {
                            ore.o();
                            return null;
                        }
                        if (str3 == null || str3.length() == 0) {
                            c79VarW2.add(new c2d(new tnh(R.string.profile_edit_shortlink_chat_private_generate_link_after_change_placeholder)));
                        } else {
                            c79VarW2.add(new h1g(new g1g(new tnh(R.string.profile_edit_shortlink_chat_private_link_hint), new xnh(str3), numValueOf)));
                        }
                    }
                    if (cqk.d(lv2Var.y(), Boolean.FALSE) && str3 != null && str3.length() != 0) {
                        c79VarW2.addAll(b());
                    }
                    return yab.j(c79VarW2);
                }
            }
        } else {
            if (!(wp2Var instanceof xh4)) {
                ore.o();
                return null;
            }
            mq2 mq2Var = (mq2) ((xh4) wp2Var).i.getValue();
            if (mq2Var != null) {
                c79 c79VarW3 = yab.w();
                c79VarW3.add(new e1g());
                ((w69) ny8Var.getValue()).getClass();
                String str5 = mq2Var.a;
                if (str5 != null && (uri = Uri.parse(str5)) != null) {
                    lastPathSegment = uri.getLastPathSegment();
                }
                String str6 = lastPathSegment;
                tnh tnhVar6 = new tnh(R.string.oneme_profile_edit_shortlink_placeholder);
                ynh ynhVar3 = mq2Var.b;
                Integer num3 = mq2Var.c;
                c79VarW3.add(new h1g(new f1g("max.ru/", str6, tnhVar6, true, ynhVar3, Integer.valueOf(num3 != null ? num3.intValue() : R.attr.text_tertiary))));
                return yab.j(c79VarW3);
            }
        }
        return listP0;
    }
}
