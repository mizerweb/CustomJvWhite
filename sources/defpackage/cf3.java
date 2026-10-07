package defpackage;

import android.view.View;
import one.me.main.MainScreen;

/* JADX INFO: loaded from: classes.dex */
public final class cf3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cf3(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((we3) this.c).invoke(Long.valueOf(((h9h) this.b).a));
                break;
            case 1:
                ((we3) this.c).invoke(((h9h) this.b).i);
                break;
            default:
                String str = ((MainScreen) this.c).t;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "before handleClick, view hierarchy ... ".concat(n9j.c(view)), null);
                    }
                }
                ((MainScreen) this.c).z1((rxb) this.b, null);
                break;
        }
    }
}
