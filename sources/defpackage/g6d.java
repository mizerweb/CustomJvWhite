package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g6d extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l6d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6d(l6d l6dVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = l6dVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        l6d l6dVar = this.g;
        switch (i) {
            case 0:
                g6d g6dVar = new g6d(l6dVar, lq4Var, 0);
                g6dVar.f = obj;
                return g6dVar;
            default:
                g6d g6dVar2 = new g6d(l6dVar, lq4Var, 1);
                g6dVar2.f = obj;
                return g6dVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((g6d) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((g6d) create((ynh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        CharSequence charSequence;
        int i = this.e;
        sbi sbiVar = sbi.a;
        l6d l6dVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                l6dVar.l.setValue((List) obj2);
                break;
            default:
                ynh ynhVar = (ynh) obj2;
                ch3.d0(obj);
                mjg mjgVar = l6dVar.o;
                do {
                    value = mjgVar.getValue();
                    h6d h6dVar = (h6d) value;
                    charSequence = h6dVar.b;
                    h6dVar.getClass();
                } while (!mjgVar.h(value, new h6d(ynhVar, charSequence)));
                break;
        }
        return sbiVar;
    }
}
