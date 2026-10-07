package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lxb implements tf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ lxb(int i) {
        this.a = i;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                ((ImageView) obj).setImageTintList(ColorStateList.valueOf(((kbc) obj3).getIcon().b));
                break;
            case 1:
                c60 c60Var = (c60) obj3;
                z60 z60VarA = c60Var.c().a();
                z60VarA.u = (String) obj2;
                z60VarA.v = (x60) obj;
                c60Var.d = new d70(z60VarA);
                break;
            default:
                x60 x60Var = (x60) obj;
                String str = (String) obj2;
                c60 c60Var2 = (c60) obj3;
                b60 b60Var = c60Var2.e;
                if (b60Var == null) {
                    b60Var = b60.j;
                }
                a60 a60VarA = b60Var.a();
                a60VarA.f = str;
                a60VarA.i = x60Var;
                c60Var2.e = new b60(a60VarA);
                break;
        }
        return sbiVar;
    }
}
