package defpackage;

import one.me.chats.picker.stories.PickStoryPresetScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class zwc extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickStoryPresetScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwc(lq4 lq4Var, PickStoryPresetScreen pickStoryPresetScreen) {
        super(2, lq4Var);
        this.g = pickStoryPresetScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickStoryPresetScreen pickStoryPresetScreen = this.g;
        switch (i) {
            case 0:
                zwc zwcVar = new zwc(pickStoryPresetScreen, lq4Var);
                zwcVar.f = obj;
                return zwcVar;
            default:
                zwc zwcVar2 = new zwc(lq4Var, pickStoryPresetScreen);
                zwcVar2.f = obj;
                return zwcVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((zwc) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((zwc) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PickStoryPresetScreen pickStoryPresetScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                long[] jArrG0 = rx8.g0((m8b) obj2);
                vv vvVar = pickStoryPresetScreen.j;
                zv8 zv8Var = PickStoryPresetScreen.o[0];
                vvVar.b(pickStoryPresetScreen, jArrG0);
                break;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr = PickStoryPresetScreen.o;
                    wsc.i((wsc) pickStoryPresetScreen.m.getValue(), new svj(pickStoryPresetScreen, 1));
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwc(PickStoryPresetScreen pickStoryPresetScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = pickStoryPresetScreen;
    }
}
