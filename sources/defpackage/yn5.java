package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class yn5 implements vn5 {
    @Override // defpackage.vn5
    public final void a(kr0 kr0Var) {
        ((ThreadPoolExecutor) zn5.a.getValue()).execute(new xn5(kr0Var, 0));
    }
}
