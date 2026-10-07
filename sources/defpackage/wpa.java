package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wpa extends qbb {
    public static final wpa b = new wpa();

    public static i65 j(List list, boolean z) {
        return new i65(qt4.n(":chats/forward?messages_ids=", ww3.z1(list, ",", null, null, null, 62), "&show_ext_sharing=", z));
    }

    public static i65 l(long j, long j2, String str, dq5 dq5Var) {
        int iOrdinal = dq5Var.ordinal();
        StringBuilder sbS = qt4.s(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        qv1.s(j2, "&local_attach_id=", str, sbS);
        return new i65(zo5.v(sbS, "&cause_ordinal=", iOrdinal));
    }

    public final i65 k(long j) {
        return new i65(nbh.s(j, ":profile?id=", "&type=contact"));
    }
}
