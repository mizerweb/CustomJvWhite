package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vvb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kwb c;

    public /* synthetic */ vvb(kwb kwbVar, Context context) {
        this.a = 6;
        this.c = kwbVar;
        this.b = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        kwb kwbVar = this.c;
        switch (i) {
            case 0:
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, R.drawable.icon_warning_fill_color);
                lvb.A0(enhancedVectorDrawable, "background", c0a.h(a8gVar, context).j);
                lvb.B0(enhancedVectorDrawable, "icon", a8gVar.h(kwbVar).getIcon().g);
                enhancedVectorDrawable.setCallback(kwbVar);
                return enhancedVectorDrawable;
            case 1:
                EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context, R.drawable.ic_add_photo_28);
                lvb.A0(enhancedVectorDrawable2, "background", a8gVar.e(context).m().h().a);
                a8gVar.e(context).m();
                lvb.A0(enhancedVectorDrawable2, "photo", -1);
                enhancedVectorDrawable2.setCallback(kwbVar);
                return enhancedVectorDrawable2;
            case 2:
                EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context, R.drawable.ic_online_24);
                lvb.A0(enhancedVectorDrawable3, "online", c0a.h(a8gVar, context).i);
                lvb.B0(enhancedVectorDrawable3, "online", a8gVar.e(context).m().b().c);
                enhancedVectorDrawable3.setCallback(kwbVar);
                return enhancedVectorDrawable3;
            case 3:
                EnhancedVectorDrawable enhancedVectorDrawable4 = new EnhancedVectorDrawable(context, R.drawable.ic_delete_filled_apart_24);
                a8gVar.e(context).m();
                lvb.A0(enhancedVectorDrawable4, "cross", -1);
                lvb.A0(enhancedVectorDrawable4, "circle_background", c0a.h(a8gVar, context).d);
                enhancedVectorDrawable4.setCallback(kwbVar);
                return enhancedVectorDrawable4;
            case 4:
                p99 p99Var = new p99(context);
                p99Var.setCallback(kwbVar);
                return p99Var;
            case 5:
                ycf ycfVar = new ycf(context);
                ycfVar.setCallback(kwbVar);
                return ycfVar;
            default:
                return new qk0(kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate(), awb.a, this.b, new s9a(25), new s9a(26), 32);
        }
    }

    public /* synthetic */ vvb(Context context, kwb kwbVar, int i) {
        this.a = i;
        this.b = context;
        this.c = kwbVar;
    }
}
