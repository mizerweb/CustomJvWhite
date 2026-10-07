package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class mw8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ KeyboardEmojiWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw8(lq4 lq4Var, KeyboardEmojiWidget keyboardEmojiWidget) {
        super(2, lq4Var);
        this.e = 1;
        this.g = keyboardEmojiWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        KeyboardEmojiWidget keyboardEmojiWidget = this.g;
        switch (i) {
            case 0:
                mw8 mw8Var = new mw8(keyboardEmojiWidget, lq4Var, 0);
                mw8Var.f = obj;
                return mw8Var;
            case 1:
                mw8 mw8Var2 = new mw8(lq4Var, keyboardEmojiWidget);
                mw8Var2.f = obj;
                return mw8Var2;
            default:
                mw8 mw8Var3 = new mw8(keyboardEmojiWidget, lq4Var, 2);
                mw8Var3.f = obj;
                return mw8Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((mw8) create((b66) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((mw8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((mw8) create((c66) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        KeyboardEmojiWidget keyboardEmojiWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                b66 b66Var = (b66) obj2;
                ch3.d0(obj);
                keyboardEmojiWidget.h.H(b66Var.a);
                keyboardEmojiWidget.g.H(b66Var.b);
                break;
            case 1:
                ch3.d0(obj);
                cz9 cz9Var = (cz9) obj2;
                if (cz9Var instanceof zy9) {
                    zv8[] zv8VarArr = KeyboardEmojiWidget.k;
                    mjg mjgVar = keyboardEmojiWidget.r1().l;
                    b66 b66Var2 = (b66) mjgVar.getValue();
                    List list = b66Var2.a;
                    List list2 = b66Var2.b;
                    ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mjgVar.j(null, new b66(list, arrayList));
                        } else {
                            Object objI = (k79) it.next();
                            z46 z46Var = objI instanceof z46 ? (z46) objI : null;
                            if (z46Var != null) {
                                objI = z46.i(z46Var, 0, true, 63);
                            }
                            arrayList.add(objI);
                        }
                    }
                } else if (cz9Var instanceof xy9) {
                    zv8[] zv8VarArr2 = KeyboardEmojiWidget.k;
                    keyboardEmojiWidget.r1().C(((xy9) cz9Var).a, Boolean.FALSE);
                }
                break;
            default:
                c66 c66Var = (c66) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr3 = KeyboardEmojiWidget.k;
                RecyclerView recyclerViewO1 = keyboardEmojiWidget.o1();
                int i2 = c66Var.b;
                if (i2 >= 0) {
                    recyclerViewO1.E0();
                    GridLayoutManager gridLayoutManagerC0 = tre.c0(recyclerViewO1);
                    if (gridLayoutManagerC0 != null) {
                        gridLayoutManagerC0.p1(i2, 0);
                    }
                }
                RecyclerView recyclerViewQ1 = keyboardEmojiWidget.q1();
                int i3 = c66Var.c;
                if (i3 >= 0) {
                    recyclerViewQ1.E0();
                    recyclerViewQ1.w0(i3);
                }
                if (c66Var.b >= 0) {
                    keyboardEmojiWidget.o1().X();
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw8(KeyboardEmojiWidget keyboardEmojiWidget, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = keyboardEmojiWidget;
    }
}
