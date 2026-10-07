package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uuf extends qbb {
    public static final uuf b = new uuf();

    public static i65 j(long j, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(":webapp:root?bot_id=" + j + "&entry_point=support_from_privacy");
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new i65(sb.toString());
    }
}
