package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class uzc extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ v5c f;
    public /* synthetic */ kbc g;
    public final /* synthetic */ PinBarsWidget h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzc(int i, lq4 lq4Var, PinBarsWidget pinBarsWidget) {
        super(3, lq4Var);
        this.e = i;
        this.h = pinBarsWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PinBarsWidget pinBarsWidget = this.h;
        v5c v5cVar = (v5c) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                uzc uzcVar = new uzc(0, lq4Var, pinBarsWidget);
                uzcVar.f = v5cVar;
                uzcVar.g = kbcVar;
                uzcVar.invokeSuspend(sbiVar);
                break;
            default:
                uzc uzcVar2 = new uzc(1, lq4Var, pinBarsWidget);
                uzcVar2.f = v5cVar;
                uzcVar2.g = kbcVar;
                uzcVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PinBarsWidget pinBarsWidget = this.h;
        switch (i) {
            case 0:
                v5c v5cVar = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                PinBarsWidget.o1(pinBarsWidget, v5cVar.getBackground(), ((fn8) kbcVar.u().c.b).c);
                if (!((Boolean) pinBarsWidget.r1().u().i()).booleanValue()) {
                    Drawable background = v5cVar.getBackground();
                    RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                    Drawable drawable = rippleDrawable != null ? rippleDrawable.getDrawable(0) : null;
                    ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
                    if (colorDrawable != null) {
                        colorDrawable.setColor(kbcVar.b().d);
                    }
                }
                break;
            default:
                v5c v5cVar2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                PinBarsWidget.o1(pinBarsWidget, v5cVar2.getBackground(), ((fn8) kbcVar2.u().c.b).c);
                break;
        }
        return sbiVar;
    }
}
