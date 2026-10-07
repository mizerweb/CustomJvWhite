package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nu7 {
    public static final nu7 a = new nu7();
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static Context c;

    public static void a(File file) {
        if (file.exists()) {
            file.toString();
            file.delete();
        }
    }

    public static void b(String str) {
        Context context;
        String str2;
        if (swh.b || (context = c) == null || !b.getAndSet(false)) {
            return;
        }
        m3a m3aVar = swh.c;
        if (m3aVar == null) {
            m3aVar = null;
        }
        String str3 = (String) m3aVar.d;
        String strP = ch3.p();
        if (strP.equals(context.getPackageName())) {
            str2 = "tracer";
        } else {
            str2 = "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)));
        }
        File file = new File(context.getCacheDir(), str2);
        File fileQ0 = lu6.q0(file, "dump-tmp.hprof");
        File fileQ1 = lu6.q0(file, "dump-tmp-meta.json");
        try {
            sb8.U(file);
            Debug.dumpHprofData(fileQ0.getAbsolutePath());
            lu6.s0(fileQ1, new mu7(str3, str).c());
        } catch (Exception unused) {
            a(fileQ0);
            a(fileQ1);
        }
        File fileQ2 = lu6.q0(file, "dump.hprof");
        File fileQ3 = lu6.q0(file, "dump-meta.json");
        try {
            if (fileQ2.exists()) {
                sb8.o(fileQ2);
            }
            if (fileQ3.exists()) {
                sb8.o(fileQ3);
            }
            sb8.e0(fileQ0, fileQ2);
            sb8.e0(fileQ1, fileQ3);
        } catch (Exception unused2) {
            a(fileQ2);
            a(fileQ3);
        }
    }
}
