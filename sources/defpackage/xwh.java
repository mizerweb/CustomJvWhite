package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class xwh {
    public static final xwh a = new xwh();
    public static n3 b;

    public static final byte[] a(Throwable th) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, pt2.a), 8192);
        try {
            yxl.b(th, bufferedWriter);
            bufferedWriter.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rx8.n(bufferedWriter, th2);
                throw th3;
            }
        }
    }

    public static final void b(String str) {
        if (swh.b) {
            return;
        }
        try {
            n3 n3Var = b;
            if (n3Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            oe9 oe9Var = (oe9) n3Var.d;
            int i = oe9Var.a - 36;
            if (i <= 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bytes = str.getBytes(pt2.a);
            SimpleDateFormat simpleDateFormat = de9.a;
            if (bytes.length > i) {
                if ((bytes[i] & 192) == 128) {
                    do {
                        i--;
                        if (i < 0) {
                            break;
                        }
                    } while ((bytes[i] & 192) == 128);
                }
                bytes = a.T0(0, bytes, i);
            }
            be9 be9Var = new be9(jCurrentTimeMillis, bytes);
            qd9 qd9Var = oe9Var.i;
            synchronized (qd9Var.b) {
                try {
                    qd9Var.b.addLast(be9Var);
                    qd9Var.c += be9Var.c;
                    while (qd9Var.c > qd9Var.a) {
                        zv zvVar = qd9Var.b;
                        be9 be9Var2 = (be9) (zvVar.isEmpty() ? null : zvVar.removeFirst());
                        if (be9Var2 == null) {
                            qd9Var.c = 0;
                        } else {
                            qd9Var.c -= be9Var2.c;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            yxh.a(new o90(oe9Var, 9, be9Var));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    public static final void c(qwf qwfVar, Throwable th, String str) {
        int iCompareTo;
        boolean z;
        List listT1;
        long availableBytes;
        if (swh.b) {
            return;
        }
        try {
            n3 n3Var = b;
            if (n3Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            byte[] bArrA = a(th);
            if (swh.b) {
                return;
            }
            snf snfVar = (snf) n3Var.b;
            synchronized (snfVar.b) {
                snfVar.b();
                lnf lnfVar = snfVar.k;
                if (lnfVar == null) {
                    lnfVar = null;
                }
                qwf qwfVar2 = lnfVar.g;
                if (qwfVar == null && qwfVar2 == null) {
                    iCompareTo = 0;
                } else if (qwfVar == null) {
                    iCompareTo = -1;
                } else {
                    iCompareTo = qwfVar2 == null ? 1 : qwfVar.compareTo(qwfVar2);
                }
                if (iCompareTo > 0) {
                    snf.c(snfVar, qwfVar, 1);
                }
            }
            fbc fbcVar = a8g.g;
            if (fbcVar == null) {
                ore.k("Tracer settings are not initialized.");
                return;
            }
            if (!gol.a(fbcVar, "system.shutdown.until.ts")) {
                StringBuilder sb = new StringBuilder("system.");
                sb.append("CRASH_REPORT");
                sb.append(".shutdown.until.ts");
                z = gol.a(fbcVar, sb.toString());
            }
            if (z) {
                return;
            }
            if (!uuh.a((uuh) n3Var.f)) {
                ((AtomicInteger) n3Var.g).incrementAndGet();
                yxh.a(new jj2(9, n3Var));
                return;
            }
            jv4 jv4Var = (jv4) n3Var.a;
            int iA = vnl.a(qwfVar);
            snf snfVar2 = (snf) n3Var.b;
            snfVar2.b();
            igh ighVar = snfVar2.f;
            igh ighVar2 = ighVar == null ? null : ighVar;
            khh khhVar = (khh) n3Var.c;
            synchronized (khhVar.e) {
                listT1 = ww3.T1(khhVar.e);
            }
            Date date = new Date();
            Method method = qwh.d;
            qwh qwhVarA = gyl.a();
            Context context = swh.d;
            long jFreeMemory = -1;
            try {
                availableBytes = new StatFs((context != null ? context : null).getFilesDir().getPath()).getAvailableBytes();
            } catch (Exception unused) {
                availableBytes = -1;
            }
            try {
                Runtime runtime = Runtime.getRuntime();
                jFreeMemory = runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory());
            } catch (Exception unused2) {
            }
            cv4 cv4VarB = jv4Var.b(iA, bArrA, xvc.d(ighVar2, listT1, date, str, qwhVarA, availableBytes, jFreeMemory), s66.a, ww3.T1(((oe9) n3Var.d).i));
            if (cv4VarB != null) {
                yxh.b(new jj2(n3Var, cv4VarB));
            }
        } catch (IllegalStateException unused3) {
        }
    }
}
