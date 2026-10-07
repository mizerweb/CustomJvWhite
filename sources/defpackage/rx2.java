package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx2 extends f83 {
    public static final rx2 c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;
    public static final m65 g;

    static {
        rx2 rx2Var = new rx2(2);
        c = rx2Var;
        d = f83.d(rx2Var, ":chats", new String[]{"id", "type"}, null, 14);
        e = f83.d(rx2Var, ":saved-messages", new String[0], null, 14);
        f = f83.d(rx2Var, ":scheduled-messages", new String[]{"id"}, null, 14);
        g = f83.d(rx2Var, ":comments", new String[]{"parent_chat_server_id", "parent_message_server_id"}, null, 14);
    }
}
