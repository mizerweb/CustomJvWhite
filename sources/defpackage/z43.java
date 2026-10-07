package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z43 extends qbb {
    public static final z43 b = new z43();

    public static i65 j(long j, Long l) {
        if (l == null) {
            return new i65(zo5.j(j, ":chats/forward?messages_ids="));
        }
        return new i65(":chats/forward?messages_ids=" + j + "&attach_id=" + l + "&is_forward_attach=true");
    }

    public final i65 k(long j, long j2) {
        StringBuilder sbS = qt4.s(j, ":chats?id=", "&type=local&message_id=");
        sbS.append(j2);
        return new i65(sbS.toString());
    }
}
