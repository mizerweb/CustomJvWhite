package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yv6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public yv6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = q5h.a;
        yab.u("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static yv6 a(Context context) {
        phf phfVar = new phf(context, 4);
        String strX = phfVar.x("google_app_id");
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        return new yv6(strX, phfVar.x("google_api_key"), phfVar.x("firebase_database_url"), phfVar.x("ga_trackingId"), phfVar.x("gcm_defaultSenderId"), phfVar.x("google_storage_bucket"), phfVar.x("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yv6)) {
            return false;
        }
        yv6 yv6Var = (yv6) obj;
        return f55.h(this.b, yv6Var.b) && f55.h(this.a, yv6Var.a) && f55.h(this.c, yv6Var.c) && f55.h(this.d, yv6Var.d) && f55.h(this.e, yv6Var.e) && f55.h(this.f, yv6Var.f) && f55.h(this.g, yv6Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.b, "applicationId");
        qg7Var.e(this.a, "apiKey");
        qg7Var.e(this.c, "databaseUrl");
        qg7Var.e(this.e, "gcmSenderId");
        qg7Var.e(this.f, "storageBucket");
        qg7Var.e(this.g, "projectId");
        return qg7Var.toString();
    }
}
