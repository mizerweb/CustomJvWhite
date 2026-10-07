package defpackage;

import android.graphics.Bitmap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class av2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ lv2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(int i, lv2 lv2Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.f = i;
        this.g = lv2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lv2 lv2Var = this.g;
        switch (i) {
            case 0:
                return new av2(lv2Var, lq4Var, 0);
            case 1:
                return new av2(this.f, lv2Var, lq4Var);
            case 2:
                return new av2(lv2Var, lq4Var, 2);
            default:
                return new av2(lv2Var, lq4Var, 3);
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
                return ((av2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 1:
                ((av2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                return ((av2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                return ((av2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Bitmap bitmap;
        int i = this.e;
        kq2 kq2Var = kq2.b;
        int i2 = 2;
        hu4 hu4Var = hu4.a;
        lv2 lv2Var = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = lv2Var.f;
                    zv8[] zv8VarArr = lv2.I;
                    c79 c79VarW = yab.w();
                    lq2 lq2Var = (lq2) lv2Var.i.getValue();
                    if ((lq2Var != null ? lq2Var.b : null) == kq2Var) {
                        c79VarW.add(new rp4(R.id.profile_edit_shortlink_action_refresh_link, new tnh(R.string.profile_edit_shortlink_action_refresh_link), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_redo), Integer.valueOf(R.attr.icon_negative)));
                    }
                    zld zldVar = new zld(yab.j(c79VarW));
                    this.f = 1;
                    if (pzfVar.emit(zldVar, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                int i4 = this.f;
                if (i4 == R.id.profile_edit_shortlink_confirm_update) {
                    zv8[] zv8VarArr2 = lv2.I;
                    lv2Var.u(false);
                } else if (i4 == R.id.profile_edit_join_request_disable_confirm) {
                    zv8[] zv8VarArr3 = lv2.I;
                    lv2Var.F(false);
                } else if (i4 == R.id.profile_edit_shortlink_confirmation_change_action_continue) {
                    lq2 lq2Var2 = (lq2) lv2Var.h.getValue();
                    if ((lq2Var2 != null ? lq2Var2.b : null) == kq2Var) {
                        zv8[] zv8VarArr4 = lv2.I;
                        lv2Var.C();
                    } else {
                        zv8[] zv8VarArr5 = lv2.I;
                        lv2Var.B();
                    }
                } else if (i4 == R.id.profile_edit_shortlink_no_digital_id_action_create) {
                    zv8[] zv8VarArr6 = lv2.I;
                    pzf pzfVar2 = lv2Var.e;
                    wnd wndVar = wnd.b;
                    long jLongValue = ((Number) ((e5d) lv2Var.v.getValue()).G4.a(e5d.S6[294]).i()).longValue();
                    wndVar.getClass();
                    pzfVar2.a(new i65(":webapp:root?bot_id=" + jLongValue + "&entry_point=from_create_channel"));
                }
                return sbiVar;
            case 2:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    lv2Var.d.setValue(((dq2) lv2Var.g.getValue()).a(lv2Var));
                    pzf pzfVar3 = lv2Var.f;
                    yld yldVar = new yld(new tnh(R.string.join_request_disable_confirmation_title), new tnh(R.string.join_request_disable_confirmation_description), xw3.P0(new kc4(R.id.profile_edit_join_request_disable_confirm, new tnh(R.string.join_request_disable_confirmation_confirm), 3, true, 3, 4), new kc4(R.id.profile_edit_join_request_disable_cancel, new tnh(R.string.join_request_disable_confirmation_cancel), i2, 32)));
                    this.f = 1;
                    if (pzfVar3.emit(yldVar, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                long j = lv2Var.a;
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        objB = obj;
                    } else {
                        if (i6 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                im7 im7Var = (im7) lv2Var.o.getValue();
                zzd zzdVar = new zzd(j);
                this.f = 1;
                objB = im7Var.b(zzdVar, true, 0, this);
                if (objB == hu4Var) {
                    return hu4Var;
                }
                szd szdVar = (szd) objB;
                if (szdVar != null && (bitmap = szdVar.b) != null) {
                    int height = bitmap.getHeight();
                    pzf pzfVar4 = lv2Var.f;
                    amd amdVar = new amd(j, height);
                    this.f = 2;
                    if (pzfVar4.emit(amdVar, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av2(lv2 lv2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = lv2Var;
    }
}
