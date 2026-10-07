package defpackage;

import android.content.Intent;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final class cs1 extends qbb {
    public static final cs1 b = new cs1();

    public static void j(cs1 cs1Var, int i) {
        String str;
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        o65 o65VarB = cs1Var.b();
        if (!z) {
            str = null;
        } else {
            if (!z) {
                throw null;
            }
            str = "PIP";
        }
        if (str == null) {
            str = "";
        }
        o65.c(o65VarB, qt4.n(":call-active?place=", str, "&replace_top=", z2), null, null, 6);
    }

    public static i65 k(cs1 cs1Var, long j) {
        cs1Var.getClass();
        return new i65(":profile?id=" + j + "&type=local_chat");
    }

    public final void l(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        o65.c(b(), ":chats/share", n1g.i(new ylc("oneme:share:data", intent), new ylc("oneme:share:title", str2), new ylc("tag", str3)), null, 4);
    }
}
