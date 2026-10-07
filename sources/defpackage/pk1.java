package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pk1 extends qbb {
    public static final pk1 b = new pk1();

    public final void j(CharSequence charSequence, Long l, String str) {
        StringBuilder sb = new StringBuilder(":call-history-info?is_link_call=true");
        pk1 pk1Var = b;
        if (str != null) {
            pk1Var.getClass();
            sb.append("&call_link=".concat(str));
        }
        if (charSequence != null) {
            pk1Var.getClass();
            sb.append("&call_title=" + ((Object) charSequence));
        }
        if (l != null) {
            pk1Var.getClass();
            sb.append("&call_chat_id=" + l);
        }
        o65.c(b(), sb.toString(), null, null, 6);
    }

    public final void k(String str) {
        o65.c(b(), c0a.o(":call-join-link?link=", str, "&start_source=HISTORY"), null, null, 6);
    }
}
