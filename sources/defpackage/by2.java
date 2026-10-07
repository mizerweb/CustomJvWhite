package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class by2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ hy2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by2(int i, hy2 hy2Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = hy2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hy2 hy2Var = this.g;
        switch (i) {
            case 0:
                return new by2(0, hy2Var, lq4Var);
            case 1:
                return new by2(1, hy2Var, lq4Var);
            default:
                return new by2(2, hy2Var, lq4Var);
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
            case 1:
                break;
        }
        return ((by2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        tod todVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        hy2 hy2Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ((sie) hy2Var.x.getValue()).a(hy2Var.p, true, true);
                pzf pzfVar = hy2Var.d;
                dod dodVar = dod.b;
                this.f = 1;
                return pzfVar.emit(dodVar, this) == hu4Var ? hu4Var : sbiVar;
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
                zv8[] zv8VarArr = hy2.Q;
                ((xn3) hy2Var.t.getValue()).u(hy2Var.p);
                pzf pzfVar2 = hy2Var.d;
                dod dodVar2 = dod.b;
                this.f = 1;
                return pzfVar2.emit(dodVar2, this) == hu4Var ? hu4Var : sbiVar;
            default:
                mjg mjgVar = hy2Var.b;
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
                boolean z = hy2Var.N;
                int i5 = R.id.profile_edit_change_avatar_remove_current;
                int i6 = R.id.profile_edit_change_avatar_upload_from_camera;
                int i7 = R.id.profile_edit_change_avatar_upload_from_gallery;
                int i8 = 56;
                int i9 = 3;
                boolean z2 = false;
                if (z) {
                    b06 b06VarC = hy2Var.c();
                    ind indVar = (ind) mjgVar.getValue();
                    if (indVar != null && indVar.a != null) {
                        z2 = true;
                    }
                    b06VarC.getClass();
                    tnh tnhVar = new tnh(R.string.oneme_profile_edit_change_avatar_channel_title);
                    c79 c79VarW = yab.w();
                    c79VarW.add(new kc4(i7, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_gallery), i9, i8));
                    c79VarW.add(new kc4(i6, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_camera), i9, i8));
                    if (z2) {
                        c79VarW.add(new kc4(i5, new tnh(R.string.oneme_profile_edit_change_avatar_delete_current), 1, i8));
                    }
                    c79VarW.add(new kc4(R.id.profile_edit_change_avatar_cancel, new tnh(R.string.oneme_profile_edit_change_avatar_cancel), 2, i8));
                    todVar = new tod(tnhVar, (ynh) null, yab.j(c79VarW), 10);
                } else {
                    b06 b06VarC2 = hy2Var.c();
                    ind indVar2 = (ind) mjgVar.getValue();
                    if (indVar2 != null && indVar2.a != null) {
                        z2 = true;
                    }
                    b06VarC2.getClass();
                    tnh tnhVar2 = new tnh(R.string.oneme_profile_edit_change_avatar_chat_title);
                    c79 c79VarW2 = yab.w();
                    c79VarW2.add(new kc4(i7, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_gallery), i9, i8));
                    c79VarW2.add(new kc4(i6, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_camera), i9, i8));
                    if (z2) {
                        c79VarW2.add(new kc4(i5, new tnh(R.string.oneme_profile_edit_change_avatar_delete_current), 1, i8));
                    }
                    c79VarW2.add(new kc4(R.id.profile_edit_change_avatar_cancel, new tnh(R.string.oneme_profile_edit_change_avatar_cancel), 2, i8));
                    todVar = new tod(tnhVar2, (ynh) null, yab.j(c79VarW2), 10);
                }
                pzf pzfVar3 = hy2Var.e;
                this.f = 1;
                return pzfVar3.emit(todVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
