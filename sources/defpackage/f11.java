package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f11 implements tf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, final Object obj3) {
        int i;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                kbc kbcVar = (kbc) obj3;
                int iD = qt4.D(((h11) obj4).w);
                if (iD == 0) {
                    i = kbcVar.v().c;
                } else {
                    if (iD != 1) {
                        ore.o();
                        return null;
                    }
                    i = kbcVar.v().b;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return sbiVar;
            case 1:
                final p41 p41Var = (p41) obj4;
                final tdf tdfVar = (tdf) obj;
                return new tf7() { // from class: g41
                    @Override // defpackage.tf7
                    public final Object i(Object obj5, Object obj6, Object obj7) throws IllegalAccessException, InvocationTargetException {
                        c5b c5bVar = r41.l;
                        Object obj8 = obj3;
                        if (obj8 != c5bVar) {
                            fel.a(p41Var.b, obj8, ((sdf) tdfVar).a);
                        }
                        return sbi.a;
                    }
                };
            default:
                ((egf) obj4).d();
                return sbiVar;
        }
    }
}
