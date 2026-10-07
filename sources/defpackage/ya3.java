package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ya3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya3(lq4 lq4Var, ChatScreen chatScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatScreen;
    }

    private final Object l(Object obj) {
        View viewFindViewById;
        ia8 ia8Var;
        y3f y3fVar = y3f.CHAT;
        fa8 fa8Var = fa8.SEND_5_MESSAGES;
        Object obj2 = this.f;
        ch3.d0(obj);
        pc3 pc3Var = (pc3) obj2;
        final int i = 0;
        final int i2 = 1;
        if (pc3Var instanceof fc3) {
            zv8[] zv8VarArr = BottomSheetWidget.t;
            fc3 fc3Var = (fc3) pc3Var;
            ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(this.g.d.b(), fc3Var.a, fc3Var.b, null, 8, null);
            br4 parentController = this.g;
            scheduledSendPickerBottomSheet.setTargetController(parentController);
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
            }
        } else if (pc3Var instanceof lc3) {
            ChatScreen chatScreen = this.g;
            lc3 lc3Var = (lc3) pc3Var;
            List list = lc3Var.a;
            Bundle bundle = lc3Var.b;
            View view = lc3Var.c;
            ou7 ou7Var = ChatScreen.L1;
            opl.b(chatScreen, 1).l(list).p(bundle).f(view).b().build().u(chatScreen);
        } else {
            int i3 = 16;
            if (pc3Var instanceof oc3) {
                ChatScreen chatScreen2 = this.g;
                final oc3 oc3Var = (oc3) pc3Var;
                ou7 ou7Var2 = ChatScreen.L1;
                la2 la2Var = la2.c;
                rb3 rb3Var = new rb3(i, chatScreen2);
                long j = oc3Var.a;
                long j2 = oc3Var.b;
                String str = oc3Var.c;
                boolean z = oc3Var.d;
                if (j != 0) {
                    String strA = ((os4) chatScreen2.F1.getValue()).a();
                    rb3Var.i(new ns4(strA), Boolean.valueOf(z), la2.a);
                    ((xu1) chatScreen2.G1.getValue()).m(null, strA, oc3Var.a, oc3Var.d, new za2(oc3Var, i3, strA));
                } else if (str != null && str.length() != 0) {
                    ifh ifhVar = ns4.b;
                    rb3Var.i(new ns4(oc9.b0()), Boolean.valueOf(z), la2Var);
                    ((xu1) chatScreen2.G1.getValue()).k(str, true, oc3Var.d, false, new af7() { // from class: ta3
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i4 = i;
                            sbi sbiVar = sbi.a;
                            oc3 oc3Var2 = oc3Var;
                            switch (i4) {
                                case 0:
                                    ou7 ou7Var3 = ChatScreen.L1;
                                    o65.c(tb3.b.b(), c0a.o(":call-join-link?link=", oc3Var2.c, "&start_source=CHAT_HEAD"), null, null, 6);
                                    break;
                                default:
                                    ou7 ou7Var4 = ChatScreen.L1;
                                    tb3 tb3Var = tb3.b;
                                    long j3 = oc3Var2.b;
                                    boolean z2 = oc3Var2.d;
                                    o65 o65VarB = tb3Var.b();
                                    StringBuilder sbU = qt4.u(j3, ":call-chat?chat_id=", "&video_enabled=", z2);
                                    sbU.append("&start_source=CHAT_HEAD");
                                    o65.c(o65VarB, sbU.toString(), null, null, 6);
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                } else if (j2 != 0) {
                    ifh ifhVar2 = ns4.b;
                    rb3Var.i(new ns4(oc9.b0()), Boolean.valueOf(z), la2Var);
                    ((xu1) chatScreen2.G1.getValue()).j(j2, z, new af7() { // from class: ta3
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i4 = i2;
                            sbi sbiVar = sbi.a;
                            oc3 oc3Var2 = oc3Var;
                            switch (i4) {
                                case 0:
                                    ou7 ou7Var3 = ChatScreen.L1;
                                    o65.c(tb3.b.b(), c0a.o(":call-join-link?link=", oc3Var2.c, "&start_source=CHAT_HEAD"), null, null, 6);
                                    break;
                                default:
                                    ou7 ou7Var4 = ChatScreen.L1;
                                    tb3 tb3Var = tb3.b;
                                    long j3 = oc3Var2.b;
                                    boolean z2 = oc3Var2.d;
                                    o65 o65VarB = tb3Var.b();
                                    StringBuilder sbU = qt4.u(j3, ":call-chat?chat_id=", "&video_enabled=", z2);
                                    sbU.append("&start_source=CHAT_HEAD");
                                    o65.c(o65VarB, sbU.toString(), null, null, 6);
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                }
            } else if (pc3Var instanceof mc3) {
                mc3 mc3Var = (mc3) pc3Var;
                ChatScreen.q2(this.g, new Integer(mc3Var.a), null, mc3Var.b, mc3Var.c, 2);
            } else if (pc3Var instanceof jc3) {
                g8c g8cVar = this.g.J1;
                if (g8cVar != null) {
                    g8cVar.a();
                }
                zv8[] zv8VarArr2 = BottomSheetWidget.t;
                jc3 jc3Var = (jc3) pc3Var;
                jc4 jc4VarA = mol.a(jc3Var.a, null, null, 6);
                jc4VarA.g(jc3Var.b);
                jc3Var.c.forEach(new ob3(0, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(this.g);
                br4 parentController2 = this.g;
                confirmationBottomSheetF.setTargetController(parentController2);
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU2 != null) {
                    lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar2, true, "BottomSheetWidget");
                    hveVarU2.I(lveVar2);
                }
            } else if (pc3Var instanceof kc3) {
                ChatScreen chatScreen3 = this.g;
                kc3 kc3Var = (kc3) pc3Var;
                ou7 ou7Var3 = ChatScreen.L1;
                MessageWriteWidget messageWriteWidgetV1 = chatScreen3.V1();
                if (messageWriteWidgetV1 != null) {
                    messageWriteWidgetV1.H1(kc3Var.a);
                }
                x9h x9hVar = (x9h) chatScreen3.E.getValue();
                CharSequence charSequence = kc3Var.a;
                Long l = kc3Var.b;
                x9hVar.F(charSequence);
                if (l != null) {
                    chatScreen3.U1().Q(l);
                } else if (kc3Var.c != null) {
                    nma.P(chatScreen3.U1(), kc3Var.c, null, null, chatScreen3.V1() == null, 6);
                }
            } else if (pc3Var instanceof ec3) {
                ChatScreen chatScreen4 = this.g;
                ec3 ec3Var = (ec3) pc3Var;
                int i4 = ec3Var.a;
                n87 n87Var = ec3Var.b;
                boolean z2 = ec3Var.c;
                ou7 ou7Var4 = ChatScreen.L1;
                chatScreen4.U1().Q(null);
                if (!z2) {
                    chatScreen4.U1().D();
                }
                chatScreen4.W1().B(null);
                ia8 ia8Var2 = (ia8) chatScreen4.H1.getValue();
                if (ia8Var2 != null) {
                    ia8Var2.f(Collections.singleton(new ha8(fa8Var, i4)), y3fVar);
                }
                if (n87Var != null && (ia8Var = (ia8) chatScreen4.H1.getValue()) != null) {
                    ia8Var.f(n87Var.a, n87Var.b);
                }
            } else if (pc3Var instanceof zb3) {
                ChatScreen chatScreen5 = this.g;
                ou7 ou7Var5 = ChatScreen.L1;
                chatScreen5.U1().D();
                if (!((zb3) pc3Var).a) {
                    this.g.getRouter().D();
                }
            } else if (cqk.d(pc3Var, ac3.c)) {
                if (!sol.d(this.g.d)) {
                    this.g.b2().C(true);
                }
            } else if (cqk.d(pc3Var, ac3.d)) {
                br4 parentController3 = this.g;
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                hve hveVarU3 = rootController3 != null ? rootController3.u1() : null;
                if ((hveVarU3 != null ? hveVarU3.g("send_message_restricted_controller_tag") : null) == null) {
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.chat_screen_error_restricted_send_message_title, null, null, 6);
                    jc4VarC.g(new tnh(R.string.chat_screen_error_restricted_send_message_desc));
                    jc4VarC.a(new kc4(R.id.chat_screen__error_restricted_send_message_action, new tnh(R.string.chat_screen_error_restricted_send_message_action), 3, true, 3, 3), new kc4(R.id.chat_screen__error_restricted_send_message_cancel, new tnh(R.string.chat_screen_error_restricted_send_message_cancel), 2, true, 3, 2));
                    ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarC.f(this.g);
                    br4 parentController4 = this.g;
                    confirmationBottomSheetF2.setTargetController(parentController4);
                    while (parentController4.getParentController() != null) {
                        parentController4 = parentController4.getParentController();
                    }
                    RootController rootController4 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
                    hve hveVarU4 = rootController4 != null ? rootController4.u1() : null;
                    if (hveVarU4 != null) {
                        lve lveVar3 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                        p.k(false, lveVar3, true, "send_message_restricted_controller_tag");
                        hveVarU4.I(lveVar3);
                    }
                }
            } else if (cqk.d(pc3Var, ac3.b)) {
                Context context = this.g.getContext();
                g5d g5dVar = (g5d) ((gjf) this.g.k.getValue());
                String str2 = String.format(context.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
                it3.a(this.g.getContext(), str2.toString());
                String str3 = sj8.a;
                sj8.j(this.g.getContext(), str2, null);
            } else if (cqk.d(pc3Var, ac3.a)) {
                ChatScreen chatScreen6 = this.g;
                ou7 ou7Var6 = ChatScreen.L1;
                br4 br4VarC = rx8.C(chatScreen6.R1().a);
                MediaBarWidget mediaBarWidget = br4VarC instanceof MediaBarWidget ? (MediaBarWidget) br4VarC : null;
                if (mediaBarWidget != null) {
                    mediaBarWidget.E1(false);
                }
                ChatScreen chatScreen7 = this.g;
                chatScreen7.Q1().setVisibility(8);
                kz9 kz9Var = chatScreen7.t1;
                if (kz9Var != null && !kz9Var.o) {
                    chatScreen7.F1();
                }
            } else if (pc3Var instanceof dc3) {
                ChatScreen chatScreen8 = this.g;
                mvh mvhVar = chatScreen8.n;
                if ((mvhVar == null || !mvhVar.isShowing()) && !chatScreen8.o && (viewFindViewById = chatScreen8.g2().findViewById(R.id.oneme_toolbar_title_avatar)) != null) {
                    mvh mvhVar2 = chatScreen8.n;
                    if (mvhVar2 != null) {
                        mvhVar2.dismiss();
                    }
                    mvh mvhVar3 = new mvh(chatScreen8.getContext(), chatScreen8.requireView(), new pa3(chatScreen8, i3), null, 1, 1, false, 24);
                    mvhVar3.c(new tnh(R.string.discussions_channel_onboarding_tooltip));
                    int[] iArr = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr);
                    Point point = new Point(qv1.b(8.0f, yl5.d().getDisplayMetrics().density, viewFindViewById.getWidth() / 2, iArr[0]), viewFindViewById.getHeight() + iArr[1]);
                    mvhVar3.setOnDismissListener(new nc1(2, chatScreen8));
                    mvhVar3.e(point, 8388659, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    chatScreen8.o = true;
                    chatScreen8.n = mvhVar3;
                }
            } else if (pc3Var instanceof nc3) {
                nc3 nc3Var = (nc3) pc3Var;
                boolean z3 = nc3Var.a;
                br4 parentController5 = this.g;
                if (z3) {
                    while (parentController5.getParentController() != null) {
                        parentController5 = parentController5.getParentController();
                    }
                    RootController rootController5 = parentController5 instanceof RootController ? (RootController) parentController5 : null;
                    hve hveVarU5 = rootController5 != null ? rootController5.u1() : null;
                    if ((hveVarU5 != null ? hveVarU5.g("notification_vpn_controller_tag") : null) == null) {
                        zv8[] zv8VarArr4 = BottomSheetWidget.t;
                        VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(nc3Var.b ? y3f.CHAT_VPN_WARNING_SHEET : y3f.CALL_VPN_WARNING_SHEET, this.g.d.b());
                        br4 parentController6 = this.g;
                        vpnConnectedWarningBottomSheet.setTargetController(parentController6);
                        while (parentController6.getParentController() != null) {
                            parentController6 = parentController6.getParentController();
                        }
                        RootController rootController6 = parentController6 instanceof RootController ? (RootController) parentController6 : null;
                        hve hveVarU6 = rootController6 != null ? rootController6.u1() : null;
                        if (hveVarU6 != null) {
                            lve lveVar4 = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar4, true, "notification_vpn_controller_tag");
                            hveVarU6.I(lveVar4);
                        }
                    }
                } else {
                    while (parentController5.getParentController() != null) {
                        parentController5 = parentController5.getParentController();
                    }
                    RootController rootController7 = parentController5 instanceof RootController ? (RootController) parentController5 : null;
                    hve hveVarU7 = rootController7 != null ? rootController7.u1() : null;
                    if ((hveVarU7 != null ? hveVarU7.g("notification_vpn_controller_tag") : null) != null) {
                        br4 parentController7 = this.g;
                        while (parentController7.getParentController() != null) {
                            parentController7 = parentController7.getParentController();
                        }
                        RootController rootController8 = parentController7 instanceof RootController ? (RootController) parentController7 : null;
                        hve hveVarU8 = rootController8 != null ? rootController8.u1() : null;
                        br4 br4VarG = hveVarU8 != null ? hveVarU8.g("notification_vpn_controller_tag") : null;
                        VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet2 = br4VarG instanceof VpnConnectedWarningBottomSheet ? (VpnConnectedWarningBottomSheet) br4VarG : null;
                        if (vpnConnectedWarningBottomSheet2 != null) {
                            vpnConnectedWarningBottomSheet2.v1(true);
                        }
                    }
                }
            } else if (cqk.d(pc3Var, bc3.a)) {
                ml9.b(this.g);
                ChatScreen chatScreen9 = this.g;
                ou7 ou7Var7 = ChatScreen.L1;
                as9 as9VarS1 = chatScreen9.S1();
                as9VarS1.D().a();
                as9VarS1.t = null;
                Long lF = this.g.U1().F();
                nma.P(this.g.U1(), null, null, null, false, 14);
                this.g.k2().Q(lF);
            } else if (cqk.d(pc3Var, gc3.a)) {
                ChatScreen chatScreen10 = this.g;
                ou7 ou7Var8 = ChatScreen.L1;
                MessageWriteWidget messageWriteWidgetV2 = chatScreen10.V1();
                if (messageWriteWidgetV2 != null) {
                    nma.O(messageWriteWidgetV2.A1(), messageWriteWidgetV2.t1().getText(), null, 2);
                    messageWriteWidgetV2.t1().setText(null);
                }
            } else if (cqk.d(pc3Var, hc3.a)) {
                ChatScreen chatScreen11 = this.g;
                ou7 ou7Var9 = ChatScreen.L1;
                chatScreen11.S1().H(null);
            } else {
                if (!(pc3Var instanceof ic3)) {
                    ore.o();
                    return null;
                }
                ChatScreen chatScreen12 = this.g;
                ou7 ou7Var10 = ChatScreen.L1;
                ic3 ic3Var = (ic3) pc3Var;
                xd3.Y(chatScreen12.k2(), ic3Var.a, this.g.U1().J(), ic3Var.b, null, ic3Var.c, 8);
                this.g.U1().Q(null);
                ia8 ia8Var3 = (ia8) this.g.H1.getValue();
                if (ia8Var3 != null) {
                    ia8Var3.f(a.p1(new ha8[]{new ha8(fa8.SEND_3_STICKERS, 1), new ha8(fa8Var, 1)}), y3fVar);
                }
            }
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatScreen chatScreen = this.g;
        switch (i) {
            case 0:
                ya3 ya3Var = new ya3(chatScreen, lq4Var, 0);
                ya3Var.f = obj;
                return ya3Var;
            case 1:
                ya3 ya3Var2 = new ya3(lq4Var, chatScreen, 1);
                ya3Var2.f = obj;
                return ya3Var2;
            case 2:
                ya3 ya3Var3 = new ya3(chatScreen, lq4Var, 2);
                ya3Var3.f = obj;
                return ya3Var3;
            case 3:
                ya3 ya3Var4 = new ya3(lq4Var, chatScreen, 3);
                ya3Var4.f = obj;
                return ya3Var4;
            case 4:
                ya3 ya3Var5 = new ya3(lq4Var, chatScreen, 4);
                ya3Var5.f = obj;
                return ya3Var5;
            case 5:
                ya3 ya3Var6 = new ya3(lq4Var, chatScreen, 5);
                ya3Var6.f = obj;
                return ya3Var6;
            case 6:
                ya3 ya3Var7 = new ya3(lq4Var, chatScreen, 6);
                ya3Var7.f = obj;
                return ya3Var7;
            case 7:
                ya3 ya3Var8 = new ya3(lq4Var, chatScreen, 7);
                ya3Var8.f = obj;
                return ya3Var8;
            case 8:
                ya3 ya3Var9 = new ya3(lq4Var, chatScreen, 8);
                ya3Var9.f = obj;
                return ya3Var9;
            case 9:
                ya3 ya3Var10 = new ya3(lq4Var, chatScreen, 9);
                ya3Var10.f = obj;
                return ya3Var10;
            case 10:
                ya3 ya3Var11 = new ya3(lq4Var, chatScreen, 10);
                ya3Var11.f = obj;
                return ya3Var11;
            case 11:
                ya3 ya3Var12 = new ya3(lq4Var, chatScreen, 11);
                ya3Var12.f = obj;
                return ya3Var12;
            case 12:
                ya3 ya3Var13 = new ya3(lq4Var, chatScreen, 12);
                ya3Var13.f = obj;
                return ya3Var13;
            case 13:
                ya3 ya3Var14 = new ya3(lq4Var, chatScreen, 13);
                ya3Var14.f = obj;
                return ya3Var14;
            case 14:
                ya3 ya3Var15 = new ya3(lq4Var, chatScreen, 14);
                ya3Var15.f = obj;
                return ya3Var15;
            case 15:
                ya3 ya3Var16 = new ya3(lq4Var, chatScreen, 15);
                ya3Var16.f = obj;
                return ya3Var16;
            case 16:
                ya3 ya3Var17 = new ya3(lq4Var, chatScreen, 16);
                ya3Var17.f = obj;
                return ya3Var17;
            case 17:
                ya3 ya3Var18 = new ya3(lq4Var, chatScreen, 17);
                ya3Var18.f = obj;
                return ya3Var18;
            case 18:
                ya3 ya3Var19 = new ya3(lq4Var, chatScreen, 18);
                ya3Var19.f = obj;
                return ya3Var19;
            default:
                ya3 ya3Var20 = new ya3(lq4Var, chatScreen, 19);
                ya3Var20.f = obj;
                return ya3Var20;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ya3) create((uv7) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ya3) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 15:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 16:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 17:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 18:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ya3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        kz9 kz9Var;
        e21 e21Var;
        int i;
        View videoMessageRecordAnchor;
        Object value;
        int i2 = 7;
        int i3 = 6;
        switch (this.e) {
            case 0:
                uv7 uv7Var = (uv7) this.f;
                ch3.d0(obj);
                ylc ylcVar = uv7Var != null ? new ylc(new Long(uv7Var.b), uv7Var.d) : null;
                ChatScreen chatScreen = this.g;
                ou7 ou7Var = ChatScreen.L1;
                chatScreen.W1().B(ylcVar);
                return sbi.a;
            case 1:
                Object obj2 = this.f;
                ch3.d0(obj);
                int iIntValue = ((Number) obj2).intValue();
                ChatScreen chatScreen2 = this.g;
                ou7 ou7Var2 = ChatScreen.L1;
                MessageWriteWidget messageWriteWidgetV1 = chatScreen2.V1();
                if (messageWriteWidgetV1 != null) {
                    messageWriteWidgetV1.B = iIntValue;
                }
                return sbi.a;
            case 2:
                dqa dqaVar = dqa.a;
                ec6 ec6Var = (ec6) this.f;
                ch3.d0(obj);
                ChatScreen chatScreen3 = this.g;
                zka zkaVar = (zka) ec6Var.a;
                ou7 ou7Var3 = ChatScreen.L1;
                int iOrdinal = zkaVar.a.ordinal();
                if (iOrdinal == 0) {
                    kz9 kz9Var2 = chatScreen3.t1;
                    if (kz9Var2 != null) {
                        zv8[] zv8VarArr = kz9.p;
                        kz9Var2.i(true);
                    }
                } else if (iOrdinal != 1) {
                    int i4 = 3;
                    if (iOrdinal == 2) {
                        kz9 kz9Var3 = chatScreen3.t1;
                        if (kz9Var3 != null && kz9Var3.o) {
                            a8j.x(chatScreen3.W1().i, dqaVar);
                        }
                        MessageWriteWidget messageWriteWidgetV2 = chatScreen3.V1();
                        if (messageWriteWidgetV2 != null) {
                            messageWriteWidgetV2.K1();
                        }
                        mmc.d(new fz6(new jz(new p5(uw8.f, 28), 11), new lb3(chatScreen3, null, 0), i4), chatScreen3.getViewLifecycleScope());
                    } else if (iOrdinal == 3 && (kz9Var = chatScreen3.t1) != null && kz9Var.o) {
                        a8j.x(chatScreen3.W1().i, dqaVar);
                    }
                } else {
                    rt2 rt2Var = (rt2) chatScreen3.k2().G1.a.getValue();
                    if (rt2Var != null) {
                        long j = rt2Var.a;
                        if (!chatScreen3.T1().o()) {
                            hve hveVarT1 = chatScreen3.T1();
                            t3f t3fVar = chatScreen3.d;
                            MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(t3fVar, j, sol.d(t3fVar), false, null, false, 56, null);
                            mediaKeyboardWidget.setTargetController(chatScreen3);
                            mediaKeyboardWidget.f = chatScreen3.y1;
                            hveVarT1.T(oc9.e(mediaKeyboardWidget, null, null));
                        }
                        int i5 = uw8.a;
                        if (uw8.b(uw8.c)) {
                            a8j.x(chatScreen3.W1().i, dqaVar);
                        } else {
                            a8j.x(chatScreen3.W1().i, cqa.a);
                        }
                        if (chatScreen3.m2()) {
                            tp2 tp2VarJ1 = chatScreen3.J1();
                            WeakHashMap weakHashMap = i7j.a;
                            swj.a(tp2VarJ1, null);
                            swj.a((tp2) chatScreen3.Y.m(chatScreen3, ChatScreen.M1[7]), null);
                            y6j.l(chatScreen3.J1(), null);
                        }
                        chatScreen3.e2().a();
                        kz9 kz9Var4 = chatScreen3.t1;
                        if (kz9Var4 != null) {
                            kz9Var4.l();
                        }
                    }
                }
                return sbi.a;
            case 3:
                ChatScreen chatScreen4 = this.g;
                Object obj3 = this.f;
                ch3.d0(obj);
                ylc ylcVar2 = (ylc) obj3;
                q9h q9hVar = (q9h) ylcVar2.a;
                if (((Boolean) ylcVar2.b).booleanValue()) {
                    ou7 ou7Var4 = ChatScreen.L1;
                    br4 br4VarC = rx8.C(chatScreen4.e2().a);
                    SuggestionsWidget suggestionsWidget = br4VarC instanceof SuggestionsWidget ? (SuggestionsWidget) br4VarC : null;
                    if (suggestionsWidget != null) {
                        suggestionsWidget.v1(false);
                    }
                } else if (q9hVar != null) {
                    ou7 ou7Var5 = ChatScreen.L1;
                    if (cqk.d(chatScreen4.L1().b(), "write_controller") && rx8.C(chatScreen4.e2().a) == null) {
                        zp3 zp3VarE2 = chatScreen4.e2();
                        hve hveVar = zp3VarE2.a;
                        if (!cqk.d(zp3VarE2.b(), "SuggestionsWidgetTag")) {
                            hveVar.S(false);
                            lve lveVarE = oc9.e(new SuggestionsWidget(chatScreen4.d, false, 2, null), null, null);
                            lveVarE.e("SuggestionsWidgetTag");
                            hveVar.T(lveVarE);
                        }
                        hve childRouter = chatScreen4.getChildRouter(chatScreen4.d2());
                        childRouter.e = 1;
                        childRouter.S(false);
                        if (!childRouter.o()) {
                            childRouter.T(oc9.e(new SuggestionsWidget(chatScreen4.d, false, 2, null), null, null));
                        }
                    }
                }
                return sbi.a;
            case 4:
                Object obj4 = this.f;
                ch3.d0(obj);
                this.g.x = ((Boolean) obj4).booleanValue();
                return sbi.a;
            case 5:
                Object obj5 = this.f;
                ch3.d0(obj);
                rr9 rr9Var = (rr9) obj5;
                ChatScreen chatScreen5 = this.g;
                ou7 ou7Var6 = ChatScreen.L1;
                String name = ChatScreen.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "got mediaBarViewModel.upEvents " + rr9Var + " " + chatScreen5.lifecycleOwner.f().d + "," + chatScreen5.getViewLifecycleOwner().f().d, null);
                    }
                }
                if (cqk.d(rr9Var, kr9.a)) {
                    MessageWriteWidget messageWriteWidgetV3 = chatScreen5.V1();
                    if (messageWriteWidgetV3 != null) {
                        messageWriteWidgetV3.t1().setText(messageWriteWidgetV3.i.a.i);
                    }
                } else if (cqk.d(rr9Var, jr9.a)) {
                    chatScreen5.Q1().setVisibility(8);
                    kz9 kz9Var5 = chatScreen5.t1;
                    if (kz9Var5 != null && !kz9Var5.o) {
                        chatScreen5.F1();
                    }
                } else if (cqk.d(rr9Var, mr9.a)) {
                    a8j.x(chatScreen5.W1().i, fqa.a);
                } else if (rr9Var instanceof qr9) {
                    xd3 xd3VarK2 = chatScreen5.k2();
                    zv8[] zv8VarArr2 = xd3.X1;
                    xd3VarK2.M(R.id.chat_screen__confirm_send_message_positive, R.id.chat_screen__confirm_send_message_negative);
                } else if (rr9Var instanceof pr9) {
                    xd3 xd3VarK3 = chatScreen5.k2();
                    pr9 pr9Var = (pr9) rr9Var;
                    CharSequence charSequence = pr9Var.a;
                    ArrayList arrayList = pr9Var.b;
                    boolean z = pr9Var.c;
                    g4b g4bVar = pr9Var.d;
                    Long lJ = chatScreen5.U1().J();
                    hla hlaVarG = chatScreen5.U1().G();
                    xd3VarK3.V(charSequence, arrayList, z, lJ, hlaVarG != null ? hlaVarG.a() : null, g4bVar, pr9Var.e);
                } else if (rr9Var instanceof nr9) {
                    if (sol.e(chatScreen5.d)) {
                        chatScreen5.k2().X(new g2f(((nr9) rr9Var).a));
                    } else {
                        xd3 xd3VarK4 = chatScreen5.k2();
                        nr9 nr9Var = (nr9) rr9Var;
                        Uri uri = nr9Var.a;
                        g4b g4bVar2 = nr9Var.b;
                        Long lJ2 = chatScreen5.U1().J();
                        hla hlaVarG2 = chatScreen5.U1().G();
                        q87 q87VarA = hlaVarG2 != null ? hlaVarG2.a() : null;
                        zv8[] zv8VarArr3 = xd3.X1;
                        xd3VarK4.T(uri, lJ2, q87VarA, g4bVar2, null);
                    }
                } else {
                    if (rr9Var instanceof or9) {
                        chatScreen5.k2();
                        throw null;
                    }
                    if (rr9Var instanceof hr9) {
                        Long lF = chatScreen5.U1().F();
                        hr9 hr9Var = (hr9) rr9Var;
                        chatScreen5.k2().F(hr9Var.a, lF, hr9Var.b, hr9Var.c);
                        nma.P(chatScreen5.U1(), null, null, null, false, 14);
                        chatScreen5.k2().Q(lF);
                    } else if (rr9Var instanceof ir9) {
                        MessageWriteWidget messageWriteWidgetV4 = chatScreen5.V1();
                        if (messageWriteWidgetV4 != null) {
                            messageWriteWidgetV4.H1(null);
                        }
                    } else {
                        if (!cqk.d(rr9Var, lr9.a)) {
                            ore.o();
                            return null;
                        }
                        nma.P(chatScreen5.U1(), null, null, null, false, 14);
                    }
                }
                return sbi.a;
            case 6:
                Object obj6 = this.f;
                ch3.d0(obj);
                ChatScreen chatScreen6 = this.g;
                ou7 ou7Var7 = ChatScreen.L1;
                a8j.x(chatScreen6.W1().i, gqa.a);
                return sbi.a;
            case 7:
                Object obj7 = this.f;
                ch3.d0(obj);
                fla flaVar = (fla) obj7;
                ChatScreen chatScreen7 = this.g;
                ou7 ou7Var8 = ChatScreen.L1;
                if (chatScreen7.k2().R1.a.getValue() != null) {
                    if (chatScreen7.b2().g.a.getValue() instanceof n9f) {
                        e21Var = flaVar == null ? e21.c : e21.a;
                    } else {
                        e21Var = e21.b;
                    }
                    if (!((Boolean) chatScreen7.N1().p.getValue()).booleanValue()) {
                        chatScreen7.r2(e21Var);
                    }
                }
                return sbi.a;
            case 8:
                Object obj8 = this.f;
                ch3.d0(obj);
                ama amaVar = (ama) obj8;
                ChatScreen chatScreen8 = this.g;
                ou7 ou7Var9 = ChatScreen.L1;
                if (amaVar instanceof tla) {
                    chatScreen8.k2().E();
                    xd3 xd3VarK5 = chatScreen8.k2();
                    q87 q87Var = ((tla) amaVar).a;
                    rt2 rt2Var2 = (rt2) xd3VarK5.G1.a.getValue();
                    if (rt2Var2 != null) {
                        a8j.t(xd3VarK5, ((n0c) xd3VarK5.H()).b(), new vq(rt2Var2.a, xd3VarK5, q87Var, (lq4) null), 2);
                    } else {
                        gm0.Y(xd3.class.getName(), "Early return in messageSent cuz of chatFlow.value?.id is null");
                    }
                } else if (amaVar instanceof ula) {
                    xd3 xd3VarK6 = chatScreen8.k2();
                    ula ulaVar = (ula) amaVar;
                    xd3VarK6.a0(yab.h0(xd3VarK6.b, ((n0c) xd3VarK6.H()).b(), 2, new t20(xd3VarK6, ulaVar.b, ulaVar.a, chatScreen8.U1().J(), (lq4) null, 9)));
                } else if (amaVar instanceof vla) {
                    chatScreen8.o2(true);
                } else if (cqk.d(amaVar, wla.a)) {
                    chatScreen8.p2(qc3.c);
                } else if (amaVar instanceof sla) {
                    Long lF2 = chatScreen8.U1().F();
                    xd3 xd3VarK7 = chatScreen8.k2();
                    CharSequence charSequence2 = ((sla) amaVar).a;
                    zv8[] zv8VarArr4 = xd3.X1;
                    xd3VarK7.F(charSequence2, lF2, null, false);
                    nma.P(chatScreen8.U1(), null, null, null, false, 14);
                    chatScreen8.k2().Q(lF2);
                } else if (amaVar instanceof rla) {
                    chatScreen8.k2().Q(((rla) amaVar).a);
                } else if (amaVar instanceof zla) {
                    xd3 xd3VarK8 = chatScreen8.k2();
                    zv8[] zv8VarArr5 = xd3.X1;
                    xd3VarK8.M(R.id.chat_screen__confirm_send_message_positive, R.id.chat_screen__confirm_send_message_negative);
                } else if (cqk.d(amaVar, yla.a)) {
                    MessageWriteWidget messageWriteWidgetV5 = chatScreen8.V1();
                    if (messageWriteWidgetV5 != null) {
                        int[] iArr = new int[2];
                        View sendMessageAnchor = messageWriteWidgetV5.t1().getSendMessageAnchor();
                        sendMessageAnchor.getLocationOnScreen(iArr);
                        int iD = zo5.D(18.0f, yl5.d().getDisplayMetrics().density, (wk8.u(messageWriteWidgetV5.getContext()) - iArr[0]) - (sendMessageAnchor.getWidth() / 2));
                        WindowInsets rootWindowInsets = messageWriteWidgetV5.requireView().getRootWindowInsets();
                        int i6 = rootWindowInsets != null ? ixj.g(rootWindowInsets, null).a.f(519).d : 0;
                        int i7 = uw8.a;
                        Point point = new Point(iD, (messageWriteWidgetV5.t1().getHeight() - gm0.K(4.0f * yl5.d().getDisplayMetrics().density)) + i6 + (uw8.b(uw8.c) ? uw8.a(messageWriteWidgetV5.getContext()) : 0));
                        mvh mvhVar = messageWriteWidgetV5.A;
                        if (mvhVar == null || !mvhVar.isShowing()) {
                            mvh mvhVar2 = messageWriteWidgetV5.A;
                            if (mvhVar2 != null) {
                                mvhVar2.dismiss();
                            }
                            mvh mvhVar3 = new mvh(messageWriteWidgetV5.getContext(), sendMessageAnchor, new pma(messageWriteWidgetV5, i3), null, 2, 3, false, 136);
                            rt2 rt2Var3 = (rt2) messageWriteWidgetV5.A1().c.getValue();
                            if (rt2Var3 == null || !rt2Var3.d0()) {
                                rt2 rt2Var4 = (rt2) messageWriteWidgetV5.A1().c.getValue();
                                i = rt2Var4 != null ? rt2Var4.y0() : false ? R.string.scheduled_send_favs_onboarding_tooltip : R.string.scheduled_send_chat_onboarding_tooltip;
                            } else {
                                i = R.string.scheduled_send_channel_onboarding_tooltip;
                            }
                            mvhVar3.c(new tnh(i));
                            mvhVar3.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                            mvhVar3.setOnDismissListener(new rma(messageWriteWidgetV5, 1));
                            messageWriteWidgetV5.A = mvhVar3;
                        } else {
                            mvh mvhVar4 = messageWriteWidgetV5.A;
                            if (mvhVar4 != null) {
                                mvhVar4.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                            }
                        }
                    }
                } else if (amaVar instanceof xla) {
                    tb3 tb3Var = tb3.b;
                    long j2 = ((xla) amaVar).a;
                    o65 o65VarB = tb3Var.b();
                    n65 n65Var = new n65();
                    n65Var.a = ":scheduled-messages";
                    n65Var.d(Long.valueOf(j2), "id");
                    o65.e(o65VarB, n65Var.a(), null, null, 4);
                } else {
                    if (!cqk.d(amaVar, qla.a)) {
                        ore.o();
                        return null;
                    }
                    xd3 xd3VarK9 = chatScreen8.k2();
                    if (((gbj) xd3VarK9.Y.getValue()).b(xd3VarK9.G1)) {
                        a8j.x(xd3VarK9.L1, new nc3(true, true));
                    }
                }
                return sbi.a;
            case 9:
                Object obj9 = this.f;
                ch3.d0(obj);
                y5b y5bVar = (y5b) obj9;
                ChatScreen chatScreen9 = this.g;
                ou7 ou7Var10 = ChatScreen.L1;
                if (chatScreen9.getView() != null) {
                    if (y5bVar.a > 0) {
                        chatScreen9.g2().c(String.valueOf(y5bVar.a), y5bVar.b, new xa3(chatScreen9, 0), new ol0(i2, chatScreen9));
                    } else if (chatScreen9.g2().b()) {
                        chatScreen9.g2().a();
                    }
                }
                return sbi.a;
            case 10:
                ChatScreen chatScreen10 = this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                pbe pbeVar = (pbe) obj10;
                if (pbeVar instanceof lbe) {
                    lbe lbeVar = (lbe) pbeVar;
                    g4b g4bVar3 = lbeVar.b;
                    boolean z2 = lbeVar.c;
                    t2 t2Var = lbeVar.a;
                    if (t2Var instanceof lzi) {
                        if (sol.e(chatScreen10.d) || z2) {
                            chatScreen10.k2().X(new k2f((lzi) t2Var));
                        } else {
                            xd3 xd3VarK10 = chatScreen10.k2();
                            lzi lziVar = (lzi) t2Var;
                            Long lJ3 = chatScreen10.U1().J();
                            hla hlaVarG3 = chatScreen10.U1().G();
                            q87 q87VarA2 = hlaVarG3 != null ? hlaVarG3.a() : null;
                            zv8[] zv8VarArr6 = xd3.X1;
                            xd3VarK10.Z(lziVar, lJ3, q87VarA2, g4bVar3, null);
                        }
                    } else if (t2Var instanceof q90) {
                        if (sol.e(chatScreen10.d) || z2) {
                            chatScreen10.k2().X(new e2f((q90) t2Var));
                        } else {
                            xd3 xd3VarK11 = chatScreen10.k2();
                            List listSingletonList = Collections.singletonList(t2Var);
                            Long lJ4 = chatScreen10.U1().J();
                            hla hlaVarG4 = chatScreen10.U1().G();
                            q87 q87VarA3 = hlaVarG4 != null ? hlaVarG4.a() : null;
                            zv8[] zv8VarArr7 = xd3.X1;
                            xd3VarK11.V(null, listSingletonList, false, lJ4, q87VarA3, g4bVar3, null);
                        }
                        ia8 ia8Var = (ia8) chatScreen10.H1.getValue();
                        if (ia8Var != null) {
                            ia8Var.f(Collections.singleton(new ha8(fa8.SEND_AUDIO_MESSAGE, 1)), y3f.CHAT);
                        }
                    }
                } else if (pbeVar instanceof nbe) {
                    nbe nbeVar = (nbe) pbeVar;
                    ChatScreen.q2(chatScreen10, null, String.valueOf(nbeVar.a.b(chatScreen10.getContext())), null, nbeVar.b, 5);
                } else if (pbeVar instanceof obe) {
                    ou7 ou7Var11 = ChatScreen.L1;
                    MessageWriteWidget messageWriteWidgetV6 = chatScreen10.V1();
                    if (messageWriteWidgetV6 != null) {
                        obe obeVar = (obe) pbeVar;
                        fbe fbeVar = obeVar.a;
                        tnh tnhVar = obeVar.b;
                        int[] iArr2 = new int[2];
                        int iOrdinal2 = fbeVar.ordinal();
                        if (iOrdinal2 == 0) {
                            videoMessageRecordAnchor = messageWriteWidgetV6.t1().getVideoMessageRecordAnchor();
                        } else {
                            if (iOrdinal2 != 1) {
                                ore.o();
                                return null;
                            }
                            videoMessageRecordAnchor = messageWriteWidgetV6.t1().getAudioRecordAnchor();
                        }
                        if (videoMessageRecordAnchor != null) {
                            videoMessageRecordAnchor.getLocationOnScreen(iArr2);
                            int iD2 = zo5.D(18.0f, yl5.d().getDisplayMetrics().density, (wk8.u(messageWriteWidgetV6.getContext()) - iArr2[0]) - (videoMessageRecordAnchor.getWidth() / 2));
                            WindowInsets rootWindowInsets2 = messageWriteWidgetV6.requireView().getRootWindowInsets();
                            int i8 = rootWindowInsets2 != null ? ixj.g(rootWindowInsets2, null).a.f(519).d : 0;
                            int i9 = uw8.a;
                            Point point2 = new Point(iD2, (messageWriteWidgetV6.t1().getHeight() - gm0.K(8.0f * yl5.d().getDisplayMetrics().density)) + i8 + (uw8.b(uw8.c) ? uw8.a(messageWriteWidgetV6.getContext()) : 0));
                            mvh mvhVar5 = messageWriteWidgetV6.A;
                            if (mvhVar5 == null || !mvhVar5.isShowing()) {
                                mvh mvhVar6 = messageWriteWidgetV6.A;
                                if (mvhVar6 != null) {
                                    mvhVar6.dismiss();
                                }
                                mvh mvhVar7 = new mvh(messageWriteWidgetV6.getContext(), videoMessageRecordAnchor, new pma(messageWriteWidgetV6, i2), null, 2, 3, false, 136);
                                mvhVar7.c(tnhVar);
                                mvhVar7.e(point2, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                                mvhVar7.setOnDismissListener(new rma(messageWriteWidgetV6, 2));
                                messageWriteWidgetV6.A = mvhVar7;
                            } else {
                                mvh mvhVar8 = messageWriteWidgetV6.A;
                                if (mvhVar8 != null) {
                                    mvhVar8.e(point2, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                                }
                            }
                        }
                    }
                } else if (pbeVar instanceof mbe) {
                    mbe mbeVar = (mbe) pbeVar;
                    boolean z3 = mbeVar.b;
                    int iOrdinal3 = mbeVar.a.ordinal();
                    if (iOrdinal3 == 0) {
                        ou7 ou7Var12 = ChatScreen.L1;
                        xd3 xd3VarK12 = chatScreen10.k2();
                        rt2 rt2Var5 = (rt2) xd3VarK12.G1.a.getValue();
                        if (rt2Var5 != null) {
                            long jA = rt2Var5.A();
                            ny8 ny8Var = xd3VarK12.D;
                            if (z3) {
                                hjc hjcVar = (hjc) ny8Var.getValue();
                                hjcVar.getClass();
                                if (jA != 0) {
                                    hjcVar.g(jA, w50.VIDEO_MSG, -2L);
                                }
                            } else {
                                hjc hjcVar2 = (hjc) ny8Var.getValue();
                                if (jA == 0) {
                                    hjcVar2.getClass();
                                } else {
                                    hjcVar2.c(jA, -2L);
                                }
                            }
                        } else {
                            gm0.Y(xd3.class.getName(), "Early return in sendVideoMessageTyping cuz of chatFlow.value?.serverId is null");
                        }
                    } else {
                        if (iOrdinal3 != 1) {
                            ore.o();
                            return null;
                        }
                        ou7 ou7Var13 = ChatScreen.L1;
                        xd3 xd3VarK13 = chatScreen10.k2();
                        rt2 rt2Var6 = (rt2) xd3VarK13.G1.a.getValue();
                        if (rt2Var6 != null) {
                            long jA2 = rt2Var6.A();
                            ny8 ny8Var2 = xd3VarK13.D;
                            if (z3) {
                                hjc hjcVar3 = (hjc) ny8Var2.getValue();
                                hjcVar3.getClass();
                                if (jA2 != 0) {
                                    hjcVar3.g(jA2, w50.AUDIO, -1L);
                                }
                            } else {
                                hjc hjcVar4 = (hjc) ny8Var2.getValue();
                                if (jA2 == 0) {
                                    hjcVar4.getClass();
                                } else {
                                    hjcVar4.c(jA2, -1L);
                                }
                            }
                        } else {
                            gm0.Y(xd3.class.getName(), "Early return in sendAudioTyping cuz of chatFlow.value?.serverId is null");
                        }
                    }
                } else {
                    if (!(pbeVar instanceof kbe)) {
                        ore.o();
                        return null;
                    }
                    ou7 ou7Var14 = ChatScreen.L1;
                    MessageWriteWidget messageWriteWidgetV7 = chatScreen10.V1();
                    if (messageWriteWidgetV7 != null) {
                        mvh mvhVar9 = messageWriteWidgetV7.A;
                        if (mvhVar9 != null) {
                            mvhVar9.dismiss();
                        }
                        messageWriteWidgetV7.A = null;
                    }
                }
                return sbi.a;
            case 11:
                Object obj11 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                ChatScreen chatScreen11 = this.g;
                ou7 ou7Var15 = ChatScreen.L1;
                chatScreen11.j2().setVisibility(zBooleanValue ? 0 : 8);
                j8e j8eVar = chatScreen11.w1;
                if (zBooleanValue) {
                    zp3 zp3Var = (zp3) j8eVar.m(chatScreen11, ChatScreen.M1[17]);
                    hve hveVar2 = zp3Var.a;
                    if (!cqk.d(zp3Var.b(), "video_msg_controller")) {
                        hveVar2.S(false);
                        lve lveVarE2 = oc9.e(new VideoMessageWidget(chatScreen11.d.b()), null, null);
                        lveVarE2.e("video_msg_controller");
                        hveVar2.T(lveVarE2);
                    }
                } else {
                    ((zp3) j8eVar.m(chatScreen11, ChatScreen.M1[17])).a();
                }
                return sbi.a;
            case 12:
                Object obj12 = this.f;
                ch3.d0(obj);
                Boolean bool = (Boolean) obj12;
                bool.getClass();
                ChatScreen chatScreen12 = this.g;
                ou7 ou7Var16 = ChatScreen.L1;
                br4 br4VarC2 = rx8.C(((zp3) chatScreen12.w1.m(chatScreen12, ChatScreen.M1[17])).a);
                VideoMessageWidget videoMessageWidget = br4VarC2 instanceof VideoMessageWidget ? (VideoMessageWidget) br4VarC2 : null;
                if (videoMessageWidget != null) {
                    mjg mjgVar = videoMessageWidget.y1().g;
                    do {
                        value = mjgVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!mjgVar.h(value, bool));
                }
                return sbi.a;
            case 13:
                Object obj13 = this.f;
                ch3.d0(obj);
                ChatScreen chatScreen13 = this.g;
                ou7 ou7Var17 = ChatScreen.L1;
                chatScreen13.M1().setBackground((Drawable) obj13);
                return sbi.a;
            case 14:
                return l(obj);
            case 15:
                Object obj14 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj14;
                if (rbbVar instanceof rt3) {
                    this.g.getRouter().D();
                } else if (rbbVar instanceof i65) {
                    tb3.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 16:
                Object obj15 = this.f;
                ch3.d0(obj);
                this.g.getRouter().D();
                return sbi.a;
            case 17:
                ChatScreen chatScreen14 = this.g;
                Object obj16 = this.f;
                ch3.d0(obj);
                s93 s93Var = (s93) obj16;
                if (s93Var instanceof q93) {
                    g8c g8cVar = chatScreen14.J1;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    zv8[] zv8VarArr8 = BottomSheetWidget.t;
                    q93 q93Var = (q93) s93Var;
                    jc4 jc4VarA = mol.a(q93Var.a, null, null, 6);
                    q93Var.b.forEach(new ob3(0, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 2)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(chatScreen14);
                    confirmationBottomSheetF.setTargetController(chatScreen14);
                    br4 parentController = chatScreen14;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else {
                    if (!(s93Var instanceof r93)) {
                        ore.o();
                        return null;
                    }
                    CharSequence charSequenceB = ((r93) s93Var).a.b(chatScreen14.getContext());
                    ChatScreen.q2(chatScreen14, null, charSequenceB != null ? charSequenceB.toString() : null, null, null, 13);
                }
                return sbi.a;
            case 18:
                sbi sbiVar = sbi.a;
                Object obj17 = this.f;
                ch3.d0(obj);
                rbb rbbVar2 = (rbb) obj17;
                if (rbbVar2 instanceof pfc) {
                    tb3 tb3Var2 = tb3.b;
                    long jLongValue = ((Number) ((pfc) rbbVar2).a).longValue();
                    tb3Var2.getClass();
                    n65 n65Var2 = new n65();
                    n65Var2.a = ":settings/folder/by-chat";
                    n65Var2.d(Long.valueOf(jLongValue), "ids");
                    n65Var2.d(Boolean.TRUE, "replace_top");
                    o65.c(tb3Var2.b(), n65Var2.b(), null, null, 6);
                }
                return sbiVar;
            default:
                Object obj18 = this.f;
                ch3.d0(obj);
                int iIntValue2 = ((Number) obj18).intValue();
                ChatScreen chatScreen15 = this.g;
                ou7 ou7Var18 = ChatScreen.L1;
                a8j.x(chatScreen15.W1().i, new eqa(iIntValue2));
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya3(ChatScreen chatScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatScreen;
    }
}
