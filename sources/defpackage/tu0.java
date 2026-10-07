package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Ltu0;", "", "", "tag", "Lkotlin/Function0;", "message", "Lsbi;", "b", "(Ljava/lang/String;Laf7;)V", "", "throwable", "j", "(Ljava/lang/String;Ljava/lang/Throwable;Laf7;)V", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface tu0 {
    static /* synthetic */ void g(tu0 tu0Var, String str, Throwable th, af7 af7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: w");
            return;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        tu0Var.j(str, th, af7Var);
    }

    void b(String tag, af7 message);

    void j(String tag, Throwable throwable, af7 message);
}
