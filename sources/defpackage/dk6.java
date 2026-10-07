package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class dk6 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ TextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk6(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        TextView textView = (TextView) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                dk6 dk6Var = new dk6(3, lq4Var, 0);
                dk6Var.f = textView;
                dk6Var.invokeSuspend(sbiVar);
                break;
            case 1:
                dk6 dk6Var2 = new dk6(3, lq4Var, 1);
                dk6Var2.f = textView;
                dk6Var2.invokeSuspend(sbiVar);
                break;
            case 2:
                dk6 dk6Var3 = new dk6(3, lq4Var, 2);
                dk6Var3.f = textView;
                dk6Var3.invokeSuspend(sbiVar);
                break;
            case 3:
                dk6 dk6Var4 = new dk6(3, lq4Var, 3);
                dk6Var4.f = textView;
                dk6Var4.invokeSuspend(sbiVar);
                break;
            case 4:
                dk6 dk6Var5 = new dk6(3, lq4Var, 4);
                dk6Var5.f = textView;
                dk6Var5.invokeSuspend(sbiVar);
                break;
            case 5:
                dk6 dk6Var6 = new dk6(3, lq4Var, 5);
                dk6Var6.f = textView;
                dk6Var6.invokeSuspend(sbiVar);
                break;
            case 6:
                dk6 dk6Var7 = new dk6(3, lq4Var, 6);
                dk6Var7.f = textView;
                dk6Var7.invokeSuspend(sbiVar);
                break;
            case 7:
                dk6 dk6Var8 = new dk6(3, lq4Var, 7);
                dk6Var8.f = textView;
                dk6Var8.invokeSuspend(sbiVar);
                break;
            case 8:
                dk6 dk6Var9 = new dk6(3, lq4Var, 8);
                dk6Var9.f = textView;
                dk6Var9.invokeSuspend(sbiVar);
                break;
            case 9:
                dk6 dk6Var10 = new dk6(3, lq4Var, 9);
                dk6Var10.f = textView;
                dk6Var10.invokeSuspend(sbiVar);
                break;
            default:
                dk6 dk6Var11 = new dk6(3, lq4Var, 10);
                dk6Var11.f = textView;
                dk6Var11.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        TextView textView = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().d);
                break;
            case 1:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar.h(textView).u().c.g).c), null, new ColorDrawable(-1)));
                break;
            case 2:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().c);
                break;
            case 3:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                break;
            case 4:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().c);
                break;
            case 5:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                break;
            case 6:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().c);
                break;
            case 7:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                break;
            case 8:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().d);
                break;
            case 9:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().b);
                break;
            default:
                ch3.d0(obj);
                textView.setTextColor(a8gVar.h(textView).getText().c);
                break;
        }
        return sbiVar;
    }
}
