package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rz5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public rz5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public final void a(c79 c79Var, boolean z, rt2 rt2Var) {
        if (rt2Var == null) {
            gm0.Y(c79.class.getName(), "Can't prepare disable copy option for UI because chat is null");
            return;
        }
        if (z) {
            ny8 ny8Var = this.c;
            if (((Boolean) ((e5d) ny8Var.getValue()).C6.a(e5d.S6[394]).i()).booleanValue()) {
                boolean zK0 = rt2Var.k0((e5d) ny8Var.getValue());
                c79Var.add(new f8(R.id.profile_edit_admin_participants_permission_disable_copy, new ctf(b6c.c, 0, new tnh(R.string.oneme_profile_edit_admin_action_participants_permission_disable_copy), null, null, null, aql.a(R.drawable.icon_copyright), new ksf(zK0, true), null, false, null, 1848), 1024));
                c79Var.add(new kaf(zK0 ? new tnh(R.string.oneme_profile_edit_admin_action_participants_permission_disable_copy_desc_enabled) : new tnh(R.string.oneme_profile_edit_admin_action_participants_permission_disable_copy_desc_disabled), q9i.i, 2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x07c0  */
    public final List b(zz5 zz5Var) {
        ny8 ny8Var;
        int i;
        ynh pnhVar;
        ynh tnhVar;
        int i2;
        c79 c79Var;
        c79 c79Var2;
        rt2 rt2Var;
        boolean z;
        nx2 nx2Var;
        ynh tnhVar2;
        rt2 rt2VarR;
        rt2 rt2VarR2;
        nx2 nx2Var2;
        boolean z2 = zz5Var instanceof hy2;
        fsf fsfVar = fsf.a;
        ny8 ny8Var2 = this.d;
        int i3 = 0;
        xnh xnhVar = ynh.b;
        osf osfVar = osf.d;
        if (z2) {
            hy2 hy2Var = (hy2) zz5Var;
            AtomicBoolean atomicBoolean = hy2Var.q;
            boolean z3 = hy2Var.O;
            boolean z4 = hy2Var.N;
            mjg mjgVar = hy2Var.l;
            ny8 ny8Var3 = this.b;
            ny8 ny8Var4 = this.c;
            if (z4) {
                boolean z5 = hy2Var.P;
                kz5 kz5Var = (kz5) mjgVar.getValue();
                if (kz5Var != null) {
                    String str = kz5Var.f;
                    sx3 sx3Var = kz5Var.e;
                    String str2 = kz5Var.d;
                    if (!atomicBoolean.get()) {
                        c79 c79VarW = yab.w();
                        c79VarW.add(new gw6(str2, sx3Var));
                        c79VarW.add(new ai5(str, new tnh(R.string.oneme_profile_edit_description_channel_placeholder), ((g5d) c()).f()));
                        return yab.j(c79VarW);
                    }
                    rt2 rt2VarR3 = hy2Var.r();
                    int i4 = (rt2VarR3 == null || (nx2Var2 = rt2VarR3.b) == null) ? 0 : nx2Var2.w0;
                    int i5 = i4 == 0 ? -1 : qz5.$EnumSwitchMapping$0[qt4.D(i4)];
                    if (i5 == -1) {
                        tnhVar2 = xnhVar;
                    } else if (i5 == 1) {
                        tnhVar2 = new tnh(R.string.oneme_profile_edit_chat_type_public);
                    } else {
                        if (i5 != 2) {
                            ore.o();
                            return null;
                        }
                        tnhVar2 = new tnh(R.string.oneme_profile_edit_chat_type_private);
                    }
                    c79 c79VarW2 = yab.w();
                    c79VarW2.add(new b83(str2, new tnh(R.string.profile_edit_channel_name_field_hint), sx3Var, ((g5d) c()).k()));
                    c79VarW2.add(new ai5(str, new tnh(R.string.oneme_profile_edit_description_channel_placeholder), ((g5d) c()).f()));
                    b5d b5dVar = ((e5d) ny8Var4.getValue()).N1;
                    zv8[] zv8VarArr = e5d.S6;
                    if (((Boolean) b5dVar.a(zv8VarArr[142]).i()).booleanValue() && z3) {
                        c79VarW2.add(new f8(R.id.profile_edit_admin_chat_type, new ctf(R.id.profile_edit_admin_chat_type, 0, new tnh(R.string.oneme_profile_edit_admin_action_channel_type), null, null, null, aql.a(R.drawable.icon_megaphone), new isf(tnhVar2, null), null, false, null, 1848), 1024));
                    }
                    if (((Boolean) ((e5d) ny8Var4.getValue()).v5.a(zv8VarArr[335]).i()).booleanValue()) {
                        long j = b6c.o;
                        tnh tnhVar3 = new tnh(R.string.oneme_profile_edit_confirm_before_send);
                        bz8 bz8VarA = aql.a(R.drawable.icon_warning);
                        rt2 rt2VarR4 = hy2Var.r();
                        c79VarW2.add(new f8(R.id.profile_edit_confirm_before_send, new ctf(j, 0, tnhVar3, null, null, null, bz8VarA, new ksf(rt2VarR4 != null && rt2VarR4.b.I.o, true), null, false, null, 1848), 1024));
                        c79VarW2.add(new kaf(new tnh(R.string.oneme_profile_edit_confirm_before_send_hint), q9i.i, 2));
                    }
                    boolean z6 = z5 && ((f5d) ((wo6) ny8Var3.getValue())).q() && ((rt2VarR2 = hy2Var.r()) == null || !rt2VarR2.b.I.n);
                    boolean z7 = ((Boolean) ((f5d) ((wo6) ny8Var3.getValue())).a.X2.a(zv8VarArr[207]).i()).booleanValue() && z5;
                    if (z7) {
                        c79VarW2.add(new f8(R.id.profile_edit_reactions, new ctf(R.id.profile_edit_reactions, 0, new tnh(R.string.oneme_profile_edit_admin_action_reactions), null, null, null, aql.a(R.drawable.icon_smile_happy), new isf(new xnh(kz5Var.h), null), null, false, null, 1848), z6 ? 536871936 : 1024));
                    }
                    if (z6) {
                        long j2 = b6c.n;
                        boolean z8 = !((xb9) ((et3) ny8Var2.getValue())).c0() && ((rt2VarR = hy2Var.r()) == null || !rt2VarR.b.I.n);
                        tnh tnhVar4 = new tnh(R.string.oneme_profile_edit_admin_action_comments);
                        bz8 bz8VarA2 = aql.a(R.drawable.ic_comments_24);
                        rt2 rt2VarR5 = hy2Var.r();
                        c79VarW2.add(new f8(R.id.profile_edit_comments_toggle, new ctf(j2, 0, tnhVar4, null, null, null, bz8VarA2, new ksf(rt2VarR5 != null && rt2VarR5.b.I.m, true), null, z8, null, 1336), z7 ? -2147482624 : 1024));
                    }
                    a(c79VarW2, z3, hy2Var.r());
                    if (z3) {
                        c79VarW2.add(new f8(R.id.profile_edit_admin_move_rights, new ctf(R.id.profile_edit_admin_move_rights, 0, new tnh(R.string.oneme_profile_edit_admin_action_give_rights), null, null, null, aql.a(R.drawable.icon_user_defence), null, null, false, null, 1976), 536871936));
                    }
                    if (z3) {
                        c79VarW2.add(new f8(R.id.profile_edit_admin_clear_channel_history, new ctf(R.id.profile_edit_admin_clear_channel_history, 0, new tnh(R.string.oneme_profile_edit_admin_action_clear_channel_history), null, null, null, aql.a(R.drawable.icon_clear_history), null, null, false, null, 1976), 1073742848));
                    }
                    if (z3) {
                        c79VarW2.add(new f8(R.id.profile_edit_admin_leave_channel, new ctf(R.id.profile_edit_admin_leave_channel, 0, new tnh(R.string.oneme_profile_edit_admin_action_leave_channel), null, osfVar, null, aql.a(R.drawable.icon_autorization_leave), null, null, false, null, 1960), -2147482624));
                    }
                    if (z3) {
                        c79VarW2.add(new f8(R.id.profile_edit_admin_close_channel, new ctf(R.id.profile_edit_admin_close_channel, 0, new tnh(R.string.oneme_profile_edit_close_channel), null, osfVar, null, aql.a(R.drawable.icon_delete), null, null, false, null, 1960)));
                    }
                    return yab.j(c79VarW2);
                }
            } else {
                kz5 kz5Var2 = (kz5) mjgVar.getValue();
                if (kz5Var2 != null) {
                    String str3 = kz5Var2.f;
                    sx3 sx3Var2 = kz5Var2.e;
                    String str4 = kz5Var2.d;
                    if (!atomicBoolean.get()) {
                        c79 c79VarW3 = yab.w();
                        c79VarW3.add(new b83(str4, new tnh(R.string.profile_edit_chat_name_field_hint), sx3Var2, ((g5d) c()).k()));
                        c79VarW3.add(new ai5(str3, new tnh(R.string.oneme_profile_edit_description_chat_placeholder), ((g5d) c()).f()));
                        return yab.j(c79VarW3);
                    }
                    rt2 rt2VarR6 = hy2Var.r();
                    if (rt2VarR6 != null && (nx2Var = rt2VarR6.b) != null) {
                        i3 = nx2Var.w0;
                    }
                    int i6 = i3 == 0 ? -1 : qz5.$EnumSwitchMapping$0[qt4.D(i3)];
                    if (i6 == -1) {
                        tnhVar = xnhVar;
                    } else if (i6 == 1) {
                        tnhVar = new tnh(R.string.oneme_profile_edit_chat_type_public);
                    } else {
                        if (i6 != 2) {
                            ore.o();
                            return null;
                        }
                        tnhVar = new tnh(R.string.oneme_profile_edit_chat_type_private);
                    }
                    c79 c79VarW4 = yab.w();
                    c79VarW4.add(new b83(str4, new tnh(R.string.profile_edit_chat_name_field_hint), sx3Var2, ((g5d) c()).k()));
                    c79VarW4.add(new ai5(str3, new tnh(R.string.oneme_profile_edit_description_chat_placeholder), ((g5d) c()).f()));
                    String str5 = kz5Var2.h;
                    rt2 rt2VarR7 = hy2Var.r();
                    c79 c79VarW5 = yab.w();
                    b5d b5dVar2 = ((e5d) ny8Var4.getValue()).F0;
                    zv8[] zv8VarArr2 = e5d.S6;
                    if (((Boolean) b5dVar2.a(zv8VarArr2[82]).i()).booleanValue()) {
                        c79VarW5.add(new f8(R.id.profile_edit_admin_chat_type, new ctf(R.id.profile_edit_admin_chat_type, 0, new tnh(R.string.oneme_profile_edit_admin_action_chat_type), null, null, null, aql.a(R.drawable.icon_users), new isf(tnhVar, null), null, false, null, 1848), 1024));
                    }
                    if (((Boolean) ((f5d) ((wo6) ny8Var3.getValue())).a.X2.a(zv8VarArr2[207]).i()).booleanValue()) {
                        i2 = 1024;
                        c79VarW5.add(new f8(R.id.profile_edit_reactions, new ctf(R.id.profile_edit_reactions, 0, new tnh(R.string.oneme_profile_edit_admin_action_reactions), null, null, null, aql.a(R.drawable.icon_smile_happy), new isf(new xnh(str5), null), null, false, null, 1848), 1024));
                    } else {
                        i2 = 1024;
                    }
                    if (z3) {
                        c79Var2 = c79VarW4;
                        c79Var = c79VarW5;
                        c79Var.add(new f8(R.id.profile_edit_admin_participants_permission, new ctf(R.id.profile_edit_admin_participants_permission, 0, new tnh(R.string.oneme_profile_edit_admin_action_participants_permissions), null, null, null, aql.a(R.drawable.icon_profile_check), fsfVar, null, false, null, 1848), i2));
                        rt2Var = rt2VarR7;
                        z = z3;
                    } else {
                        c79Var = c79VarW5;
                        c79Var2 = c79VarW4;
                        rt2Var = rt2VarR7;
                        z = z3;
                    }
                    a(c79Var, z, rt2Var);
                    if (z) {
                        c79Var.add(new f8(R.id.profile_edit_admin_move_rights, new ctf(R.id.profile_edit_admin_move_rights, 0, new tnh(R.string.oneme_profile_edit_admin_action_give_rights), null, null, null, aql.a(R.drawable.icon_user_defence), null, null, false, null, 1976), 536871936));
                        c79Var.add(new f8(R.id.profile_edit_admin_clear_chat_history, new ctf(R.id.profile_edit_admin_clear_chat_history, 0, new tnh(R.string.oneme_profile_edit_admin_action_clear_history), null, null, null, aql.a(R.drawable.icon_clear_history), null, null, false, null, 1976), 1073742848));
                        c79Var.add(new f8(R.id.profile_edit_admin_leave_chat, new ctf(R.id.profile_edit_admin_leave_chat, 0, new tnh(R.string.oneme_profile_edit_admin_action_leave_chat), null, osfVar, null, aql.a(R.drawable.icon_autorization_leave), null, null, false, null, 1960), -2147482624));
                    }
                    c79 c79Var3 = c79Var2;
                    c79Var3.addAll(yab.j(c79Var));
                    if (z) {
                        c79Var3.add(new f8(R.id.profile_edit_admin_close_chat, new ctf(R.id.profile_edit_admin_close_chat, 0, new tnh(R.string.oneme_profile_edit_close_chat), null, osfVar, null, aql.a(R.drawable.icon_delete), null, null, false, null, 1960)));
                    }
                    return yab.j(c79Var3);
                }
            }
        } else {
            if (!(zz5Var instanceof vi4)) {
                ore.o();
                return null;
            }
            vi4 vi4Var = (vi4) zz5Var;
            pz5 pz5Var = (pz5) vi4Var.l.getValue();
            if (pz5Var != null) {
                sx3 sx3Var3 = pz5Var.g;
                String str6 = pz5Var.f;
                sx3 sx3Var4 = pz5Var.e;
                String str7 = pz5Var.c;
                if (!vi4Var.E.get()) {
                    c79 c79VarW6 = yab.w();
                    c79VarW6.add(new gw6(str7, sx3Var4));
                    c79VarW6.add(new yx8(str6, sx3Var3));
                    c79VarW6.add(new f8(R.id.profile_edit_contact_delete_action, new ctf(R.id.profile_edit_contact_delete_action, 0, new tnh(R.string.oneme_profile_edit_delete_contact), null, osfVar, null, aql.a(R.drawable.icon_delete), null, null, false, null, 1960)));
                    return yab.j(c79VarW6);
                }
                c79 c79VarW7 = yab.w();
                c79VarW7.add(new gw6(str7, sx3Var4));
                c79VarW7.add(new yx8(str6, sx3Var3));
                c79VarW7.add(new ai5(pz5Var.h, new tnh(R.string.oneme_profile_edit_description_placeholder), ((g5d) c()).f()));
                if (((g5d) c()).p()) {
                    ny8Var = ny8Var2;
                    i = -1;
                    c79VarW7.add(new f8(R.id.profile_edit_short_link, new ctf(R.id.profile_edit_short_link, 0, pz5Var.i, null, null, null, null, fsfVar, null, false, new tnh(R.string.profile_edit_short_link), 888)));
                    pz5Var = pz5Var;
                } else {
                    ny8Var = ny8Var2;
                    i = -1;
                }
                kni kniVar = pz5Var.k;
                String string = kniVar != null ? kniVar.a : ((nni) this.e.getValue()).d.getString("app.privacy.inactive.ttl", "6M");
                kni kniVar2 = kni.TTL_6M;
                if (string != null) {
                    switch (string.hashCode()) {
                        case 1596:
                            if (!string.equals("1M")) {
                                i3 = i;
                            }
                            break;
                        case 1658:
                            i3 = !string.equals("3M") ? i : 1;
                            break;
                        case 1751:
                            i3 = !string.equals("6M") ? i : 2;
                            break;
                        default:
                            i3 = i;
                            break;
                    }
                    switch (i3) {
                        case 0:
                            kniVar2 = kni.TTL_1M;
                            break;
                        case 1:
                            kniVar2 = kni.TTL_3M;
                            break;
                    }
                }
                int i7 = kniVar2.b;
                c79VarW7.add(new zb8(new rnh(R.plurals.inactive_ttl_item, i7, a.n1(new Object[]{Integer.valueOf(i7)}))));
                c79VarW7.add(gh9.a);
                if (pz5Var.l) {
                    Long l = pz5Var.m;
                    if (l == null) {
                        pnhVar = xnhVar;
                    } else {
                        long jF = ((s7f) ((et3) ny8Var.getValue())).f();
                        if (jF >= l.longValue()) {
                            pnhVar = xnhVar;
                        } else {
                            int iCeil = (int) Math.ceil(((double) Math.round((l.longValue() - jF) / 3600000.0f)) / 24.0d);
                            pnhVar = iCeil > 1 ? new pnh(R.plurals.profile_delete_dates_days_left, iCeil) : new tnh(R.string.profile_delete_dates_minutes_left);
                        }
                    }
                    c79VarW7.add(new nj2(pnhVar));
                }
                return yab.j(c79VarW7);
            }
        }
        return r66.a;
    }

    public final gjf c() {
        return (gjf) this.a.getValue();
    }
}
