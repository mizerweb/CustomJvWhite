package defpackage;

import android.widget.FrameLayout;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class pz9 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ FrameLayout f;
    public final /* synthetic */ MediaKeyboardWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz9(MediaKeyboardWidget mediaKeyboardWidget, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = mediaKeyboardWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaKeyboardWidget mediaKeyboardWidget = this.g;
        FrameLayout frameLayout = (FrameLayout) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                pz9 pz9Var = new pz9(mediaKeyboardWidget, lq4Var, 0);
                pz9Var.f = frameLayout;
                pz9Var.invokeSuspend(sbiVar);
                break;
            default:
                pz9 pz9Var2 = new pz9(mediaKeyboardWidget, lq4Var, 1);
                pz9Var2.f = frameLayout;
                pz9Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaKeyboardWidget mediaKeyboardWidget = this.g;
        FrameLayout frameLayout = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                vv vvVar = mediaKeyboardWidget.d;
                zv8 zv8Var = MediaKeyboardWidget.u[3];
                frameLayout.setBackgroundColor(((Boolean) vvVar.a(mediaKeyboardWidget)).booleanValue() ? MediaKeyboardWidget.o1(mediaKeyboardWidget).b().d : MediaKeyboardWidget.o1(mediaKeyboardWidget).k().b);
                break;
            default:
                ch3.d0(obj);
                frameLayout.setBackgroundColor(MediaKeyboardWidget.o1(mediaKeyboardWidget).p().c);
                break;
        }
        return sbiVar;
    }
}
