package defpackage;

import java.util.List;
import one.me.chats.tab.ChatsTabWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class to3 {
    public final /* synthetic */ ChatsTabWidget a;

    public to3(ChatsTabWidget chatsTabWidget) {
        this.a = chatsTabWidget;
    }

    public final void a() {
        zv8[] zv8VarArr = ChatsTabWidget.B1;
        iug iugVarB1 = this.a.B1();
        Integer numValueOf = Integer.valueOf(R.drawable.icon_info_fill);
        boolean zBooleanValue = ((Boolean) iugVarB1.d.getValue()).booleanValue();
        osg osgVar = (osg) ww3.t1((List) iugVarB1.l.d.a.getValue());
        int i = ((vqg) iugVarB1.c.getValue()).h;
        boolean z = false;
        if (osgVar != null && osgVar.a && osgVar.e >= i) {
            z = true;
        }
        if (zBooleanValue && !z) {
            ic6 ic6Var = iugVarB1.o;
            uug.b.getClass();
            a8j.x(ic6Var, uug.j());
        } else {
            ic6 ic6Var2 = iugVarB1.p;
            if (z) {
                a8j.x(ic6Var2, new hrg(new tnh(R.string.oneme_stories_publish_max_count), numValueOf));
            } else {
                a8j.x(ic6Var2, new hrg(new tnh(R.string.oneme_stories_publish_denied), numValueOf));
            }
        }
    }

    public final void b(long j) {
        Boolean boolValueOf;
        ChatsTabWidget chatsTabWidget = this.a;
        if (chatsTabWidget.getView() != null) {
            zv8[] zv8VarArr = ChatsTabWidget.B1;
            boolValueOf = Boolean.valueOf(chatsTabWidget.A1().isClickable());
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null ? boolValueOf.booleanValue() : true) {
            zv8[] zv8VarArr2 = ChatsTabWidget.B1;
            chatsTabWidget.B1().C(j, chatsTabWidget.a, gvg.ALL);
        }
    }
}
