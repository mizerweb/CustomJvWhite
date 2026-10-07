package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vql {
    public static String a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iRemaining; i++) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb.toString().trim();
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static qcg b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        qcg qcgVar;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                Log.w("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
                o7j.b("SoLoader", "Corrupted lib name detected");
                qcgVar = new ocg(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                qcgVar = new qcg(str, unsatisfiedLinkError.toString());
            }
        } else {
            o7j.b("SoLoader", "Corrupted lib file detected");
            qcgVar = new ocg(str, unsatisfiedLinkError.toString());
        }
        qcgVar.initCause(unsatisfiedLinkError);
        return qcgVar;
    }

    public static String c(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = j2 - timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - timeUnit.toMillis(j3)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }
}
