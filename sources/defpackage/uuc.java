package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class uuc extends f83 {
    public static final uuc c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;

    static {
        uuc uucVar = new uuc(2);
        c = uucVar;
        d = f83.d(uucVar, ":photo-editor", new String[0], Collections.singleton("image_uri"), 12);
        e = f83.d(uucVar, ":media-editor", new String[0], Collections.singleton("initial_id"), 12);
        f = f83.d(uucVar, ":media-editor/edit-and-reply", new String[]{"reply_chat_id", "source_uri"}, null, 14);
    }
}
