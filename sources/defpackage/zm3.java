package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class zm3 extends qbb {
    public static final zm3 b = new zm3();

    public static Uri j(zm3 zm3Var, long j, String str, Long l, Long l2, List list, String str2, d93 d93Var, String str3, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        Long l3 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str4 = (i & 32) != 0 ? null : str2;
        boolean z = (i & np0.n) == 0;
        boolean z2 = (i & np0.o) == 0;
        d93 d93Var2 = (i & 1024) != 0 ? d93.UNKNOWN : d93Var;
        String str5 = (i & np0.q) == 0 ? str3 : null;
        zm3Var.getClass();
        n65 n65Var = new n65();
        n65Var.a = ":chats";
        n65Var.d(Long.valueOf(j), "id");
        n65Var.d(str, "type");
        n65Var.d(Integer.valueOf(d93Var2.a), "flow");
        if (z) {
            n65Var.d(Boolean.TRUE, "no_anim");
        }
        if (l != null) {
            n65Var.d(Long.valueOf(l.longValue()), "message_id");
        }
        if (l3 != null) {
            n65Var.d(Long.valueOf(l3.longValue()), "load_mark");
        }
        if (list2 != null) {
            n65Var.b.add("highlights=".concat(ww3.z1(list2, ",", null, null, null, 62)));
        }
        if (str4 != null) {
            n65Var.d(str4, ApiProtocol.PARAM_PAYLOAD);
        }
        if (str5 != null) {
            n65Var.d(str5, "source_folder");
        }
        n65Var.d(Boolean.valueOf(z2), "is_preview");
        return n65Var.a();
    }

    public static i65 k(zm3 zm3Var, long j, d93 d93Var, String str, int i) {
        if ((i & 4) != 0) {
            d93Var = d93.UNKNOWN;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        zm3Var.getClass();
        n65 n65Var = new n65();
        n65Var.a = ":chats";
        n65Var.d(Long.valueOf(j), "id");
        n65Var.d("local", "type");
        n65Var.d(Integer.valueOf(d93Var.a), "flow");
        if (str != null) {
            n65Var.d(str, "source_folder");
        }
        return new i65(n65Var.b());
    }

    public static void o(zm3 zm3Var, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        d93 d93Var = (i & np0.m) != 0 ? d93.UNKNOWN : d93.SEARCH;
        zm3Var.getClass();
        o65.e(zm3Var.b(), j(zm3Var, j, str, l3, l4, list2, str3, d93Var, null, 2880), null, null, 6);
    }

    public static i65 z(zm3 zm3Var, long j, bdj bdjVar, String str, Long l, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        int i2 = (i & 8) != 0 ? 0 : 101;
        if ((i & 16) != 0) {
            l = null;
        }
        zm3Var.getClass();
        StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
        sb.append(j);
        sb.append("&entry_point=");
        sb.append(bdjVar.a);
        if (i2 != 0) {
            sb.append("&request_code=");
            sb.append(i2);
        }
        if (str != null && str.length() != 0) {
            sb.append("&start_param=");
            sb.append(str);
        }
        if (l != null) {
            sb.append("&source_id=");
            sb.append(l.longValue());
        }
        return new i65(sb.toString());
    }

    public final void l(long j) {
        o65.c(b(), zo5.j(j, ":settings/folder/by-chat?ids="), null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    public final void m(String str, ArrayList arrayList) {
        String strConcat;
        if (str == null) {
            strConcat = null;
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                strConcat = "&tag=".concat(str);
            } else {
                strConcat = null;
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        o65.c(b(), c0a.o(":settings/folder/by-chat?ids=", ww3.z1(arrayList, ",", null, null, null, 62), strConcat), null, null, 6);
    }

    public final void n(String str) {
        o65.c(b(), ":settings/folder/edit?id=".concat(str), null, null, 6);
    }

    public final void p() {
        o65.c(b(), ":start-conversation", null, null, 6);
    }

    public final void q(String str) {
        o65.c(b(), ":settings/folder/members-picker?folder_id=".concat(str), null, null, 6);
    }

    public final void r(String str) {
        o65.c(b(), ":call-join-preview?link=".concat(str), null, null, 6);
    }

    public final void s() {
        o65.c(b(), ":settings/notifications", null, null, 6);
    }

    public final void t() {
        o65.c(b(), ":chats-search", null, null, 6);
    }

    public final void u(t3f t3fVar, long j, avg avgVar, gvg gvgVar) {
        n65 n65Var = new n65();
        n65Var.a = ":stories/viewer";
        n65Var.d(Long.valueOf(j), "owner_id");
        n65Var.d(avgVar.a, "owner_type");
        n65Var.d(gvgVar.a, "type");
        n65Var.d(Boolean.FALSE, "remove_on_push");
        if (t3fVar != null) {
            n65Var.d(t3fVar.a, "parent_scope_id");
        }
        o65.c(b(), n65Var.b(), null, null, 6);
    }

    public final void v() {
        o65.c(b(), ":invite/phone", null, null, 6);
    }

    public final void w(long j) {
        o65.c(b(), nbh.s(j, ":profile/change-owner?chat_id=", "&leave_chat=true"), null, null, 6);
    }

    public final i65 x(long j) {
        return new i65(nbh.s(j, ":profile?id=", "&type=contact"));
    }

    public final void y(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        String string = (extras == null || (obj = extras.get("android.intent.extra.shortcut.ID")) == null) ? null : obj.toString();
        Long lC0 = string != null ? y5h.C0(string) : null;
        boolean z = cqk.d(string, "share_story") || intent.getBooleanExtra("oneme:share:open_story", false);
        o65 o65VarB = b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("oneme:share:data", intent);
        if (lC0 != null) {
            bundle.putLongArray("selected_ids", new long[]{lC0.longValue()});
        }
        if (z) {
            bundle.putBoolean("oneme:share:open_story", true);
        }
        o65.c(o65VarB, ":chats/share", bundle, null, 4);
    }
}
