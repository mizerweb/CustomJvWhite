package defpackage;

import android.content.Context;
import android.graphics.PointF;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class bn1 implements g32 {
    public final ny8 a;
    public final ny8 b;
    public final LinkedHashSet c = new LinkedHashSet();
    public int d;
    public int e;

    public bn1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        k4f k4fVarO = f55.o((Context) ny8Var.getValue());
        this.d = k4fVarO.b;
        this.e = k4fVarO.a;
        ((l92) ny8Var3.getValue()).f(this);
    }

    public final void a(ev1 ev1Var) {
        this.c.add(ev1Var);
    }

    public final void e(ev1 ev1Var) {
        this.c.remove(ev1Var);
    }

    public final void f(k4f k4fVar) {
        int i = this.d;
        int i2 = this.e;
        int i3 = k4fVar.b;
        int i4 = k4fVar.a;
        ny8 ny8Var = this.a;
        float f = ((rn1) ((qn1) ny8Var.getValue())).e().x;
        float f2 = ((rn1) ((qn1) ny8Var.getValue())).e().y;
        ((rn1) ((qn1) ny8Var.getValue())).getClass();
        int iK = gm0.K(l1d.a.b * yl5.d().getDisplayMetrics().density);
        int iA = ((rn1) ((qn1) ny8Var.getValue())).a();
        int i5 = i - iK;
        float fU = i5 > 0 ? oc9.u(f / i5, 0.0f, 1.0f) : 0.0f;
        int i6 = i2 - iA;
        float fU2 = i6 > 0 ? oc9.u(f2 / i6, 0.0f, 1.0f) : 0.0f;
        int i7 = i3 - iK;
        float f3 = fU * i7;
        int i8 = i4 - iA;
        float f4 = fU2 * i8;
        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i9 = i7 - iK2;
        if (i9 < iK2) {
            i9 = iK2;
        }
        int i10 = i8 - iK3;
        if (i10 < iK3) {
            i10 = iK3;
        }
        PointF pointF = new PointF(oc9.u(f3, iK2, i9), oc9.u(f4, iK3, i10));
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ev1) it.next()).setStartPosition(pointF);
        }
        qn1 qn1Var = (qn1) ny8Var.getValue();
        float f5 = pointF.x;
        float f6 = pointF.y;
        PointF pointF2 = ((rn1) qn1Var).b;
        pointF2.x = f5;
        pointF2.y = f6;
        this.d = i3;
        this.e = i4;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        ((l92) this.b.getValue()).e(this);
        this.c.clear();
    }
}
