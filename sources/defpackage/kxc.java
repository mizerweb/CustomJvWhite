package defpackage;

import android.view.View;
import one.me.startconversation.channel.PickSubscribersScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kxc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickSubscribersScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxc(PickSubscribersScreen pickSubscribersScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pickSubscribersScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickSubscribersScreen pickSubscribersScreen = this.g;
        switch (i) {
            case 0:
                kxc kxcVar = new kxc(pickSubscribersScreen, lq4Var, 0);
                kxcVar.f = obj;
                return kxcVar;
            case 1:
                kxc kxcVar2 = new kxc(pickSubscribersScreen, lq4Var, 1);
                kxcVar2.f = obj;
                return kxcVar2;
            default:
                kxc kxcVar3 = new kxc(pickSubscribersScreen, lq4Var, 2);
                kxcVar3.f = obj;
                return kxcVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((kxc) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((kxc) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((kxc) create((cxc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        final int i2 = 1;
        final PickSubscribersScreen pickSubscribersScreen = this.g;
        final int i3 = 0;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                long[] jArrG0 = rx8.g0((m8b) obj2);
                vv vvVar = pickSubscribersScreen.j;
                zv8 zv8Var = PickSubscribersScreen.p[0];
                vvVar.b(pickSubscribersScreen, jArrG0);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                int i4 = ((m8b) obj2).d;
                zv8[] zv8VarArr = PickSubscribersScreen.p;
                cyb cybVarA1 = pickSubscribersScreen.A1();
                if (i4 == 0) {
                    cybVarA1.setText(np4.q(pickSubscribersScreen.getContext(), R.string.oneme_startconversation_channel_select_subscribers_skip_button));
                    cybVarA1.setCount(null);
                    qe7.H(cybVarA1, 300L, new View.OnClickListener() { // from class: lxc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i5 = i3;
                            PickSubscribersScreen pickSubscribersScreen2 = pickSubscribersScreen;
                            switch (i5) {
                                case 0:
                                    zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                                    dxc dxcVar = (dxc) pickSubscribersScreen2.x1().d;
                                    gu4 gu4Var = dxcVar.k;
                                    if (gu4Var != null) {
                                        yab.i0(gu4Var, null, 0, new ur8(dxcVar, null, 18), 3);
                                    }
                                    break;
                                default:
                                    zv8[] zv8VarArr3 = PickSubscribersScreen.p;
                                    pickSubscribersScreen2.A1().setLoading(true);
                                    dxc dxcVar2 = (dxc) pickSubscribersScreen2.x1().d;
                                    vv vvVar2 = pickSubscribersScreen2.j;
                                    zv8 zv8Var2 = PickSubscribersScreen.p[0];
                                    long[] jArr = (long[]) vvVar2.a(pickSubscribersScreen2);
                                    rt2 rt2Var = (rt2) ((xn3) dxcVar2.d.getValue()).k(dxcVar2.a).a.getValue();
                                    if (rt2Var != null) {
                                        ((wd4) dxcVar2.f.getValue()).h();
                                        gu4 gu4Var2 = dxcVar2.k;
                                        dxcVar2.j.B(dxcVar2, dxc.l[0], gu4Var2 != null ? yab.i0(gu4Var2, ((n0c) ((xhh) dxcVar2.c.getValue())).b(), 0, new voc(dxcVar2, rt2Var, jArr, null, 3), 2) : null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    cybVarA1.setEnabled(true);
                } else if (i4 > ((g5d) ((gjf) pickSubscribersScreen.m.getValue())).d()) {
                    cybVarA1.setEnabled(false);
                } else {
                    cybVarA1.setText(np4.q(pickSubscribersScreen.getContext(), R.string.picker_chats_add_button));
                    cybVarA1.setCount(new Integer(i4));
                    cybVarA1.setEnabled(true);
                    qe7.H(cybVarA1, 300L, new View.OnClickListener() { // from class: lxc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i5 = i2;
                            PickSubscribersScreen pickSubscribersScreen2 = pickSubscribersScreen;
                            switch (i5) {
                                case 0:
                                    zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                                    dxc dxcVar = (dxc) pickSubscribersScreen2.x1().d;
                                    gu4 gu4Var = dxcVar.k;
                                    if (gu4Var != null) {
                                        yab.i0(gu4Var, null, 0, new ur8(dxcVar, null, 18), 3);
                                    }
                                    break;
                                default:
                                    zv8[] zv8VarArr3 = PickSubscribersScreen.p;
                                    pickSubscribersScreen2.A1().setLoading(true);
                                    dxc dxcVar2 = (dxc) pickSubscribersScreen2.x1().d;
                                    vv vvVar2 = pickSubscribersScreen2.j;
                                    zv8 zv8Var2 = PickSubscribersScreen.p[0];
                                    long[] jArr = (long[]) vvVar2.a(pickSubscribersScreen2);
                                    rt2 rt2Var = (rt2) ((xn3) dxcVar2.d.getValue()).k(dxcVar2.a).a.getValue();
                                    if (rt2Var != null) {
                                        ((wd4) dxcVar2.f.getValue()).h();
                                        gu4 gu4Var2 = dxcVar2.k;
                                        dxcVar2.j.B(dxcVar2, dxc.l[0], gu4Var2 != null ? yab.i0(gu4Var2, ((n0c) ((xhh) dxcVar2.c.getValue())).b(), 0, new voc(dxcVar2, rt2Var, jArr, null, 3), 2) : null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                return sbiVar;
            default:
                cxc cxcVar = (cxc) obj2;
                ch3.d0(obj);
                if (cxcVar instanceof bxc) {
                    zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                    pickSubscribersScreen.A1().setLoading(false);
                    ohg.b.l(new lh9(pickSubscribersScreen, cxcVar));
                } else {
                    if (!cqk.d(cxcVar, axc.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr3 = PickSubscribersScreen.p;
                    pickSubscribersScreen.A1().setLoading(false);
                    ohg.b.l(new ixc(pickSubscribersScreen, 1));
                    h8c h8cVar = new h8c(pickSubscribersScreen);
                    h8cVar.m(new tnh(R.string.oneme_startconversation_channel_add_subscribers_error));
                    h8cVar.h(new w8c(R.drawable.icon_warning_fill));
                    h8cVar.p();
                }
                return sbiVar;
        }
    }
}
