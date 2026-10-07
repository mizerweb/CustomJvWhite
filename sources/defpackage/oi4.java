package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oi4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ vi4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi4(int i, vi4 vi4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = vi4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vi4 vi4Var = this.g;
        switch (i) {
            case 0:
                return new oi4(0, vi4Var, lq4Var);
            case 1:
                return new oi4(1, vi4Var, lq4Var);
            case 2:
                return new oi4(2, vi4Var, lq4Var);
            case 3:
                return new oi4(3, vi4Var, lq4Var);
            default:
                return new oi4(4, vi4Var, lq4Var);
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((oi4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        int i2 = 2;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        vi4 vi4Var = this.g;
        int i3 = 1;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
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
                ch4 ch4Var = (ch4) vi4Var.z.getValue();
                long j = vi4Var.p;
                this.f = 1;
                return ch4Var.a(j, this, null, null) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                pzf pzfVar = vi4Var.d;
                wnd.b.getClass();
                i65 i65Var = new i65(":logout");
                this.f = 1;
                return pzfVar.emit(i65Var, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
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
                ((svb) vi4Var.v.getValue()).d(true);
                lk9 lk9VarC = ((n0c) vi4Var.r()).c();
                oi4 oi4Var = new oi4(i3, vi4Var, lq4Var);
                this.f = 1;
                return yab.K0(lk9VarC, oi4Var, this) == hu4Var ? hu4Var : sbiVar;
            case 3:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    no4 no4Var = (no4) vi4Var.q.getValue();
                    long j2 = vi4Var.p;
                    this.f = 1;
                    obj = no4Var.i(j2);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                vg4 vg4Var = (vg4) obj;
                if (vg4Var == null) {
                    return sbiVar;
                }
                AtomicLong atomicLong = vi4Var.n;
                pvb pvbVar = (pvb) vi4Var.B.getValue();
                atomicLong.set(pvb.t(pvbVar, new vie(pvbVar.u().a.g(), vg4Var.a.b.e)));
                pzf pzfVar2 = vi4Var.e;
                uod uodVar = new uod(new tnh(R.string.oneme_profile_edit_delete_avatar_success), new Integer(R.drawable.icon_check));
                this.f = 2;
                if (pzfVar2.emit(uodVar, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
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
                pzf pzfVar3 = vi4Var.e;
                b06 b06VarC = vi4Var.c();
                ind indVar = (ind) vi4Var.b.getValue();
                boolean z = false;
                if (indVar != null && indVar.a != null) {
                    z = true;
                }
                b06VarC.getClass();
                tnh tnhVar = new tnh(R.string.oneme_profile_edit_change_avatar_contact_title);
                c79 c79VarW = yab.w();
                int i9 = 3;
                int i10 = 56;
                c79VarW.add(new kc4(R.id.profile_edit_change_avatar_upload_from_gallery, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_gallery), i9, i10));
                c79VarW.add(new kc4(R.id.profile_edit_change_avatar_upload_from_camera, new tnh(R.string.oneme_profile_edit_change_avatar_upload_from_camera), i9, i10));
                if (z) {
                    c79VarW.add(new kc4(R.id.profile_edit_change_avatar_remove_current, new tnh(R.string.oneme_profile_edit_change_avatar_delete_current), i3, i10));
                }
                c79VarW.add(new kc4(R.id.profile_edit_change_avatar_cancel, new tnh(R.string.oneme_profile_edit_change_avatar_cancel), i2, i10));
                tod todVar = new tod(tnhVar, (ynh) null, yab.j(c79VarW), 10);
                this.f = 1;
                return pzfVar3.emit(todVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
