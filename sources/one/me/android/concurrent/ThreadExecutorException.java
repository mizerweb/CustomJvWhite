package one.me.android.concurrent;

import defpackage.c0a;
import defpackage.ew5;
import defpackage.ghb;
import defpackage.j95;
import defpackage.jqh;
import defpackage.kqh;
import defpackage.lw5;
import defpackage.mcj;
import defpackage.qe7;
import defpackage.ww3;
import defpackage.xw3;
import defpackage.yd6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0014\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bB\u001f\b\u0014\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/android/concurrent/ThreadExecutorException;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "issueKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lmcj;", "task", "Lyd6;", "timeProvider", "(Lmcj;Lyd6;)V", "", "tasks", "(Ljava/lang/Iterable;Lyd6;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ThreadExecutorException extends IssueKeyException {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThreadExecutorException(Iterable<mcj> iterable, yd6 yd6Var) {
        int size;
        Thread thread;
        StackTraceElement[] stackTrace;
        long jB = yd6Var.b();
        List listM1 = ww3.M1(iterable, new kqh(jB));
        int i = 0;
        mcj next = null;
        byte b = 0;
        byte b2 = 0;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<mcj> it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
                if (i2 < 0) {
                    xw3.U0();
                    throw null;
                }
            }
            size = i2;
        }
        this(ww3.z1(listM1, null, c0a.k(size, "Tasks in queue: ", "\n"), null, new jqh(jB, i), 29), b2 == true ? 1 : 0, 2, b == true ? 1 : 0);
        ghb ghbVar = ew5.b;
        long jP = qe7.P(System.nanoTime(), lw5.NANOSECONDS);
        Iterator<mcj> it2 = iterable.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                ew5 ew5Var = new ew5(next.a(jP));
                do {
                    mcj next2 = it2.next();
                    ew5 ew5Var2 = new ew5(next2.a(jP));
                    if (ew5Var.compareTo(ew5Var2) < 0) {
                        next = next2;
                        ew5Var = ew5Var2;
                    }
                } while (it2.hasNext());
            }
        }
        mcj mcjVar = next;
        if (mcjVar == null || (thread = mcjVar.d) == null || (stackTrace = thread.getStackTrace()) == null) {
            return;
        }
        setStackTrace(stackTrace);
    }

    public /* synthetic */ ThreadExecutorException(String str, String str2, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? "46750" : str2);
    }

    public ThreadExecutorException(mcj mcjVar, yd6 yd6Var) {
        StackTraceElement[] stackTrace;
        this(mcjVar.b(yd6Var.b()), null, 2, 0 == true ? 1 : 0);
        Thread thread = mcjVar.d;
        setStackTrace((thread == null || (stackTrace = thread.getStackTrace()) == null) ? (StackTraceElement[]) mcjVar.e.toArray(new StackTraceElement[0]) : stackTrace);
    }

    public ThreadExecutorException(String str, String str2) {
        super(4, str2, str, null);
    }
}
