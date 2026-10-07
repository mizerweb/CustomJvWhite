package defpackage;

import java.util.LinkedHashMap;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public final ny8 a;
    public final ny8 b;
    public volatile la2 c;
    public volatile String d;
    public volatile int e;

    public sa2(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void c(sa2 sa2Var, String str, String str2, String str3, Long l, String str4, String str5, boolean z, Boolean bool, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        ?? r9 = z;
        if ((i & np0.m) != 0) {
            r9 = 0;
        }
        if ((i & np0.n) != 0) {
            bool = null;
        }
        sa2Var.getClass();
        ul9 ul9Var = new ul9();
        Integer numC = ((tbb) sa2Var.b.getValue()).c();
        if (numC != null) {
            ul9Var.put("screen", Integer.valueOf(numC.intValue()));
        }
        if (str2 != null) {
            ul9Var.put("call_id", str2);
        } else {
            String str6 = sa2Var.d;
            if (str6 != null) {
                ul9Var.put("call_id", str6);
            }
        }
        la2 la2Var = sa2Var.c;
        if (la2Var != null) {
            ul9Var.put("source", la2Var.name());
        }
        if (str3 != null) {
            ul9Var.put("event_label_str", str3);
        }
        if (l != null) {
            ul9Var.put("event_label_int", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            ul9Var.put("error_type", str4);
        }
        if (str5 != null) {
            ul9Var.put("error_desc", str5);
        }
        ul9Var.put("is_group", Integer.valueOf((int) r9));
        int i2 = sa2Var.e;
        if (i2 != 0) {
            ul9Var.put("con_state", bc1.a(i2));
        }
        if (bool != null) {
            ul9Var.put("is_wave", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ae9.k((ae9) sa2Var.a.getValue(), "CALL", str, ul9Var.b(), 8);
    }

    public static void d(sa2 sa2Var, String str, String str2, long j, String str3, int i) {
        String str4 = (i & 8) != 0 ? null : str3;
        sa2Var.getClass();
        c(sa2Var, "INCOMING_CALL_RECEIVED", str, str2, Long.valueOf(j), str4, null, false, null, HttpStatus.SC_BAD_REQUEST);
    }

    public static void i(sa2 sa2Var, String str) {
        sa2Var.b("showed", "UNKNOWN_CALLER_ALERT", "contact_info_bubble", null, str);
    }

    public final void a(long j, String str, LinkedHashMap linkedHashMap) {
        ul9 ul9Var = new ul9();
        if (str != null) {
            ul9Var.put("call_id", str);
        }
        Integer numC = ((tbb) this.b.getValue()).c();
        if (numC != null) {
            ul9Var.put("screen", Integer.valueOf(numC.intValue()));
        }
        ul9Var.put("user_id2", Long.valueOf(j));
        ul9Var.putAll(linkedHashMap);
        ae9.k((ae9) this.a.getValue(), "CALL", "ADMIN_CALL_SETTINGS_TO_USER", ul9Var.b(), 8);
    }

    public final void b(String str, String str2, String str3, String str4, String str5) {
        ul9 ul9Var = new ul9();
        if (str3 != null) {
            ul9Var.put("UIElementType", str3);
        }
        if (str4 != null) {
            ul9Var.put("clickType", str4);
        }
        Integer numC = ((tbb) this.b.getValue()).c();
        if (numC != null) {
            ul9Var.put("screen", Integer.valueOf(numC.intValue()));
        }
        if (str5 != null) {
            ul9Var.put("call_id", str5);
        } else {
            String str6 = this.d;
            if (str6 != null) {
                ul9Var.put("call_id", str6);
            }
        }
        int i = this.e;
        if (i != 0) {
            ul9Var.put("con_state", bc1.a(i));
        }
        la2 la2Var = this.c;
        if (la2Var != null) {
            ul9Var.put("source", la2Var.name());
        }
        ae9.k((ae9) this.a.getValue(), str2, str, ul9Var.b(), 8);
    }

    public final void e(String str, String str2, boolean z) {
        c(this, "REQUEST_PERMISSION_CAM", str, str2, null, null, null, z, null, 376);
    }

    public final void f(int i, int i2, String str) {
        c(this, "SHARE_CALL_LINK", str, bc1.d(i), Long.valueOf(bc1.c(i2)), null, null, true, null, 368);
    }

    public final void g(oa2 oa2Var, boolean z) {
        c(this, "START_CALL", null, oa2Var.a(), Long.valueOf(z ? 2L : 1L), null, null, oa2Var instanceof ma2, null, 370);
    }

    public final void h(ra2 ra2Var, String str) {
        b("clicked", "UNKNOWN_CALLER_ALERT", "contact_info_bubble", ra2Var.getDescription(), str);
    }

    public final void j(String str) {
        if (ns4.b(str)) {
            return;
        }
        this.d = str.toString();
    }
}
