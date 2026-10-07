package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.chats.search.ChatsListSearchScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class bj3 implements p7c {
    public final /* synthetic */ ChatsListSearchScreen a;
    public final /* synthetic */ rcc b;

    public bj3(ChatsListSearchScreen chatsListSearchScreen, rcc rccVar) {
        this.a = chatsListSearchScreen;
        this.b = rccVar;
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        zv8[] zv8VarArr = ChatsListSearchScreen.F;
        ChatsListSearchScreen chatsListSearchScreen = this.a;
        fk3 fk3VarR1 = chatsListSearchScreen.r1();
        String string = charSequence != null ? charSequence.toString() : null;
        String str = string == null ? "" : string;
        mjg mjgVar = fk3VarR1.E;
        if (str.equals(((jj3) mjgVar.getValue()).b)) {
            gm0.n(fk3VarR1.Z, "Same query for search, ignore it");
        } else {
            mjgVar.j(null, new jj3(ij3.a, str, l48.d, (str.length() <= 0 || !r5h.n1(((jj3) mjgVar.getValue()).b, str, false)) ? r66.a : ((jj3) mjgVar.getValue()).d, true, false, false));
            if (str.length() == 0) {
                fk3VarR1.G();
            } else {
                sgg sggVar = fk3VarR1.p1;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                sgg sggVar2 = fk3VarR1.q1;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                vo8 vo8Var = (vo8) fk3VarR1.s1.m(fk3VarR1, fk3.y1[0]);
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
                mjg mjgVar2 = fk3VarR1.H;
                Boolean bool = Boolean.FALSE;
                mjgVar2.getClass();
                mjgVar2.j(null, bool);
                mjg mjgVar3 = fk3VarR1.G;
                mjgVar3.getClass();
                mjgVar3.j(null, str);
            }
        }
        y8 y8Var = (y8) chatsListSearchScreen.l.getValue();
        String string2 = charSequence != null ? charSequence.toString() : null;
        String str2 = string2 != null ? string2 : "";
        zv8[] zv8VarArr2 = y8.j;
        y8Var.C(str2);
    }

    @Override // defpackage.p7c
    public final void o() {
        ml9.d(this.b);
        zv8[] zv8VarArr = ChatsListSearchScreen.F;
        y8 y8Var = (y8) this.a.l.getValue();
        ((f9b) y8Var.i.getValue()).setValue(null);
        mjg mjgVar = y8Var.f;
        mjgVar.getClass();
        mjgVar.j(null, r66.a);
        zm3.b.b().f();
    }
}
