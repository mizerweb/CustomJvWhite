package defpackage;

import android.content.Context;
import android.graphics.PointF;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class rn1 implements qn1, g32 {
    public final ny8 a;
    public final PointF b;

    public rn1(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        ((l92) ny8Var2.getValue()).f(this);
        this.b = o7j.c((Context) ny8Var.getValue());
    }

    public final int a() {
        return gm0.K(l1d.a.a * yl5.d().getDisplayMetrics().density);
    }

    public final PointF e() {
        PointF pointF = this.b;
        return new PointF(pointF.x, pointF.y);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        PointF pointFC = o7j.c((Context) this.a.getValue());
        float f = pointFC.x;
        PointF pointF = this.b;
        pointF.x = f;
        pointF.y = pointFC.y;
    }
}
