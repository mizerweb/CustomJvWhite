package defpackage;

import android.content.Context;
import org.webrtc.EglBase;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class g5f implements ub9 {
    public final y3e a;
    public final qq4 b;
    public volatile boolean c;
    public bc7 d;
    public ic7 e;
    public volatile wc7 f;
    public volatile boolean g = false;
    public final f5f h = new f5f(this, 2);

    public g5f(EglBase.Context context, Context context2, CidLogger cidLogger, ufk ufkVar, nue nueVar) {
        qq4 qq4Var = new qq4("SSSendControl");
        this.b = qq4Var;
        this.a = cidLogger;
        qq4Var.b(new xp4(this, context, context2, ufkVar, cidLogger, nueVar, 2));
    }

    @Override // defpackage.ub9
    public final void a(int i, int i2) {
        this.b.b(new q31(this, i, i2, 4));
    }
}
