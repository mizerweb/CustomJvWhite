package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class th2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th2() {
        super(2, null);
        this.e = 3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new th2(2, lq4Var, 0);
            case 1:
                return new th2(2, lq4Var, 1);
            case 2:
                return new th2(2, lq4Var, 2);
            case 3:
                return new th2(2, lq4Var, 3);
            case 4:
                return new th2(2, lq4Var, 4);
            case 5:
                return new th2(2, lq4Var, 5);
            default:
                return new th2(2, lq4Var, 6);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((th2) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((th2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lw5 lw5Var = lw5.SECONDS;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return rx8.t(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar = ew5.b;
                long jO = qe7.O(2, lw5Var);
                this.f = 1;
                return rx8.u(jO, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar2 = ew5.b;
                long jO2 = qe7.O(2, lw5Var);
                this.f = 1;
                return rx8.u(jO2, this) == hu4Var ? hu4Var : sbiVar;
            case 3:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    ghb ghbVar3 = ew5.b;
                    long jO3 = qe7.O(1, lw5Var);
                    this.f = 1;
                    if (rx8.u(jO3, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.TRUE;
            case 4:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar4 = ew5.b;
                long jO4 = qe7.O(2, lw5Var);
                this.f = 1;
                return rx8.u(jO4, this) == hu4Var ? hu4Var : sbiVar;
            case 5:
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar5 = ew5.b;
                long jO5 = qe7.O(2, lw5Var);
                this.f = 1;
                return rx8.u(jO5, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar6 = ew5.b;
                long jO6 = qe7.O(2, lw5Var);
                this.f = 1;
                return rx8.u(jO6, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th2(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
