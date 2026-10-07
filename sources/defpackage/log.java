package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class log extends qbb {
    public static final log b = new log();

    public final i65 j(long j, long j2) {
        return new i65(c0a.m(j2, "&entry_point=url", qt4.s(j, ":webapp:root?bot_id=", "&start_param=")));
    }

    public final void k(ShareData shareData, String str) {
        o65.c(b(), ":chats/share", n1g.i(new ylc("share_data", shareData), new ylc("tag", str)), null, 4);
    }
}
