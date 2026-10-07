package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zj3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public int g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public a8j k;
    public a8j l;
    public final /* synthetic */ a8j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj3(int i, long j, fk3 fk3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = i;
        this.m = fk3Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        a8j a8jVar = this.m;
        switch (i) {
            case 0:
                zj3 zj3Var = new zj3(this.i, this.h, (fk3) a8jVar, lq4Var);
                zj3Var.j = obj;
                return zj3Var;
            default:
                zj3 zj3Var2 = new zj3((vb4) a8jVar, lq4Var);
                zj3Var2.j = obj;
                return zj3Var2;
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
        return ((zj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02ea A[Catch: all -> 0x02f7, CancellationException -> 0x031b, TryCatch #3 {CancellationException -> 0x031b, blocks: (B:55:0x0150, B:133:0x02e2, B:135:0x02ea, B:137:0x02f9, B:129:0x02c2), top: B:272:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9 A[Catch: all -> 0x02f7, CancellationException -> 0x031b, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x031b, blocks: (B:55:0x0150, B:133:0x02e2, B:135:0x02ea, B:137:0x02f9, B:129:0x02c2), top: B:272:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v1, types: [a8j, fk3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [fk3] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [fk3] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [fk3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ?? r5;
        vg4 vg4VarW;
        int iH;
        Object objH;
        ?? r3;
        y1g y1gVarI;
        y1g y1gVarF;
        vb4 vb4Var;
        int i;
        long j;
        vb4 vb4Var2;
        vb4 vb4Var3;
        vb4 vb4Var4;
        String localizedMessage;
        int i2 = this.e;
        Object obj2 = sbi.a;
        a8j a8jVar = this.m;
        hu4 hu4Var = hu4.a;
        int i3 = 0;
        switch (i2) {
            case 0:
                final long j2 = this.h;
                final ?? r6 = (fk3) a8jVar;
                ny8 ny8Var = r6.h;
                ny8 ny8Var2 = r6.o;
                String str = r6.Z;
                ic6 ic6Var = r6.J;
                ic6 ic6Var2 = r6.K;
                final gu4 gu4Var = (gu4) this.j;
                try {
                    try {
                        try {
                            switch (this.g) {
                                case 0:
                                    ch3.d0(obj);
                                    int i4 = this.i;
                                    if (i4 == R.id.oneme_chat_action_add_to_folder || i4 == R.id.oneme_chat_action_remove_from_folder) {
                                        zv8[] zv8VarArr = fk3.y1;
                                        rt2 rt2Var = (rt2) r6.E().k(j2).a.getValue();
                                        if (rt2Var == null) {
                                            return obj2;
                                        }
                                        a8j.x(ic6Var, new qfc(rt2Var.A()));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_remove_from_folder) {
                                        a8j.x(ic6Var, new qfc(j2));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_delete_channel) {
                                        zv8[] zv8VarArr2 = fk3.y1;
                                        rt2 rt2Var2 = (rt2) r6.E().k(j2).a.getValue();
                                        if (rt2Var2 == null) {
                                            return obj2;
                                        }
                                        a8j.x(ic6Var2, rt2Var2.i() ? vt2.d(rt2Var2) : vt2.e(rt2Var2));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_delete_chat) {
                                        zv8[] zv8VarArr3 = fk3.y1;
                                        rt2 rt2Var3 = (rt2) r6.E().k(j2).a.getValue();
                                        if (rt2Var3 == null) {
                                            return obj2;
                                        }
                                        if (rt2Var3.h0()) {
                                            y1gVarF = vt2.g(rt2Var3);
                                        } else {
                                            y1gVarF = rt2Var3.i() ? vt2.f(rt2Var3) : vt2.e(rt2Var3);
                                        }
                                        a8j.x(ic6Var2, y1gVarF);
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_leave) {
                                        zv8[] zv8VarArr4 = fk3.y1;
                                        rt2 rt2Var4 = (rt2) r6.E().k(j2).a.getValue();
                                        if (rt2Var4 == null) {
                                            return obj2;
                                        }
                                        if (rt2Var4.i()) {
                                            y1gVarI = rt2Var4.d0() ? vt2.j(rt2Var4) : vt2.l(rt2Var4);
                                        } else {
                                            y1gVarI = rt2Var4.d0() ? vt2.i(rt2Var4) : vt2.k(rt2Var4);
                                        }
                                        a8j.x(ic6Var2, y1gVarI);
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_close_chat) {
                                        a8j.x(ic6Var2, vt2.c(j2));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_close_channel) {
                                        a8j.x(ic6Var2, vt2.b(j2));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_block) {
                                        zv8[] zv8VarArr5 = fk3.y1;
                                        rt2 rt2Var5 = (rt2) r6.E().k(j2).a.getValue();
                                        vg4VarW = rt2Var5 != null ? rt2Var5.w() : null;
                                        if (vg4VarW == null) {
                                            return obj2;
                                        }
                                        a8j.x(ic6Var2, vt2.a(rt2Var5, vg4VarW));
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_unblock) {
                                        zv8[] zv8VarArr6 = fk3.y1;
                                        rt2 rt2Var6 = (rt2) r6.E().k(j2).a.getValue();
                                        vg4VarW = rt2Var6 != null ? rt2Var6.w() : null;
                                        if (vg4VarW != null) {
                                            a8j.x(ic6Var2, vt2.o(rt2Var6, vg4VarW));
                                            return obj2;
                                        }
                                        gm0.Y(str, "Failed to unblock, no contact found");
                                        return obj2;
                                    }
                                    if (i4 == R.id.oneme_chat_action_add_favorite) {
                                        zv8[] zv8VarArr7 = fk3.y1;
                                        iH = ((g5d) ((gjf) r6.j.getValue())).h();
                                        rt2 rt2Var7 = (rt2) r6.E().k(j2).a.getValue();
                                        if (rt2Var7 == null) {
                                            return obj2;
                                        }
                                        eb ebVar = (eb) r6.x.getValue();
                                        long jA = rt2Var7.A();
                                        this.j = null;
                                        this.k = r6;
                                        this.l = r6;
                                        this.f = iH;
                                        this.g = 1;
                                        objH = ebVar.h(jA, this, "all.chat.folder");
                                        if (objH != hu4Var) {
                                            r5 = r6;
                                            r3 = r6;
                                            r6 = r6;
                                            try {
                                                if (((Boolean) objH).booleanValue()) {
                                                    a8j.x(r6.K, new o6f(true));
                                                } else {
                                                    a8j.x(r6.K, new r3g(new vnh(R.string.favorite_chats_limit_exceeded, a.n1(new Object[]{new Integer(iH)})), null, null, 6));
                                                }
                                                return obj2;
                                            } catch (Throwable unused) {
                                                r6 = r3;
                                                zv8[] zv8VarArr8 = fk3.y1;
                                                r6.K();
                                                return obj2;
                                            }
                                        }
                                    } else {
                                        if (i4 == R.id.oneme_chat_action_remove_favorite) {
                                            zv8[] zv8VarArr9 = fk3.y1;
                                            rt2 rt2Var8 = (rt2) r6.E().k(j2).a.getValue();
                                            if (rt2Var8 == null) {
                                                return obj2;
                                            }
                                            yie yieVar = (yie) r6.y.getValue();
                                            long jA2 = rt2Var8.A();
                                            this.j = null;
                                            this.k = r6;
                                            this.l = null;
                                            this.f = 0;
                                            this.g = 2;
                                            if (yieVar.h(jA2, this, "all.chat.folder") == hu4Var) {
                                            }
                                            r6 = r6;
                                            r5 = r6;
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_mark_as_unread) {
                                            zv8[] zv8VarArr10 = fk3.y1;
                                            rt2 rt2Var9 = (rt2) r6.E().k(j2).a.getValue();
                                            if (rt2Var9 == null) {
                                                return obj2;
                                            }
                                            i8e i8eVar = (i8e) ny8Var2.getValue();
                                            rt2 rt2VarK = ((qw2) i8eVar.a.getValue()).K(rt2Var9.A());
                                            if (rt2VarK == null) {
                                                return obj2;
                                            }
                                            i8eVar.b(rt2VarK);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_mark_as_read) {
                                            zv8[] zv8VarArr11 = fk3.y1;
                                            rt2 rt2Var10 = (rt2) r6.E().k(j2).a.getValue();
                                            if (rt2Var10 == null) {
                                                return obj2;
                                            }
                                            ((i8e) ny8Var2.getValue()).a(rt2Var10);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_unmute) {
                                            zv8[] zv8VarArr12 = fk3.y1;
                                            qw2 qw2VarJ = r6.E().j();
                                            rt2 rt2VarN = qw2VarJ.N(j2);
                                            if (rt2VarN == null) {
                                                return obj2;
                                            }
                                            qw2VarJ.x(rt2VarN, 0L, true);
                                            ((pvb) qw2VarJ.r.get()).o(rt2VarN.a);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_mute) {
                                            zv8[] zv8VarArr13 = fk3.y1;
                                            rt2 rt2Var11 = (rt2) r6.E().k(j2).a.getValue();
                                            if (rt2Var11 == null) {
                                                return obj2;
                                            }
                                            kc4 kc4Var = vt2.a;
                                            a8j.x(ic6Var2, new y1g(rt2Var11.a, new tnh(R.string.notifications_disable), null, vt2.n()));
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_select) {
                                            a8j.x(ic6Var2, vt2.p());
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_chat_action_move_rights_and_leave) {
                                            zv8[] zv8VarArr14 = fk3.y1;
                                            rt2 rt2Var12 = (rt2) r6.E().k(j2).a.getValue();
                                            if (rt2Var12 == null) {
                                                return obj2;
                                            }
                                            if (rt2Var12.d0()) {
                                                a8j.x(ic6Var, new q1b(j2));
                                                return obj2;
                                            }
                                            zm3.b.getClass();
                                            bc1.q(":profile/change-owner?chat_id=" + j2 + "&leave_chat=true", ic6Var);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_confirm_delete) {
                                            zv8[] zv8VarArr15 = fk3.y1;
                                            ((sie) ny8Var.getValue()).a(j2, true, true);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_confirm_delete_for_all) {
                                            zv8[] zv8VarArr16 = fk3.y1;
                                            ((sie) ny8Var.getValue()).a(j2, true, true);
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_confirm_leave_chat) {
                                            final int i5 = 0;
                                            a8j.x(ic6Var2, new r1g(new tnh(R.string.oneme_chat_snackbar_title_leave_chat), new cf7() { // from class: wj3
                                                @Override // defpackage.cf7
                                                public final Object invoke(Object obj3) {
                                                    int i6 = i5;
                                                    sbi sbiVar = sbi.a;
                                                    gu4 gu4Var2 = gu4Var;
                                                    j8c j8cVar = (j8c) obj3;
                                                    switch (i6) {
                                                        case 0:
                                                            if (yj3.$EnumSwitchMapping$0[j8cVar.ordinal()] != 1) {
                                                                fk3 fk3Var = r6;
                                                                yab.i0(gu4Var2, ((n0c) fk3Var.g).b(), 0, new xj3(0, j2, fk3Var, null), 2);
                                                            }
                                                            break;
                                                        default:
                                                            if (yj3.$EnumSwitchMapping$0[j8cVar.ordinal()] != 1) {
                                                                fk3 fk3Var2 = r6;
                                                                yab.i0(gu4Var2, ((n0c) fk3Var2.g).b(), 0, new xj3(1, j2, fk3Var2, null), 2);
                                                            }
                                                            break;
                                                    }
                                                    return sbiVar;
                                                }
                                            }));
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_confirm_leave_channel) {
                                            final int i6 = 1;
                                            a8j.x(ic6Var2, new r1g(new tnh(R.string.oneme_chat_snackbar_title_leave_channel), new cf7() { // from class: wj3
                                                @Override // defpackage.cf7
                                                public final Object invoke(Object obj3) {
                                                    int i7 = i6;
                                                    sbi sbiVar = sbi.a;
                                                    gu4 gu4Var2 = gu4Var;
                                                    j8c j8cVar = (j8c) obj3;
                                                    switch (i7) {
                                                        case 0:
                                                            if (yj3.$EnumSwitchMapping$0[j8cVar.ordinal()] != 1) {
                                                                fk3 fk3Var = r6;
                                                                yab.i0(gu4Var2, ((n0c) fk3Var.g).b(), 0, new xj3(0, j2, fk3Var, null), 2);
                                                            }
                                                            break;
                                                        default:
                                                            if (yj3.$EnumSwitchMapping$0[j8cVar.ordinal()] != 1) {
                                                                fk3 fk3Var2 = r6;
                                                                yab.i0(gu4Var2, ((n0c) fk3Var2.g).b(), 0, new xj3(1, j2, fk3Var2, null), 2);
                                                            }
                                                            break;
                                                    }
                                                    return sbiVar;
                                                }
                                            }));
                                            return obj2;
                                        }
                                        if (i4 == R.id.oneme_confirm_block) {
                                            zv8[] zv8VarArr17 = fk3.y1;
                                            rt2 rt2Var13 = (rt2) r6.E().k(j2).a.getValue();
                                            vg4 vg4VarW2 = rt2Var13 != null ? rt2Var13.w() : null;
                                            if (vg4VarW2 == null) {
                                                gm0.Y(str, "Failed to block, no contact found");
                                                return obj2;
                                            }
                                            a8j.x(ic6Var2, new r1g(new tnh(R.string.contact_blocked), new tc((Object) r6, 24, vg4VarW2)));
                                            mh4 mh4Var = (mh4) r6.p.getValue();
                                            long jV = vg4VarW2.v();
                                            this.j = null;
                                            this.g = 3;
                                            if (mh4Var.a(jV, this) != hu4Var) {
                                                r5 = r6;
                                                return obj2;
                                            }
                                        } else {
                                            if (i4 == R.id.oneme_confirm_unblock) {
                                                zv8[] zv8VarArr18 = fk3.y1;
                                                rt2 rt2Var14 = (rt2) r6.E().k(j2).a.getValue();
                                                vg4VarW = rt2Var14 != null ? rt2Var14.w() : null;
                                                if (vg4VarW == null) {
                                                    gm0.Y(str, "Failed to block, no contact found");
                                                    return obj2;
                                                }
                                                fk3.D(r6, vg4VarW.v(), true);
                                                return obj2;
                                            }
                                            lw5 lw5Var = lw5.HOURS;
                                            if (i4 == R.id.oneme_confirm_mute_1_hour) {
                                                ghb ghbVar = ew5.b;
                                                long jO = qe7.O(1, lw5Var);
                                                this.j = null;
                                                this.g = 4;
                                                fk3.B(r6, j2, jO);
                                                if (obj2 != hu4Var) {
                                                    r5 = r6;
                                                    return obj2;
                                                }
                                            } else if (i4 == R.id.oneme_confirm_mute_4_hour) {
                                                ghb ghbVar2 = ew5.b;
                                                long jO2 = qe7.O(4, lw5Var);
                                                this.j = null;
                                                this.g = 5;
                                                fk3.B(r6, j2, jO2);
                                                if (obj2 != hu4Var) {
                                                    r5 = r6;
                                                    return obj2;
                                                }
                                            } else if (i4 == R.id.oneme_confirm_mute_1_day) {
                                                ghb ghbVar3 = ew5.b;
                                                long jO3 = qe7.O(1, lw5.DAYS);
                                                this.j = null;
                                                this.g = 6;
                                                fk3.B(r6, j2, jO3);
                                                if (obj2 != hu4Var) {
                                                    r5 = r6;
                                                    return obj2;
                                                }
                                            } else {
                                                if (i4 != R.id.oneme_confirm_mute_infinite) {
                                                    if (i4 == R.id.oneme_chat_action_suspend_bot) {
                                                        zv8[] zv8VarArr19 = fk3.y1;
                                                        a8j.x(ic6Var2, new r1g(new tnh(R.string.suspend_bot_snackbar_title), new kj3(r6, j2, 1)));
                                                        return obj2;
                                                    }
                                                    if (i4 == R.id.oneme_chat_action_suspend_and_delete_bot) {
                                                        zv8[] zv8VarArr20 = fk3.y1;
                                                        a8j.x(ic6Var2, new r1g(new tnh(R.string.chat_deleted_and_bot_suspended_snackbar), new kj3(r6, j2, 0)));
                                                        return obj2;
                                                    }
                                                    if (i4 == R.id.oneme_action_complaint) {
                                                        zm3.b.getClass();
                                                        bc1.q(":complaint?ids=" + j2, ic6Var);
                                                        return obj2;
                                                    }
                                                    if (i4 == R.id.oneme_chat_action_clear_chat_history) {
                                                        a8j.x(ic6Var2, new r1g(new tnh(R.string.chat_clear_history_snackbar_title), new kj3(r6, j2, 2)));
                                                        return obj2;
                                                    }
                                                    int i7 = R.id.oneme_saved_messages_clear_history;
                                                    if (i4 == R.id.oneme_chat_action_clear_saved_messages) {
                                                        a8j.x(ic6Var2, new y1g(0L, new tnh(R.string.chat_list_confirm_clear_saved_messages_history_title), new tnh(R.string.chat_list_confirm_clear_saved_messages_history_subtitle), xw3.P0(new kc4(i7, new tnh(R.string.chat_list_confirm_clear_saved_messages_history_negative_button), 1, 56), vt2.a)));
                                                        return obj2;
                                                    }
                                                    if (i4 != R.id.oneme_saved_messages_clear_history) {
                                                        return obj2;
                                                    }
                                                    zv8[] zv8VarArr21 = fk3.y1;
                                                    rt2 rt2Var15 = (rt2) ((mjg) r6.E().s()).getValue();
                                                    if (rt2Var15 == null) {
                                                        gm0.Y(fk3.class.getName(), "Early return in onClearSavedMessagesConfirm cuz of chatsRepository.savedMessagesChat.value is null");
                                                        return obj2;
                                                    }
                                                    ((wzj) r6.v.getValue()).c(new xjf(rt2Var15.a, false));
                                                    return obj2;
                                                }
                                                this.j = null;
                                                this.g = 7;
                                                zv8[] zv8VarArr22 = fk3.y1;
                                                qw2 qw2VarJ2 = r6.E().j();
                                                r5 = -1;
                                                qw2VarJ2.W(j2, -1L);
                                                if (obj2 != hu4Var) {
                                                    return obj2;
                                                }
                                            }
                                        }
                                    }
                                    r5 = r6;
                                    r5 = r6;
                                    r5 = r6;
                                    r5 = r6;
                                    r6 = r6;
                                    r5 = r6;
                                    r5 = r6;
                                    obj2 = hu4Var;
                                    r6 = r5;
                                    r6 = r6;
                                    r5 = r6;
                                    return obj2;
                                case 1:
                                    iH = this.f;
                                    fk3 fk3Var = (fk3) this.l;
                                    fk3 fk3Var2 = (fk3) this.k;
                                    ch3.d0(obj);
                                    r3 = fk3Var;
                                    r6 = fk3Var2;
                                    objH = obj;
                                    if (((Boolean) objH).booleanValue()) {
                                        a8j.x(r6.K, new o6f(true));
                                    } else {
                                        a8j.x(r6.K, new r3g(new vnh(R.string.favorite_chats_limit_exceeded, a.n1(new Object[]{new Integer(iH)})), null, null, 6));
                                    }
                                    return obj2;
                                case 2:
                                    fk3 fk3Var3 = (fk3) this.k;
                                    ch3.d0(obj);
                                    r6 = fk3Var3;
                                    r6 = r6;
                                    r5 = r6;
                                    return obj2;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    ch3.d0(obj);
                                    return obj2;
                                default:
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                            }
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable unused2) {
                            zv8[] zv8VarArr23 = fk3.y1;
                            r6.K();
                            return obj2;
                        }
                    } catch (Throwable unused3) {
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                break;
            default:
                gu4 gu4Var2 = (gu4) this.j;
                int i8 = this.i;
                lw5 lw5Var2 = lw5.NANOSECONDS;
                try {
                    if (i8 == 0) {
                        ch3.d0(obj);
                        vb4Var = (vb4) a8jVar;
                        try {
                            ghb ghbVar4 = ew5.b;
                            long jP = qe7.P(System.nanoTime(), lw5Var2);
                            qfi qfiVar = (qfi) vb4Var.e.getValue();
                            this.j = gu4Var2;
                            this.k = vb4Var;
                            this.l = vb4Var;
                            this.f = 0;
                            this.g = 0;
                            this.h = jP;
                            this.i = 1;
                            if (qfiVar.a(true, false, this) == hu4Var) {
                                return hu4Var;
                            }
                            i = 0;
                            j = jP;
                            vb4Var2 = vb4Var;
                        } catch (Throwable th) {
                            th = th;
                            vb4Var3 = vb4Var;
                            if (th instanceof TamErrorException) {
                                localizedMessage = th.getLocalizedMessage();
                                if (localizedMessage != null) {
                                    a8j.x(vb4Var3.k, localizedMessage);
                                }
                            } else {
                                qv1.t(gu4Var2, "fail to update safe mode", th);
                            }
                            return Boolean.FALSE;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vb4Var3 = (vb4) this.l;
                            vb4Var4 = (vb4) this.k;
                            try {
                                ch3.d0(obj);
                                vb4Var2 = vb4Var4;
                                cqk.m(gu4Var2);
                                a8j.x(vb4Var2.l, obj2);
                                return Boolean.TRUE;
                            } catch (Throwable th2) {
                                th = th2;
                                if (th instanceof TamErrorException) {
                                    localizedMessage = th.getLocalizedMessage();
                                    if (localizedMessage != null) {
                                        a8j.x(vb4Var3.k, localizedMessage);
                                    }
                                } else {
                                    qv1.t(gu4Var2, "fail to update safe mode", th);
                                }
                                return Boolean.FALSE;
                            }
                        }
                        long j3 = this.h;
                        int i9 = this.g;
                        int i10 = this.f;
                        vb4 vb4Var5 = (vb4) this.l;
                        vb4Var2 = (vb4) this.k;
                        try {
                            ch3.d0(obj);
                            j = j3;
                            i = i9;
                            vb4Var = vb4Var5;
                            i3 = i10;
                        } catch (Throwable th3) {
                            th = th3;
                            vb4Var3 = vb4Var5;
                            if (th instanceof TamErrorException) {
                                localizedMessage = th.getLocalizedMessage();
                                if (localizedMessage != null) {
                                    a8j.x(vb4Var3.k, localizedMessage);
                                }
                            } else {
                                qv1.t(gu4Var2, "fail to update safe mode", th);
                            }
                            return Boolean.FALSE;
                        }
                    }
                    et3 et3Var = (et3) vb4Var2.d.getValue();
                    xb9 xb9Var = (xb9) et3Var;
                    int i11 = i3;
                    xb9Var.e("app.pin_" + xb9Var.t(), vb4Var2.c);
                    ghb ghbVar5 = ew5.b;
                    long jO4 = ew5.o(qe7.O(1, lw5.SECONDS), ew5.o(qe7.P(System.nanoTime(), lw5Var2), j));
                    if (ew5.g(jO4) > 0) {
                        this.j = gu4Var2;
                        this.k = vb4Var2;
                        this.l = vb4Var;
                        this.f = i11;
                        this.g = i;
                        this.h = j;
                        this.i = 2;
                        if (rx8.u(jO4, this) == hu4Var) {
                            return hu4Var;
                        }
                        vb4Var3 = vb4Var;
                        vb4Var4 = vb4Var2;
                        vb4Var2 = vb4Var4;
                    } else {
                        vb4Var3 = vb4Var;
                    }
                    cqk.m(gu4Var2);
                    a8j.x(vb4Var2.l, obj2);
                    return Boolean.TRUE;
                } catch (CancellationException e3) {
                    throw e3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj3(vb4 vb4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = vb4Var;
    }
}
