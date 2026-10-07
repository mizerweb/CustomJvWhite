package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ald extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileAvatarsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ald(lq4 lq4Var, ProfileAvatarsScreen profileAvatarsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileAvatarsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileAvatarsScreen profileAvatarsScreen = this.g;
        switch (i) {
            case 0:
                ald aldVar = new ald(lq4Var, profileAvatarsScreen, 0);
                aldVar.f = obj;
                return aldVar;
            default:
                ald aldVar2 = new ald(lq4Var, profileAvatarsScreen, 1);
                aldVar2.f = obj;
                return aldVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ald) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ald) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ProfileAvatarsScreen profileAvatarsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                okd okdVar = (okd) profileAvatarsScreen.m.getValue();
                if (!okdVar.m.isEmpty() || list.isEmpty()) {
                    nl5 nl5VarJ = tre.J(new wk1(3, okdVar.m, list));
                    okdVar.m = list;
                    nl5VarJ.a(new t3a(okdVar));
                } else {
                    okdVar.m = list;
                    okdVar.r(0, list.size());
                }
                ProfileAvatarsScreen.E1(profileAvatarsScreen, profileAvatarsScreen.J1().c.c(), profileAvatarsScreen.K1().getCurrentItem());
                return sbiVar;
            default:
                ch3.d0(obj);
                hld hldVar = (hld) obj2;
                if (cqk.d(hldVar, gld.a)) {
                    zv8[] zv8VarArr2 = ProfileAvatarsScreen.r;
                    profileAvatarsScreen.F1(true);
                    return sbiVar;
                }
                if (cqk.d(hldVar, cld.a)) {
                    zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                    profileAvatarsScreen.F1(false);
                    return sbiVar;
                }
                if (cqk.d(hldVar, bld.a)) {
                    zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                    profileAvatarsScreen.getRouter().D();
                    return sbiVar;
                }
                if (hldVar instanceof eld) {
                    zv8[] zv8VarArr5 = ProfileAvatarsScreen.r;
                    String str = sj8.a;
                    sj8.i(profileAvatarsScreen.getContext(), ((eld) hldVar).a, "image/*");
                    return sbiVar;
                }
                if (hldVar instanceof dld) {
                    dld dldVar = (dld) hldVar;
                    zv8[] zv8VarArr6 = ProfileAvatarsScreen.r;
                    CharSequence charSequenceB = dldVar.a.b(profileAvatarsScreen.getContext());
                    if (charSequenceB == null) {
                        return sbiVar;
                    }
                    int i2 = dldVar.b ? R.drawable.icon_warning : R.drawable.icon_check;
                    h8c h8cVar = new h8c(profileAvatarsScreen);
                    h8cVar.h(new w8c(i2));
                    h8cVar.n(charSequenceB);
                    h8cVar.p();
                    return sbiVar;
                }
                if (!(hldVar instanceof fld)) {
                    ore.o();
                    return null;
                }
                int i3 = ((fld) hldVar).a;
                zv8[] zv8VarArr7 = ProfileAvatarsScreen.r;
                int size = ((okd) profileAvatarsScreen.m.getValue()).m.size();
                if (i3 < 0 || i3 >= size) {
                    return sbiVar;
                }
                profileAvatarsScreen.K1().h(i3, true);
                return sbiVar;
        }
    }
}
