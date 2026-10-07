package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rh9 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai9 b;

    public /* synthetic */ rh9(ai9 ai9Var, int i) {
        this.a = i;
        this.b = ai9Var;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        k66 k66Var = k66.a;
        final ai9 ai9Var = this.b;
        switch (i) {
            case 0:
                final List list = (List) obj;
                final int i2 = 0;
                Object objV = qyj.V(k66Var, new af7() { // from class: qh9
                    @Override // defpackage.af7
                    public final Object invoke() throws InterruptedException {
                        int i3 = i2;
                        sbi sbiVar2 = sbi.a;
                        List list2 = list;
                        ai9 ai9Var2 = ai9Var;
                        switch (i3) {
                            case 0:
                                ai9Var2.f.put(list2);
                                break;
                            default:
                                ai9Var2.h.put(list2);
                                break;
                        }
                        return sbiVar2;
                    }
                }, lq4Var);
                return objV == hu4Var ? objV : sbiVar;
            default:
                final List list2 = (List) obj;
                final int i3 = 1;
                Object objV2 = qyj.V(k66Var, new af7() { // from class: qh9
                    @Override // defpackage.af7
                    public final Object invoke() throws InterruptedException {
                        int i4 = i3;
                        sbi sbiVar2 = sbi.a;
                        List list3 = list2;
                        ai9 ai9Var2 = ai9Var;
                        switch (i4) {
                            case 0:
                                ai9Var2.f.put(list3);
                                break;
                            default:
                                ai9Var2.h.put(list3);
                                break;
                        }
                        return sbiVar2;
                    }
                }, lq4Var);
                return objV2 == hu4Var ? objV2 : sbiVar;
        }
    }
}
