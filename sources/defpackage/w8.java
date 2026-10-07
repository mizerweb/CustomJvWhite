package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import one.me.android.root.RootController;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.CommentAdminDeleteBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w8 extends ha implements qf7 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0551  */
    /* JADX WARN: Code duplicated, block: B:247:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:249:0x07d9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object a(Object obj, Object obj2) {
        mvh mvhVar;
        View contentView$message_list;
        t6e t6eVar;
        uvc uvcVar;
        int i;
        hve hveVarU1;
        vpa vpaVar = (vpa) obj;
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.a;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        messagesListWidget.getClass();
        mt7 mt7Var = mt7.LONG_PRESS;
        z8c z8cVar = z8c.a;
        if (vpaVar instanceof x1g) {
            x1g x1gVar = (x1g) vpaVar;
            zv8[] zv8VarArr2 = BottomSheetWidget.t;
            jc4 jc4VarA = mol.a(x1gVar.b, n1g.i(new ylc("selected.messageIds.Action", ww3.U1(x1gVar.a))), null, 4);
            jc4VarA.g(x1gVar.c);
            x1gVar.d.forEach(new o01(9, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11)));
            lc4 lc4Var = x1gVar.e;
            if (lc4Var != null) {
                jc4VarA.a.putParcelable("option_row", lc4Var);
            }
            jc4VarA.a.putBoolean("memorize_keyboard", x1gVar.f);
            ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(messagesListWidget);
            confirmationBottomSheetF.setTargetController(messagesListWidget);
            br4 parentController = messagesListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
            }
        } else if (vpaVar instanceof l3g) {
            l3g l3gVar = (l3g) vpaVar;
            zv8[] zv8VarArr3 = BottomSheetWidget.t;
            jc4 jc4VarA2 = mol.a(l3gVar.e, n1g.i(new ylc("selected.messageIds.Action", new long[]{l3gVar.a}), new ylc("bot.shareContact.confirm.keyboardId", l3gVar.b), new ylc("bot.shareContact.confirm.button", l3gVar.d), new ylc("bot.shareContact.confirm.buttonPosition", l3gVar.c)), null, 4);
            l3gVar.f.forEach(new o01(8, new t63(1, jc4VarA2, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12)));
            ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarA2.f(messagesListWidget);
            confirmationBottomSheetF2.setTargetController(messagesListWidget);
            br4 parentController2 = messagesListWidget;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar2 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                p.k(false, lveVar2, true, "BottomSheetWidget");
                hveVarU1.I(lveVar2);
            }
        } else if (vpaVar instanceof h3g) {
            a8j.x(messagesListWidget.E1().j, new mqa(((h3g) vpaVar).a));
        } else if (vpaVar instanceof b2g) {
            messagesListWidget.F1().c0().b();
            a8j.x(messagesListWidget.E1().j, new lqa(((b2g) vpaVar).a));
        } else if (vpaVar instanceof n3g) {
            messagesListWidget.K1((n3g) vpaVar);
        } else if (vpaVar instanceof v3g) {
            if (messagesListWidget.F1().c0().h()) {
                messagesListWidget.F1().c0().b();
            }
            h8c h8cVar = new h8c(messagesListWidget);
            h8cVar.n(np4.q(messagesListWidget.getContext(), R.string.chat_screen_message_unpinned_snackbar));
            h8cVar.h(z8cVar);
            h8cVar.j(new e9c(new tnh(R.string.cancel)));
            h8cVar.e(new fv9(messagesListWidget, 16, (v3g) vpaVar));
            h8cVar.c(new o8c(0, 0, messagesListWidget.r1(), 11));
            h8cVar.p();
        } else if (vpaVar instanceof u1g) {
            if (messagesListWidget.F1().c0().h()) {
                messagesListWidget.F1().c0().b();
            }
            zv8[] zv8VarArr4 = BottomSheetWidget.t;
            u1g u1gVar = (u1g) vpaVar;
            CommentAdminDeleteBottomSheet commentAdminDeleteBottomSheet = new CommentAdminDeleteBottomSheet(messagesListWidget.b, u1gVar.a.size(), u1gVar.b, ww3.U1(u1gVar.a));
            commentAdminDeleteBottomSheet.setTargetController(messagesListWidget);
            br4 parentController3 = messagesListWidget;
            while (parentController3.getParentController() != null) {
                parentController3 = parentController3.getParentController();
            }
            RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
            hveVarU1 = rootController3 != null ? rootController3.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar3 = new lve(commentAdminDeleteBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar3, true, "BottomSheetWidget");
                hveVarU1.I(lveVar3);
            }
        } else if (vpaVar instanceof v1g) {
            v1g v1gVar = (v1g) vpaVar;
            long j = v1gVar.a;
            boolean z = v1gVar.c;
            g8c g8cVar = messagesListWidget.S1;
            if (g8cVar != null) {
                g8cVar.a();
            }
            h8c h8cVar2 = new h8c(messagesListWidget);
            boolean z2 = v1gVar.b;
            if (z2 && z) {
                i = R.string.chat_screen_admin_delete_comment_snackbar_delete_and_block;
            } else if (z2) {
                i = R.string.chat_screen_admin_delete_comment_snackbar_delete_all;
            } else {
                i = z ? R.string.chat_screen_admin_delete_comment_snackbar_block : R.string.chat_screen_admin_delete_comment_snackbar_delete;
            }
            h8cVar2.m(new tnh(i));
            h8cVar2.h(z8cVar);
            h8cVar2.j(new e9c(new tnh(R.string.cancel)));
            h8cVar2.e(new gw2(messagesListWidget, j, 5));
            h8cVar2.c(new o8c(0, 0, messagesListWidget.r1(), 11));
            messagesListWidget.S1 = h8cVar2.p();
        } else if (vpaVar instanceof bja) {
            if (messagesListWidget.F1().c0().h()) {
                messagesListWidget.F1().c0().b();
            }
            ia8 ia8Var = (ia8) messagesListWidget.d.getAccessor().g().getValue();
            if (ia8Var != null) {
                ia8Var.f(Collections.singleton(new ha8(fa8.MADE_2_PIN, 1)), y3f.CHAT);
            }
        } else if (vpaVar instanceof ob) {
            b7e b7eVar = messagesListWidget.P1;
            if (b7eVar != null) {
                ob obVar = (ob) vpaVar;
                b7eVar.d(obVar.c, obVar.a, obVar.b);
            }
        } else if (vpaVar instanceof a3g) {
            a3g a3gVar = (a3g) vpaVar;
            MessageModel messageModel = a3gVar.a;
            Collection collection = a3gVar.b;
            boolean z3 = a3gVar.c;
            vv vvVar = messagesListWidget.e;
            zv8[] zv8VarArr5 = MessagesListWidget.T1;
            zv8 zv8Var = zv8VarArr5[1];
            if (((long[]) vvVar.a(messagesListWidget)) == null && messagesListWidget.getView() != null) {
                lfe lfeVarL = messagesListWidget.D1().L(messageModel.a);
                if (lfeVarL == null) {
                    String name = MessagesListWidget.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, zo5.j(messageModel.a, "not find viewholder for messageId "), null);
                        }
                    }
                } else {
                    messagesListWidget.I1();
                    View view = lfeVarL.a;
                    iea ieaVar = view instanceof iea ? (iea) view : null;
                    if (ieaVar == null || (contentView$message_list = ieaVar.getContentView$message_list()) == null) {
                        contentView$message_list = lfeVarL.a;
                    }
                    long[] jArr = {messageModel.a};
                    vv vvVar2 = messagesListWidget.e;
                    zv8 zv8Var2 = zv8VarArr5[1];
                    vvVar2.b(messagesListWidget, jArr);
                    b5d b5dVar = messagesListWidget.x1().a4;
                    zv8[] zv8VarArr6 = e5d.S6;
                    if (((Boolean) b5dVar.a(zv8VarArr6[262]).i()).booleanValue()) {
                        pp4 pp4VarQ = opl.b(messagesListWidget, 1).g().l(collection).f(contentView$message_list).h(new Rect(-1073741824, 0, -1073741824, 0), 0.0f).q();
                        PointF pointF = messagesListWidget.K;
                        pp4 pp4VarD = pp4VarQ.r(pointF.x).j(pointF.y).s().m().d();
                        h hVar = messagesListWidget.d;
                        Context context = messagesListWidget.getContext();
                        e5d e5dVarX1 = messagesListWidget.x1();
                        jsa jsaVarF1 = messagesListWidget.F1();
                        a8e a8eVarB = messageModel.r() ? (a8e) messagesListWidget.C1().g.getValue() : messagesListWidget.C1().B();
                        ExecutorService executorServiceA = hVar.getExecutors().a();
                        ljf ljfVar = new ljf(context, e5dVarX1, jsaVarF1, a8eVarB, executorServiceA, hVar.getAccessor().g());
                        View rootView = messagesListWidget.D1().getRootView();
                        float f = pointF.x;
                        msa msaVar = new msa(messagesListWidget, 21);
                        msa msaVar2 = new msa(messagesListWidget, 22);
                        int iOrdinal = jsaVarF1.d.ordinal();
                        if ((iOrdinal == 0 || (iOrdinal == 2 && (messageModel.r() || ((Boolean) e5dVarX1.q5.a(zv8VarArr6[330]).i()).booleanValue()))) && a8eVarB.O(messageModel.A)) {
                            Rect rect = new Rect();
                            rootView.getWindowVisibleDisplayFrame(rect);
                            boolean z4 = f <= ((float) rect.centerX());
                            List listL = a8e.L(a8eVarB, messageModel.w, z4, 2);
                            if (listL.isEmpty()) {
                                uvcVar = null;
                            } else {
                                wfe wfeVar = new wfe();
                                ljf ljfVar2 = new ljf(ljfVar, messageModel, msaVar, wfeVar, 18);
                                v6e v6eVar = new v6e(context, executorServiceA);
                                v6e.d(v6eVar, listL, null, null, 6);
                                v6eVar.c = ljfVar2;
                                List list = listL;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            t6eVar = null;
                                            break;
                                        }
                                        if (((k79) it.next()) instanceof f6e) {
                                            t6eVar = new t6e(v6eVar, listL, z4, gm0.K((hsl.c(context) >= 360 ? 32 : 28) * yl5.d().getDisplayMetrics().density), new vx9(ljfVar, 6, messageModel), new ww8(24, rect), msaVar2);
                                            break;
                                        }
                                    }
                                } else {
                                    t6eVar = null;
                                    break;
                                }
                                wfeVar.a = t6eVar;
                                rja rjaVar = new rja(context, r5a.f(12.0f, yl5.d().getDisplayMetrics().density, 2, rect.width()));
                                rjaVar.addView(v6eVar.e, new FrameLayout.LayoutParams(-2, -2));
                                uvcVar = new uvc(rjaVar, 22, (jda) wfeVar.a);
                            }
                        } else {
                            uvcVar = null;
                        }
                        if (uvcVar != null) {
                            pp4VarD.k((rja) uvcVar.b);
                        }
                        tda tdaVar = new tda(messagesListWidget.getContext(), collection, new lsa(messagesListWidget, 8), z3, new k01(messagesListWidget, messagesListWidget.getArgs().getLong("ARG_CHAT_ID"), messageModel, 6), new msa(messagesListWidget, 23), hVar.getExecutors().a(), new lsa(messagesListWidget, 9));
                        pp4VarD.u(tdaVar.b());
                        tdaVar.b().setOverscrollCallback(uvcVar != null ? (jda) uvcVar.c : null);
                        messagesListWidget.p = tdaVar;
                        qp4 qp4VarBuild = pp4VarD.build();
                        messagesListWidget.o = qp4VarBuild;
                        qp4VarBuild.u(messagesListWidget);
                    } else {
                        p0m.a(contentView$message_list, mt7Var);
                        boolean z5 = (messagesListWidget.F1().d.h() || messagesListWidget.F1().d.a()) && messagesListWidget.C1().B().O(messageModel.A);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_reactions_selector", z5);
                        bundle.putLong("message_id", messageModel.a);
                        bundle.putLong("message_server_id", messageModel.b);
                        bundle.putLong("chat_id", messagesListWidget.getArgs().getLong("ARG_CHAT_ID"));
                        bundle.putParcelable(Widget.ARG_SCOPE_ID, messagesListWidget.b);
                        bundle.putBundle("actions", mpl.a(collection));
                        if (contentView$message_list.getId() == -1) {
                            ore.k("Check failed.");
                            return null;
                        }
                        bundle.putInt("anchor_id", contentView$message_list.getId());
                        bundle.putSerializable("anchor_class", contentView$message_list.getClass());
                        bundle.putParcelable("highlight_padding", new Rect(-1073741824, 0, -1073741824, 0));
                        bundle.putFloat("highlight_radius", 0.0f);
                        bundle.putInt("parent_id", R.id.messages_list_recycler_view);
                        MessageContextMenuBottomSheet messageContextMenuBottomSheet = new MessageContextMenuBottomSheet(new Bundle(bundle));
                        messagesListWidget.o = messageContextMenuBottomSheet;
                        messageContextMenuBottomSheet.u(messagesListWidget);
                    }
                }
            }
        } else if (vpaVar instanceof k2g) {
            k2g k2gVar = (k2g) vpaVar;
            float f2 = k2gVar.a;
            float f3 = k2gVar.b;
            Bundle bundle2 = k2gVar.c;
            xnh xnhVar = k2gVar.d;
            Collection collection2 = k2gVar.e;
            View view2 = messagesListWidget.getView();
            if (view2 != null) {
                opl.b(messagesListWidget, 1).g().n(f2, f3).p(bundle2).t(xnhVar).l(collection2).build().u(messagesListWidget);
                p0m.a(view2, mt7Var);
            }
        } else if (vpaVar instanceof kv7) {
            qp4 qp4Var = messagesListWidget.o;
            if (qp4Var != null) {
                qp4Var.dismiss();
            }
        } else if (cqk.d(vpaVar, csc.a)) {
            View view3 = messagesListWidget.getView();
            if (view3 != null) {
                p0m.a(view3, lt7.CONFIRM);
            }
        } else if (vpaVar instanceof w3g) {
            zv8[] zv8VarArr7 = BottomSheetWidget.t;
            w3g w3gVar = (w3g) vpaVar;
            WarningLinkBottomSheet warningLinkBottomSheet = new WarningLinkBottomSheet(messagesListWidget.b, w3gVar.a, w3gVar.b);
            warningLinkBottomSheet.setTargetController(messagesListWidget);
            br4 parentController4 = messagesListWidget;
            while (parentController4.getParentController() != null) {
                parentController4 = parentController4.getParentController();
            }
            RootController rootController4 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
            hve hveVarU2 = rootController4 != null ? rootController4.u1() : null;
            if (hveVarU2 != null) {
                lve lveVar4 = new lve(warningLinkBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar4, true, "BottomSheetWidget");
                hveVarU2.I(lveVar4);
            }
        } else if (vpaVar instanceof a2g) {
            a2g a2gVar = (a2g) vpaVar;
            long j2 = a2gVar.a;
            r2f r2fVar = a2gVar.b;
            long j3 = a2gVar.c;
            zv8[] zv8VarArr8 = BottomSheetWidget.t;
            ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(messagesListWidget.b.b(), j2, r2fVar, Long.valueOf(j3));
            scheduledSendPickerBottomSheet.setTargetController(messagesListWidget);
            br4 parentController5 = messagesListWidget;
            while (parentController5.getParentController() != null) {
                parentController5 = parentController5.getParentController();
            }
            RootController rootController5 = parentController5 instanceof RootController ? (RootController) parentController5 : null;
            hve hveVarU3 = rootController5 != null ? rootController5.u1() : null;
            if (hveVarU3 != null) {
                lve lveVar5 = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar5, true, "BottomSheetWidget");
                hveVarU3.I(lveVar5);
            }
        } else if (vpaVar instanceof g3g) {
            if (!sol.e(messagesListWidget.w1())) {
                g3g g3gVar = (g3g) vpaVar;
                messagesListWidget.J1(g3gVar.a, g3gVar.b);
            }
        } else if (vpaVar instanceof e3g) {
            View view4 = messagesListWidget.getView();
            if (!((Boolean) messagesListWidget.F1().I2.getValue()).booleanValue() && view4 != null) {
                mvh mvhVar2 = messagesListWidget.p1;
                if (mvhVar2 == null || !mvhVar2.isShowing()) {
                    mvhVar = messagesListWidget.p1;
                    if (mvhVar != null) {
                        mvhVar.dismiss();
                    }
                    mvh mvhVar3 = new mvh(messagesListWidget.getContext(), view4, new msa(messagesListWidget, 13), null, 0, 0, false, 248);
                    e3g e3gVar = (e3g) vpaVar;
                    mvhVar3.m = e3gVar.e;
                    mvhVar3.c(e3gVar.d);
                    mvhVar3.setOnDismissListener(new nc1(5, messagesListWidget));
                    mvhVar3.e(e3gVar.c, 8388659, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    messagesListWidget.p1 = mvhVar3;
                } else {
                    mvh mvhVar4 = messagesListWidget.p1;
                    String str = mvhVar4 != null ? mvhVar4.m : null;
                    e3g e3gVar2 = (e3g) vpaVar;
                    if (cqk.d(str, e3gVar2.e)) {
                        mvh mvhVar5 = messagesListWidget.p1;
                        if (mvhVar5 != null) {
                            mvhVar5.e(e3gVar2.c, 8388659, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        }
                    } else {
                        mvhVar = messagesListWidget.p1;
                        if (mvhVar != null) {
                            mvhVar.dismiss();
                        }
                        mvh mvhVar6 = new mvh(messagesListWidget.getContext(), view4, new msa(messagesListWidget, 13), null, 0, 0, false, 248);
                        e3g e3gVar3 = (e3g) vpaVar;
                        mvhVar6.m = e3gVar3.e;
                        mvhVar6.c(e3gVar3.d);
                        mvhVar6.setOnDismissListener(new nc1(5, messagesListWidget));
                        mvhVar6.e(e3gVar3.c, 8388659, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        messagesListWidget.p1 = mvhVar6;
                    }
                }
            }
        } else {
            if (!cqk.d(vpaVar, fub.a) && !cqk.d(vpaVar, hub.a) && !(vpaVar instanceof gub)) {
                ore.o();
                return null;
            }
            h1i h1iVar = (h1i) messagesListWidget.Q1.getValue();
            if (h1iVar != null) {
                h1iVar.a.a(null);
            }
            messagesListWidget.I1();
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:179:0x04d9 A[LOOP:0: B:178:0x04d7->B:179:0x04d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        lq1 lq1Var;
        ynh xnhVar;
        dcc dccVarB;
        dcc dccVar;
        c79 c79VarW;
        boolean z;
        String strF;
        List listG1;
        jy8 jy8Var;
        int size;
        int size2;
        int size3;
        ArrayList arrayList;
        int i;
        ynh tnhVar;
        int i2;
        rt2 rt2VarC;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        list = null;
        list = null;
        List list = null;
        switch (this.h) {
            case 0:
                ((y8) this.a).C((String) obj);
                return sbi.a;
            case 1:
                ca1 ca1Var = (ca1) this.a;
                zv8[] zv8VarArr = CallAdminSettingsScreen.j;
                ca1Var.H((List) obj);
                return sbi.a;
            case 2:
                ((qc1) this.a).setVolumeMicrophone(((Number) obj).floatValue());
                return sbi.a;
            case 3:
                uf1 uf1Var = (uf1) this.a;
                zv8[] zv8VarArr2 = CallDebugMenuScreen.i;
                uf1Var.H((List) obj);
                return sbi.a;
            case 4:
                rt2 rt2Var = (rt2) obj;
                vq1 vq1Var = (vq1) this.a;
                mjg mjgVar = vq1Var.j;
                do {
                    value = mjgVar.getValue();
                    lq1Var = (lq1) value;
                    xnhVar = (rt2Var == null || (strF = rt2Var.F()) == null) ? lq1Var.e : new xnh(strF);
                    if (rt2Var != null) {
                        Long lValueOf = Long.valueOf(rt2Var.A());
                        if (rt2Var.f0()) {
                            long j = rt2Var.f;
                            if (j == rt2Var.b.d || rt2Var.Y(j)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        dccVarB = vq1Var.B(lValueOf, z);
                    } else {
                        dccVarB = ybc.a;
                    }
                    dccVar = dccVarB;
                    c79VarW = yab.w();
                    if (rt2Var != null) {
                        nx2 nx2Var = rt2Var.b;
                        int i6 = nx2Var.m;
                        int iB = nx2Var.b();
                        c79VarW.add(new zp1(iB == 0 ? new tnh(R.string.call_history_item_call_count_no_users) : new pnh(R.plurals.call_history_item_call_count_users, iB + 1), i6 == 0 ? null : new dsf(i6, 2)));
                    }
                    c79VarW.addAll(lq1.k);
                } while (!mjgVar.h(value, lq1.a(lq1Var, null, null, null, null, xnhVar, yab.j(c79VarW), null, false, null, dccVar, 927)));
                return sbi.a;
            case 5:
                gv1 gv1Var = (gv1) this.a;
                zv8[] zv8VarArr3 = CallPresettingsScreen.i;
                gv1Var.H((List) obj);
                return sbi.a;
            case 6:
                vfi vfiVar = (vfi) obj;
                op2 op2Var = (op2) this.a;
                op2Var.getClass();
                if (vfiVar.a()) {
                    String str = vfiVar.h.a;
                    rt2 rt2Var2 = (rt2) op2Var.k().k(op2Var.d).a.getValue();
                    if (rt2Var2 != null) {
                        yab.i0((gu4) op2Var.i.getValue(), null, 0, new je0(op2Var, new wy2(rt2Var2.A(), 0, (String) null, false, (String) null, (Map) null, (String) null, str, op2Var.e, (Long) null, false, 0L), null, 1), 3);
                    } else {
                        String str2 = op2Var.g;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str2, zo5.j(op2Var.d, "updateChatAvatar: chat not found, chatId="), null);
                            }
                        }
                        op2Var.F();
                    }
                }
                return sbi.a;
            case 7:
                krd krdVar = (krd) obj;
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) this.a;
                zv8[] zv8VarArr4 = ChatAdminsScreen.l;
                chatAdminsScreen.getClass();
                if (krdVar instanceof ird) {
                    h8c h8cVar = new h8c(chatAdminsScreen);
                    h8cVar.h(z8c.a);
                    h8cVar.m(((ird) krdVar).a);
                    h8cVar.j(b9c.a);
                    h8cVar.e(new ot4(25, chatAdminsScreen));
                    chatAdminsScreen.j = h8cVar.p();
                } else if (krdVar instanceof hrd) {
                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                    hrd hrdVar = (hrd) krdVar;
                    jc4 jc4VarA = mol.a(hrdVar.a, hrdVar.d, null, 4);
                    jc4VarA.g(hrdVar.b);
                    kc4[] kc4VarArr = (kc4[]) hrdVar.c.toArray(new kc4[0]);
                    jc4VarA.a((kc4[]) Arrays.copyOf(kc4VarArr, kc4VarArr.length));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(chatAdminsScreen);
                    confirmationBottomSheetF.setTargetController(chatAdminsScreen);
                    br4 parentController = chatAdminsScreen;
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
                    if (!(krdVar instanceof jrd)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar2 = new h8c(chatAdminsScreen);
                    h8cVar2.h(new w8c(R.drawable.icon_check));
                    h8cVar2.m(((jrd) krdVar).a);
                    h8cVar2.p();
                }
                return sbi.a;
            case 8:
                krd krdVar2 = (krd) obj;
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) this.a;
                zv8[] zv8VarArr6 = ChatMembersCompactWidget.h;
                chatMembersCompactWidget.getClass();
                if (krdVar2 instanceof ird) {
                    h8c h8cVar3 = new h8c(chatMembersCompactWidget);
                    h8cVar3.h(z8c.a);
                    h8cVar3.m(((ird) krdVar2).a);
                    h8cVar3.j(b9c.a);
                    h8cVar3.e(new s63(0, chatMembersCompactWidget));
                    chatMembersCompactWidget.e = h8cVar3.p();
                } else if (krdVar2 instanceof hrd) {
                    zv8[] zv8VarArr7 = BottomSheetWidget.t;
                    hrd hrdVar2 = (hrd) krdVar2;
                    jc4 jc4VarA2 = mol.a(hrdVar2.a, hrdVar2.d, null, 4);
                    jc4VarA2.g(hrdVar2.b);
                    hrdVar2.c.forEach(new o01(2, new t63(1, jc4VarA2, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 0)));
                    ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarA2.f(chatMembersCompactWidget);
                    confirmationBottomSheetF2.setTargetController(chatMembersCompactWidget);
                    br4 parentController2 = chatMembersCompactWidget;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                    hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU2 != null) {
                        lve lveVar2 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU2.I(lveVar2);
                    }
                } else {
                    if (!(krdVar2 instanceof jrd)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar4 = new h8c(chatMembersCompactWidget);
                    h8cVar4.h(new w8c(R.drawable.icon_check));
                    h8cVar4.m(((jrd) krdVar2).a);
                    h8cVar4.p();
                }
                return sbi.a;
            case 9:
                krd krdVar3 = (krd) obj;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.a;
                zv8[] zv8VarArr8 = ChatMembersScreen.k;
                chatMembersScreen.getClass();
                if (krdVar3 instanceof ird) {
                    h8c h8cVar5 = new h8c(chatMembersScreen);
                    h8cVar5.h(z8c.a);
                    h8cVar5.m(((ird) krdVar3).a);
                    h8cVar5.j(b9c.a);
                    h8cVar5.e(new s63(1, chatMembersScreen));
                    chatMembersScreen.j = h8cVar5.p();
                } else if (krdVar3 instanceof hrd) {
                    zv8[] zv8VarArr9 = BottomSheetWidget.t;
                    hrd hrdVar3 = (hrd) krdVar3;
                    jc4 jc4VarA3 = mol.a(hrdVar3.a, hrdVar3.d, null, 4);
                    jc4VarA3.g(hrdVar3.b);
                    kc4[] kc4VarArr2 = (kc4[]) hrdVar3.c.toArray(new kc4[0]);
                    jc4VarA3.a((kc4[]) Arrays.copyOf(kc4VarArr2, kc4VarArr2.length));
                    ConfirmationBottomSheet confirmationBottomSheetF3 = jc4VarA3.f(chatMembersScreen);
                    confirmationBottomSheetF3.setTargetController(chatMembersScreen);
                    br4 parentController3 = chatMembersScreen;
                    while (parentController3.getParentController() != null) {
                        parentController3 = parentController3.getParentController();
                    }
                    RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                    hve hveVarU3 = rootController3 != null ? rootController3.u1() : null;
                    if (hveVarU3 != null) {
                        lve lveVar3 = new lve(confirmationBottomSheetF3, null, null, null, false, -1);
                        p.k(false, lveVar3, true, "BottomSheetWidget");
                        hveVarU3.I(lveVar3);
                    }
                } else {
                    if (!(krdVar3 instanceof jrd)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar6 = new h8c(chatMembersScreen);
                    h8cVar6.h(new w8c(R.drawable.icon_check));
                    h8cVar6.m(((jrd) krdVar3).a);
                    h8cVar6.p();
                }
                return sbi.a;
            case 10:
                dc6 dc6Var = (dc6) obj;
                ChatScreen chatScreen = (ChatScreen) this.a;
                ou7 ou7Var = ChatScreen.L1;
                if (!(dc6Var instanceof cz9)) {
                    chatScreen.getClass();
                } else if (chatScreen.Q1().getVisibility() != 0) {
                    cz9 cz9Var = (cz9) dc6Var;
                    if (cz9Var instanceof wy9) {
                        MessageWriteWidget messageWriteWidgetV1 = chatScreen.V1();
                        if (messageWriteWidgetV1 != null) {
                            messageWriteWidgetV1.t1().i(((wy9) dc6Var).a);
                        }
                    } else if (cz9Var instanceof yy9) {
                        chatScreen.U1().N(4, ((yy9) dc6Var).a == ax8.e ? eha.a : eha.c);
                    } else if (cz9Var instanceof vy9) {
                        MessageWriteWidget messageWriteWidgetV2 = chatScreen.V1();
                        if (messageWriteWidgetV2 != null) {
                            messageWriteWidgetV2.t1().f.dispatchKeyEvent(new KeyEvent(0, 67));
                        }
                    } else if (cz9Var instanceof bz9) {
                        kz9 kz9Var = chatScreen.t1;
                        if (kz9Var != null && kz9Var.j()) {
                            nma.M(chatScreen.U1(), 0, 3);
                        }
                        if (sol.e(chatScreen.d)) {
                            chatScreen.k2().X(new j2f(((bz9) dc6Var).a));
                        } else {
                            xd3 xd3VarK2 = chatScreen.k2();
                            bz9 bz9Var = (bz9) dc6Var;
                            long j2 = bz9Var.a;
                            g4b g4bVar = bz9Var.b;
                            int i7 = bz9Var.c;
                            rt2 rt2Var3 = (rt2) xd3VarK2.G1.a.getValue();
                            if (rt2Var3 == null || !pll.d(rt2Var3, (e5d) xd3VarK2.t.getValue(), xd3VarK2.c.h(), null)) {
                                a8j.x(xd3VarK2.L1, new ic3(j2, g4bVar, i7));
                            } else {
                                xd3VarK2.V1.set(new rc3(j2, g4bVar, i7));
                                xd3VarK2.M(R.id.chat_screen__confirm_send_sticker_positive, R.id.chat_screen__confirm_send_sticker_negative);
                            }
                        }
                    } else if (cz9Var instanceof az9) {
                        xd3 xd3VarK3 = chatScreen.k2();
                        xd3VarK3.u1.B(xd3VarK3, xd3.X1[2], yab.h0(xd3VarK3.b, ((n0c) xd3VarK3.H()).a(), 2, new xb3(xd3VarK3, null, 2)));
                    } else if (!(cz9Var instanceof zy9) && !(cz9Var instanceof xy9)) {
                        ore.o();
                        return null;
                    }
                }
                return sbi.a;
            case 11:
                ChatScreen chatScreen2 = (ChatScreen) this.a;
                ou7 ou7Var2 = ChatScreen.L1;
                chatScreen2.getClass();
                zv8[] zv8VarArr10 = BottomSheetWidget.t;
                AddLinkBottomSheet addLinkBottomSheet = new AddLinkBottomSheet(chatScreen2.d, (jb) obj);
                addLinkBottomSheet.setTargetController(chatScreen2);
                br4 parentController4 = chatScreen2;
                while (parentController4.getParentController() != null) {
                    parentController4 = parentController4.getParentController();
                }
                RootController rootController4 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
                hve hveVarU4 = rootController4 != null ? rootController4.u1() : null;
                if (hveVarU4 != null) {
                    lve lveVar4 = new lve(addLinkBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar4, true, "BottomSheetWidget");
                    hveVarU4.I(lveVar4);
                }
                return sbi.a;
            case 12:
                ((xh4) this.a).d((vp2) obj);
                return sbi.a;
            case 13:
                ((vl4) this.a).f((tjd) obj);
                return sbi.a;
            case 14:
                y26 y26Var = (y26) obj;
                xk2 xk2Var = (xk2) this.a;
                gg1 gg1Var = xk2Var.c;
                if (y26Var == null || y26Var != ((y26) gg1Var.f)) {
                    gg1Var.f = null;
                    if (y26Var != null) {
                        ArrayList arrayList2 = y26Var.a;
                        Rect rect = y26Var.c;
                        if (!rect.isEmpty()) {
                            gg1Var.c = new Rect(rect);
                            gg1Var.a = y26Var.d;
                            List list2 = (List) gg1Var.d;
                            List list3 = (List) gg1Var.e;
                            Iterable iterableF0 = oc9.f0(0, Math.min(list2.size(), arrayList2.size()));
                            if ((iterableF0 instanceof Collection) && ((Collection) iterableF0).isEmpty()) {
                                size = arrayList2.size();
                                size2 = list2.size();
                                listG1 = list2;
                                if (size != size2) {
                                    if (arrayList2.size() < list2.size()) {
                                        listG1 = ww3.N1(list2, arrayList2.size());
                                    } else {
                                        List list4 = list2;
                                        size3 = arrayList2.size() - list2.size();
                                        arrayList = new ArrayList(size3);
                                        for (i = 0; i < size3; i++) {
                                            long j3 = gg1Var.b + 1;
                                            gg1Var.b = j3;
                                            arrayList.add(Long.valueOf(-j3));
                                        }
                                        listG1 = ww3.G1(arrayList, list4);
                                    }
                                }
                            } else {
                                Iterator it = iterableF0.iterator();
                                while (true) {
                                    gj8 gj8Var = (gj8) it;
                                    if (gj8Var.c) {
                                        int iNextInt = gj8Var.nextInt();
                                        lu5 lu5Var = (lu5) ww3.u1(iNextInt, list3);
                                        if (lu5Var != null && (jy8Var = lu5Var.b) != null) {
                                            jy8 jy8Var2 = (jy8) arrayList2.get(iNextInt);
                                            if (jy8Var.c != jy8Var2.c || jy8Var.e.size() > jy8Var2.e.size()) {
                                            }
                                        }
                                        int size4 = arrayList2.size();
                                        ArrayList arrayList3 = new ArrayList(size4);
                                        for (int i8 = 0; i8 < size4; i8++) {
                                            long j4 = gg1Var.b + 1;
                                            gg1Var.b = j4;
                                            arrayList3.add(Long.valueOf(-j4));
                                        }
                                        listG1 = arrayList3;
                                    } else {
                                        size = arrayList2.size();
                                        size2 = list2.size();
                                        listG1 = list2;
                                        if (size != size2) {
                                            if (arrayList2.size() < list2.size()) {
                                                listG1 = ww3.N1(list2, arrayList2.size());
                                            } else {
                                                List list5 = list2;
                                                size3 = arrayList2.size() - list2.size();
                                                arrayList = new ArrayList(size3);
                                                while (i < size3) {
                                                    long j5 = gg1Var.b + 1;
                                                    gg1Var.b = j5;
                                                    arrayList.add(Long.valueOf(-j5));
                                                }
                                                listG1 = ww3.G1(arrayList, list5);
                                            }
                                        }
                                    }
                                }
                            }
                            gg1Var.d = listG1;
                            ArrayList arrayList4 = new ArrayList(yw3.W0(arrayList2, 10));
                            for (Object obj3 : arrayList2) {
                                int i9 = i5 + 1;
                                if (i5 < 0) {
                                    xw3.V0();
                                    throw null;
                                }
                                arrayList4.add(new lu5(((Number) ((List) gg1Var.d).get(i5)).longValue(), (jy8) obj3, (Rect) gg1Var.c));
                                i5 = i9;
                            }
                            gg1Var.e = arrayList4;
                            list = arrayList4;
                        }
                    } else if (!((List) gg1Var.e).isEmpty()) {
                        list = r66.a;
                        gg1Var.d = list;
                        gg1Var.c = new Rect();
                        gg1Var.e = list;
                    }
                } else {
                    gg1Var.f = null;
                }
                if (list != null) {
                    xk2Var.d(list);
                }
                return sbi.a;
            case 15:
                i27 i27Var = (i27) this.a;
                zv8[] zv8VarArr11 = FolderEditScreen.i;
                i27Var.H((List) obj);
                return sbi.a;
            case 16:
                String str3 = (String) obj;
                a69 a69Var = (a69) this.a;
                x59 x59VarA = ((y59) a69Var.e.getValue()).a(str3, true);
                mjg mjgVar2 = a69Var.c;
                u59 u59Var = (u59) mjgVar2.getValue();
                if (x59VarA instanceof v59) {
                    int i10 = z59.$EnumSwitchMapping$0[qt4.D(((v59) x59VarA).a)];
                    if (i10 == 1) {
                        i2 = R.string.add_link_error_not_valid_link;
                    } else if (i10 == 2) {
                        i2 = R.string.add_link_error_short_link;
                    } else if (i10 == 3) {
                        i2 = R.string.add_link_error_has_space;
                    } else {
                        if (i10 != 4) {
                            ore.o();
                            return null;
                        }
                        i2 = R.string.add_link_error_not_valid_scheme;
                    }
                    tnhVar = new tnh(i2);
                } else {
                    tnhVar = ynh.b;
                }
                u59Var.getClass();
                mjgVar2.j(null, new u59(tnhVar, str3));
                return sbi.a;
            case 17:
                dc6 dc6Var2 = (dc6) obj;
                tha thaVar = ((dz9) this.a).b;
                if (dc6Var2 instanceof cz9) {
                    cz9 cz9Var2 = (cz9) dc6Var2;
                    if (cz9Var2 instanceof wy9) {
                        thaVar.i(((wy9) dc6Var2).a);
                    } else if (cz9Var2 instanceof vy9) {
                        thaVar.f.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                }
                return sbi.a;
            case 18:
                iwi iwiVar = (iwi) obj;
                qqa qqaVar = (qqa) this.a;
                if (iwiVar == null) {
                    qqaVar.getClass();
                    ore.o();
                    return null;
                }
                RecyclerView recyclerView = qqaVar.h;
                if (iwiVar.a.equals("messages_video_prefetch_id") && recyclerView != null) {
                    qqaVar.e(recyclerView);
                }
                return sbi.a;
            case 19:
                return a(obj, obj2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ova ovaVar = (ova) this.a;
                zv8[] zv8VarArr12 = MessagesSettingsScreen.p;
                ovaVar.H((List) obj);
                return sbi.a;
            case 21:
                q5b q5bVar = (q5b) obj;
                c6b c6bVar = (c6b) this.a;
                zff zffVar = c6bVar.d;
                RecyclerView recyclerView2 = c6bVar.a;
                boolean z2 = q5bVar.a;
                Set set = q5bVar.b;
                odb odbVar = c6bVar.e;
                if (z2) {
                    if (odbVar == null) {
                        odb odbVar2 = new odb(new z5b(c6bVar, 1), new a6b(c6bVar, 1));
                        recyclerView2.h(odbVar2, -1);
                        c6bVar.e = odbVar2;
                        b65 b65Var = new b65(recyclerView2);
                        recyclerView2.j(b65Var);
                        c6bVar.f = b65Var;
                    }
                    zffVar.c(set.isEmpty() ? recyclerView2.getContext().getString(R.string.oneme_strickers_settings_stickers_multiselect_empty_title) : recyclerView2.getContext().getString(R.string.oneme_strickers_settings_stickers_multiselect_title, Integer.valueOf(set.size())), q5bVar.c, new z5b(c6bVar, 0), new a6b(c6bVar, 0));
                    recyclerView2.X();
                } else {
                    if (odbVar != null) {
                        recyclerView2.o0(odbVar);
                    }
                    c6bVar.e = null;
                    b65 b65Var2 = c6bVar.f;
                    if (b65Var2 != null) {
                        recyclerView2.q0(b65Var2);
                    }
                    c6bVar.f = null;
                    if (zffVar.b()) {
                        zffVar.a();
                    }
                }
                return sbi.a;
            case 22:
                r5b r5bVar = (r5b) obj;
                final d6b d6bVar = (d6b) this.a;
                oqa oqaVar = d6bVar.d;
                RecyclerView recyclerView3 = d6bVar.a;
                boolean zIsEmpty = r5bVar.a.isEmpty();
                tp3 tp3Var = d6bVar.e;
                if (zIsEmpty) {
                    if (tp3Var != null) {
                        recyclerView3.o0(tp3Var);
                    }
                    d6bVar.e = null;
                    b65 b65Var3 = d6bVar.f;
                    if (b65Var3 != null) {
                        recyclerView3.q0(b65Var3);
                    }
                    d6bVar.f = null;
                    y5b y5bVar = new y5b(0, r66.a, s66.a);
                    mjg mjgVar3 = oqaVar.g;
                    mjgVar3.getClass();
                    mjgVar3.j(null, y5bVar);
                    d6bVar.a();
                } else {
                    if (tp3Var == null) {
                        tp3 tp3Var2 = new tp3(new iua(4, d6bVar), new cf7() { // from class: b6b
                            /* JADX WARN: Code duplicated, block: B:50:0x007f  */
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj4) {
                                MessageModel messageModelQ;
                                boolean z3;
                                l1j l1jVarE;
                                k1j k1jVar;
                                int i11;
                                int i12 = i5;
                                boolean zContains = false;
                                d6b d6bVar2 = d6bVar;
                                int iIntValue = ((Integer) obj4).intValue();
                                switch (i12) {
                                    case 0:
                                        if (d6bVar2.b.l() > iIntValue && iIntValue >= 0 && (messageModelQ = d6bVar2.b.Q(iIntValue)) != null) {
                                            zContains = ((r5b) d6bVar2.c.g.a.getValue()).a.contains(Long.valueOf(messageModelQ.a));
                                        }
                                        return Boolean.valueOf(zContains);
                                    case 1:
                                        MessageModel messageModelQ2 = d6bVar2.b.Q(iIntValue);
                                        if (messageModelQ2 != null) {
                                            t50 t50Var = messageModelQ2.j.b;
                                            oxi oxiVar = t50Var instanceof oxi ? (oxi) t50Var : null;
                                            z3 = (messageModelQ2.z || (oxiVar != null && (l1jVarE = oxiVar.e()) != null && (l1jVarE.b > oxiVar.a ? 1 : (l1jVarE.b == oxiVar.a ? 0 : -1)) == 0 && (k1jVar = l1jVarE.f) != k1j.a && k1jVar != k1j.e && k1jVar != k1j.f)) && !messageModelQ2.w() && messageModelQ2.p == null && !messageModelQ2.r();
                                        }
                                        return Boolean.valueOf(z3);
                                    default:
                                        MessageModel messageModelQ3 = d6bVar2.b.Q(iIntValue);
                                        return Boolean.valueOf((messageModelQ3 == null || (i11 = messageModelQ3.F) == 0 || vka.e(i11) || messageModelQ3.r()) ? false : true);
                                }
                            }
                        }, new cf7() { // from class: b6b
                            /* JADX WARN: Code duplicated, block: B:50:0x007f  */
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj4) {
                                MessageModel messageModelQ;
                                boolean z3;
                                l1j l1jVarE;
                                k1j k1jVar;
                                int i11;
                                int i12 = i4;
                                boolean zContains = false;
                                d6b d6bVar2 = d6bVar;
                                int iIntValue = ((Integer) obj4).intValue();
                                switch (i12) {
                                    case 0:
                                        if (d6bVar2.b.l() > iIntValue && iIntValue >= 0 && (messageModelQ = d6bVar2.b.Q(iIntValue)) != null) {
                                            zContains = ((r5b) d6bVar2.c.g.a.getValue()).a.contains(Long.valueOf(messageModelQ.a));
                                        }
                                        return Boolean.valueOf(zContains);
                                    case 1:
                                        MessageModel messageModelQ2 = d6bVar2.b.Q(iIntValue);
                                        if (messageModelQ2 != null) {
                                            t50 t50Var = messageModelQ2.j.b;
                                            oxi oxiVar = t50Var instanceof oxi ? (oxi) t50Var : null;
                                            z3 = (messageModelQ2.z || (oxiVar != null && (l1jVarE = oxiVar.e()) != null && (l1jVarE.b > oxiVar.a ? 1 : (l1jVarE.b == oxiVar.a ? 0 : -1)) == 0 && (k1jVar = l1jVarE.f) != k1j.a && k1jVar != k1j.e && k1jVar != k1j.f)) && !messageModelQ2.w() && messageModelQ2.p == null && !messageModelQ2.r();
                                        }
                                        return Boolean.valueOf(z3);
                                    default:
                                        MessageModel messageModelQ3 = d6bVar2.b.Q(iIntValue);
                                        return Boolean.valueOf((messageModelQ3 == null || (i11 = messageModelQ3.F) == 0 || vka.e(i11) || messageModelQ3.r()) ? false : true);
                                }
                            }
                        }, new cf7() { // from class: b6b
                            /* JADX WARN: Code duplicated, block: B:50:0x007f  */
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj4) {
                                MessageModel messageModelQ;
                                boolean z3;
                                l1j l1jVarE;
                                k1j k1jVar;
                                int i11;
                                int i12 = i3;
                                boolean zContains = false;
                                d6b d6bVar2 = d6bVar;
                                int iIntValue = ((Integer) obj4).intValue();
                                switch (i12) {
                                    case 0:
                                        if (d6bVar2.b.l() > iIntValue && iIntValue >= 0 && (messageModelQ = d6bVar2.b.Q(iIntValue)) != null) {
                                            zContains = ((r5b) d6bVar2.c.g.a.getValue()).a.contains(Long.valueOf(messageModelQ.a));
                                        }
                                        return Boolean.valueOf(zContains);
                                    case 1:
                                        MessageModel messageModelQ2 = d6bVar2.b.Q(iIntValue);
                                        if (messageModelQ2 != null) {
                                            t50 t50Var = messageModelQ2.j.b;
                                            oxi oxiVar = t50Var instanceof oxi ? (oxi) t50Var : null;
                                            z3 = (messageModelQ2.z || (oxiVar != null && (l1jVarE = oxiVar.e()) != null && (l1jVarE.b > oxiVar.a ? 1 : (l1jVarE.b == oxiVar.a ? 0 : -1)) == 0 && (k1jVar = l1jVarE.f) != k1j.a && k1jVar != k1j.e && k1jVar != k1j.f)) && !messageModelQ2.w() && messageModelQ2.p == null && !messageModelQ2.r();
                                        }
                                        return Boolean.valueOf(z3);
                                    default:
                                        MessageModel messageModelQ3 = d6bVar2.b.Q(iIntValue);
                                        return Boolean.valueOf((messageModelQ3 == null || (i11 = messageModelQ3.F) == 0 || vka.e(i11) || messageModelQ3.r()) ? false : true);
                                }
                            }
                        });
                        recyclerView3.h(tp3Var2, -1);
                        d6bVar.e = tp3Var2;
                        b65 b65Var4 = new b65(recyclerView3);
                        recyclerView3.j(b65Var4);
                        d6bVar.f = b65Var4;
                        d6bVar.a();
                    }
                    y5b y5bVar2 = new y5b(r5bVar.a.size(), r5bVar.b, r5bVar.c);
                    mjg mjgVar4 = oqaVar.g;
                    mjgVar4.getClass();
                    mjgVar4.j(null, y5bVar2);
                    recyclerView3.X();
                }
                return sbi.a;
            case 23:
                rt2 rt2Var4 = (rt2) obj;
                mjg mjgVar5 = ((zpc) this.a).b;
                if (!rt2Var4.d0() || rt2Var4.b.r0 <= 0) {
                    cqc cqcVar = cqc.a;
                    mjgVar5.getClass();
                    mjgVar5.j(null, cqcVar);
                } else {
                    bqc bqcVar = new bqc(new tnh(R.string.pinbars_pending_join_requests_title));
                    mjgVar5.getClass();
                    mjgVar5.j(null, bqcVar);
                }
                return sbi.a;
            case 24:
                String str4 = (String) obj;
                dyc dycVar = (dyc) this.a;
                zv8[] zv8VarArr13 = PickerChatsListWidget.x;
                if (str4 != null) {
                    dycVar.getClass();
                    if (r5h.X0(str4)) {
                        dycVar.v.setValue(null);
                    } else {
                        dycVar.p.B(dycVar, dyc.D[0], yab.h0(dycVar.b, ((n0c) dycVar.j).b(), 2, new voc(dycVar, str4, (lq4) null, 4)));
                    }
                } else {
                    dycVar.v.setValue(null);
                }
                return sbi.a;
            case 25:
                String str5 = (String) obj;
                vyc vycVar = (vyc) this.a;
                zv8[] zv8VarArr14 = PickerContactsListWidget.q;
                vycVar.getClass();
                p3c p3cVar = vycVar.g;
                if (str5 == null || str5.length() == 0) {
                    p3cVar.B(vycVar, vyc.h[0], null);
                    vycVar.e.b();
                } else {
                    p3cVar.B(vycVar, vyc.h[0], a8j.t(vycVar, null, new qz9(vycVar, str5, null, 21), 1));
                }
                return sbi.a;
            case 26:
                String str6 = (String) obj;
                czc czcVar = (czc) this.a;
                zv8[] zv8VarArr15 = PickerMembersListWidget.p;
                czcVar.getClass();
                p3c p3cVar2 = czcVar.k;
                if (str6 == null || str6.length() == 0) {
                    p3cVar2.B(czcVar, czc.l[0], null);
                    czcVar.j.setValue(null);
                } else {
                    p3cVar2.B(czcVar, czc.l[0], a8j.t(czcVar, null, new awa(czcVar, str6, (lq4) null, 28), 1));
                }
                return sbi.a;
            case 27:
                wpd wpdVar = (wpd) this.a;
                zv8[] zv8VarArr16 = ProfileInviteScreen.g;
                wpdVar.H((List) obj);
                return sbi.a;
            case 28:
                wv4 wv4Var = (wv4) obj;
                dqd dqdVar = (dqd) this.a;
                pzf pzfVar = dqdVar.A;
                if (cqk.d(wv4Var, tv4.a)) {
                    a8j.x(dqdVar.z, new qpd(R.drawable.icon_warning, new tnh(R.string.join_request_update_error)));
                } else if (dqdVar.v.compareAndSet(false, true) && (rt2VarC = dqdVar.C()) != null) {
                    dqdVar.B(rt2VarC);
                    if (cqk.d(wv4Var, uv4.a)) {
                        pzfVar.a(new opd(new tnh(R.string.profile_invite_create_link_error_title), new tnh(R.string.profile_invite_create_link_error_no_connection), Collections.singletonList(new kc4(R.id.profile_invite_create_link_error_confirm, new tnh(R.string.profile_invite_create_link_error_confirm), 3, 56))));
                    } else if (cqk.d(wv4Var, vv4.a)) {
                        pzfVar.a(new opd(new tnh(R.string.profile_invite_create_link_error_title), new tnh(R.string.profile_invite_create_link_error_service_unavailable), Collections.singletonList(new kc4(R.id.profile_invite_create_link_error_confirm, new tnh(R.string.profile_invite_create_link_error_confirm), 3, 56))));
                    }
                }
                return sbi.a;
            default:
                ((lrd) this.a).H((List) obj);
                return sbi.a;
        }
    }
}
