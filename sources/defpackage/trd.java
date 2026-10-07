package defpackage;

import android.app.Activity;
import one.me.android.root.RootController;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes2.dex */
public final class trd extends qbb {
    public static final trd b = new trd();

    public static i65 l(long j, long j2) {
        return new i65(c0a.m(j2, "&permissions_type=change_admin", qt4.s(j, ":profile/edit/admin_permission?chat_id=", "&contact_id=")));
    }

    public static i65 p(long j, String str, int i) {
        return new i65(qt4.q(zo5.x(i, j, ":invite/qr?height=", "&id="), "&type=", str, "&push_if_absent=true"));
    }

    public static i65 q(long j, bdj bdjVar, Long l, String str) {
        n65 n65Var = new n65();
        n65Var.a = ":webapp:root";
        n65Var.d(Long.valueOf(j), "bot_id");
        n65Var.d(bdjVar.a, "entry_point");
        if (l != null) {
            n65Var.d(l, "source_id");
        }
        if (((str == null || str.length() == 0) ? null : str) != null) {
            n65Var.d(str, "start_param");
        }
        return new i65(n65Var.b());
    }

    public static void s(trd trdVar, String str, ShareData shareData, String str2, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        o65.c(trdVar.b(), ":chats/share", n1g.i(new ylc("share_data", shareData), new ylc("oneme:share:title", str), new ylc("oneme:share:confirm", Boolean.valueOf((i & 16) == 0)), new ylc("oneme:share:is:internal:url:sharing", Boolean.valueOf(z)), new ylc("oneme:share:mode", (i & 32) != 0 ? "default" : "only_send"), new ylc("tag", str2)), null, 4);
    }

    public final void j(long j, boolean z) {
        o65.c(b(), bc1.l(j, ":profile/add-members?chat_id=", "&is_chat=", z), null, null, 6);
    }

    public final void k(long j) {
        o65.c(b(), nbh.s(j, ":chats?id=", "&type=local"), null, null, 6);
    }

    public final void m(long j) {
        o65.c(b(), zo5.j(j, ":profile/invite?id="), null, null, 6);
    }

    public final void n(long j, String str) {
        o65.c(b(), ewi.d(j, ":profile/members?id=", "&type=", str), null, null, 6);
    }

    public final void o(long j) {
        o65 o65VarB = b();
        n65 n65Var = new n65();
        n65Var.a = ":profile";
        n65Var.d(Long.valueOf(j), "id");
        n65Var.d("contact", "type");
        o65.e(o65VarB, n65Var.a(), null, null, 6);
    }

    public final void r() {
        if (b().f()) {
            return;
        }
        RootController rootController = b().a().e;
        Activity activityD = rootController != null ? rootController.w1().d() : null;
        if (activityD != null) {
            activityD.finish();
        }
    }
}
