package defpackage;

import android.content.Context;
import android.view.View;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.stories.publish.PublishStoryBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class zd implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return yab.g((dq4) this.b, (vt4) this.c, 1, new sfd(obj, (lq4) null, (be) this.d, 6));
            case 1:
                return yab.g((dq4) this.b, (vt4) this.c, 1, new af8(obj, (lq4) null, (qyc) this.d, 17));
            case 2:
                return yab.g((dq4) this.b, (vt4) this.c, 2, new af8(obj, (lq4) null, (r00) this.d, 18));
            case 3:
                String name = kwe.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "bindAndAwaitResult: cancelled, unbinding", null);
                    }
                }
                kwe kweVar = (kwe) this.b;
                Context context = (Context) this.c;
                Object obj2 = ((wfe) this.d).a;
                kwe.a(kweVar, context, obj2 != null ? (jk7) obj2 : null);
                return sbi.a;
            case 4:
                ((r2j) this.b).dispose();
                String str = ((VideoMessageWidget) this.c).h;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, "last updating blur for video message screen after stable position", null);
                    }
                }
                ((View) this.d).getBackground().invalidateSelf();
                return sbi.a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                uik uikVar = ((fvj) this.b).u;
                long j = ((hyd) this.c).a;
                PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) uikVar.b;
                zv8[] zv8VarArr = PublishStoryBottomSheet.t;
                nyd nydVarE1 = publishStoryBottomSheet.E1();
                String str2 = nydVarE1.f;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str2, bc1.l(j, "onItemChecked: id: ", ", isChecked: ", zBooleanValue), null);
                    }
                }
                if (zBooleanValue) {
                    nydVarE1.D(j);
                }
                if (!zBooleanValue && ((hyd) this.c).c) {
                    ((izb) this.d).setItemSelected(true);
                }
                return sbi.a;
        }
    }
}
