package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mi4 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public int g;
    public final /* synthetic */ vi4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi4(int i, vi4 vi4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = i;
        this.h = vi4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vi4 vi4Var = this.h;
        switch (i) {
            case 0:
                return new mi4(this.g, vi4Var, lq4Var);
            default:
                return new mi4(vi4Var, lq4Var);
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
        return ((mi4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5 A[PHI: r3
  0x00a5: PHI (r3v17 int) = (r3v16 int), (r3v16 int), (r3v19 int) binds: [B:22:0x0091, B:24:0x00a2, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        int iK;
        rt2 rt2VarO;
        cod codVar;
        rt3 rt3Var;
        int i2 = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        vi4 vi4Var = this.h;
        int i3 = 1;
        int i4 = 2;
        byte b = 0;
        switch (i2) {
            case 0:
                pzf pzfVar = vi4Var.e;
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    int i6 = this.g;
                    if (i6 == 256) {
                        yab.i0(vi4Var.a, ((n0c) vi4Var.r()).b(), 0, new qi4((Object) vi4Var, false, (lq4) (b == true ? 1 : 0), (int) (0 == true ? 1 : 0)), 2);
                        return sbiVar;
                    }
                    if (i6 == 128) {
                        this.f = 1;
                        if (vi4.o(vi4Var, this) != hu4Var) {
                            return sbiVar;
                        }
                    } else if (i6 == R.id.profile_edit_contact_delete_action) {
                        this.f = 2;
                        if (vi4.o(vi4Var, this) != hu4Var) {
                            return sbiVar;
                        }
                    } else {
                        int i7 = 56;
                        if (i6 == 64) {
                            this.f = 3;
                            vi4Var.c().getClass();
                            tnh tnhVar = new tnh(R.string.oneme_profile_edit_inactive_ttl_header);
                            c79 c79VarW = yab.w();
                            for (kni kniVar : a06.a) {
                                int iOrdinal = kniVar.ordinal();
                                if (iOrdinal == 0) {
                                    i = R.id.profile_change_inactive_ttl_delete_1_month;
                                } else if (iOrdinal == i3) {
                                    i = R.id.profile_change_inactive_ttl_delete_3_month;
                                } else if (iOrdinal == 2) {
                                    i = R.id.profile_change_inactive_ttl_delete_6_month;
                                } else {
                                    ore.o();
                                }
                                c79VarW.add(new kc4(i, new pnh(R.plurals.inactive_ttl, kniVar.b), i4, i7));
                                i3 = 1;
                            }
                            Object objEmit = pzfVar.emit(new tod(tnhVar, (ynh) null, yab.j(c79VarW), 8), this);
                            if (objEmit != hu4Var) {
                                objEmit = sbiVar;
                            }
                            if (objEmit != hu4Var) {
                                return sbiVar;
                            }
                        } else if (i6 == 512) {
                            this.f = 4;
                            b06 b06VarC = vi4Var.c();
                            boolean z = ((f62) ((n42) ((k42) vi4Var.w.getValue())).f.a.getValue()).b;
                            b06VarC.getClass();
                            tnh tnhVar2 = new tnh(R.string.oneme_profile_edit_logout_header);
                            tnh tnhVar3 = z ? new tnh(R.string.oneme_profile_edit_logout_call_subheader) : null;
                            c79 c79VarW2 = yab.w();
                            c79VarW2.add(new kc4(R.id.profile_edit_logout_confirm_action, new tnh(z ? R.string.oneme_profile_edit_logout_button_with_call : R.string.oneme_profile_edit_logout_confirm_action), 1, i7));
                            c79VarW2.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.oneme_profile_edit_logout_cancel), i4, i7));
                            Object objEmit2 = pzfVar.emit(new tod(tnhVar2, tnhVar3, yab.j(c79VarW2), 8), this);
                            if (objEmit2 != hu4Var) {
                                objEmit2 = sbiVar;
                            }
                            if (objEmit2 != hu4Var) {
                                return sbiVar;
                            }
                        } else {
                            if (i6 != R.id.profile_edit_short_link) {
                                return sbiVar;
                            }
                            pzf pzfVar2 = vi4Var.d;
                            ynd yndVar = new ynd(vi4Var.p, nnd.CONTACT);
                            this.f = 5;
                            if (pzfVar2.emit(yndVar, this) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                    return hu4Var;
                }
                if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                pzf pzfVar3 = vi4Var.d;
                long j = vi4Var.p;
                int i8 = this.g;
                if (i8 == 0) {
                    ch3.d0(obj);
                    bm4 bm4Var = (bm4) vi4Var.y.getValue();
                    this.g = 1;
                    if (bm4Var.a(j, this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i8 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i8 == 2) {
                        iK = this.f;
                        ch3.d0(obj);
                        rt2VarO = ((xn3) vi4Var.r.getValue()).o(j);
                        if (rt2VarO != null) {
                            codVar = new cod(rt2VarO.a);
                            this.f = iK;
                            this.g = 3;
                            if (pzfVar3.emit(codVar, this) != hu4Var) {
                            }
                        }
                        return hu4Var;
                    }
                    if (i8 != 3) {
                        if (i8 == 4) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iK = this.f;
                    ch3.d0(obj);
                }
                rt3Var = rt3.b;
                this.f = iK;
                this.g = 4;
                if (pzfVar3.emit(rt3Var, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
                iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
                pzf pzfVar4 = vi4Var.e;
                sod sodVar = new sod(new tnh(R.string.profile_contact_deleted_snackbar_title), iK, new s63(7, vi4Var));
                this.f = iK;
                this.g = 2;
                if (pzfVar4.emit(sodVar, this) != hu4Var) {
                    rt2VarO = ((xn3) vi4Var.r.getValue()).o(j);
                    if (rt2VarO != null) {
                        codVar = new cod(rt2VarO.a);
                        this.f = iK;
                        this.g = 3;
                        if (pzfVar3.emit(codVar, this) != hu4Var) {
                            rt3Var = rt3.b;
                            this.f = iK;
                            this.g = 4;
                            if (pzfVar3.emit(rt3Var, this) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    } else {
                        rt3Var = rt3.b;
                        this.f = iK;
                        this.g = 4;
                        if (pzfVar3.emit(rt3Var, this) != hu4Var) {
                            return sbiVar;
                        }
                    }
                }
                return hu4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi4(vi4 vi4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = vi4Var;
    }
}
