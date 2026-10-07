package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kad extends f83 {
    public static final kad c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;

    static {
        kad kadVar = new kad(2);
        c = kadVar;
        d = f83.d(kadVar, ":polls/create", new String[]{"chat_id", "request_code"}, null, 14);
        e = f83.d(kadVar, ":polls/result", new String[]{"chat_id", "message_id", "poll_id"}, null, 14);
        f = f83.d(kadVar, ":polls/result/voters", new String[]{"chat_id", "message_id", "poll_id", "answer_id"}, null, 14);
    }
}
