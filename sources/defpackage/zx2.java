package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zx2 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ hy2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx2(int i, hy2 hy2Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = i;
        this.h = hy2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hy2 hy2Var = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                return new zx2(hy2Var, i2, lq4Var);
            default:
                return new zx2(i2, hy2Var, lq4Var);
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
        return ((zx2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0435  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        tod todVar;
        boolean z;
        nx2 nx2Var;
        tod todVar2;
        int i = this.e;
        int i2 = R.id.profile_edit_admin_close_chat_cancel;
        int i3 = this.g;
        hu4 hu4Var = hu4.a;
        hy2 hy2Var = this.h;
        sbi sbiVar = sbi.a;
        int i4 = 56;
        int i5 = 1;
        int i6 = 2;
        switch (i) {
            case 0:
                long j = hy2Var.p;
                pzf pzfVar = hy2Var.d;
                pzf pzfVar2 = hy2Var.e;
                switch (this.f) {
                    case 0:
                        ch3.d0(obj);
                        kz5 kz5Var = (kz5) hy2Var.k.getValue();
                        String str = kz5Var != null ? kz5Var.d : null;
                        if (str == null) {
                            str = "";
                        }
                        rt2 rt2VarR = hy2Var.r();
                        boolean z2 = rt2VarR != null && rt2VarR.i();
                        int i7 = R.id.profile_edit_admin_leave_chat_and_change_owner_confirm;
                        if (i3 == R.id.profile_edit_admin_close_chat) {
                            b06 b06VarC = hy2Var.c();
                            rt2 rt2VarR2 = hy2Var.r();
                            boolean z3 = rt2VarR2 != null && rt2VarR2.i();
                            b06VarC.getClass();
                            vnh vnhVar = new vnh(R.string.oneme_profile_edit_close_chat_header, a.n1(new Object[]{str}));
                            tnh tnhVar = z3 ? new tnh(R.string.oneme_profile_edit_close_chat_description) : null;
                            c79 c79VarW = yab.w();
                            if (z3) {
                                c79VarW.add(new kc4(i7, new tnh(R.string.oneme_profile_edit_leave_chat_and_change_owner_action), i5, i4));
                            }
                            c79VarW.add(new kc4(R.id.profile_edit_admin_close_chat_confirm, z3 ? new tnh(R.string.oneme_profile_edit_close_chat_for_all_action) : new tnh(R.string.oneme_profile_edit_close_chat), i5, i4));
                            c79VarW.add(new kc4(R.id.profile_edit_admin_close_chat_cancel, new tnh(R.string.oneme_profile_edit_close_chat_cancel), 2, i4));
                            tod todVar3 = new tod(vnhVar, tnhVar, yab.j(c79VarW), 8);
                            this.f = 1;
                            if (pzfVar2.emit(todVar3, this) == hu4Var) {
                                return hu4Var;
                            }
                        } else if (i3 == R.id.profile_edit_admin_clear_chat_history) {
                            b06 b06VarC2 = hy2Var.c();
                            boolean z4 = hy2Var.O;
                            b06VarC2.getClass();
                            vnh vnhVar2 = new vnh(R.string.oneme_profile_edit_clear_chat_history_header, a.n1(new Object[]{str}));
                            c79 c79VarW2 = yab.w();
                            c79VarW2.add(new kc4(R.id.profile_edit_admin_clear_chat_history_confirm_for_yourself, new tnh(R.string.oneme_profile_edit_admin_action_clear_history_for_yourself), i5, i4));
                            if (z4) {
                                c79VarW2.add(new kc4(R.id.profile_edit_admin_clear_chat_history_confirm_for_all, new tnh(R.string.oneme_profile_edit_admin_action_clear_history_for_all), i5, i4));
                            }
                            c79VarW2.add(new kc4(R.id.profile_edit_admin_clear_chat_history_cancel, new tnh(R.string.oneme_profile_edit_admin_action_clear_cancel), 2, i4));
                            tod todVar4 = new tod(vnhVar2, (ynh) null, yab.j(c79VarW2), 10);
                            this.f = 2;
                            if (pzfVar2.emit(todVar4, this) == hu4Var) {
                                return hu4Var;
                            }
                        } else if (i3 != R.id.profile_edit_admin_leave_chat) {
                            int i8 = R.id.profile_edit_admin_leave_channel_and_change_owner_confirm;
                            if (i3 == R.id.profile_edit_admin_close_channel) {
                                b06 b06VarC3 = hy2Var.c();
                                rt2 rt2VarR3 = hy2Var.r();
                                if (rt2VarR3 == null || !rt2VarR3.i()) {
                                    z = false;
                                } else {
                                    rt2 rt2VarR4 = hy2Var.r();
                                    if (((rt2VarR4 == null || (nx2Var = rt2VarR4.b) == null) ? 0 : nx2Var.b()) > 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                                b06VarC3.getClass();
                                vnh vnhVar3 = new vnh(R.string.oneme_profile_edit_close_channel_header, a.n1(new Object[]{str}));
                                tnh tnhVar2 = z ? new tnh(R.string.oneme_profile_edit_close_channel_description) : null;
                                c79 c79VarW3 = yab.w();
                                if (z) {
                                    c79VarW3.add(new kc4(i8, new tnh(R.string.oneme_profile_edit_leave_channel_and_change_owner_action), i5, i4));
                                }
                                c79VarW3.add(new kc4(R.id.profile_edit_admin_close_channel_confirm, z ? new tnh(R.string.oneme_profile_edit_close_channel_for_all_action) : new tnh(R.string.oneme_profile_edit_close_channel), i5, i4));
                                c79VarW3.add(new kc4(R.id.profile_edit_admin_close_channel_cancel, new tnh(R.string.oneme_profile_edit_close_channel_cancel), 2, i4));
                                tod todVar5 = new tod(vnhVar3, tnhVar2, yab.j(c79VarW3), 8);
                                this.f = 4;
                                if (pzfVar2.emit(todVar5, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_leave_channel) {
                                int i9 = R.id.profile_edit_admin_leave_channel_cancel;
                                if (z2) {
                                    hy2Var.c().getClass();
                                    todVar = new tod(new tnh(R.string.oneme_profile_edit_leave_channel_header), new vnh(R.string.oneme_profile_edit_leave_channel_description, a.n1(new Object[]{str})), xw3.P0(new kc4(i8, new tnh(R.string.oneme_profile_edit_leave_channel_and_change_owner_action), i5, i4), new kc4(i9, new tnh(R.string.oneme_profile_edit_leave_channel_action_cancel), 2, i4)), 8);
                                } else {
                                    hy2Var.c().getClass();
                                    todVar = new tod(new tnh(R.string.oneme_profile_edit_leave_channel_header), new vnh(R.string.oneme_profile_edit_leave_channel_description, a.n1(new Object[]{str})), xw3.P0(new kc4(R.id.profile_edit_admin_leave_channel_confirm, new tnh(R.string.oneme_profile_edit_leave_channel_action), i5, i4), new kc4(i9, new tnh(R.string.oneme_profile_edit_leave_channel_action_cancel), 2, i4)), 8);
                                }
                                this.f = 5;
                                if (pzfVar2.emit(todVar, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_clear_channel_history) {
                                hy2Var.c().getClass();
                                tod todVar6 = new tod(new vnh(R.string.oneme_profile_edit_clear_channel_history_header, a.n1(new Object[]{str})), new tnh(R.string.oneme_profile_edit_clear_channel_history_description), xw3.P0(new kc4(R.id.profile_edit_admin_clear_chat_history_confirm_for_all, new tnh(R.string.oneme_profile_edit_admin_action_clear_history_for_all), i5, i4), new kc4(R.id.profile_edit_admin_clear_chat_history_cancel, new tnh(R.string.oneme_profile_edit_admin_action_clear_cancel), 2, i4)), 8);
                                this.f = 6;
                                if (pzfVar2.emit(todVar6, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_participants_permission) {
                                wnd.b.getClass();
                                i65 i65Var = new i65(":profile/member_permissions?id=" + j);
                                this.f = 7;
                                if (pzfVar.emit(i65Var, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_reactions) {
                                wnd.b.getClass();
                                i65 i65Var2 = new i65(":profile/edit/reactions?id=" + j);
                                this.f = 8;
                                if (pzfVar.emit(i65Var2, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_chat_type) {
                                ynd yndVar = new ynd(j, nnd.LOCAL_CHAT);
                                this.f = 9;
                                if (pzfVar.emit(yndVar, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_invite_by_link) {
                                bod bodVar = new bod(j);
                                this.f = 10;
                                if (pzfVar.emit(bodVar, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_move_rights) {
                                wnd.b.getClass();
                                i65 i65Var3 = new i65(":profile/change-owner?chat_id=" + j + "&leave_chat=false");
                                this.f = 11;
                                if (pzfVar.emit(i65Var3, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else if (i3 == R.id.profile_edit_admin_participants_permission_disable_copy) {
                                hy2Var.t();
                            }
                        } else {
                            int i10 = R.id.profile_edit_admin_leave_chat_cancel;
                            if (z2) {
                                hy2Var.c().getClass();
                                int i11 = 32;
                                todVar2 = new tod(new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{str})), (ynh) null, xw3.P0(new kc4(R.id.profile_edit_admin_leave_chat_and_change_owner_confirm, new tnh(R.string.oneme_profile_edit_leave_chat_and_change_owner_action), 3, i11), new kc4(i10, new tnh(R.string.oneme_profile_edit_leave_chat_action_cancel), 2, i11)), 10);
                            } else {
                                hy2Var.c().getClass();
                                todVar2 = new tod(new tnh(R.string.leave_chat), new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{str})), xw3.P0(new kc4(R.id.profile_edit_admin_leave_chat_confirm, new tnh(R.string.leave_chat), i5, i4), new kc4(i10, new tnh(R.string.oneme_profile_edit_leave_chat_action_cancel), 2, i4)), 8);
                            }
                            this.f = 3;
                            if (pzfVar2.emit(todVar2, this) == hu4Var) {
                                return hu4Var;
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ch3.d0(obj);
                        break;
                    default:
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                return sbiVar;
            default:
                p3c p3cVar = hy2Var.I;
                pzf pzfVar3 = hy2Var.e;
                gu4 gu4Var = hy2Var.a;
                boolean z5 = hy2Var.N;
                switch (this.f) {
                    case 0:
                        ch3.d0(obj);
                        int i12 = R.id.profile_edit_admin_close_chat_certain_confirm;
                        if (i3 != R.id.profile_edit_admin_close_chat_confirm) {
                            int i13 = R.id.profile_edit_admin_close_channel_certain_confirm;
                            if (i3 != R.id.profile_edit_admin_close_channel_confirm) {
                                if (i3 == R.id.profile_edit_admin_close_chat_certain_confirm || i3 == R.id.profile_edit_admin_close_channel_certain_confirm) {
                                    this.f = 5;
                                    if (hy2.o(hy2Var, z5, this) == hu4Var) {
                                        return hu4Var;
                                    }
                                } else if (i3 == R.id.profile_edit_admin_clear_chat_history_confirm_for_yourself) {
                                    this.f = 6;
                                    zv8[] zv8VarArr = hy2.Q;
                                    Object objK0 = yab.K0(((n0c) hy2Var.s()).b(), new ay2(hy2Var, false, null, 0), this);
                                    if (objK0 != hu4Var) {
                                        objK0 = sbiVar;
                                    }
                                    if (objK0 == hu4Var) {
                                        return hu4Var;
                                    }
                                } else if (i3 == R.id.profile_edit_admin_clear_chat_history_confirm_for_all) {
                                    this.f = 7;
                                    zv8[] zv8VarArr2 = hy2.Q;
                                    Object objK1 = yab.K0(((n0c) hy2Var.s()).b(), new ay2(hy2Var, true, null, 0), this);
                                    if (objK1 != hu4Var) {
                                        objK1 = sbiVar;
                                    }
                                    if (objK1 == hu4Var) {
                                        return hu4Var;
                                    }
                                } else if (i3 == R.id.profile_edit_admin_leave_chat_confirm || i3 == R.id.profile_edit_admin_leave_channel_confirm) {
                                    this.f = 8;
                                    zv8[] zv8VarArr3 = hy2.Q;
                                    hy2Var.G.B(hy2Var, hy2.Q[0], yab.h0(gu4Var, ((n0c) hy2Var.s()).b(), 2, new by2(1, hy2Var, null)));
                                    if (sbiVar == hu4Var) {
                                        return hu4Var;
                                    }
                                } else if (i3 == R.id.profile_edit_admin_leave_chat_and_change_owner_confirm || i3 == R.id.profile_edit_admin_leave_channel_and_change_owner_confirm) {
                                    pzf pzfVar4 = hy2Var.d;
                                    wnd wndVar = wnd.b;
                                    long j2 = hy2Var.p;
                                    wndVar.getClass();
                                    i65 i65Var4 = new i65(":profile/change-owner?chat_id=" + j2 + "&leave_chat=true");
                                    this.f = 9;
                                    if (pzfVar4.emit(i65Var4, this) == hu4Var) {
                                        return hu4Var;
                                    }
                                } else if (i3 == R.id.profile_edit_comments_enable_confirm) {
                                    zv8[] zv8VarArr4 = hy2.Q;
                                    p3cVar.B(hy2Var, hy2.Q[2], yab.h0(gu4Var, ((n0c) hy2Var.s()).b(), 2, new ay2(hy2Var, true, null, 2)));
                                } else if (i3 != R.id.profile_edit_comments_enable_cancel && i3 == R.id.profile_edit_comments_disable_confirm) {
                                    zv8[] zv8VarArr5 = hy2.Q;
                                    p3cVar.B(hy2Var, hy2.Q[2], yab.h0(gu4Var, ((n0c) hy2Var.s()).b(), 2, new ay2(hy2Var, false, null, 2)));
                                }
                                break;
                            } else {
                                rt2 rt2VarR5 = hy2Var.r();
                                if (rt2VarR5 == null || !rt2VarR5.i()) {
                                    this.f = 4;
                                    if (hy2.o(hy2Var, z5, this) == hu4Var) {
                                        return hu4Var;
                                    }
                                } else {
                                    hy2Var.c().getClass();
                                    tod todVar7 = new tod(new tnh(R.string.oneme_profile_edit_close_channel_certain_header), new tnh(R.string.oneme_profile_edit_close_channel_certain_description), xw3.P0(new kc4(i13, new tnh(R.string.oneme_profile_edit_close_channel_certain_action), i5, i4), new kc4(R.id.profile_edit_admin_close_channel_cancel, new tnh(R.string.oneme_profile_edit_close_channel_cancel), i6, i4)), 8);
                                    this.f = 3;
                                    if (pzfVar3.emit(todVar7, this) == hu4Var) {
                                        return hu4Var;
                                    }
                                }
                            }
                        } else {
                            rt2 rt2VarR6 = hy2Var.r();
                            if (rt2VarR6 == null || !rt2VarR6.i()) {
                                this.f = 2;
                                if (hy2.o(hy2Var, z5, this) == hu4Var) {
                                    return hu4Var;
                                }
                            } else {
                                hy2Var.c().getClass();
                                tod todVar8 = new tod(new tnh(R.string.oneme_profile_edit_close_chat_certain_header), (ynh) null, xw3.P0(new kc4(i12, new tnh(R.string.oneme_profile_edit_close_chat_certain_action), i5, i4), new kc4(i2, new tnh(R.string.oneme_profile_edit_close_chat_certain_action_cancel), i6, i4)), 10);
                                this.f = 1;
                                if (pzfVar3.emit(todVar8, this) == hu4Var) {
                                    return hu4Var;
                                }
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        ch3.d0(obj);
                        break;
                    default:
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx2(hy2 hy2Var, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = hy2Var;
        this.g = i;
    }
}
