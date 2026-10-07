package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import one.me.android.debug.StrictModeHelper$ViolationException;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class bu extends iv4 {
    public static final bu a = new bu();
    public static final Class[] b = {StrictModeHelper$ViolationException.class};
    public static volatile af7 c = new b6(3);
    public static volatile IntConsumer d = new au();
    public static final AtomicInteger e = new AtomicInteger(0);
    public static volatile af7 f = new b6(4);
    public static final ifh g = new ifh(new b6(5));
    public static final ifh h = new ifh(new b6(6));

    @Override // defpackage.iv4
    public final void a(String str, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        if (str == null) {
            IssueKeyException issueKeyException = th instanceof IssueKeyException ? (IssueKeyException) th : null;
            if (issueKeyException == null) {
                Throwable cause = th.getCause();
                issueKeyException = cause instanceof IssueKeyException ? (IssueKeyException) cause : null;
            }
            str = issueKeyException != null ? issueKeyException.getIssueKey() : null;
        }
        if (str == null || str.length() == 0) {
            if (((th instanceof Error) || ((Boolean) c.invoke()).booleanValue()) && ((xwh) h.getValue()) != null) {
                xwh.c(null, th, null);
            }
        } else if (((xwh) h.getValue()) != null) {
            xwh.c(qwf.e, th, str);
        }
        d.accept(e.incrementAndGet());
    }

    @Override // defpackage.iv4
    public final void c(String str, String str2) {
        if (((swh) g.getValue()) != null) {
            swh.e(str, str2);
        }
    }
}
