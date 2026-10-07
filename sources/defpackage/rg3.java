package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rg3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        qf7 qf7Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((yh3) obj3).accept(((tg3) obj2).a, ((w73) obj).a);
                return true;
            case 1:
                ((yh3) obj3).accept(((tg3) obj2).a, ((w73) obj).a);
                return true;
            case 2:
                ((m20) obj3).invoke(Long.valueOf(((lk6) obj2).a), ((jk6) obj).a);
                return true;
            default:
                n67 n67Var = (n67) obj3;
                z9c z9cVar = (z9c) obj2;
                owb owbVar = (owb) obj;
                cf7 cf7Var = n67Var.h;
                if (cf7Var == null) {
                    return false;
                }
                boolean zBooleanValue = ((Boolean) cf7Var.invoke(z9cVar.getTabItem())).booleanValue();
                if (!zBooleanValue || (qf7Var = n67Var.i) == null) {
                    return zBooleanValue;
                }
                qf7Var.invoke(view, owbVar);
                return zBooleanValue;
        }
    }
}
