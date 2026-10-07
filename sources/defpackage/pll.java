package defpackage;

import java.util.Collection;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pll {
    public static hrd a(Collection collection, ynh ynhVar, xnh xnhVar) {
        return new hrd(ynhVar, xnhVar, xw3.P0(new kc4(R.id.profile_members_list_delete_from_channel_btn, new tnh(R.string.profile_members_list_delete_from_chat_btn), 1, 56), new kc4(R.id.profile_members_list_delete_from_chat_btn_cancel, new tnh(R.string.profile_members_list_delete_from_chat_cancel), 2, 56)), n1g.i(new ylc("profile:memberslist:ids_to_delete", ww3.U1(collection))));
    }

    public static hrd b(Collection collection, ynh ynhVar, xnh xnhVar) {
        return new hrd(ynhVar, xnhVar, xw3.P0(new kc4(R.id.profile_members_list_delete_from_chat_btn, new tnh(R.string.profile_members_list_delete_from_chat_btn), 1, 56), new kc4(R.id.profile_members_list_delete_from_chat_btn_with_clean, new tnh(R.string.profile_members_list_delete_from_chat_btn_with_clean), 1, 56), new kc4(R.id.profile_members_list_delete_from_chat_btn_cancel, new tnh(R.string.profile_members_list_delete_from_chat_cancel), 2, 56)), n1g.i(new ylc("profile:memberslist:ids_to_delete", ww3.U1(collection))));
    }

    public static final long c(rt2 rt2Var) {
        long jZ = rt2Var.z();
        long jY = rt2Var.y() == 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : rt2Var.y();
        return jZ > jY ? jY : jZ;
    }

    public static final boolean d(rt2 rt2Var, e5d e5dVar, boolean z, Long l) {
        nx2 nx2Var;
        zw2 zw2Var;
        return ((Boolean) e5dVar.v5.a(e5d.S6[335]).i()).booleanValue() && l == null && z && rt2Var.d0() && (nx2Var = rt2Var.b) != null && (zw2Var = nx2Var.I) != null && zw2Var.o;
    }
}
