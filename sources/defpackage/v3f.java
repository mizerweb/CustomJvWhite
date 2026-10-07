package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface v3f {
    public static final u3f a = u3f.a;

    static void a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
            u3f u3fVar = u3f.a;
            String str = u3f.b;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.l(uri, "sendBroadcastToGallery: failed for uri "), e);
            }
        }
    }

    Uri b(w3f w3fVar, String str);

    Uri c(w3f w3fVar, String str);

    default String d() {
        lz8 lz8VarE = e();
        Date date = new Date();
        lz8VarE.getClass();
        return c0a.o("MOV_", lz8.a(date), ".mp4");
    }

    lz8 e();

    default String f(boolean z) {
        lz8 lz8VarE = e();
        Date date = new Date();
        lz8VarE.getClass();
        return qv1.l("IMG_", lz8.a(date), ".", z ? "gif" : "jpg");
    }
}
