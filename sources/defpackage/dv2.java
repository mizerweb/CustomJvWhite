package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dv2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ lv2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv2(int i, lv2 lv2Var, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = i;
        this.h = lv2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lv2 lv2Var = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                return new dv2(i2, lv2Var, lq4Var, 0);
            default:
                return new dv2(i2, lv2Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((dv2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        Object objEmit2;
        String str;
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 2;
        lv2 lv2Var = this.h;
        int i3 = this.g;
        hu4 hu4Var = hu4.a;
        int i4 = 3;
        switch (i) {
            case 0:
                ny8 ny8Var = lv2Var.m;
                mjg mjgVar = lv2Var.i;
                pzf pzfVar = lv2Var.f;
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    if (i3 == R.id.profile_edit_shortlink_action_copy) {
                        this.f = 1;
                        zv8[] zv8VarArr = lv2.I;
                        if (lv2Var.t(this) != hu4Var) {
                            return sbiVar;
                        }
                    } else if (i3 == R.id.profile_edit_shortlink_action_share) {
                        this.f = 2;
                        zv8[] zv8VarArr2 = lv2.I;
                        lq2 lq2Var = (lq2) mjgVar.getValue();
                        if (lq2Var == null || (str = lq2Var.c) == null) {
                            gm0.Y(lv2.class.getName(), "Early return in shareLink cuz of editedModel.value?.link is null");
                        } else {
                            int i6 = lv2Var.A() ? R.string.oneme_channel_shortlink_action_share_link_text : R.string.oneme_chat_shortlink_action_share_link_text;
                            lq2 lq2Var2 = (lq2) mjgVar.getValue();
                            kq2 kq2Var = lq2Var2 != null ? lq2Var2.b : null;
                            int i7 = kq2Var == null ? -1 : zu2.$EnumSwitchMapping$0[kq2Var.ordinal()];
                            if (i7 == 1) {
                                ((w69) ny8Var.getValue()).getClass();
                                objEmit2 = pzfVar.emit(new xld(new vnh(i6, a.n1(new Object[]{"max.ru/".concat(str)}))), this);
                                if (objEmit2 != hu4Var) {
                                }
                            } else if (i7 != 2 || (objEmit2 = pzfVar.emit(new xld(new vnh(i6, a.n1(new Object[]{str}))), this)) != hu4Var) {
                            }
                            if (objEmit2 != hu4Var) {
                                return sbiVar;
                            }
                        }
                        objEmit2 = sbiVar;
                        if (objEmit2 != hu4Var) {
                            return sbiVar;
                        }
                    } else if (i3 == R.id.profile_edit_shortlink_action_share_external) {
                        this.f = 3;
                        zv8[] zv8VarArr3 = lv2.I;
                        lq2 lq2Var3 = (lq2) mjgVar.getValue();
                        if (lq2Var3 == null) {
                            gm0.Y(lv2.class.getName(), "Early return in externalShareLink cuz of editedModel.value is null");
                        } else {
                            String strConcat = lq2Var3.c;
                            if (strConcat == null) {
                                gm0.Y(lv2.class.getName(), "Early return in externalShareLink cuz of model.link is null");
                            } else {
                                int iOrdinal = lq2Var3.b.ordinal();
                                if (iOrdinal == 0) {
                                    ((w69) ny8Var.getValue()).getClass();
                                    strConcat = "max.ru/".concat(strConcat);
                                } else if (iOrdinal != 1) {
                                    ore.o();
                                }
                                objEmit = pzfVar.emit(new vld(new vnh(lv2Var.A() ? R.string.oneme_channel_shortlink_action_share_link_text : R.string.oneme_chat_shortlink_action_share_link_text, a.n1(new Object[]{strConcat}))), this);
                                if (objEmit != hu4Var) {
                                }
                                if (objEmit != hu4Var) {
                                    return sbiVar;
                                }
                            }
                        }
                        objEmit = sbiVar;
                        if (objEmit != hu4Var) {
                            return sbiVar;
                        }
                    } else {
                        if (i3 == R.id.profile_edit_shortlink_action_qr_code) {
                            gu4 gu4Var = lv2Var.b;
                            xt4 xt4VarA = ((n0c) lv2Var.x()).a();
                            yt4 yt4VarW = lv2Var.w();
                            xt4VarA.getClass();
                            yab.i0(gu4Var, lvb.x0(xt4VarA, yt4VarW), 0, new av2(lv2Var, (lq4) null, 3), 2);
                            return sbiVar;
                        }
                        if (i3 != R.id.profile_edit_action_go_to_business_bot) {
                            return sbiVar;
                        }
                        this.f = 4;
                        if (lv2.p(lv2Var, this) != hu4Var) {
                            return sbiVar;
                        }
                    }
                    return hu4Var;
                }
                if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                if (i3 != R.id.profile_edit_shortlink_action_refresh_link) {
                    return sbiVar;
                }
                pzf pzfVar2 = lv2Var.f;
                zv8[] zv8VarArr4 = lv2.I;
                int i9 = 56;
                yld yldVar = new yld(new tnh(R.string.profile_edit_shortlink_update_confirmation_title), new tnh(R.string.profile_edit_shortlink_update_confirmation_description), xw3.P0(new kc4(R.id.profile_edit_shortlink_confirm_update, new tnh(R.string.profile_edit_shortlink_update_action), i4, i9), new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_edit_shortlink_update_cancel), i2, i9)));
                this.f = 1;
                return pzfVar2.emit(yldVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
