package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class xw8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ KeyboardStickersWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw8(lq4 lq4Var, KeyboardStickersWidget keyboardStickersWidget) {
        super(2, lq4Var);
        this.e = 1;
        this.g = keyboardStickersWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        KeyboardStickersWidget keyboardStickersWidget = this.g;
        switch (i) {
            case 0:
                xw8 xw8Var = new xw8(keyboardStickersWidget, lq4Var, 0);
                xw8Var.f = obj;
                return xw8Var;
            case 1:
                xw8 xw8Var2 = new xw8(lq4Var, keyboardStickersWidget);
                xw8Var2.f = obj;
                return xw8Var2;
            default:
                xw8 xw8Var3 = new xw8(keyboardStickersWidget, lq4Var, 2);
                xw8Var3.f = obj;
                return xw8Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xw8) create((jpg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xw8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xw8) create((ipg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        KeyboardStickersWidget keyboardStickersWidget = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                jpg jpgVar = (jpg) obj2;
                ch3.d0(obj);
                keyboardStickersWidget.i.H(jpgVar.a);
                keyboardStickersWidget.j.H(jpgVar.b);
                break;
            case 1:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    rw8.b.e((i65) rbbVar);
                }
                break;
            default:
                ipg ipgVar = (ipg) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = KeyboardStickersWidget.l;
                k96 k96VarO1 = keyboardStickersWidget.o1();
                int i2 = ipgVar.b;
                if (i2 >= 0) {
                    k96VarO1.E0();
                    GridLayoutManager gridLayoutManagerC0 = tre.c0(k96VarO1);
                    if (gridLayoutManagerC0 != null) {
                        gridLayoutManagerC0.p1(i2, 0);
                    }
                }
                RecyclerView recyclerViewP1 = keyboardStickersWidget.p1();
                int i3 = ipgVar.c;
                if (i3 >= 0) {
                    recyclerViewP1.E0();
                    recyclerViewP1.w0(i3);
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw8(KeyboardStickersWidget keyboardStickersWidget, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = keyboardStickersWidget;
    }
}
