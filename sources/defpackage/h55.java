package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class h55 implements vm7 {
    public final p51 a;
    public final ex3 b;

    public h55(p51 p51Var, ex3 ex3Var) {
        this.a = p51Var;
        this.b = ex3Var;
    }

    @Override // defpackage.vm7
    public final cn7 a(Context context, boolean z) {
        return new i55(context, this.a, this.b);
    }
}
