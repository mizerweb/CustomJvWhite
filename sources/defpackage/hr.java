package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hr(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    @Override // java.lang.Runnable
    public final void run() {
        mc9 mc9Var;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            Object objB = kr.b();
                            if (objB != null) {
                                mc9Var = new mc9(new nc9(jr.a(objB)));
                            } else {
                                mc9Var = mc9.b;
                            }
                        } else {
                            mc9Var = kr.c;
                            if (mc9Var == null) {
                                mc9Var = mc9.b;
                            }
                        }
                        if (mc9Var.c()) {
                            String strY = np4.y(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                jr.b(systemService, ir.a(strY));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                kr.f = true;
                break;
            case 1:
                kr.n(context);
                break;
            default:
                try {
                    String strP = ch3.p();
                    File file = new File(context.getCacheDir(), strP.equals(context.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false))));
                    File fileQ0 = lu6.q0(file, "perf-old.bin");
                    File fileQ1 = lu6.q0(file, "perf-current.bin");
                    if (fileQ0.exists()) {
                        sb8.o(fileQ0);
                    }
                    if (fileQ1.exists()) {
                        File parentFile = fileQ0.getParentFile();
                        if (parentFile != null) {
                            sb8.U(parentFile);
                        }
                        sb8.e0(fileQ1, fileQ0);
                        yxh.b(new f4g(13, fileQ0));
                    }
                    jrc jrcVar = new jrc(fileQ1);
                    sxh sxhVar = txh.b;
                    if (sxhVar instanceof rxh) {
                        jrcVar.g(((rxh) sxhVar).a);
                    } else {
                        Objects.toString(txh.b);
                    }
                    txh.b = new iw8(12);
                } catch (Exception unused) {
                    txh.b = zpe.n;
                    return;
                }
                break;
        }
    }
}
