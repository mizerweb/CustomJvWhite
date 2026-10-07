package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class og8 {
    public final ny8 a;
    public final ny8 b;

    public og8(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final void a(int i, sdg sdgVar, long j, String str, String str2) {
        int i2 = 5;
        if (i == 5 && str2 != null) {
            Uri uri = Uri.parse(str2);
            String host = uri.getHost();
            ny8 ny8Var = this.b;
            ((w69) ny8Var.getValue()).getClass();
            if (!cqk.d(host, "max.ru")) {
                String scheme = uri.getScheme();
                ((w69) ny8Var.getValue()).getClass();
                if (!cqk.d(scheme, "max")) {
                    str2 = uri.getHost();
                }
            }
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("sourceType", Integer.valueOf(sdgVar != null ? sdgVar.b : 0));
        ul9Var.put("sourceId", Long.valueOf(sdgVar != null ? sdgVar.a : 0L));
        ul9Var.put("messageId", Long.valueOf(j));
        ul9Var.put("inlineText", str);
        if (str2 != null) {
            ul9Var.put("inlineParamValue", str2);
        }
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            default:
                throw null;
        }
        ul9Var.put("inlineButtonEvent", Integer.valueOf(i2));
        ((ae9) this.a.getValue()).h("inline_button_click", ouk.a(new ylc("source_meta", ul9Var.b())));
    }
}
