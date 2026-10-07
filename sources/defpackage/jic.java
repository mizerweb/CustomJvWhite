package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class jic {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final k8b d;
    public long e;

    public jic(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        k8b k8bVar = gi9.a;
        this.d = new k8b();
        this.e = -1L;
    }

    public final void a(int i, long j, int i2, long j2, int i3, int i4, Boolean bool) {
        int i5;
        String str;
        String str2;
        String str3;
        ul9 ul9Var = new ul9();
        ul9Var.put("org_id", Long.valueOf(j));
        if (i2 == 1) {
            i5 = 1;
        } else if (i2 == 2) {
            i5 = 2;
        } else {
            if (i2 != 3) {
                throw null;
            }
            i5 = 4;
        }
        ul9Var.put("source_type", Integer.valueOf(i5));
        ul9Var.put("source_id", Long.valueOf(j2));
        if (i3 == 1) {
            str = "profile";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str = "chat_widget";
        }
        ul9Var.put("placement", str);
        Object objC = ((tbb) this.c.getValue()).c();
        if (objC == null) {
            objC = "";
        }
        ul9Var.put("screen", objC);
        if (i4 != 0) {
            if (i4 == 1) {
                str3 = "miniapp";
            } else {
                if (i4 != 2) {
                    throw null;
                }
                str3 = MLFeatureConfigProviderBase.URL_KEY;
            }
            ul9Var.put("org_link_type", str3);
        }
        if (bool != null) {
            ul9Var.put("is_clickable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ul9 ul9VarB = ul9Var.b();
        ae9 ae9Var = (ae9) this.a.getValue();
        if (i == 1) {
            str2 = "org_widget_shown";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "org_widget_name_tap";
        }
        ae9.k(ae9Var, "ORGANIZATION_INFO", str2, ul9VarB, 8);
    }
}
