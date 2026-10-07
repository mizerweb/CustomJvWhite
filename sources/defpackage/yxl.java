package defpackage;

import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yxl {
    public static final void a(Appendable appendable, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
    }

    public static final void b(Throwable th, Appendable appendable) {
        c(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    public static final void c(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, IdentityHashMap identityHashMap) throws IOException {
        int i3 = 1;
        if (identityHashMap.containsKey(th)) {
            a(appendable, 1);
            appendable.append("[CIRCULAR REFERENCE: ").append(th.toString()).append("]").append('\n');
            return;
        }
        if (identityHashMap.size() >= 50) {
            a(appendable, i);
            appendable.append("[EXCEPTION CHAIN TOO LONG]").append('\n');
            return;
        }
        identityHashMap.put(th, sbi.a);
        a(appendable, i);
        appendable.append(str).append(th.toString()).append('\n');
        if (!(th instanceof StackOverflowError)) {
            i3 = 0;
            break;
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[0];
        int length = stackTraceElementArr.length;
        while (true) {
            if (i3 >= length) {
                i3 = 0;
                break;
            } else if (cqk.d(stackTraceElement, stackTraceElementArr[i3])) {
                break;
            } else {
                i3++;
            }
        }
        int length2 = i3 > 0 ? i3 : stackTraceElementArr.length - i2;
        for (int i4 = 0; i4 < length2; i4++) {
            d(stackTraceElementArr[i4], appendable, i + 1, 4);
        }
        if (i3 > 0) {
            a(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i3)).append(" calls repeat").append('\n');
        } else if (i2 != 0) {
            a(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i2)).append(" more").append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            c(th2, appendable, i + 1, "Suppressed: ", stackTrace, e(stackTraceElementArr, stackTrace), identityHashMap);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            c(cause, appendable, i, "Caused by: ", stackTrace2, e(stackTraceElementArr, stackTrace2), identityHashMap);
        }
    }

    public static void d(StackTraceElement stackTraceElement, Appendable appendable, int i, int i2) throws IOException {
        String fileName;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        a(appendable, i);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append('\n');
    }

    public static final int e(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && cqk.d(stackTraceElementArr[length], stackTraceElementArr2[length2]); length2--) {
            length--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    public static final Object f(i37 i37Var, fka fkaVar) {
        if (nu6.$EnumSwitchMapping$0[i37Var.ordinal()] == 1) {
            return fjf.c(fkaVar);
        }
        try {
            fkaVar.x();
            return null;
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD == 0) {
                return null;
            }
            if (iD == 1) {
                throw th;
            }
            ore.o();
            return null;
        }
    }
}
