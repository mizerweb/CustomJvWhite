package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tl1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(long j, end endVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 5;
        this.f = j;
        this.g = endVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                tl1 tl1Var = new tl1((CallHistoryScreen) obj2, lq4Var, 0);
                tl1Var.f = ((Number) obj).longValue();
                return tl1Var;
            case 1:
                tl1 tl1Var2 = new tl1((ChatMediaViewerScreen) obj2, lq4Var, 1);
                tl1Var2.f = ((Number) obj).longValue();
                return tl1Var2;
            case 2:
                return new tl1((l73) obj2, this.f, lq4Var, 2);
            case 3:
                return new tl1((yk4) obj2, this.f, lq4Var, 3);
            case 4:
                return new tl1((w5b) obj2, this.f, lq4Var, 4);
            case 5:
                return new tl1(this.f, (end) obj2, lq4Var);
            case 6:
                return new tl1((z18) obj2, this.f, lq4Var, 6);
            case 7:
                return new tl1((xte) obj2, this.f, lq4Var, 7);
            case 8:
                return new tl1((SaveStoryToGalleryWorker) obj2, this.f, lq4Var, 8);
            case 9:
                tl1 tl1Var3 = new tl1((s4f) obj2, lq4Var, 9);
                tl1Var3.f = ((Number) obj).longValue();
                return tl1Var3;
            case 10:
                return new tl1((brf) obj2, this.f, lq4Var, 10);
            default:
                tl1 tl1Var4 = new tl1((vei) obj2, lq4Var, 11);
                tl1Var4.f = ((Number) obj).longValue();
                return tl1Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((tl1) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((tl1) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                return ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                ((tl1) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((tl1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((tl1) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String strK;
        rp4 rp4Var;
        rp4 rp4Var2;
        Set setA0;
        xmd xmdVar;
        Object poeVar;
        int i = this.e;
        List listJ = r66.a;
        sbi sbiVar = sbi.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                long j = this.f;
                ch3.d0(obj);
                if (j > 0) {
                    zv8[] zv8VarArr = CallHistoryScreen.D;
                }
                return sbiVar;
            case 1:
                long j2 = this.f;
                ch3.d0(obj);
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) obj2;
                if (!chatMediaViewerScreen.j) {
                    zv8[] zv8VarArr2 = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.R1().e(j2, chatMediaViewerScreen.w0().V(), chatMediaViewerScreen.w0().getDuration());
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                l73 l73Var = (l73) obj2;
                ny8 ny8Var = l73Var.f;
                ic6 ic6Var = l73Var.p;
                no4 no4Var = (no4) ny8Var.getValue();
                long j3 = this.f;
                vg4 vg4Var = (vg4) no4Var.j(j3).a.getValue();
                if (vg4Var != null && (strK = vg4Var.k()) != null) {
                    int iD = qt4.D(l73Var.o);
                    if (iD == 0) {
                        a8j.x(ic6Var, pll.a(c0a.s(j3), new vnh(R.string.profile_members_list_delete_one_from_channel_title, a.n1(new Object[]{strK})), null));
                    } else {
                        if (iD != 1) {
                            ore.o();
                            return null;
                        }
                        a8j.x(ic6Var, pll.b(c0a.s(j3), new vnh(R.string.profile_members_list_delete_one_from_chat_title, a.n1(new Object[]{strK})), null));
                    }
                }
                return sbiVar;
            case 3:
                ch3.d0(obj);
                xg4 xg4Var = (xg4) ((yk4) obj2).e.getValue();
                long j4 = this.f;
                vg4 vg4VarF = ((bi4) xg4Var.a.getValue()).f(j4, false);
                if (vg4VarF != null) {
                    rt2 rt2VarO = ((xn3) xg4Var.b.getValue()).o(j4);
                    boolean zC = ((jcd) xg4Var.c.getValue()).c(rt2VarO, vg4VarF);
                    c79 c79VarW = yab.w();
                    boolean zH = vg4VarF.H();
                    boolean zE = vg4VarF.E();
                    if (!zH && !zE) {
                        c79VarW.add(wg4.h);
                        c79VarW.add(wg4.i);
                    }
                    c79VarW.add(wg4.a);
                    if (zH) {
                        c79VarW.add(wg4.b);
                    } else {
                        c79VarW.add(wg4.c);
                    }
                    c79VarW.add(wg4.d);
                    if (!zC) {
                        if (zE && rt2VarO != null && !rt2VarO.E0()) {
                            c79VarW.add(wg4.j);
                        } else if (!zE && vg4VarF.D()) {
                            c79VarW.add(wg4.f);
                        } else if (!zE && !vg4VarF.D()) {
                            c79VarW.add(wg4.e);
                        }
                    }
                    c79VarW.add(wg4.g);
                    listJ = yab.j(c79VarW);
                }
                qu6 qu6VarN0 = yhf.n0(yhf.n0(new sw(1, listJ), new w83(12)), new w83(13));
                zc6 zc6Var = yk4.H;
                ArrayList arrayList = new ArrayList();
                ArrayList<wg4> arrayList2 = new ArrayList();
                yhf.v0(qu6VarN0, arrayList2);
                bx3.Y0(arrayList2, zc6Var);
                for (wg4 wg4Var : arrayList2) {
                    Integer numValueOf = Integer.valueOf(R.attr.icon_negative);
                    Integer numValueOf2 = Integer.valueOf(R.attr.text_negative);
                    Integer numValueOf3 = Integer.valueOf(R.attr.icon_primary);
                    switch (wg4Var.ordinal()) {
                        case 0:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_open_profile, new tnh(R.string.oneme_contactlist_action_open_profile), Integer.valueOf(R.drawable.icon_placeholder), numValueOf3, 4);
                            break;
                        case 1:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_share_contact, new tnh(R.string.oneme_contactlist_action_share_contact), Integer.valueOf(R.drawable.icon_share_ios), numValueOf3, 4);
                            break;
                        case 2:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_write, new tnh(R.string.oneme_contactlist_action_write), Integer.valueOf(R.drawable.icon_message), numValueOf3, 4);
                            break;
                        case 3:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_select, new tnh(R.string.oneme_contactlist_action_select), Integer.valueOf(R.drawable.icon_folder_add_to), numValueOf3, 4);
                            break;
                        case 4:
                            rp4Var2 = new rp4(R.id.oneme_contactlist_action_block, new tnh(R.string.action_block), numValueOf2, Integer.valueOf(R.drawable.icon_block_contact), numValueOf);
                            continue;
                            arrayList.add(rp4Var2);
                            break;
                        case 5:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_unblock, new tnh(R.string.action_unblock), Integer.valueOf(R.drawable.icon_privacy), numValueOf3, 4);
                            break;
                        case 6:
                            rp4Var2 = new rp4(R.id.oneme_contactlist_action_delete, new tnh(R.string.oneme_contactlist_action_delete), numValueOf2, Integer.valueOf(R.drawable.icon_delete), numValueOf);
                            continue;
                            arrayList.add(rp4Var2);
                            break;
                        case 7:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_audio_call, new tnh(R.string.oneme_contactlist_action_audio_call), Integer.valueOf(R.drawable.icon_call), numValueOf3, 4);
                            break;
                        case 8:
                            rp4Var = new rp4(R.id.oneme_contactlist_action_video_call, new tnh(R.string.oneme_contactlist_action_video_call), Integer.valueOf(R.drawable.icon_video_call), numValueOf3, 4);
                            break;
                        case 9:
                            rp4Var2 = new rp4(R.id.oneme_contactlist_action_suspend_bot, new tnh(R.string.oneme_contactlist_action_suspend_bot), numValueOf2, Integer.valueOf(R.drawable.icon_minus_round), numValueOf);
                            continue;
                            arrayList.add(rp4Var2);
                            break;
                        default:
                            ore.o();
                            return null;
                    }
                    rp4Var2 = rp4Var;
                    arrayList.add(rp4Var2);
                }
                return arrayList;
            case 4:
                ch3.d0(obj);
                mjg mjgVar = ((w5b) obj2).d;
                Set set = ((q5b) mjgVar.getValue()).b;
                boolean zIsEmpty = set.isEmpty();
                long j5 = this.f;
                if (zIsEmpty) {
                    setA0 = Collections.singleton(new Long(j5));
                } else if (set.contains(new Long(j5))) {
                    setA0 = ww3.W1(set);
                    setA0.remove(new Long(j5));
                } else {
                    setA0 = lof.a0(set, new Long(j5));
                }
                if (!setA0.isEmpty()) {
                    c79 c79VarW2 = yab.w();
                    c79VarW2.add(new mcc(R.id.oneme_stickers_settings_stickers_multiselect_delete, R.string.oneme_stickers_settings_menu_delete_set_confirm_action, R.drawable.icon_delete, false, null, 56));
                    listJ = yab.j(c79VarW2);
                }
                q5b q5bVar = new q5b(true, setA0, listJ);
                mjgVar.getClass();
                mjgVar.j(null, q5bVar);
                return sbiVar;
            case 5:
                end endVar = (end) obj2;
                long j6 = endVar.d;
                ic6 ic6Var2 = endVar.s;
                ch3.d0(obj);
                long j7 = this.f;
                if (!(j7 == b6c.j || j7 == b6c.f) || (xmdVar = (xmd) endVar.o.getValue()) == null || xmdVar.e.a) {
                    zv8[] zv8VarArr3 = end.w;
                    rt2 rt2VarD = endVar.D();
                    boolean z = rt2VarD != null && rt2VarD.v0(j6);
                    if (((s7f) ((et3) endVar.m.getValue())).t() != j6 && !z) {
                        a8j.x(ic6Var2, new umd(new tnh(R.string.profile_edit_admin_permissions_not_enough_perm_title), new Integer(R.drawable.icon_privacy_fill), false, 4));
                    }
                } else {
                    a8j.x(ic6Var2, new umd(new tnh(R.string.profile_edit_admin_permissions_cannot_read_all_messages_title), new Integer(R.drawable.icon_info_fill), false, 4));
                }
                return sbiVar;
            case 6:
                ch3.d0(obj);
                ((xn3) ((ny8) ((z18) obj2).e).getValue()).u(this.f);
                return sbiVar;
            case 7:
                ch3.d0(obj);
                xte xteVar = (xte) obj2;
                String str = xteVar.c;
                long j8 = this.f;
                gm0.m(str, "seekToPosition, posMs %d", new Long(j8));
                xteVar.b();
                iu9 iu9Var = xteVar.g;
                if (iu9Var != null) {
                    iu9Var.seekTo(j8);
                }
                mjg mjgVar2 = xteVar.m;
                Long l = new Long(j8);
                mjgVar2.getClass();
                mjgVar2.j(null, l);
                mjg mjgVar3 = xteVar.z;
                Float f = new Float(oc9.u((float) (j8 / xteVar.w), 0.0f, 1.0f));
                mjgVar3.getClass();
                mjgVar3.j(null, f);
                return sbiVar;
            case 8:
                ch3.d0(obj);
                File fileK = ((ju6) ((rs6) ((SaveStoryToGalleryWorker) obj2).p.getValue())).k(nbh.s(this.f, "story_save_", ".mp4"));
                try {
                    poeVar = Boolean.valueOf(fileK.exists() ? fileK.delete() : false);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object obj3 = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj3;
                }
                return fileK;
            case 9:
                long j9 = this.f;
                ch3.d0(obj);
                s4f s4fVar = (s4f) obj2;
                zv8[] zv8VarArr4 = s4f.r;
                s4fVar.n.B(s4fVar, s4f.r[0], yab.i0((y82) s4fVar.c.getValue(), ((n0c) ((xhh) s4fVar.g.getValue())).b(), 0, new f1j(j9, s4fVar, null), 2));
                return sbiVar;
            case 10:
                ch3.d0(obj);
                brf brfVar = (brf) obj2;
                rt2 rt2VarO2 = ((xn3) brfVar.f.getValue()).o(this.f);
                if (rt2VarO2 != null) {
                    ic6 ic6Var3 = brfVar.p;
                    uuf uufVar = uuf.b;
                    long j10 = rt2VarO2.a;
                    uufVar.getClass();
                    bc1.q(":profile?id=" + j10 + "&type=local_chat&is_opened_from_dialog=false", ic6Var3);
                }
                return sbiVar;
            default:
                long j11 = this.f;
                ch3.d0(obj);
                return ((no4) ((vei) obj2).b.getValue()).a(j11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl1(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl1(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
