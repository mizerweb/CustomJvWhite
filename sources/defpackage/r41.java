package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r41 {
    public static final es2 a = new es2(-1, null, null, 0);
    public static final int b = oc9.d0(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = oc9.d0(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final c5b d = new c5b("BUFFERED", 1);
    public static final c5b e = new c5b("SHOULD_BUFFER", 1);
    public static final c5b f = new c5b("S_RESUMING_BY_RCV", 1);
    public static final c5b g = new c5b("RESUMING_BY_EB", 1);
    public static final c5b h = new c5b("POISONED", 1);
    public static final c5b i = new c5b("DONE_RCV", 1);
    public static final c5b j = new c5b("INTERRUPTED_SEND", 1);
    public static final c5b k = new c5b("INTERRUPTED_RCV", 1);
    public static final c5b l = new c5b("CHANNEL_CLOSED", 1);
    public static final c5b m = new c5b("SUSPEND", 1);
    public static final c5b n = new c5b("SUSPEND_NO_WAITER", 1);
    public static final c5b o = new c5b("FAILED", 1);
    public static final c5b p = new c5b("NO_RECEIVE_RESULT", 1);
    public static final c5b q = new c5b("CLOSE_HANDLER_CLOSED", 1);
    public static final c5b r = new c5b("CLOSE_HANDLER_INVOKED", 1);
    public static final c5b s = new c5b("NO_CLOSE_CAUSE", 1);

    public static final boolean a(ck2 ck2Var, Object obj, tf7 tf7Var) {
        c5b c5bVarE = ck2Var.e(obj, tf7Var);
        if (c5bVarE == null) {
            return false;
        }
        ck2Var.m(c5bVarE);
        return true;
    }
}
