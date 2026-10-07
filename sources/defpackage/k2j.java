package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class k2j implements c3j {
    public final /* synthetic */ VideoMessageWidget a;

    public k2j(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    @Override // defpackage.c3j
    public final void e() {
        sgg sggVar;
        VideoMessageWidget videoMessageWidget = this.a;
        if (videoMessageWidget.i.d() && videoMessageWidget.w1() != null && ((sggVar = videoMessageWidget.z) == null || !sggVar.isActive())) {
            e3j e3jVarX1 = videoMessageWidget.x1();
            ghb ghbVar = ew5.b;
            videoMessageWidget.z = e9i.j0(new fz6(n1g.v(u3m.b(e3jVarX1, qe7.O(16, lw5.MILLISECONDS)), videoMessageWidget.getViewLifecycleOwner().f(), n09.d), new q2j(null, videoMessageWidget, 6), 3), videoMessageWidget.getViewLifecycleScope());
        }
        mjg mjgVar = videoMessageWidget.y1().p;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // defpackage.c3j
    public final void g() {
        zv8[] zv8VarArr = VideoMessageWidget.B;
        VideoMessageWidget videoMessageWidget = this.a;
        if (((Boolean) ((e5d) videoMessageWidget.d.getValue()).x().i()).booleanValue()) {
            ((zzi) videoMessageWidget.p.getValue()).setAlpha(1.0f);
        }
    }

    @Override // defpackage.c3j
    public final void m() throws IllegalAccessException, InvocationTargetException {
        zv8[] zv8VarArr = VideoMessageWidget.B;
        this.a.B1();
    }

    @Override // defpackage.c3j
    public final void p() throws IllegalAccessException, InvocationTargetException {
        zv8[] zv8VarArr = VideoMessageWidget.B;
        this.a.B1();
    }
}
