package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vt2 {
    public static final kc4 a = new kc4(R.id.oneme_confirm_cancel, new tnh(R.string.cancel), 2, 56);
    public static final ifh b = new ifh(new k82(9));

    public static y1g a(rt2 rt2Var, vg4 vg4Var) {
        String strK = vg4Var.k();
        return new y1g(rt2Var.a, strK == null ? new tnh(R.string.contact_block_title_stub) : new vnh(R.string.contact_block_title, a.n1(new Object[]{strK})), new tnh(R.string.contact_block_warning), xw3.P0(new kc4(R.id.oneme_confirm_block, new tnh(R.string.block_contact), 1, 56), a));
    }

    public static y1g b(long j) {
        return new y1g(j, new tnh(R.string.channel_close_title), null, xw3.P0(new kc4(R.id.oneme_confirm_delete_for_all, new tnh(R.string.confirmation_close_channel), 1, 56), a));
    }

    public static y1g c(long j) {
        return new y1g(j, new tnh(R.string.chat_delete_for_all_title), null, xw3.P0(new kc4(R.id.oneme_confirm_delete_for_all, new tnh(R.string.chat_delete_for_all), 1, 56), a));
    }

    public static y1g d(rt2 rt2Var) {
        boolean z = rt2Var.b.b() > 1;
        long j = rt2Var.a;
        rt2Var.K0();
        vnh vnhVar = new vnh(R.string.channel_delete_title, a.n1(new Object[]{rt2Var.j}));
        tnh tnhVar = new tnh(R.string.channel_remove_warning);
        c79 c79VarW = yab.w();
        if (z) {
            c79VarW.add(new kc4(R.id.oneme_chat_action_move_rights_and_leave, new tnh(R.string.channel_move_rights_and_leave), 1, 56));
        }
        c79VarW.add(new kc4(R.id.oneme_chat_action_close_channel, new tnh(R.string.channel_delete_for_all), 1, 56));
        c79VarW.add(a);
        return new y1g(j, vnhVar, tnhVar, yab.j(c79VarW));
    }

    public static y1g e(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.chat_delete_title, a.n1(new Object[]{rt2Var.j})), null, xw3.P0(new kc4(R.id.oneme_confirm_delete, new tnh(R.string.chat_delete_confirm), 1, 56), a));
    }

    public static y1g f(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.chat_delete_title, a.n1(new Object[]{rt2Var.j})), new tnh(R.string.chat_remove_warning), xw3.P0(new kc4(R.id.oneme_chat_action_move_rights_and_leave, new tnh(R.string.chat_move_rights_and_leave), 1, 56), new kc4(R.id.oneme_chat_action_close_chat, new tnh(R.string.chat_delete_for_both), 1, 56), a));
    }

    public static y1g g(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        vnh vnhVar = new vnh(R.string.dialog_delete_title, a.n1(new Object[]{rt2Var.j}));
        tnh tnhVar = new tnh(R.string.chat_cannot_be_restored);
        c79 c79VarW = yab.w();
        c79VarW.add(new kc4(R.id.oneme_confirm_delete, new tnh(R.string.chat_delete_for_self), 1, 56));
        if (rt2Var.e0() && rt2Var.b.d == rt2Var.f) {
            c79VarW.add(new kc4(R.id.oneme_confirm_delete_for_all, new tnh(R.string.chat_delete_for_both), 1, 56));
        }
        c79VarW.add(a);
        return new y1g(j, vnhVar, tnhVar, yab.j(c79VarW));
    }

    public static y1g h() {
        tnh tnhVar = new tnh(R.string.multiselect_chats_delete_title);
        c79 c79VarW = yab.w();
        c79VarW.add(new kc4(R.id.oneme_confirm_delete, new tnh(R.string.chat_delete_for_self), 1, 56));
        c79VarW.add(a);
        return new y1g(tnhVar, yab.j(c79VarW));
    }

    public static y1g i(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.channel_leave_title, a.n1(new Object[]{rt2Var.j})), null, xw3.P0(new kc4(R.id.oneme_confirm_leave_channel, new tnh(R.string.confirmation_leave_channel), 1, 56), a));
    }

    public static y1g j(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.channel_leave_title, a.n1(new Object[]{rt2Var.j})), null, xw3.P0(new kc4(R.id.oneme_chat_action_move_rights_and_leave, new tnh(R.string.channel_move_rights_and_leave), 1, 56), a));
    }

    public static y1g k(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{rt2Var.j})), null, xw3.P0(new kc4(R.id.oneme_confirm_leave_chat, new tnh(R.string.confirmation_leave_chat), 1, 56), (kc4) b.getValue()));
    }

    public static y1g l(rt2 rt2Var) {
        long j = rt2Var.a;
        rt2Var.K0();
        return new y1g(j, new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{rt2Var.j})), null, xw3.P0(new kc4(R.id.oneme_chat_action_move_rights_and_leave, new tnh(R.string.chat_move_rights_and_leave), 1, 56), (kc4) b.getValue()));
    }

    public static y1g m() {
        return new y1g(new tnh(R.string.notifications_disable), n());
    }

    public static List n() {
        return xw3.P0(new kc4(R.id.oneme_confirm_mute_1_hour, new tnh(R.string.notifications_1_hour), 3, 56), new kc4(R.id.oneme_confirm_mute_4_hour, new tnh(R.string.notifications_4_hour), 3, 56), new kc4(R.id.oneme_confirm_mute_1_day, new tnh(R.string.notifications_1_day), 3, 56), new kc4(R.id.oneme_confirm_mute_infinite, new tnh(R.string.notifications_infinite), 1, 56), a);
    }

    public static y1g o(rt2 rt2Var, vg4 vg4Var) {
        String strK = vg4Var.k();
        return new y1g(rt2Var.a, strK == null ? new tnh(R.string.contact_unblock_title_stub) : new vnh(R.string.contact_unblock_title, a.n1(new Object[]{strK})), new tnh(R.string.contact_unblock_question), xw3.P0(new kc4(R.id.oneme_confirm_unblock, new tnh(R.string.unblock_contact), 3, 56), a));
    }

    public static y1g p() {
        return new y1g(BuildConfig.MAX_TIME_TO_UPLOAD, new xnh("Действие находится в разработке!"), new xnh("Возвращайтесь позже :)"), Collections.singletonList(new kc4(Integer.MIN_VALUE, new xnh("Вернусь позже"), 3, 56)));
    }
}
