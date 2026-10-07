package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class lq8 extends qbb {
    public static final lq8 b = new lq8();

    public static Uri j(long j, String str) {
        n65 n65Var = new n65();
        n65Var.a = ":join";
        n65Var.d(Long.valueOf(j), "id");
        n65Var.c("link", str);
        n65Var.d(Boolean.TRUE, "no_anim");
        return n65Var.a();
    }
}
