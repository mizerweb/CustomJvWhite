package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class e85 implements ot5 {
    public final ti a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final f1b d;
    public final k2d e;
    public final ru4 f;
    public final h85 g;
    public final h85 h;
    public final h85 i;
    public final h85 j;

    public e85(ti tiVar, tai taiVar, jif jifVar, RealtimeSinceBootClock realtimeSinceBootClock, k2d k2dVar, ru4 ru4Var, wi wiVar, wi wiVar2, h85 h85Var, h85 h85Var2, h85 h85Var3, h85 h85Var4) {
        this.a = tiVar;
        this.b = taiVar;
        this.c = jifVar;
        this.d = realtimeSinceBootClock;
        this.e = k2dVar;
        this.f = ru4Var;
        this.g = h85Var;
        this.i = h85Var3;
        this.h = h85Var2;
        this.j = h85Var4;
    }

    @Override // defpackage.ot5
    public final Drawable a(xt3 xt3Var) {
        ux0 ae7Var;
        g85 g85Var;
        ww6 ww6Var = null;
        if (!(xt3Var instanceof wt3)) {
            return null;
        }
        wt3 wt3Var = (wt3) xt3Var;
        cj cjVarL = wt3Var.l();
        gj gjVarY = wt3Var.y();
        gjVarY.getClass();
        Bitmap.Config configG = cjVarL != null ? cjVarL.g() : null;
        Object obj = this.g.b;
        cj cjVarA = gjVarY.a();
        byte b = 0;
        si siVarX = this.a.x(gjVarY, new Rect(0, 0, cjVarA.getWidth(), cjVarA.getHeight()));
        due dueVar = new due(siVarX);
        Integer num = 2;
        int iIntValue = num.intValue();
        ru4 ru4Var = this.f;
        if (iIntValue == 1) {
            ae7Var = new ae7(new ljf(new ek(gjVarY.hashCode(), false), ru4Var), true);
        } else if (iIntValue != 2) {
            ae7Var = iIntValue != 3 ? new ku8() : new vc7();
        } else {
            ae7Var = new ae7(new ljf(new ek(gjVarY.hashCode(), false), ru4Var), false);
        }
        ri riVar = new ri(ae7Var, siVarX, ((Boolean) obj).booleanValue());
        Integer num2 = 3;
        int iIntValue2 = num2.intValue();
        k2d k2dVar = this.e;
        if (iIntValue2 > 0) {
            ww6Var = new ww6(iIntValue2, b, b);
            if (configG == null) {
                configG = Bitmap.Config.ARGB_8888;
            }
            g85Var = new g85(k2dVar, riVar, configG, this.c);
        } else {
            g85Var = null;
        }
        return new qi(xj.a(new px0(this.e, ae7Var, dueVar, riVar, ((Boolean) obj).booleanValue(), ((Boolean) obj).booleanValue() ? new sc7(gjVarY.b(), dueVar, riVar, new qc7(k2dVar, ((Integer) this.i.b).intValue(), ((Integer) this.j.b).intValue()), ((Boolean) this.h.b).booleanValue()) : ww6Var, g85Var), this.d, this.b));
    }

    @Override // defpackage.ot5
    public final boolean b(xt3 xt3Var) {
        return xt3Var instanceof wt3;
    }
}
