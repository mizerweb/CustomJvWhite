package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yd0 {
    public final ny8 a;

    public yd0(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static void a(yd0 yd0Var, int i, int i2, Boolean bool, int i3) {
        String str;
        int i4;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bool = null;
        }
        ae9 ae9Var = (ae9) yd0Var.a.getValue();
        ul9 ul9Var = new ul9();
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = 6;
            } else if (i2 == 2) {
                i4 = 7;
            } else if (i2 == 3) {
                i4 = 9;
            } else if (i2 == 4) {
                i4 = 10;
            } else {
                if (i2 != 5) {
                    throw null;
                }
                i4 = 12;
            }
            ul9Var.put("fail_reason_code", Integer.valueOf(i4));
        }
        int i5 = xd0.$EnumSwitchMapping$0[qt4.D(i)];
        if (i5 == 1) {
            ul9Var.put("permission", "camera");
        } else if (i5 == 2) {
            boolean zD = cqk.d(bool, Boolean.TRUE);
            ul9Var.put("permission", "camera");
            ul9Var.put("status", Integer.valueOf(zD ? 1 : 0));
        }
        ul9 ul9VarB = ul9Var.b();
        ul9 ul9Var2 = new ul9();
        switch (i) {
            case 1:
                str = "qr_login_button_click";
                break;
            case 2:
                str = "permission_prompt_shown";
                break;
            case 3:
                str = "permission_decision";
                break;
            case 4:
                str = "qr_scan_failed";
                break;
            case 5:
                str = "qr_scan_succeeded";
                break;
            case 6:
                str = "qr_not_auth_ui_shown";
                break;
            default:
                throw null;
        }
        ul9Var2.put("action", str);
        if (!ul9VarB.isEmpty()) {
            ul9Var2.put("params", ul9VarB);
        }
        ae9.k(ae9Var, "AUTH_QR", "LOG", ul9Var2.b(), 8);
    }
}
