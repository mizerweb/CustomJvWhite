package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gzl {
    public static String a(long j, long j2) {
        return "[" + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j)) + ", " + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j2)) + "]";
    }

    public static void b(MediaFormat mediaFormat, LogSessionId logSessionId) {
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mediaFormat.setString("log-session-id", logSessionId.getStringId());
    }

    public static String c(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strJ0 = z5h.J0(((xx9) list.get(i)).toString(), "\n", "\n                  ");
            sb.append("\n                  ");
            sb.append(strJ0);
        }
        return sb.toString();
    }

    public static String d(w5a w5aVar) {
        StringBuilder sbC = nbh.C("\n                  mute=");
        sbC.append(w5aVar.h);
        sbC.append("\n                  streamable_mp4=");
        sbC.append(w5aVar.k);
        sbC.append("\n                  encoderConfig={");
        w5aVar.d.c(new nv4(15, sbC));
        sbC.append('\n');
        sbC.append("              ");
        sbC.append("    }");
        sbC.append('\n');
        sbC.append("              ");
        sbC.append("    position_range=");
        sbC.append('[');
        sbC.append(w5aVar.e);
        sbC.append(", ");
        sbC.append(w5aVar.f);
        sbC.append(']');
        return sbC.toString();
    }

    public static String e(w5a w5aVar, String str) {
        StringBuilder sbV = qt4.v("\n", str, "    ping_delay=");
        qv1.s(w5aVar.n, " ms\n", str, sbV);
        sbV.append("    stuck_delay=");
        return c0a.m(w5aVar.o, " ms", sbV);
    }

    public static String f(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n                  ");
            sb.append(arrayList.get(i));
        }
        return sb.toString();
    }
}
