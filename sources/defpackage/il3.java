package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class il3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(wfe wfeVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 2;
        this.f = wfeVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        int i2 = 3;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                vj4 vj4Var = (vj4) obj;
                new il3(i2, (lq4) obj3, 0).f = vj4Var;
                ch3.d0(sbiVar);
                return vj4Var;
            case 1:
                il3 il3Var = new il3(i2, (lq4) obj3, 1);
                il3Var.f = (ImageView) obj;
                il3Var.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                new il3((wfe) this.f, (lq4) obj3).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                vj4 vj4Var = (vj4) this.f;
                ch3.d0(obj);
                return vj4Var;
            case 1:
                ImageView imageView = (ImageView) this.f;
                ch3.d0(obj);
                a8g a8gVar = pq3.j;
                imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().b));
                imageView.setBackgroundColor(a8gVar.h(imageView).h().b);
                return sbiVar;
            default:
                ch3.d0(obj);
                ((vo8) ((wfe) this.f).a).b(null);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
