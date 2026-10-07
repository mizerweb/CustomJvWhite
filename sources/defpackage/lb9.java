package defpackage;

import android.content.Context;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class lb9 {
    public final Context a;
    public final CidLogger b;
    public volatile boolean c;
    public volatile boolean d;

    public lb9(Context context, CidLogger cidLogger) {
        context.getClass();
        this.a = context;
        this.b = cidLogger;
        this.c = np4.c(context, "android.permission.RECORD_AUDIO") == 0;
        this.d = np4.c(context, "android.permission.CAMERA") == 0;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = np4.c(this.a, "android.permission.RECORD_AUDIO") == 0;
        boolean z3 = np4.c(this.a, "android.permission.CAMERA") == 0;
        CidLogger cidLogger = this.b;
        boolean z4 = this.c;
        boolean z5 = this.d;
        StringBuilder sbB = zo5.B("call permissions state updated, audio: ", z4, "->", z2, ", video: ");
        sbB.append(z5);
        sbB.append("->");
        sbB.append(z3);
        cidLogger.log("LocalMediaPermissionProvider", sbB.toString());
        if (this.c != z2) {
            this.c = z2;
            z = true;
        }
        if (this.d == z3) {
            return z;
        }
        this.d = z3;
        return true;
    }
}
