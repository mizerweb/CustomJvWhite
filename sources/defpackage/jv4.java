package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jv4 {
    public static final o6 b = new o6(5);
    public static final zc6 c = new zc6(new zc6(new b54(1, new o6(6)), 3), 4);
    public final Context a;

    public /* synthetic */ jv4(Context context) {
        this.a = context;
    }

    public static cv4 a(File file) throws Exception {
        try {
            String name = file.getName();
            int iY0 = r5h.Y0(name, '_', 0, 6);
            if (iY0 < 0) {
                throw new IllegalStateException("Malformed directory name ".concat(name).toString());
            }
            int i = iic.i(name.substring(0, iY0));
            long j = Long.parseLong(name.substring(iY0 + 1));
            File fileQ0 = lu6.q0(file, "system_info");
            if (!fileQ0.exists()) {
                throw new IllegalStateException("No system info file");
            }
            File fileQ1 = lu6.q0(file, "stacktrace");
            if (!fileQ1.exists()) {
                throw new IllegalStateException("No stacktrace file");
            }
            return new cv4(j, i, file.getPath(), fileQ0.getPath(), lu6.q0(file, "tags").getPath(), fileQ1.getPath(), lu6.q0(file, "all_stacktraces").getPath(), lu6.q0(file, "all_logs").getPath());
        } catch (Exception e) {
            lu6.l0(file);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r16v0, types: [jv4] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [cv4] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public cv4 b(int i, byte[] bArr, JSONObject jSONObject, Map map, List list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strP = ch3.p();
        Context context = this.a;
        int i2 = 0;
        File fileQ0 = lu6.q0(lu6.q0(new File(context.getCacheDir(), strP.equals(context.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)))), "crashes"), iic.o(i) + "_" + jCurrentTimeMillis);
        ?? r11 = 0;
        r11 = 0;
        if (fileQ0.exists()) {
            fileQ0.getName();
            return null;
        }
        try {
            sb8.U(fileQ0);
            File fileQ1 = lu6.q0(fileQ0, "stacktrace");
            lu6.r0(fileQ1, bArr);
            File fileQ2 = lu6.q0(fileQ0, "system_info");
            lu6.s0(fileQ2, jSONObject.toString());
            File fileQ3 = lu6.q0(fileQ0, "tags");
            File fileQ4 = lu6.q0(fileQ0, "all_stacktraces");
            try {
                if (map.isEmpty()) {
                    this = 0;
                } else {
                    TreeMap treeMap = new TreeMap(b);
                    treeMap.putAll(map);
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileQ4), pt2.a), 8192));
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            Thread thread = (Thread) entry.getKey();
                            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                            printWriter.append((CharSequence) "Thread: ").append((CharSequence) thread.getName()).append((CharSequence) " (").append((CharSequence) thread.getState().toString()).append((CharSequence) ")");
                            printWriter.append('\n');
                            int length = stackTraceElementArr.length;
                            int i3 = 0;
                            while (i3 < length) {
                                this = r11;
                                try {
                                    yxl.d(stackTraceElementArr[i3], printWriter, 0, 6);
                                    i3++;
                                    r11 = this;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        rx8.n(printWriter, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        this = r11;
                        printWriter.close();
                    } catch (Throwable th4) {
                        th = th4;
                        this = r11;
                    }
                }
                File fileQ5 = lu6.q0(fileQ0, "all_logs");
                if (!list.isEmpty()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileQ5), 8192);
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int i4 = i2 + 1;
                            ((be9) it.next()).a(bufferedOutputStream, i2);
                            i2 = i4;
                        }
                        bufferedOutputStream.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            rx8.n(bufferedOutputStream, th5);
                            throw th6;
                        }
                    }
                }
                return new cv4(jCurrentTimeMillis, i, fileQ0.getPath(), fileQ2.getPath(), fileQ3.getPath(), fileQ1.getPath(), fileQ4.getPath(), fileQ5.getPath());
            } catch (IOException unused) {
                lu6.l0(fileQ0);
                return this;
            }
        } catch (IOException unused2) {
            this = 0;
        }
    }
}
