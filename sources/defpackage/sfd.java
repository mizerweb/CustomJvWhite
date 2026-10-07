package defpackage;

import android.app.KeyguardManager;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.chatmedia.viewer.photo.BasePhotoViewerWidget;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.main.accountswitcher.AccountSwitcherBottomSheet;
import one.me.mediapicker.crop.AspectRatiosBottomSheet;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.workmanager.BacklogWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sfd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfd(Object obj, lq4 lq4Var, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    private final Object l(Object obj) {
        int i;
        kj1 kj1Var;
        kj1 kj1Var2;
        Object obj2 = this.f;
        ch3.d0(obj);
        gm1 gm1Var = (gm1) obj2;
        if (gm1Var instanceof em1) {
            CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.g;
            em1 em1Var = (em1) gm1Var;
            ou7 ou7Var = CallIncomingScreen.m;
            CharSequence charSequence = em1Var.k;
            boolean z = em1Var.b;
            boolean z2 = em1Var.i;
            qe1 qe1Var = em1Var.a;
            boolean z3 = charSequence != null;
            g52 g52Var = (g52) callIncomingScreen.f.m(callIncomingScreen, CallIncomingScreen.n[0]);
            if (z2 || z3) {
                ok0 ok0Var = qe1Var.d;
                kwb kwbVar = g52Var.s;
                kwb.u(kwbVar, ok0Var != null ? ok0Var.b : null, ok0Var != null ? ok0Var.a : null);
                kwbVar.setOverlay(null);
            }
            g52Var.W(z, true);
            g52Var.setCameraPreviewButtonEnable(em1Var.c);
            if (z2 || z3) {
                g52Var.setSmallAvatar(z ? qe1Var.d : null);
            }
            CharSequence charSequence2 = qe1Var.b;
            if (!z3 && charSequence2 == null) {
                g52Var.setName(np4.q(callIncomingScreen.getContext(), R.string.not_contact_with_hidden_phone_number));
            } else {
                g52Var.setName(charSequence2);
            }
            if (z3) {
                g52Var.setOrganization(em1Var.k);
            }
            g52Var.setStatus(em1Var.d);
            dm1 dm1Var = em1Var.e;
            g52Var.X(dm1Var.b, dm1Var.a, dm1Var.c, new kj1(0, callIncomingScreen.q1(), km1.class, "declineCall", "declineCall()V", 0, 1));
            dm1 dm1Var2 = em1Var.f;
            int i2 = dm1Var2.b;
            int i3 = dm1Var2.a;
            ynh ynhVar = dm1Var2.c;
            int iOrdinal = dm1Var2.ordinal();
            if (iOrdinal == 0) {
                i = 3;
                kj1Var = new kj1(0, callIncomingScreen, CallIncomingScreen.class, "acceptVideoCallIfPossible", "acceptVideoCallIfPossible()V", 0, 2);
                kj1Var2 = kj1Var;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 3;
                        kj1Var = new kj1(0, callIncomingScreen, CallIncomingScreen.class, "acceptVideoCallIfPossible", "acceptVideoCallIfPossible()V", 0, 2);
                        kj1Var2 = kj1Var;
                    } else if (iOrdinal != 3) {
                        i2 = i2;
                        i3 = i3;
                        ynhVar = ynhVar;
                        i = 3;
                        kj1Var2 = new kj1(0, callIncomingScreen.q1(), km1.class, "declineCall", "declineCall()V", 0, 4);
                    }
                }
                i = 3;
                kj1Var = new kj1(0, callIncomingScreen, CallIncomingScreen.class, "acceptAudioCallIfPossible", "acceptAudioCallIfPossible()V", 0, 3);
                kj1Var2 = kj1Var;
            }
            g52Var.b0(true, i3, ynhVar, kj1Var2, new hb8(i2, i));
            dm1 dm1Var3 = em1Var.g;
            if (dm1Var3 != null) {
                g52Var.a0(true, dm1Var3.b, dm1Var3.a, dm1Var3.c, new kj1(0, callIncomingScreen, CallIncomingScreen.class, "acceptVideoCallIfPossible", "acceptVideoCallIfPossible()V", 0, 5));
            }
            ynh ynhVar2 = em1Var.h;
            g52Var.Y(ynhVar2 != null ? ynhVar2.d(g52Var) : null, z);
            g52Var.setBackgroundState((z2 || z3) ? d52.b : d52.c);
            if (!z2 && !z3) {
                String str = qe1Var.g;
                if (str != null) {
                    g52Var.setCountry(str);
                }
                String str2 = qe1Var.h;
                if (str2 != null) {
                    g52Var.setRegistration(str2);
                }
            }
        } else {
            if (!(gm1Var instanceof fm1)) {
                ore.o();
                return null;
            }
            CallIncomingScreen callIncomingScreen2 = (CallIncomingScreen) this.g;
            fm1 fm1Var = (fm1) gm1Var;
            ou7 ou7Var2 = CallIncomingScreen.m;
            o7j.d(callIncomingScreen2.requireActivity(), fm1Var.a);
            if (!fm1Var.b) {
                boolean z4 = fm1Var.a;
                callIncomingScreen2.requireView().post(new c3(19, callIncomingScreen2));
                if (!z4) {
                    jc8 jc8Var = callIncomingScreen2.k;
                    ar arVarRequireActivity = callIncomingScreen2.requireActivity();
                    int i4 = jc8Var.b;
                    jc8Var.b = 0;
                    if (i4 != 0 && ((Boolean) ((e5d) jc8Var.a.getValue()).L0.a(e5d.S6[88]).i()).booleanValue()) {
                        KeyguardManager keyguardManager = (KeyguardManager) arVarRequireActivity.getSystemService(KeyguardManager.class);
                        if (cqk.d(keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null, Boolean.TRUE)) {
                            String name = jc8.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, zo5.h(i4, "Finish activity after incoming by mode: "), null);
                                }
                            }
                            if (i4 == 1) {
                                arVarRequireActivity.finishAndRemoveTask();
                            }
                        }
                    }
                }
            } else if (m92.a(callIncomingScreen2.getRouter())) {
                lve lveVar = (lve) ww3.D1(callIncomingScreen2.getRouter().e());
                br4 br4Var = lveVar != null ? lveVar.a : null;
                SwipeWidget swipeWidget = br4Var instanceof SwipeWidget ? (SwipeWidget) br4Var : null;
                if (swipeWidget != null) {
                    swipeWidget.z1();
                }
            } else {
                cs1.j(cs1.b, 1);
            }
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                sfd sfdVar = new sfd((vfd) obj2, lq4Var, 0);
                sfdVar.f = obj;
                return sfdVar;
            case 1:
                sfd sfdVar2 = new sfd(1, lq4Var, (AbstractPickerScreen) obj2);
                sfdVar2.f = obj;
                return sfdVar2;
            case 2:
                sfd sfdVar3 = new sfd(2, lq4Var, (AccountSwitcherBottomSheet) obj2);
                sfdVar3.f = obj;
                return sfdVar3;
            case 3:
                sfd sfdVar4 = new sfd(3, lq4Var, (AddChatAdminsScreen) obj2);
                sfdVar4.f = obj;
                return sfdVar4;
            case 4:
                sfd sfdVar5 = new sfd(4, lq4Var, (AddLinkBottomSheet) obj2);
                sfdVar5.f = obj;
                return sfdVar5;
            case 5:
                sfd sfdVar6 = new sfd((AdminWaitingRoomScreen) obj2, lq4Var, 5);
                sfdVar6.f = obj;
                return sfdVar6;
            case 6:
                return new sfd(this.f, lq4Var, (be) obj2, 6);
            case 7:
                sfd sfdVar7 = new sfd((qn) obj2, lq4Var, 7);
                sfdVar7.f = obj;
                return sfdVar7;
            case 8:
                sfd sfdVar8 = new sfd((u93) obj2, lq4Var, 8);
                sfdVar8.f = obj;
                return sfdVar8;
            case 9:
                sfd sfdVar9 = new sfd(9, lq4Var, (AspectRatiosBottomSheet) obj2);
                sfdVar9.f = obj;
                return sfdVar9;
            case 10:
                sfd sfdVar10 = new sfd((r00) obj2, lq4Var, 10);
                sfdVar10.f = obj;
                return sfdVar10;
            case 11:
                sfd sfdVar11 = new sfd((c30) obj2, lq4Var, 11);
                sfdVar11.f = obj;
                return sfdVar11;
            case 12:
                return new sfd(this.f, lq4Var, (List) obj2, 12);
            case 13:
                sfd sfdVar12 = new sfd((o50) obj2, lq4Var, 13);
                sfdVar12.f = obj;
                return sfdVar12;
            case 14:
                return new sfd((ny8) this.f, (g90) obj2, lq4Var, 14);
            case 15:
                sfd sfdVar13 = new sfd((ha0) obj2, lq4Var, 15);
                sfdVar13.f = obj;
                return sfdVar13;
            case 16:
                return new sfd((gg) this.f, (qb0) obj2, lq4Var, 16);
            case 17:
                return new sfd((pb0) this.f, (qb0) obj2, lq4Var, 17);
            case 18:
                sfd sfdVar14 = new sfd((e70) obj2, lq4Var, 18);
                sfdVar14.f = obj;
                return sfdVar14;
            case 19:
                return new sfd((wfe) this.f, (List) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new sfd((BacklogWorker) this.f, (HashSet) obj2, lq4Var, 20);
            case 21:
                sfd sfdVar15 = new sfd(21, lq4Var, (BasePhotoViewerWidget) obj2);
                sfdVar15.f = obj;
                return sfdVar15;
            case 22:
                sfd sfdVar16 = new sfd(22, lq4Var, (BaseVideoViewerWidget) obj2);
                sfdVar16.f = obj;
                return sfdVar16;
            case 23:
                sfd sfdVar17 = new sfd((mv0) obj2, lq4Var, 23);
                sfdVar17.f = obj;
                return sfdVar17;
            case 24:
                sfd sfdVar18 = new sfd(24, lq4Var, (CallAdminSettingsScreen) obj2);
                sfdVar18.f = obj;
                return sfdVar18;
            case 25:
                sfd sfdVar19 = new sfd((pe1) obj2, lq4Var, 25);
                sfdVar19.f = obj;
                return sfdVar19;
            case 26:
                sfd sfdVar20 = new sfd((ue1) obj2, lq4Var, 26);
                sfdVar20.f = obj;
                return sfdVar20;
            case 27:
                sfd sfdVar21 = new sfd((ai1) obj2, lq4Var, 27);
                sfdVar21.f = obj;
                return sfdVar21;
            case 28:
                sfd sfdVar22 = new sfd(28, lq4Var, (CallIncomingScreen) obj2);
                sfdVar22.f = obj;
                return sfdVar22;
            default:
                sfd sfdVar23 = new sfd((ym1) obj2, lq4Var, 29);
                sfdVar23.f = obj;
                return sfdVar23;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((sfd) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((sfd) create((bd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                return ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                ((sfd) create((yl) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((sfd) create((t93) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                return ((sfd) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((sfd) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((sfd) create((p5e) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((sfd) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((sfd) create((la0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                return ((sfd) create((qyi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                return ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((sfd) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((sfd) create((iu1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((sfd) create((kh1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((sfd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((sfd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:295:0x0543  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        EditText editText;
        boolean z;
        boolean z2;
        b68 b68VarP1;
        Object poeVar;
        String strK;
        Object value;
        Object objX0;
        switch (this.e) {
            case 0:
                List list = (List) this.f;
                ch3.d0(obj);
                String str = ((vfd) this.g).h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "logOfflineFlow on each after 5 seconds " + list, null);
                    }
                }
                int size = list.size();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    List list2 = (List) ((ConcurrentHashMap) ((vfd) this.g).c.H.getValue()).remove(Long.valueOf(jLongValue));
                    if (list2 == null) {
                        list2 = r66.a;
                    }
                    if (!list2.isEmpty() && (list2.contains(agd.ONLINE) || list2.contains(agd.WAS_LONG_AGO) || list2.contains(agd.WAS_RECENTLY))) {
                        vfd vfdVar = (vfd) this.g;
                        StringBuilder sb = new StringBuilder();
                        sb.append("history check");
                        sb.append(':');
                        sb.append(size);
                        sb.append(':');
                        sb.append(jLongValue);
                        sb.append(';');
                        sb.append("offlineContactClosed");
                        sb.append('=');
                        sb.append(vfdVar.r.get());
                        sb.append(';');
                        sb.append("offlineContactOpened");
                        sb.append('=');
                        sb.append(vfdVar.p.get());
                        sb.append(';');
                        sb.append("history");
                        sb.append('=');
                        ww3.y1(list2, sb, null, new pyb(26), 62);
                        String string = sb.toString();
                        gm0.V(((vfd) this.g).h, string, new zfd(string));
                        vfd vfdVar2 = (vfd) this.g;
                        yab.i0(vfdVar2.b, null, 0, new c37(vfdVar2, null, 18), 3);
                    }
                }
                return sbi.a;
            case 1:
                AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                xxc xxcVar = (xxc) obj2;
                if (cqk.d(xxcVar, uxc.a)) {
                    vzb vzbVar = (vzb) abstractPickerScreen.findViewById(R.id.oneme_picker_chips);
                    if (vzbVar != null && (editText = vzbVar.getEditText()) != null) {
                        editText.setText((CharSequence) null);
                    }
                } else if (cqk.d(xxcVar, wxc.a)) {
                    abstractPickerScreen.y1();
                } else {
                    if (!(xxcVar instanceof vxc)) {
                        ore.o();
                        return null;
                    }
                    g8c g8cVar = abstractPickerScreen.h;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(abstractPickerScreen);
                    vxc vxcVar = (vxc) xxcVar;
                    h8cVar.m(vxcVar.a);
                    Integer num = vxcVar.b;
                    h8cVar.h(new w8c(num != null ? num.intValue() : R.drawable.icon_info_fill));
                    abstractPickerScreen.h = h8cVar.p();
                }
                return sbi.a;
            case 2:
                Object obj3 = this.f;
                ch3.d0(obj);
                ((AccountSwitcherBottomSheet) this.g).x.H((List) obj3);
                return sbi.a;
            case 3:
                AddChatAdminsScreen addChatAdminsScreen = (AddChatAdminsScreen) this.g;
                sbi sbiVar = sbi.a;
                Object obj4 = this.f;
                ch3.d0(obj);
                m9a m9aVar = (m9a) obj4;
                if (m9aVar instanceof i9a) {
                    zv8[] zv8VarArr = AddChatAdminsScreen.l;
                    nl9.c(addChatAdminsScreen.p1());
                    trd trdVar = trd.b;
                    long jO1 = addChatAdminsScreen.o1();
                    long j = ((i9a) m9aVar).a;
                    trdVar.getClass();
                    StringBuilder sb2 = new StringBuilder(":profile/edit/admin_permission?chat_id=");
                    sb2.append(jO1);
                    sb2.append("&contact_id=");
                    o65.c(trdVar.b(), c0a.m(j, "&permissions_type=setup_new_admin", sb2), null, null, 6);
                } else if (m9aVar instanceof h9a) {
                    zv8[] zv8VarArr2 = AddChatAdminsScreen.l;
                    nl9.c(addChatAdminsScreen.p1());
                    t7c searchView = addChatAdminsScreen.p1().getSearchView();
                    if (searchView != null) {
                        searchView.b();
                    }
                    g8c g8cVar2 = addChatAdminsScreen.k;
                    if (g8cVar2 != null) {
                        g8cVar2.a();
                    }
                    h8c h8cVar2 = new h8c(addChatAdminsScreen);
                    h8cVar2.n(np4.q(addChatAdminsScreen.getContext(), R.string.profile_members_list_already_admin_snackbar_title));
                    h8cVar2.h(new w8c(R.drawable.icon_warning_fill));
                    addChatAdminsScreen.k = h8cVar2.p();
                }
                return sbiVar;
            case 4:
                Object obj5 = this.f;
                ch3.d0(obj);
                u59 u59Var = (u59) obj5;
                ynh ynhVar = u59Var.b;
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.g;
                CharSequence charSequenceB = ynhVar.b(addLinkBottomSheet.getContext());
                if (charSequenceB == null || charSequenceB.length() == 0) {
                    addLinkBottomSheet.D1().j();
                } else {
                    addLinkBottomSheet.D1().m(charSequenceB.toString(), gac.a);
                }
                ((cyb) addLinkBottomSheet.p.m(addLinkBottomSheet, AddLinkBottomSheet.s[2])).setEnabled(u59Var.a.length() > 0 && cqk.d(u59Var.b, ynh.b));
                return sbi.a;
            case 5:
                bd bdVar = (bd) this.f;
                ch3.d0(obj);
                AdminWaitingRoomScreen adminWaitingRoomScreen = (AdminWaitingRoomScreen) this.g;
                List list3 = bdVar.b;
                zv8[] zv8VarArr3 = AdminWaitingRoomScreen.i;
                ((wc) adminWaitingRoomScreen.h.getValue()).H(list3);
                j8e j8eVar = adminWaitingRoomScreen.e;
                zv8[] zv8VarArr4 = AdminWaitingRoomScreen.i;
                List list4 = list3;
                isk.d((cyb) j8eVar.m(adminWaitingRoomScreen, zv8VarArr4[2]), !list4.isEmpty(), 0L, null, 6);
                isk.d((cyb) adminWaitingRoomScreen.f.m(adminWaitingRoomScreen, zv8VarArr4[3]), !list4.isEmpty(), 0L, null, 6);
                isk.d((RecyclerView) adminWaitingRoomScreen.d.m(adminWaitingRoomScreen, zv8VarArr4[1]), !list4.isEmpty(), 0L, null, 6);
                isk.d((r1c) adminWaitingRoomScreen.g.m(adminWaitingRoomScreen, zv8VarArr4[4]), bdVar.b.isEmpty() && bdVar != bd.c, 0L, null, 6);
                ynh ynhVar2 = bdVar.a;
                rcc rccVar = (rcc) adminWaitingRoomScreen.c.m(adminWaitingRoomScreen, zv8VarArr4[0]);
                CharSequence charSequenceB2 = ynhVar2.b(adminWaitingRoomScreen.getContext());
                zv8[] zv8VarArr5 = rcc.E;
                rccVar.s(charSequenceB2, false);
                return sbi.a;
            case 6:
                ch3.d0(obj);
                return ((be) this.g).c((vg4) this.f);
            case 7:
                yl ylVar = (yl) this.f;
                ch3.d0(obj);
                qn qnVar = (qn) this.g;
                String str2 = qnVar.f;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.w(qt4.t(ylVar.a, "handleAnimoji #", ", ", ylVar.c), ", ", ylVar.b), null);
                    }
                }
                String str3 = ylVar.c;
                if (str3 == null || str3.length() == 0) {
                    String str4 = ylVar.b;
                    if (str4 != null && str4.length() != 0) {
                        qnVar.l(ylVar.b);
                    }
                } else {
                    bm bmVar = qnVar.e;
                    if (ylVar.c == null) {
                        bmVar.getClass();
                        ore.p("You cannot call this method without lottieUrl");
                        return null;
                    }
                    RLottieDrawable rLottieDrawable = (RLottieDrawable) bmVar.a.computeIfAbsent(ylVar, new am(0, new m(11, ylVar)));
                    rLottieDrawable.setAutoRepeat(ylVar.e);
                    rLottieDrawable.scaleByCanvas = true;
                    if (rLottieDrawable.isLoadingFailed()) {
                        RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
                    }
                    qnVar.o(mn.d);
                    if (rLottieDrawable.getBounds().isEmpty()) {
                        rLottieDrawable.setBounds(qnVar.getBounds());
                    }
                    on onVar = qnVar.p;
                    if (onVar != null) {
                        rLottieDrawable.removeDrawableLoadListener(onVar);
                    }
                    on onVar2 = new on(qnVar, ylVar, rLottieDrawable);
                    qnVar.p = onVar2;
                    rLottieDrawable.addDrawableLoadListener(onVar2);
                }
                return sbi.a;
            case 8:
                t93 t93Var = (t93) this.f;
                ch3.d0(obj);
                ((u93) this.g).a(t93Var);
                return sbi.a;
            case 9:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((AspectRatiosBottomSheet) this.g).w.H((List) obj6);
                return sbi.a;
            case 10:
                je9 je9Var3 = je9.f;
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                boolean z3 = th instanceof TamErrorException;
                if (z3 && p90.C(((TamErrorException) th).a.b)) {
                    String str5 = (String) ((r00) this.g).h;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str5, x05.h("request failed with ", ". Retrying", th), null);
                    }
                    z = true;
                } else {
                    if (z3 && cqk.d(((TamErrorException) th).a.b, "client.task.ignored")) {
                        gm0.Y((String) ((r00) this.g).h, "request ignored");
                    } else {
                        String str6 = (String) ((r00) this.g).h;
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str6, x05.h("request failed with ", ". Couldn't recover", th), null);
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                String str7 = ((c30) this.g).b;
                Throwable th2 = (Throwable) this.f;
                ch3.d0(obj);
                boolean z4 = th2 instanceof TamErrorException;
                if (z4 && p90.C(((TamErrorException) th2).a.b)) {
                    gm0.Y(str7, "request failed with " + th2 + ". Retrying");
                    z2 = true;
                } else {
                    if (z4 && cqk.d(((TamErrorException) th2).a.b, "client.task.ignored")) {
                        gm0.Y(str7, "request ignored");
                    } else {
                        gm0.Y(str7, "request failed with " + th2 + ". Couldn't recover");
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 12:
                ch3.d0(obj);
                ((xtc) this.f).a((List) this.g);
                return sbi.a;
            case 13:
                p5e p5eVar = (p5e) this.f;
                ch3.d0(obj);
                o50 o50Var = (o50) this.g;
                zv8[] zv8VarArr6 = o50.g;
                h50 h50VarB = o50Var.b(p5eVar);
                mjg mjgVar = o50Var.f;
                mjgVar.getClass();
                mjgVar.j(null, h50VarB);
                return sbi.a;
            case 14:
                ch3.d0(obj);
                ny8 ny8Var = (ny8) this.f;
                w7b w7bVar = (w7b) ny8Var.getValue();
                g90 g90Var = (g90) this.g;
                w7bVar.a(g90Var.e);
                yab.i0(g90Var.c, null, 0, new i26(ny8Var, g90Var, null, 7), 3);
                return sbi.a;
            case 15:
                la0 la0Var = (la0) this.f;
                ch3.d0(obj);
                ha0 ha0Var = (ha0) this.g;
                ad0 ad0Var = ha0Var.r;
                zpe zpeVar = zpe.c;
                eu9 eu9Var = ha0Var.m;
                h50 h50Var = la0Var != null ? la0Var.e : null;
                boolean z5 = (h50Var instanceof g50) || (h50Var instanceof e50);
                s70 s70Var = la0Var != null ? la0Var.d : null;
                if (z5) {
                    eu9Var.f(true, false);
                } else {
                    boolean z6 = cqk.d(s70Var, zpeVar) && cqk.d(la0Var.a, ha0Var.F);
                    zv8[] zv8VarArr7 = eu9.u;
                    eu9Var.f(z6, true);
                }
                if (la0Var != null) {
                    Long l = la0Var.a;
                    if (cqk.d(l, ha0Var.F)) {
                        ou7 ou7Var = ou7.c;
                        if (cqk.d(s70Var, ou7Var)) {
                            zv8[] zv8VarArr8 = eu9.u;
                            eu9Var.e(true);
                            ad0Var.f(0.0f, false, true);
                        } else {
                            if (cqk.d(s70Var, zpeVar)) {
                                zv8[] zv8VarArr9 = eu9.u;
                                int iB = eu9Var.b();
                                Drawable drawable = eu9Var.h;
                                int iD = qt4.D(iB);
                                if (iD == 0) {
                                    eu9.g(eu9Var, drawable, eu9Var.a(), eu9Var.d, 120);
                                } else if (iD == 1) {
                                    eu9.g(eu9Var, drawable, eu9Var.a(), eu9Var.f, 120);
                                } else if (iD != 2) {
                                    ore.o();
                                    return null;
                                }
                            } else if (cqk.d(s70Var, so2.c)) {
                                zv8[] zv8VarArr10 = eu9.u;
                                eu9Var.d();
                            } else {
                                if (!cqk.d(s70Var, er3.b) && !cqk.d(s70Var, ou7Var) && s70Var != null) {
                                    ore.o();
                                    return null;
                                }
                                zv8[] zv8VarArr11 = eu9.u;
                                eu9Var.e(true);
                            }
                            ad0Var.f(la0Var.c, cqk.d(l, ha0Var.F), false);
                        }
                    } else {
                        zv8[] zv8VarArr12 = eu9.u;
                        eu9Var.e(true);
                        ad0Var.f(0.0f, false, true);
                    }
                } else {
                    zv8[] zv8VarArr13 = eu9.u;
                    eu9Var.e(true);
                    ad0Var.f(0.0f, false, true);
                }
                return sbi.a;
            case 16:
                ch3.d0(obj);
                ((gg) this.f).o0(((qb0) this.g).a);
                return sbi.a;
            case 17:
                ch3.d0(obj);
                Iterator it2 = ((pb0) this.f).e.iterator();
                while (it2.hasNext()) {
                    ((le2) it2.next()).o0(((qb0) this.g).a);
                }
                return sbi.a;
            case 18:
                qyi qyiVar = (qyi) this.f;
                ch3.d0(obj);
                return Boolean.valueOf(qyiVar.c && cqk.d(qyiVar.b, ((e70) this.g).t));
            case 19:
                ch3.d0(obj);
                return Boolean.valueOf(((BacklogWorker) ((wfe) this.f).a).n().g().contains((List) this.g));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ch3.d0(obj);
                ((BacklogWorker) this.f).n().g().updateState(0, ww3.T1((HashSet) this.g));
                return sbi.a;
            case 21:
                Object obj7 = this.f;
                ch3.d0(obj);
                nic nicVar = (nic) obj7;
                BasePhotoViewerWidget basePhotoViewerWidget = (BasePhotoViewerWidget) this.g;
                zv8[] zv8VarArr14 = BasePhotoViewerWidget.b;
                if (nicVar.a != 0 && (b68VarP1 = basePhotoViewerWidget.p1()) != null) {
                    basePhotoViewerWidget.q1().setImageRotation(nicVar.b);
                    basePhotoViewerWidget.q1().k(b68VarP1, true);
                    basePhotoViewerWidget.q1().requestLayout();
                }
                return sbi.a;
            case 22:
                Object obj8 = this.f;
                ch3.d0(obj);
                nic nicVar2 = (nic) obj8;
                BaseVideoViewerWidget baseVideoViewerWidget = (BaseVideoViewerWidget) this.g;
                zv8[] zv8VarArr15 = BaseVideoViewerWidget.j;
                int i = nicVar2.a;
                float f = nicVar2.b;
                if (i != 0) {
                    baseVideoViewerWidget.s1().setRotation(f);
                    baseVideoViewerWidget.s1().requestLayout();
                    baseVideoViewerWidget.r1().setRotation(f);
                    pui puiVarP1 = baseVideoViewerWidget.p1();
                    if (puiVarP1 != null) {
                        baseVideoViewerWidget.r1().l(puiVarP1);
                        baseVideoViewerWidget.r1().requestLayout();
                    }
                }
                return sbi.a;
            case 23:
                ch3.d0(obj);
                try {
                    gid gidVarA = ((hid) ((mv0) this.g).o.getValue()).a();
                    poeVar = new ev0(gidVarA.e, gidVarA.f, gidVarA.g, gidVarA.h);
                    break;
                } catch (Throwable th3) {
                    poeVar = new poe(th3);
                }
                mv0 mv0Var = (mv0) this.g;
                Throwable thA = roe.a(poeVar);
                if (thA == null) {
                    return poeVar;
                }
                String str8 = mv0Var.e;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var4 = je9.f;
                    if (a4cVar5.b(je9Var4)) {
                        a4cVar5.c(je9Var4, str8, "Cannot read proc file, fallback to Process.getElapsedCpuTime", thA);
                    }
                }
                ifh ifhVar = av4.a;
                long elapsedCpuTime = Process.getElapsedCpuTime();
                if (elapsedCpuTime < 0) {
                    elapsedCpuTime = 0;
                }
                long jLongValue2 = ((Number) av4.a.getValue()).longValue();
                if (jLongValue2 < 1) {
                    jLongValue2 = 1;
                }
                return new ev0((elapsedCpuTime * jLongValue2) / 1000, 0L, 0L, 0L);
            case 24:
                CallAdminSettingsScreen callAdminSettingsScreen = (CallAdminSettingsScreen) this.g;
                Object obj9 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj9;
                if (rbbVar instanceof ky1) {
                    zv8[] zv8VarArr16 = BottomSheetWidget.t;
                    RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(callAdminSettingsScreen.getB(), cde.b, Boolean.FALSE);
                    recordExitBottomSheet.setTargetController(callAdminSettingsScreen);
                    br4 parentController = callAdminSettingsScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(recordExitBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (rbbVar instanceof py1) {
                    zv8[] zv8VarArr17 = CallAdminSettingsScreen.j;
                    py1 py1Var = (py1) rbbVar;
                    ((t3g) callAdminSettingsScreen.g.getValue()).getClass();
                    t3g.b(py1Var.F, new tp9(py1Var, callAdminSettingsScreen, 0, null, 1));
                }
                return sbi.a;
            case 25:
                rt2 rt2Var = (rt2) this.f;
                ch3.d0(obj);
                pe1 pe1Var = (pe1) this.g;
                yab.i0(pe1Var.a, ((n0c) ((xhh) pe1Var.e.getValue())).a(), 0, new i26(pe1Var, rt2Var, null, 22), 2);
                return sbi.a;
            case 26:
                iu1 iu1Var = (iu1) this.f;
                ch3.d0(obj);
                ue1 ue1Var = (ue1) this.g;
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null) {
                    je9 je9Var5 = je9.d;
                    if (a4cVar6.b(je9Var5)) {
                        zv8[] zv8VarArr18 = ue1.t;
                        boolean z7 = ue1Var.e().g;
                        Object obj10 = iu1Var.a;
                        String strK2 = "***";
                        if (obj10 == null) {
                            strK = null;
                        } else if (gm0.c()) {
                            strK = obj10.toString();
                        } else if (obj10 instanceof Collection) {
                            Collection collection = (Collection) obj10;
                            if (collection.isEmpty()) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(collection.size(), "[**", "**]");
                            }
                        } else if (obj10 instanceof Map) {
                            Map map = (Map) obj10;
                            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                        } else if (obj10 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj10;
                            if (objArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(objArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof int[]) {
                            int[] iArr = (int[]) obj10;
                            if (iArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(iArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof float[]) {
                            float[] fArr = (float[]) obj10;
                            if (fArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(fArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof long[]) {
                            long[] jArr = (long[]) obj10;
                            if (jArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(jArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof double[]) {
                            double[] dArr = (double[]) obj10;
                            if (dArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(dArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof short[]) {
                            short[] sArr = (short[]) obj10;
                            if (sArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(sArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj10;
                            if (bArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(bArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof char[]) {
                            char[] cArr = (char[]) obj10;
                            if (cArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(cArr.length, "[**", "**]");
                            }
                        } else if (obj10 instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj10;
                            if (zArr.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(zArr.length, "[**", "**]");
                            }
                        } else {
                            strK = "***";
                        }
                        Object obj11 = iu1Var.b;
                        if (obj11 == null) {
                            strK2 = null;
                        } else if (gm0.c()) {
                            strK2 = obj11.toString();
                        } else if (obj11 instanceof Collection) {
                            Collection collection2 = (Collection) obj11;
                            if (collection2.isEmpty()) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(collection2.size(), "[**", "**]");
                            }
                        } else if (obj11 instanceof Map) {
                            Map map2 = (Map) obj11;
                            strK2 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
                        } else if (obj11 instanceof Object[]) {
                            Object[] objArr2 = (Object[]) obj11;
                            if (objArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(objArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof int[]) {
                            int[] iArr2 = (int[]) obj11;
                            if (iArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(iArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof float[]) {
                            float[] fArr2 = (float[]) obj11;
                            if (fArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(fArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof long[]) {
                            long[] jArr2 = (long[]) obj11;
                            if (jArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(jArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof double[]) {
                            double[] dArr2 = (double[]) obj11;
                            if (dArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(dArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof short[]) {
                            short[] sArr2 = (short[]) obj11;
                            if (sArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(sArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj11;
                            if (bArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(bArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof char[]) {
                            char[] cArr2 = (char[]) obj11;
                            if (cArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(cArr2.length, "[**", "**]");
                            }
                        } else if (obj11 instanceof boolean[]) {
                            boolean[] zArr2 = (boolean[]) obj11;
                            if (zArr2.length == 0) {
                                strK2 = "[]";
                            } else {
                                strK2 = c0a.k(zArr2.length, "[**", "**]");
                            }
                        }
                        a4cVar6.c(je9Var5, "CallConnectionController", "onConnectionModeSet: showingParticipantName=" + z7 + ", phone=" + strK + ", name=" + strK2, null);
                    }
                }
                if (iu1Var.a != null) {
                    ue1 ue1Var2 = (ue1) this.g;
                    zv8[] zv8VarArr19 = ue1.t;
                    re1 re1VarA = ue1Var2.a();
                    if (re1VarA != null) {
                        re1VarA.setAddress(iu1Var.a, 1);
                    }
                }
                if (iu1Var.b != null) {
                    ue1 ue1Var3 = (ue1) this.g;
                    zv8[] zv8VarArr20 = ue1.t;
                    re1 re1VarA2 = ue1Var3.a();
                    if (re1VarA2 != null) {
                        re1VarA2.setCallerDisplayName(iu1Var.b, 1);
                    }
                }
                return sbi.a;
            case 27:
                kh1 kh1Var = (kh1) this.f;
                ch3.d0(obj);
                ai1 ai1Var = (ai1) this.g;
                mjg mjgVar2 = ai1Var.f;
                do {
                    value = mjgVar2.getValue();
                    Map map3 = (Map) value;
                    if (cqk.d(kh1Var, ug1.a) || cqk.d(kh1Var, tg1.a)) {
                        objX0 = s66.a;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map3);
                        linkedHashMap.put(Integer.valueOf(kh1Var.getPriority()), kh1Var);
                        objX0 = wm9.X0(linkedHashMap);
                    }
                } while (!mjgVar2.h(value, objX0));
                if ((kh1Var instanceof paj) && ((paj) kh1Var).b != null) {
                    yab.i0(ai1Var.b, null, 0, new i26(kh1Var, ai1Var, null, 25), 3);
                }
                return sbi.a;
            case 28:
                return l(obj);
            default:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                return yab.i0(gu4Var, null, 0, new um1((ym1) this.g, null, 2), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfd(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfd(int i, lq4 lq4Var, Widget widget) {
        super(2, lq4Var);
        this.e = i;
        this.g = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfd(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
