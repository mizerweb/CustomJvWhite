package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import one.me.android.MainActivity;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class kk9 extends qbb {
    public static final kk9 b = new kk9();

    public static i65 j(long j, Long l, Long l2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        if (l != null) {
            sb.append("&load_mark=" + l);
        }
        if (str != null) {
            sb.append("&push_link=".concat(str));
        }
        return new i65(sb.toString());
    }

    public static i65 k(kk9 kk9Var, boolean z) {
        kk9Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        return new i65(sb.toString());
    }

    public static void m(kk9 kk9Var, String str, boolean z, ha9 ha9Var, String str2, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            ha9Var = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        kk9Var.getClass();
        Bundle bundleI = str != null ? n1g.i(new ylc("action", str)) : null;
        n65 n65Var = new n65();
        n65Var.a = ":call-active";
        n65Var.d(Boolean.valueOf(z), "animated");
        String str3 = str2 != null ? str2 : null;
        if (str3 != null && !r5h.X0(str3)) {
            n65Var.d(str3, "conversation_id");
        }
        kk9Var.b().d(n65Var.a(), bundleI, ha9Var);
    }

    public static Intent p(i65 i65Var, Context context, String str, String str2, ha9 ha9Var) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        b.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + i65Var.b));
        if (ha9Var != null) {
            intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        }
        return intent;
    }

    public static Uri q(long j, bdj bdjVar, Long l, String str) {
        n65 n65Var = new n65();
        n65Var.a = ":webapp:root";
        n65Var.d(Long.valueOf(j), "bot_id");
        n65Var.d(bdjVar.a(), "entry_point");
        if (str != null) {
            n65Var.d(str, "start_param");
        }
        if (l != null) {
            n65Var.d(l, "source_id");
        }
        return n65Var.a();
    }

    public final void l(Bundle bundle, String str) {
        o65.c(b(), ":external_callback", n1g.i(new ylc("params", ui6.c(bundle, str))), null, 4);
    }

    public final void n(long j, String str, String str2, boolean z, String str3, boolean z2, ha9 ha9Var) {
        n65 n65Var = new n65();
        n65Var.a = ":call-incoming";
        n65Var.d(Long.valueOf(j), "chat_id");
        n65Var.d(str, "call_name");
        n65Var.d(str2, "call_avatar");
        n65Var.d(Boolean.valueOf(z), "video_enabled");
        n65Var.d(Boolean.valueOf(z2), "animated");
        if (!r5h.X0(str3)) {
            n65Var.d(str3, "conversation_id");
        }
        o65.e(b(), n65Var.a(), null, ha9Var, 2);
    }

    public final void o(boolean z, ha9 ha9Var, String str) {
        o65 o65VarB = b();
        n65 n65Var = new n65();
        n65Var.a = ":call-join-preview";
        n65Var.d(str, "link");
        n65Var.d(Boolean.valueOf(z), "animated");
        o65.e(o65VarB, n65Var.a(), null, ha9Var, 2);
    }

    public final i65 r(long j, bdj bdjVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(ewi.d(j, ":webapp:root?bot_id=", "&entry_point=", bdjVar.a()));
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new i65(sb.toString());
    }
}
