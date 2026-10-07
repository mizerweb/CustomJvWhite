package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class ysl {
    public static y7m j;
    public static final tdm k;
    public final String a;
    public final String b;
    public final qsl c;
    public final a0g d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", zgc.c};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new tdm(objArr);
    }

    public ysl(Context context, a0g a0gVar, qsl qslVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = p44.a(context);
        this.d = a0gVar;
        this.c = qslVar;
        dul.A();
        this.g = "vision-common";
        this.e = zj9.b().c(new g35(4, this));
        zj9 zj9VarB = zj9.b();
        a0gVar.getClass();
        this.f = zj9VarB.c(new vsl(a0gVar, 0));
        tdm tdmVar = k;
        this.h = tdmVar.containsKey("vision-common") ? rx5.d(context, (String) tdmVar.get("vision-common"), false) : -1;
    }

    public final void a(vtl vtlVar, yhl yhlVar) {
        ngl nglVar;
        ehl ehlVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.i;
        if (map.get(yhlVar) != null && jElapsedRealtime - ((Long) map.get(yhlVar)).longValue() <= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return;
        }
        map.put(yhlVar, Long.valueOf(jElapsedRealtime));
        int i = vtlVar.a;
        int i2 = vtlVar.b;
        int i3 = vtlVar.c;
        int i4 = vtlVar.d;
        int i5 = vtlVar.e;
        long j2 = vtlVar.f;
        int i6 = vtlVar.g;
        tw5 tw5Var = new tw5();
        if (i == -1) {
            nglVar = ngl.BITMAP;
        } else if (i == 35) {
            nglVar = ngl.YUV_420_888;
        } else if (i == 842094169) {
            nglVar = ngl.YV12;
        } else if (i != 16) {
            nglVar = i != 17 ? ngl.UNKNOWN_FORMAT : ngl.NV21;
        } else {
            nglVar = ngl.NV16;
        }
        tw5Var.c = nglVar;
        if (i2 == 1) {
            ehlVar = ehl.BITMAP;
        } else if (i2 == 2) {
            ehlVar = ehl.BYTEARRAY;
        } else if (i2 != 3) {
            ehlVar = i2 != 4 ? ehl.ANDROID_MEDIA_IMAGE : ehl.FILEPATH;
        } else {
            ehlVar = ehl.BYTEBUFFER;
        }
        tw5Var.b = ehlVar;
        tw5Var.d = Integer.valueOf(i3 & Integer.MAX_VALUE);
        tw5Var.f = Integer.valueOf(i4 & Integer.MAX_VALUE);
        tw5Var.e = Integer.valueOf(i5 & Integer.MAX_VALUE);
        tw5Var.a = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD & j2);
        tw5Var.g = Integer.valueOf(i6 & Integer.MAX_VALUE);
        jhl jhlVar = new jhl(tw5Var);
        xtj xtjVar = new xtj(22, false);
        xtjVar.d = jhlVar;
        phf phfVar = new phf(xtjVar);
        Task task = this.e;
        zj9.g().execute(new wn2(this, phfVar, yhlVar, task.j() ? (String) task.h() : j09.c.a(this.g), 4, false));
    }
}
