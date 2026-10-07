package defpackage;

import android.net.Uri;
import android.view.View;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg3(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((xh3) obj2).accept(((w73) obj).a);
                break;
            case 1:
                ((xh3) obj2).accept(((w73) obj).a);
                break;
            default:
                zv8[] zv8VarArr = PinBarsWidget.z;
                nzc nzcVarT1 = ((PinBarsWidget) obj2).t1();
                boolean z = ((gf8) ((if8) obj)).g;
                ae8 ae8Var = nzcVarT1.z;
                if (ae8Var != null) {
                    String str = ae8Var.t;
                    if (str != null) {
                        ae8Var.j.a(new pe8(Uri.parse(str)));
                    }
                    yab.i0(ae8Var.n, null, 0, new uq2(ae8Var, z, null), 3);
                }
                break;
        }
    }
}
