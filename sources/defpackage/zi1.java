package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class zi1 {
    public final OkApiServiceInternal a;
    public final CidLogger b;
    public final qs4 c;
    public final String d;
    public final Set e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zi1(OkApiServiceInternal okApiServiceInternal, CidLogger cidLogger, qs4 qs4Var, String str, Set set) {
        this.a = okApiServiceInternal;
        this.b = cidLogger;
        this.c = qs4Var;
        this.d = str;
        this.e = set;
    }
}
