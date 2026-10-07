package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class b0d extends qbb {
    public static final b0d b = new b0d();

    public static i65 j(long j, long j2, boolean z, boolean z2) {
        return new i65(zo5.k(j2, "&message_id=", z2 ? "&pop_controllers=true" : "", qt4.t(j, ":chats?id=", "&type=", z ? "local" : "server")));
    }

    public static /* synthetic */ i65 k(b0d b0dVar, long j, long j2) {
        b0dVar.getClass();
        return j(j, j2, true, false);
    }

    public static i65 l() {
        return new i65(":chat-list");
    }

    public static i65 q(long j) {
        n65 n65Var = new n65();
        n65Var.a = ":complaint";
        n65Var.d(Long.valueOf(j), "ids");
        n65Var.d("p2p", "type");
        n65Var.d(350, "source_screen");
        return new i65(n65Var.b());
    }

    public static i65 r(long j, long j2) {
        StringBuilder sbS = qt4.s(j, ":scheduled-messages?id=", "&message_id=");
        sbS.append(j2);
        return new i65(sbS.toString());
    }

    public final void m(long j) {
        o65.c(b(), ":chat-list", null, null, 6);
        o65.c(b(), zo5.j(j, ":complaint?type=sus_p2g&ids="), null, null, 6);
    }

    public final void n(long j) {
        o65.c(b(), zo5.j(j, ":profile/join-requests?id="), null, null, 6);
    }

    public final void o(Uri uri) {
        o65.c(b(), ":link-intercept", n1g.i(new ylc("link", uri)), null, 4);
    }

    public final void p(long j, String str) {
        o65.c(b(), nbh.s(j, ":videoweb/full?chat_id=", "&msg_id=0"), n1g.i(new ylc("video_url", str)), null, 4);
    }

    public final void s(int i, long j) {
        o65.c(b(), zo5.g(i, j, ":contact/add/dialog?contact_id=", "&bottom_margin="), null, null, 6);
    }
}
