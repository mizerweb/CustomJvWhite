package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bmc {
    public static final r91 a = new r91(new tnh(R.string.call_context_dialog_open_profile), vyb.e, null, Integer.valueOf(R.drawable.icon_user_fill), 0, false, 880);
    public static final r91 b;
    public static final r91 c;
    public static final r91 d;
    public static final r91 e;
    public static final r91 f;
    public static final r91 g;
    public static final r91 h;
    public static final r91 i;
    public static final r91 j;
    public static final r91 k;
    public static final r91 l;
    public static final r91 m;
    public static final r91 n;
    public static final r91 o;
    public static final r91 p;
    public static final r91 q;

    static {
        long j2 = vyb.n;
        tnh tnhVar = new tnh(R.string.call_context_dialog_open_chat);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_message_fill);
        b = new r91(tnhVar, j2, null, numValueOf, R.id.call_more_action_call_chat_vh, false, 624);
        c = new r91(new tnh(R.string.call_context_dialog_invite_user_to_p2p), vyb.o, null, Integer.valueOf(R.drawable.icon_user_add_fill), 0, false, 880);
        long j3 = vyb.k;
        tnh tnhVar2 = new tnh(R.string.call_context_dialog_share_screen);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_share_screen_on_fill);
        d = new r91(tnhVar2, j3, null, numValueOf2, 0, false, 880);
        e = new r91(new tnh(R.string.call_context_dialog_stop_share_screen), vyb.m, null, numValueOf2, 0, false, 880);
        f = new r91(new tnh(R.string.call_context_dialog_share_screen), vyb.l, new tnh(R.string.call_context_dialog_share_screen_unavailable_desc), Integer.valueOf(R.drawable.icon_share_screen_off_fill), 0, false, 320);
        long j4 = vyb.f;
        tnh tnhVar3 = new tnh(R.string.call_context_dialog_record_screen);
        Integer numValueOf3 = Integer.valueOf(R.drawable.icon_recording_fill);
        g = new r91(tnhVar3, j4, null, numValueOf3, R.id.call_more_action_record_vh, false, 624);
        h = new r91(new tnh(R.string.call_context_dialog_stop_record_screen), vyb.h, null, Integer.valueOf(R.drawable.icon_recording_stop_fill), R.id.call_more_action_record_vh, false, 624);
        i = new r91(new tnh(R.string.call_context_dialog_record_screen_in_progress), vyb.i, null, Integer.valueOf(R.drawable.ic_record_24), R.id.call_more_action_record_vh, true, 112);
        j = new r91(new tnh(R.string.call_context_dialog_record_screen), vyb.g, new tnh(R.string.call_context_dialog_record_screen_unavailable_desc), numValueOf3, R.id.call_more_action_record_vh, false, 64);
        long j5 = vyb.s;
        tnh tnhVar4 = new tnh(R.string.call_screen_menu_grid_mode_title);
        Integer numValueOf4 = Integer.valueOf(R.drawable.icon_grid_fill);
        k = new r91(tnhVar4, j5, null, numValueOf4, 0, false, 880);
        l = new r91(new tnh(R.string.call_screen_menu_grid_mode_title), j5, null, numValueOf4, 0, false, 352);
        long j6 = vyb.t;
        tnh tnhVar5 = new tnh(R.string.call_screen_menu_speaker_mode_title);
        tnh tnhVar6 = new tnh(R.string.call_screen_menu_speaker_mode_subtitle);
        Integer numValueOf5 = Integer.valueOf(R.drawable.icon_grid_speaker_fill);
        m = new r91(tnhVar5, j6, tnhVar6, numValueOf5, 0, false, 848);
        n = new r91(new tnh(R.string.call_screen_menu_speaker_mode_title), j6, new tnh(R.string.call_screen_menu_speaker_mode_subtitle), numValueOf5, 0, false, 320);
        long j7 = vyb.d;
        tnh tnhVar7 = new tnh(R.string.call_context_dialog_debug_menu);
        Integer numValueOf6 = Integer.valueOf(R.drawable.icon_settings_fill);
        o = new r91(tnhVar7, j7, null, numValueOf6, 0, false, 816);
        p = new r91(new tnh(R.string.call_context_dialog_settings), vyb.j, null, numValueOf6, 0, false, 816);
        q = new r91(new tnh(R.string.call_context_action_chat), vyb.c, null, numValueOf, R.id.call_more_action_call_chat_vh, false, 624);
    }

    public static void a(c79 c79Var, vy1 vy1Var) {
        if (!vy1Var.f && vy1Var.d) {
            c79Var.add(f);
        } else if (vy1Var.a()) {
            c79Var.add(e);
        } else {
            c79Var.add(d);
        }
    }

    public static c79 b(ty1 ty1Var) {
        boolean z = ty1Var.a;
        boolean z2 = ty1Var.b;
        c79 c79VarW = yab.w();
        boolean z3 = ty1Var.c;
        if (z3 && ((!z || !z3) && !z2)) {
            c79VarW.add(i);
        } else if (z3 && (z2 || z)) {
            c79VarW.add(h);
        } else if (!ty1Var.e || z2) {
            c79VarW.add(g);
        } else {
            c79VarW.add(j);
        }
        return yab.j(c79VarW);
    }
}
