package one.me.messages.list.ui;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4c;
import defpackage.a8e;
import defpackage.a8j;
import defpackage.aq6;
import defpackage.ata;
import defpackage.ava;
import defpackage.b7e;
import defpackage.bdc;
import defpackage.br4;
import defpackage.bra;
import defpackage.bta;
import defpackage.bw7;
import defpackage.bxd;
import defpackage.c03;
import defpackage.c2a;
import defpackage.c3;
import defpackage.c61;
import defpackage.c7k;
import defpackage.c8e;
import defpackage.ca2;
import defpackage.ch8;
import defpackage.cqk;
import defpackage.cta;
import defpackage.d6b;
import defpackage.d97;
import defpackage.dj9;
import defpackage.dk2;
import defpackage.dta;
import defpackage.due;
import defpackage.dwd;
import defpackage.e1i;
import defpackage.e4j;
import defpackage.e5d;
import defpackage.e6e;
import defpackage.e93;
import defpackage.e9i;
import defpackage.edi;
import defpackage.et3;
import defpackage.fqc;
import defpackage.ft0;
import defpackage.fva;
import defpackage.fy0;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.g19;
import defpackage.g61;
import defpackage.g8c;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.gta;
import defpackage.h;
import defpackage.h1i;
import defpackage.h4b;
import defpackage.h4c;
import defpackage.h7e;
import defpackage.h8c;
import defpackage.h8d;
import defpackage.ha9;
import defpackage.hi4;
import defpackage.hqc;
import defpackage.hr4;
import defpackage.hs2;
import defpackage.hta;
import defpackage.hva;
import defpackage.i1m;
import defpackage.iea;
import defpackage.ifh;
import defpackage.il1;
import defpackage.it3;
import defpackage.j3;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.jed;
import defpackage.jfa;
import defpackage.jqa;
import defpackage.jsa;
import defpackage.jz;
import defpackage.k96;
import defpackage.ka0;
import defpackage.kb0;
import defpackage.kqa;
import defpackage.lfe;
import defpackage.lq4;
import defpackage.lsa;
import defpackage.m6f;
import defpackage.m76;
import defpackage.mc4;
import defpackage.mqa;
import defpackage.msa;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n3g;
import defpackage.n5f;
import defpackage.nc1;
import defpackage.np0;
import defpackage.np4;
import defpackage.ns5;
import defpackage.nsa;
import defpackage.nx2;
import defpackage.ny8;
import defpackage.o1c;
import defpackage.o24;
import defpackage.o8c;
import defpackage.ol0;
import defpackage.oqa;
import defpackage.ore;
import defpackage.osa;
import defpackage.ow0;
import defpackage.owh;
import defpackage.p3c;
import defpackage.pti;
import defpackage.q24;
import defpackage.q2f;
import defpackage.qp4;
import defpackage.qpa;
import defpackage.qqa;
import defpackage.qrc;
import defpackage.qsa;
import defpackage.qt4;
import defpackage.qyj;
import defpackage.r66;
import defpackage.r8e;
import defpackage.rea;
import defpackage.rsa;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.sdg;
import defpackage.seh;
import defpackage.sgg;
import defpackage.sol;
import defpackage.svj;
import defpackage.t20;
import defpackage.t3f;
import defpackage.t59;
import defpackage.tda;
import defpackage.tnh;
import defpackage.tre;
import defpackage.tsa;
import defpackage.u3d;
import defpackage.uea;
import defpackage.ur8;
import defpackage.usa;
import defpackage.uw8;
import defpackage.v22;
import defpackage.v8d;
import defpackage.vee;
import defpackage.vp4;
import defpackage.vsa;
import defpackage.vv;
import defpackage.w5f;
import defpackage.w8;
import defpackage.w8c;
import defpackage.w93;
import defpackage.w95;
import defpackage.wlf;
import defpackage.wme;
import defpackage.wsa;
import defpackage.wsc;
import defpackage.wx6;
import defpackage.wz6;
import defpackage.wzj;
import defpackage.x53;
import defpackage.x5b;
import defpackage.x6e;
import defpackage.xb9;
import defpackage.xc3;
import defpackage.xhh;
import defpackage.xp9;
import defpackage.xpa;
import defpackage.xu1;
import defpackage.y1m;
import defpackage.y5h;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ysa;
import defpackage.ysc;
import defpackage.yvg;
import defpackage.z8b;
import defpackage.zci;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zsa;
import defpackage.zv8;
import defpackage.zw9;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u001d\u001e\u001f !\"#$B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0087\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u0007\u0010\u001c¨\u0006%"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lvp4;", "Lq2f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScope", "Lha9;", "localAccountId", "", ApiProtocol.PARAM_CHAT_ID, "Lq24;", "commentsId", "parentChatLocalId", "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "pushLink", "isChatPreview", "(Lt3f;Lha9;JLq24;Ljava/lang/Long;JLjava/util/List;JZZLjava/lang/String;Z)V", "usa", "tsa", "vsa", "wsa", "v22", "ssa", "xsa", "one/me/chatscreen/ChatScreen", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessagesListWidget extends Widget implements mc4, vp4, q2f {
    public static final /* synthetic */ zv8[] T1 = {new dwd(MessagesListWidget.class, "parentScope", "getParentScope()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.e(zfe.a, MessagesListWidget.class, "selectedMessageIdsForAction", "getSelectedMessageIdsForAction()[J"), new z8b(MessagesListWidget.class, "currentReadMark", "getCurrentReadMark()J"), new z8b(MessagesListWidget.class, "isLastMsgCompletelyVisibleOnDetach", "isLastMsgCompletelyVisibleOnDetach()Z"), new z8b(MessagesListWidget.class, "shouldSkipUnreadDecoration", "getShouldSkipUnreadDecoration()Z"), new z8b(MessagesListWidget.class, "readByCollectJob", "getReadByCollectJob()Lkotlinx/coroutines/Job;"), new dwd(MessagesListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(MessagesListWidget.class, "messagesListRecyclerViewAnalyticsListener", "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;", 0), new dwd(MessagesListWidget.class, "prefetchReactionsScrollListener", "getPrefetchReactionsScrollListener()Lone/me/sdk/lists/scroll/PrefetchScroller;", 0), new dwd(MessagesListWidget.class, "prefetchCommentsScrollListener", "getPrefetchCommentsScrollListener()Lone/me/sdk/lists/scroll/PrefetchScroller;", 0), new dwd(MessagesListWidget.class, "prefetchPollUpdatesScrollListener", "getPrefetchPollUpdatesScrollListener()Lone/me/sdk/lists/scroll/PrefetchScroller;", 0), new dwd(MessagesListWidget.class, "prefetchMediaAutoSaveScrollListener", "getPrefetchMediaAutoSaveScrollListener()Lone/me/sdk/lists/scroll/PrefetchScroller;", 0), new dwd(MessagesListWidget.class, "messagesScroller", "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;", 0), new dwd(MessagesListWidget.class, "emptyStateContainer", "getEmptyStateContainer()Landroid/widget/ScrollView;", 0), new dwd(MessagesListWidget.class, "reactionEffectsView", "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0)};
    public final ny8 A;
    public final v22 A1;
    public final ny8 B;
    public final tsa B1;
    public final ny8 C;
    public final wme C1;
    public final bw7 D;
    public final ifh D1;
    public seh E;
    public final ifh E1;
    public gta F;
    public final ifh F1;
    public g8c G;
    public final ny8 G1;
    public final qpa H;
    public final ny8 H1;
    public final ny8 I;
    public final ny8 I1;
    public m6f J;
    public final ny8 J1;
    public final PointF K;
    public MessagesLayoutManager K1;
    public final ow0 L1;
    public final j8e M1;
    public final j8e N1;
    public m76 O1;
    public b7e P1;
    public final ifh Q1;
    public mvh R1;
    public g8c S1;
    public final j8e X;
    public zci Y;
    public xp9 Z;
    public final String a;
    public final t3f b;
    public final vv c;
    public final h d;
    public final vv e;
    public final vv f;
    public final vv g;
    public final vv h;
    public final ny8 i;
    public final u3d j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public zpg n1;
    public qp4 o;
    public x6e o1;
    public tda p;
    public mvh p1;
    public final p3c q;
    public dj9 q1;
    public final ny8 r;
    public final ow0 r1;
    public final ny8 s;
    public final ny8 s1;
    public final ny8 t;
    public final ow0 t1;
    public final ca2 u;
    public final ow0 u1;
    public final ny8 v;
    public final ow0 v1;
    public final c7k w;
    public final ow0 w1;
    public final ny8 x;
    public final usa x1;
    public final ny8 y;
    public final vsa y1;
    public final ny8 z;
    public final wsa z1;

    public MessagesListWidget(Bundle bundle) {
        super(bundle);
        this.a = MessagesListWidget.class.getName();
        this.b = new t3f("MessagesList", super.getB().b());
        this.c = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.e = new vv(long[].class, null, "selected.messageIds.Action");
        this.f = new vv(Long.class, 0L, "messages:current.read.mark");
        Boolean bool = Boolean.FALSE;
        this.g = new vv(Boolean.class, bool, "is.last.message.completely.visible.on.detach");
        this.h = new vv(Boolean.class, bool, "ARG_SKIP_UNREAD_DECOR");
        this.i = getSharedViewModel(w1(), oqa.class, null);
        this.j = (u3d) hVar.getAccessor().c(878);
        this.k = hVar.getAccessor().d(97);
        this.l = hVar.getAccessor().d(85);
        this.m = hVar.getAccessor().d(54);
        this.n = hVar.getAccessor().d(26);
        this.q = qyj.S();
        this.r = ysc.a.a();
        this.s = hVar.getAccessor().d(18);
        this.t = hVar.getAccessor().d(20);
        this.u = new ca2(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(c8e.class, new ch8(29, new nsa(bundle, this, 4)));
        this.w = new c7k(28);
        this.x = createViewModelLazy(jsa.class, new hta(0, new nsa(bundle, this, 0)));
        this.y = createViewModelLazy(h8d.class, new hta(1, new msa(this, 7)));
        this.z = hVar.getAccessor().d(94);
        this.A = rx8.P(3, new msa(this, 8));
        this.B = hVar.getAccessor().d(239);
        this.C = hVar.getAccessor().d(247);
        bw7 bw7Var = new bw7(hVar.getAccessor().d(133));
        this.D = bw7Var;
        ExecutorService executorServiceA = hVar.getExecutors().a();
        fz7 fz7Var = new fz7(1, F1(), jsa.class, "onAttachClickAction", "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V", 0, 10);
        due dueVar = new due(this);
        ft0 ft0Var = new ft0(this);
        this.H = new qpa(executorServiceA, new ata(this), fz7Var, bw7Var, dueVar, ft0Var, new dk2(2, this), new osa(this, 0), new msa(this, 9), new msa(this, 10), new msa(this, 11), new msa(this, 12), new lsa(this, 1), hVar.getAccessor().d(54), hVar.getAccessor().d(922), x1());
        this.I = rx8.P(3, new msa(this, 17));
        this.K = new PointF();
        this.X = viewBinding(R.id.messages_list_recycler_view);
        this.r1 = binding(new msa(this, 20));
        this.s1 = rx8.P(3, new msa(this, 24));
        this.t1 = binding(new msa(this, 25));
        this.u1 = binding(new msa(this, 26));
        this.v1 = binding(new msa(this, 27));
        this.w1 = binding(new msa(this, 28));
        this.x1 = new usa(this, new ifh(new msa(this, 0)));
        this.y1 = new vsa(this);
        this.z1 = new wsa(this);
        this.A1 = new v22(6, this);
        this.B1 = new tsa(this);
        this.C1 = new wme(new msa(this, 1));
        this.D1 = new ifh(new msa(this, 2));
        this.E1 = new ifh(new msa(this, 3));
        this.F1 = new ifh(new msa(this, 4));
        this.G1 = hVar.getAccessor().d(318);
        this.H1 = rx8.P(3, new nsa(this, bundle));
        this.I1 = rx8.P(3, new nsa(bundle, this, 2));
        this.J1 = rx8.P(3, new nsa(bundle, this, 3));
        this.L1 = binding(new msa(this, 5));
        this.M1 = viewBinding(R.id.messages_list_empty_state_container);
        this.N1 = viewBinding(R.id.messages_list_reactions_effect_view);
        this.Q1 = new ifh(new msa(this, 6));
        e9i.j0(new j3(new fz6(F1().A2, new qsa(this, null), 3), 14, new rsa(0, null, this)), getLifecycleScope());
    }

    public static void G1(MessagesListWidget messagesListWidget, String str, t59 t59Var, Long l, hi4 hi4Var, int i) {
        hi4 hi4Var2 = hi4Var;
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            hi4Var2 = null;
        }
        if (l != null && messagesListWidget.F1().c0().h()) {
            messagesListWidget.F1().c0().i(l.longValue());
            return;
        }
        int iOrdinal = t59Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                a8j.x(messagesListWidget.E1().j, new kqa(str, ((h4b) messagesListWidget.s.getValue()).J(2)));
                return;
            } else if (iOrdinal == 4) {
                messagesListWidget.F1().k0(str);
                return;
            } else if (iOrdinal != 6) {
                return;
            }
        }
        if (l != null) {
            jsa jsaVarF1 = messagesListWidget.F1();
            yab.i0(jsaVarF1.b, ((n0c) jsaVarF1.j).b(), 0, new zw9(l.longValue(), jsaVarF1, str, (lq4) null, 9), 2);
        } else {
            jsa jsaVarF2 = messagesListWidget.F1();
            yab.i0(jsaVarF2.b, ((n0c) jsaVarF2.j).b(), 0, new d97(jsaVarF2, str, hi4Var2 != null ? hi4Var2.c : null, null, 13), 2);
        }
    }

    public static final ScrollView o1(MessagesListWidget messagesListWidget) {
        return (ScrollView) messagesListWidget.M1.m(messagesListWidget, T1[13]);
    }

    public static final void p1(MessagesListWidget messagesListWidget, long j) {
        if (((Boolean) messagesListWidget.F1().I2.getValue()).booleanValue()) {
            return;
        }
        messagesListWidget.H1();
        jsa jsaVarF1 = messagesListWidget.F1();
        rt2 rt2Var = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var == null) {
            gm0.x(jsaVarF1.v, "Can't check isForwardDisabled for multiselect because chat is null", null);
            jsaVarF1.c0().i(j);
            return;
        }
        boolean zK0 = rt2Var.k0((e5d) jsaVarF1.u.getValue());
        if (rt2Var.d0() && !rt2Var.B0() && zK0) {
            a8j.x(jsaVarF1.E2, new n3g(new tnh(R.string.messages_list_multiselect_disabled), Integer.valueOf(R.drawable.icon_warning_fill), null, 4));
        } else {
            jsaVarF1.c0().i(j);
        }
    }

    public final jed A1() {
        zv8 zv8Var = T1[10];
        return (jed) this.v1.getValue();
    }

    public final jed B1() {
        zv8 zv8Var = T1[8];
        return (jed) this.t1.getValue();
    }

    public final c8e C1() {
        return (c8e) this.v.getValue();
    }

    public final k96 D1() {
        return (k96) this.X.m(this, T1[6]);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        MessageModel messageModelR;
        MessageModel messageModelR2;
        int i2;
        int i3;
        int i4;
        tnh tnhVar;
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("messages:context_menu:message_id")) : null;
        if (lValueOf == null) {
            zv8[] zv8VarArr = T1;
            zv8 zv8Var = zv8VarArr[1];
            vv vvVar = this.e;
            long[] jArr = (long[]) vvVar.a(this);
            if (jArr != null) {
                zv8 zv8Var2 = zv8VarArr[1];
                vvVar.b(this, null);
                if (i == R.id.messages_list_context_action_reply) {
                    H1();
                    a8j.x(E1().j, new mqa(a.Z0(jArr)));
                    return;
                }
                if (i == R.id.messages_list_context_action_select || i == R.id.messages_list_context_action_edit) {
                    H1();
                }
                jsa jsaVarF1 = F1();
                long jZ0 = a.Z0(jArr);
                if (jZ0 == -9223372036854775805L) {
                    a8j.t(jsaVarF1, ((n0c) jsaVarF1.j).a(), new w93(jsaVarF1, i, (lq4) null, 8), 2);
                    return;
                } else {
                    jsaVarF1.getClass();
                    jsaVarF1.v0(i, Collections.singletonList(Long.valueOf(jZ0)));
                    return;
                }
            }
            return;
        }
        String string = bundle.getString("messages:context_menu:link_url");
        if (string == null) {
            return;
        }
        int i5 = 3;
        if (i != R.id.link_context_menu_action_copy_link) {
            if (i != R.id.link_context_menu_action_open_link) {
                if (i == R.id.link_context_menu_action_open_profile) {
                    F1().k0(string);
                    return;
                }
                return;
            }
            jsa jsaVarF2 = F1();
            yab.i0(jsaVarF2.b, ((n0c) jsaVarF2.j).b(), 0, new zw9(lValueOf.longValue(), jsaVarF2, string, (lq4) null, 9), 2);
            sdg sdgVarT = F1().T();
            long jLongValue = lValueOf.longValue();
            if (sdgVarT == null || (messageModelR = F1().R(jLongValue)) == null) {
                return;
            }
            long j = messageModelR.b;
            if (!y1m.b(string)) {
                i5 = y1m.c(string) ? 2 : 1;
            }
            int iD = qt4.D(i5);
            if (iD == 0) {
                u1().a(j, 1, sdgVarT, 3);
                return;
            }
            if (iD == 1) {
                u1().a(j, 3, sdgVarT, 5);
                return;
            } else if (iD == 2) {
                u1().a(j, 2, sdgVarT, 4);
                return;
            } else {
                ore.o();
                return;
            }
        }
        it3.a(getContext(), y1m.a(string));
        if (it3.b()) {
            if (y1m.b(string)) {
                i4 = 3;
            } else {
                i4 = y1m.c(string) ? 2 : 1;
            }
            int iD2 = qt4.D(i4);
            if (iD2 == 0) {
                tnhVar = new tnh(R.string.link_copied);
            } else if (iD2 == 1) {
                tnhVar = new tnh(R.string.phone_copied);
            } else {
                if (iD2 != 2) {
                    ore.o();
                    return;
                }
                tnhVar = new tnh(R.string.mail_copied);
            }
            h8c h8cVar = new h8c(this);
            h8cVar.m(tnhVar);
            h8cVar.h(new w8c(R.drawable.icon_check));
            h8cVar.c(new o8c(0, 0, r1(), 11));
            h8cVar.p();
        }
        sdg sdgVarT2 = F1().T();
        long jLongValue2 = lValueOf.longValue();
        if (sdgVarT2 == null || (messageModelR2 = F1().R(jLongValue2)) == null) {
            return;
        }
        long j2 = messageModelR2.b;
        uea ueaVarU1 = u1();
        if (y1m.b(string)) {
            i2 = 3;
        } else {
            i2 = y1m.c(string) ? 2 : 1;
        }
        int iD3 = qt4.D(i2);
        if (iD3 == 0) {
            i3 = 1;
        } else if (iD3 == 1) {
            i3 = 3;
        } else {
            if (iD3 != 2) {
                ore.o();
                return;
            }
            i3 = 2;
        }
        ueaVarU1.a(j2, i3, sdgVarT2, 2);
    }

    public final oqa E1() {
        return (oqa) this.i.getValue();
    }

    public final jsa F1() {
        return (jsa) this.x.getValue();
    }

    public final void H1() {
        if (((Boolean) E1().d.a.getValue()).booleanValue()) {
            a8j.x(E1().j, jqa.a);
        }
    }

    public final void I1() {
        mvh mvhVar = this.p1;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        this.p1 = null;
        mvh mvhVar2 = this.R1;
        if (mvhVar2 != null) {
            mvhVar2.dismiss();
        }
    }

    public final void J1(long j, List list) {
        View contentView$message_list;
        x6e x6eVar = this.o1;
        if (x6eVar != null) {
            v22 v22Var = x6eVar.k;
            Rect rect = x6eVar.j;
            RecyclerView recyclerView = x6eVar.a;
            lfe lfeVarL = recyclerView.L(j);
            if (lfeVarL == null) {
                gm0.Y(x6e.class.getName(), "not find viewholder for messageId " + j);
                return;
            }
            View view = lfeVarL.a;
            iea ieaVar = view instanceof iea ? (iea) view : null;
            if (ieaVar != null && (contentView$message_list = ieaVar.getContentView$message_list()) != null) {
                view = contentView$message_list;
            }
            if (!recyclerView.getGlobalVisibleRect(rect)) {
                gm0.Y(x6e.class.getName(), "empty recycler rect when try to show reactions popup picker");
                return;
            }
            h7e h7eVar = new h7e(recyclerView.getContext(), x6eVar.f);
            h7eVar.i = Long.valueOf(j);
            h7eVar.e = view;
            view.getLocationOnScreen(h7eVar.f);
            h7eVar.d = new Rect(rect);
            h7eVar.b(list, null);
            h7eVar.l = new i1m(x6eVar);
            h7eVar.setOnDismissListener(new nc1(6, h7eVar));
            h7eVar.c(0);
            recyclerView.r0(v22Var);
            recyclerView.k(v22Var);
            x6eVar.i = h7eVar;
        }
    }

    public final void K1(n3g n3gVar) {
        CharSequence charSequenceB = n3gVar.a.b(getContext());
        if (charSequenceB == null) {
            return;
        }
        g8c g8cVar = this.G;
        if (g8cVar != null) {
            g8cVar.a();
        }
        h8c h8cVar = new h8c(this);
        h8cVar.n(charSequenceB);
        h8cVar.a(n3gVar.c);
        Integer num = n3gVar.b;
        if (num != null) {
            h8cVar.h(new w8c(num.intValue()));
        }
        h8cVar.c(new o8c(0, 0, r1(), 11));
        this.G = h8cVar.p();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        long[] longArray;
        if (((xu1) this.A.getValue()).g(i) || bundle == null || (longArray = bundle.getLongArray("selected.messageIds.Action")) == null) {
            return;
        }
        if (i == R.id.messages_list_confirm_generic_delete) {
            F1().Q(a.m1(longArray), !bundle.getBoolean("option_row_checked", true));
            return;
        }
        if (i != R.id.messages_list_share_contact_for_bot_action) {
            F1().v0(i, a.m1(longArray));
            return;
        }
        Long lValueOf = longArray.length == 0 ? null : Long.valueOf(longArray[0]);
        String string = bundle.getString("bot.shareContact.confirm.keyboardId");
        c61 c61Var = (c61) tre.g0(bundle, "bot.shareContact.confirm.button", c61.class);
        g61 g61Var = (g61) tre.g0(bundle, "bot.shareContact.confirm.buttonPosition", g61.class);
        jsa jsaVarF1 = F1();
        jsaVarF1.getClass();
        if (lValueOf == null || string == null || c61Var == null || g61Var == null) {
            gm0.Y(jsa.class.getName(), "Early return in onBotContactRequestConfirm cuz of TODO");
        } else {
            jsaVarF1.n2.B(jsaVarF1, jsa.Z2[4], yab.h0(jsaVarF1.b, ((n0c) jsaVarF1.j).b(), 2, new t20(jsaVarF1, lValueOf, string, g61Var, c61Var, null, 23)));
        }
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        jsa jsaVarF1 = F1();
        ((wzj) jsaVarF1.q1.getValue()).c(new wlf(jsaVarF1.c.a, j, true, j2));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00d2  */
    @Override // defpackage.br4
    public final void onAttach(View view) {
        boolean z;
        gm0.n(np4.t(this), "lifecycle: onAttach");
        k96 k96VarD1 = D1();
        m6f m6fVar = new m6f(new lsa(this, 0));
        m6fVar.a(k96VarD1);
        this.J = m6fVar;
        a8e a8eVarB = C1().B();
        a8eVarB.getClass();
        gm0.n("sdk:ReactionsViewModel", "runChatSubscribeNotifObserving");
        yab.i0(a8eVarB.b, ((w95) a8eVarB.e.getValue()).a, 0, new ur8(a8eVarB, null, 25), 2);
        if (!sol.e(w1())) {
            B1().d();
            if (F1().p0()) {
                y1().d();
            }
            A1().d();
            if (((Boolean) x1().k().i()).booleanValue() && !((xb9) t1()).U().a.isEmpty()) {
                z1().d();
            }
        }
        ka0 ka0Var = this.j.b;
        ka0Var.h = true;
        ka0Var.g();
        jsa jsaVarF1 = F1();
        vv vvVar = this.g;
        zv8[] zv8VarArr = T1;
        zv8 zv8Var = zv8VarArr[3];
        if (((Boolean) vvVar.a(this)).booleanValue()) {
            vv vvVar2 = this.h;
            zv8 zv8Var2 = zv8VarArr[4];
            z = ((Boolean) vvVar2.a(this)).booleanValue() ? false : true;
        }
        MessageModel messageModelP = this.H.P();
        je9 je9Var = je9.d;
        rt2 rt2Var = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var == null) {
            String str = jsaVarF1.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "can't restartPollScheduling cuz chat is null", null);
            }
        } else {
            yab.i0(jsaVarF1.b, jsaVarF1.S2, 0, new wz6(jsaVarF1, rt2Var, (lq4) null, 16), 2);
        }
        rt2 rt2Var2 = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var2 == null) {
            String str2 = jsaVarF1.v;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "can't restartCommentsViewportPolling cuz chat is null", null);
            }
        } else if (jsaVarF1.p0()) {
            yab.i0(jsaVarF1.b, jsaVarF1.T2, 0, new d97(jsaVarF1, rt2Var2, (lq4) null, 14), 2);
        }
        jsaVarF1.i0().b(false, new il1(jsaVarF1, z, messageModelP));
        F1().Q2 = r1();
        k96 k96VarD2 = D1();
        bdc.a(k96VarD2, new bta(k96VarD2, this, 0));
        k96 k96VarD3 = D1();
        if (k96VarD3.getScrollState() == 0) {
            q1().h(k96VarD3, false);
        }
        qqa qqaVar = (qqa) this.H1.getValue();
        if (qqaVar != null) {
            qqaVar.d(D1());
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var.a || hr4Var.b || getView() == null) {
            return;
        }
        int iV = tre.V(D1(), 0.3f);
        Integer numValueOf = Integer.valueOf(iV);
        if (iV == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            MessageModel messageModelQ = this.H.Q(numValueOf.intValue());
            if (messageModelQ != null) {
                F1().t0(messageModelQ);
            }
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lsa lsaVar = new lsa(this, 2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lsaVar.invoke(frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        g8c g8cVar = this.S1;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.S1 = null;
        hqc hqcVar = (hqc) F1().X2.getValue();
        yab.i0(hqcVar.a, hqcVar.b, 0, new fqc(hqcVar, null, null, 1), 2);
        c2a c2aVar = (c2a) this.G1.getValue();
        pti ptiVarQ1 = q1();
        h4c h4cVar = (h4c) c2aVar;
        if (ptiVarQ1 != null) {
            h4cVar.g.remove(ptiVarQ1);
        } else {
            h4cVar.getClass();
        }
        b7e b7eVar = this.P1;
        if (b7eVar != null) {
            b7eVar.f.clear();
            b7eVar.e.clear();
            b7eVar.b.b();
        }
        this.P1 = null;
        this.O1 = null;
        x6e x6eVar = this.o1;
        if (x6eVar != null) {
            x6eVar.b();
        }
        this.o1 = null;
        bw7 bw7Var = this.D;
        bw7Var.c = false;
        bw7Var.d = null;
        bw7Var.b.clear();
        C1().B().C();
        seh sehVar = this.E;
        if (sehVar == null) {
            sehVar = null;
        }
        ny8 ny8Var = sehVar.u;
        if (ny8Var.d()) {
            ((fy0) sehVar.l.getValue()).d(ny8Var.getValue());
        }
        try {
            D1().E0();
            gta gtaVar = this.F;
            if (gtaVar != null) {
                gtaVar.i(null);
            }
        } catch (IllegalStateException e) {
            gm0.V(this.a, "Can't detach recycler from item touch helper", e);
        }
        this.F = null;
        k96 k96VarD1 = D1();
        zv8 zv8Var = T1[7];
        k96VarD1.p0((xpa) this.r1.getValue());
        k96VarD1.q0((zsa) this.s1.getValue());
        MessagesLayoutManager messagesLayoutManager = this.K1;
        if (messagesLayoutManager != null) {
            messagesLayoutManager.M.b();
        }
        k96VarD1.setPager(null);
        k96VarD1.setDelegate(null);
        this.K1 = null;
        this.K.set(0.0f, 0.0f);
        wx6 wx6Var = (wx6) this.I.getValue();
        wx6Var.h = false;
        wx6Var.i = null;
        this.C1.a();
        this.Y = null;
        this.n1 = null;
        this.Z = null;
        this.G = null;
        qp4 qp4Var = this.o;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.o = null;
        F1().K2.set(0L);
        I1();
        h1i h1iVar = (h1i) this.Q1.getValue();
        if (h1iVar != null) {
            D1().r0(h1iVar.d);
            h1iVar.c = null;
        }
        this.R1 = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) throws IllegalAccessException, InvocationTargetException {
        MessageModel messageModelQ;
        nx2 nx2Var;
        gm0.n(np4.t(this), "lifecycle: onDetach");
        qpa qpaVar = this.H;
        int iL = qpaVar.l();
        final int top = 0;
        if (iL != 0) {
            MessagesLayoutManager messagesLayoutManager = this.K1;
            if (messagesLayoutManager == null) {
                gm0.x(this.a, "Can't backup cur pos because LM is null", null);
            } else if (messagesLayoutManager.Z0() == iL - 1) {
                F1().B0(0, 0L);
            } else {
                int iX0 = messagesLayoutManager.X0();
                if (iX0 != -1) {
                    View viewR = messagesLayoutManager.r(iX0);
                    int top2 = viewR != null ? viewR.getTop() : 0;
                    MessageModel messageModelQ2 = qpaVar.Q(iX0);
                    long j = messageModelQ2 != null ? messageModelQ2.c : 0L;
                    if (j == 0 && top2 == 0) {
                        top2 = 1;
                    }
                    F1().B0(top2, j);
                }
            }
        }
        vv vvVar = this.h;
        zv8[] zv8VarArr = T1;
        zv8 zv8Var = zv8VarArr[4];
        vvVar.b(this, Boolean.FALSE);
        m6f m6fVar = this.J;
        if (m6fVar != null) {
            m6fVar.b(D1());
        }
        pti ptiVarQ1 = q1();
        ptiVarQ1.h = null;
        ptiVarQ1.y.i(-1);
        ka0 ka0Var = this.j.b;
        ka0Var.h = false;
        bxd bxdVar = ka0Var.b;
        if (ka0Var.f) {
            ka0Var.f = false;
            bxdVar.b();
            bxdVar.h.remove(ka0Var.i);
        }
        k96 k96VarD1 = D1();
        boolean zJ0 = tre.j0(k96VarD1, tre.V(k96VarD1, 1.0f));
        vv vvVar2 = this.g;
        zv8 zv8Var2 = zv8VarArr[3];
        vvVar2.b(this, Boolean.valueOf(zJ0));
        int iX1 = D1().getLinearLayoutManager().X0();
        Integer numValueOf = Integer.valueOf(iX1);
        if (iX1 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            vee layoutManager = D1().getLayoutManager();
            View viewR2 = layoutManager != null ? layoutManager.r(iIntValue) : null;
            top = viewR2 != null ? viewR2.getTop() : 0;
            messageModelQ = this.H.Q(iIntValue);
        } else {
            messageModelQ = null;
        }
        jsa jsaVarF1 = F1();
        je9 je9Var = je9.d;
        rt2 rt2Var = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var != null) {
            ((v8d) jsaVarF1.L1.getValue()).d(Long.valueOf(rt2Var.A()));
        } else {
            String str = jsaVarF1.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "can't restartPollScheduling cuz chat is null", null);
            }
        }
        rt2 rt2Var2 = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var2 != null) {
            ((jfa) jsaVarF1.N1.getValue()).b(rt2Var2.A());
        }
        rt2 rt2Var3 = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var3 == null || (nx2Var = rt2Var3.b) == null || nx2Var.m <= 0) {
            edi ediVarI0 = jsaVarF1.i0();
            zv8[] zv8VarArr2 = edi.j;
            ediVarI0.b(true, new yvg(25));
        }
        if (messageModelQ != null && jsaVarF1.d.h()) {
            fva fvaVarG0 = jsaVarF1.g0();
            final long j2 = messageModelQ.c;
            ava avaVar = (ava) fvaVarG0.r.get();
            if (avaVar != null || j2 == -1) {
                String str2 = fvaVarG0.l;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "saveTimeForRestoreScroll, can't save time:" + j2 + ", curState:" + avaVar, null);
                    }
                }
            } else {
                String str3 = fvaVarG0.l;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, zo5.g(top, j2, "saveTimeForRestoreScroll, time:", ", offset:"), null);
                }
                fvaVarG0.r.updateAndGet(new UnaryOperator() { // from class: xua
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return new ava(j2, top, 2, false);
                    }
                });
            }
        }
        qqa qqaVar = (qqa) this.H1.getValue();
        if (qqaVar != null) {
            sgg sggVar = qqaVar.k;
            if (sggVar != null) {
                sggVar.b(null);
            }
            e4j e4jVar = qqaVar.l;
            e4jVar.g.removeCallbacks(e4jVar.l);
            RecyclerView recyclerView = qqaVar.h;
            if (recyclerView != null) {
                recyclerView.r0(qqaVar);
            }
            qqaVar.h = null;
            qqaVar.c().b.c.obtainMessage(5).sendToTarget();
        }
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = T1;
        zv8 zv8Var = zv8VarArr[1];
        this.e.b(this, null);
        this.q.B(this, zv8VarArr[5], null);
        this.p = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((xu1) this.A.getValue()).b(i, iArr) && i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    jsa jsaVarF1 = F1();
                    ylc ylcVar = jsaVarF1.B2;
                    if (ylcVar != null) {
                        jsaVarF1.B2 = null;
                        jsaVarF1.s0((aq6) ylcVar.a, ((Number) ylcVar.b).longValue(), null);
                    }
                    if (jsaVarF1.f0().g != null) {
                        jsaVarF1.f0().h(ns5.CHAT);
                        return;
                    }
                    return;
                }
            }
            jsa jsaVarF2 = F1();
            jsaVarF2.B2 = null;
            if (jsaVarF2.f0().g != null) {
                jsaVarF2.f0().g = null;
            }
            wsc wscVar = (wsc) this.r.getValue();
            svj svjVar = new svj(this, 1);
            wscVar.getClass();
            wsc.t(svjVar, strArr, iArr, R.string.oneme_request_storage_permission_title, R.string.oneme_request_storage_permission_subtitle);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getArgs().putBoolean("ARG_IS_PREVIEW", bundle.getBoolean("messages:key.is.preview"));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("messages:key.is.preview", ((Boolean) F1().I2.getValue()).booleanValue());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long lC0;
        super.onUpdateArgs(bundle, bundle2);
        boolean z = bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR", false);
        zv8[] zv8VarArr = T1;
        zv8 zv8Var = zv8VarArr[4];
        this.h.b(this, Boolean.valueOf(z));
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        if (obj2 != null && !obj2.equals(obj)) {
            Long lC1 = y5h.C0(obj2.toString());
            if (lC1 != null) {
                long jLongValue = lC1.longValue();
                bundle2.remove("ARG_LOAD_MESSAGE_ID");
                zv8 zv8Var2 = zv8VarArr[3];
                this.g.b(this, Boolean.FALSE);
                fva fvaVarG0 = F1().g0();
                fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new c03(fvaVarG0, jLongValue, true, null, 8)));
                View view = getView();
                if (view != null) {
                    view.post(new kb0(this, jLongValue, 4));
                    return;
                }
                return;
            }
            return;
        }
        Object obj3 = bundle.get("ARG_LOAD_MARK");
        Object obj4 = bundle2.get("ARG_LOAD_MARK");
        if (obj4 != null && !cqk.d(obj3, obj4) && (lC0 = y5h.C0(obj4.toString())) != null) {
            long jLongValue2 = lC0.longValue();
            bundle2.remove("ARG_LOAD_MARK");
            fva fvaVarG1 = F1().g0();
            zv8[] zv8VarArr2 = fva.v;
            fvaVarG1.g(yab.h0(fvaVarG1.c, fvaVarG1.b, 2, new x53(fvaVarG1, jLongValue2, 4, (lq4) null, 3)));
        }
        String string = bundle2.getString("ARG_PUSH_LINK");
        if (string != null) {
            F1().j0(string, true);
            bundle2.remove("ARG_PUSH_LINK");
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        x6e x6eVar;
        e93 e93Var = (e93) this.t.getValue();
        k96 k96VarD1 = D1();
        j8e j8eVar = this.N1;
        zv8[] zv8VarArr = T1;
        this.P1 = new b7e(k96VarD1, (e6e) j8eVar.m(this, zv8VarArr[14]), new ch8(28, view));
        r8e r8eVar = F1().O2;
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, getViewLifecycleOwner().f(), n09Var), new qsa(14, null, this), 3), getViewLifecycleScope());
        if (this.H.l() > 0) {
            v1().c();
        }
        D1().j((zsa) this.s1.getValue());
        k96 k96VarD2 = D1();
        ow0 ow0Var = this.r1;
        zv8 zv8Var = zv8VarArr[7];
        k96VarD2.i((xpa) ow0Var.getValue());
        if (!sol.e(w1())) {
            B1().e(D1());
            D1().k(B1());
            if (F1().p0()) {
                y1().e(D1());
                D1().k(y1());
            }
            A1().e(D1());
            D1().k(A1());
            if (((Boolean) x1().k().i()).booleanValue() && !((xb9) t1()).U().a.isEmpty()) {
                z1().e(D1());
                D1().k(z1());
            }
        }
        k96 k96VarD3 = D1();
        bdc.a(k96VarD3, new bta(k96VarD3, this, 3));
        D1().k(q1());
        qqa qqaVar = (qqa) this.H1.getValue();
        if (qqaVar != null) {
            qqaVar.d(D1());
        }
        MessagesLayoutManager messagesLayoutManager = this.K1;
        if (messagesLayoutManager != null) {
            messagesLayoutManager.v1(new dta(this));
        }
        e9i.j0(new fz6(n1g.v(new xc3(F1().M2, 18), getViewLifecycleOwner().f(), n09Var), new qsa(6, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(F1().g0().u, 13), getViewLifecycleOwner().f(), n09Var), new qsa(7, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().G2, getViewLifecycleOwner().f(), n09Var), new qsa(8, null, this), 3), getViewLifecycleScope());
        jsa jsaVarF1 = F1();
        oqa oqaVarE1 = E1();
        g19 viewLifecycleOwner = getViewLifecycleOwner();
        View viewFindViewById = findViewById(R.id.messages_list_scroll_btn);
        w5f w5fVar = viewFindViewById instanceof w5f ? (w5f) viewFindViewById : null;
        k96 k96VarD4 = D1();
        MessagesLayoutManager messagesLayoutManager2 = this.K1;
        if (messagesLayoutManager2 == null) {
            ore.p("LM is null when we try create scrollButtonStateProcessor");
            return;
        }
        new n5f(jsaVarF1, oqaVarE1, viewLifecycleOwner, w5fVar, k96VarD4, messagesLayoutManager2, v1(), new fz7(1, this.z1, wsa.class, "invalidate", "invalidate(Landroidx/recyclerview/widget/RecyclerView;)V", 0, 12), new fz7(1, this.y1, vsa.class, "invalidate", "invalidate(Landroidx/recyclerview/widget/RecyclerView;)V", 0, 11));
        e9i.j0(new fz6(n1g.v(E1().f, getViewLifecycleOwner().f(), n09Var), new qsa(9, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().i, getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, this, view, 16), 3), getViewLifecycleScope());
        e9i.j0(new j3(new fz6(n1g.v(F1().E2, getViewLifecycleOwner().f(), n09Var), new w8(2, this, MessagesListWidget.class, "handleEvent", "handleEvent(Lone/me/messages/list/ui/viewmodels/MessagesListEvent;)V", 4, 19), 3), 14, new rsa(1, null, this)), getViewLifecycleScope()).Y(new ol0(17, this));
        e9i.j0(new fz6(n1g.v(new o24(new jz(F1().i0().f, 13), 20, this), getViewLifecycleOwner().f(), n09Var), new qsa(10, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().B().o, getViewLifecycleOwner().f(), n09Var), new qsa(11, null, this), 3), getViewLifecycleScope());
        k96 k96VarD5 = D1();
        qpa qpaVar = this.H;
        x5b x5bVarC0 = F1().c0();
        e9i.j0(new fz6(x5bVarC0.g, new w8(2, new d6b(k96VarD5, qpaVar, x5bVarC0, E1()), d6b.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 22), 3), getViewLifecycleScope());
        this.o1 = new x6e(D1(), E1(), C1(), F1(), F1().c0(), this.d.getExecutors().a(), this.d.getAccessor().g(), this.d.getAccessor().d(23));
        if ((F1().d.h() || F1().d.a()) && (x6eVar = this.o1) != null) {
            tre.m0(e9i.T(new fz6(x6eVar.e.g, new rea(2, x6eVar, x6e.class, "handleSelectedMessages", "handleSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 3), ((n0c) ((xhh) x6eVar.g.getValue())).a()), getViewLifecycleScope());
        }
        MessagesLayoutManager messagesLayoutManager3 = this.K1;
        if (messagesLayoutManager3 != null) {
            messagesLayoutManager3.v1(new ysa(this, 1));
        }
        e9i.j0(new fz6(n1g.v(((o1c) this.d.getAccessor().c(806)).a, getViewLifecycleOwner().f(), n09Var), new qsa(12, null, this), 3), getViewLifecycleScope());
        c2a c2aVar = (c2a) this.G1.getValue();
        pti ptiVarQ1 = q1();
        h4c h4cVar = (h4c) c2aVar;
        if (ptiVarQ1 != null) {
            h4cVar.g.add(ptiVarQ1);
        }
        if (h4cVar.q.get() && ptiVarQ1 != null) {
            h4cVar.f.post(new c3(15, ptiVarQ1));
        }
        e9i.j0(new fz6(n1g.v(F1().f2, getViewLifecycleOwner().f(), n09Var), new qsa(13, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().P2, getViewLifecycleOwner().f(), n09Var), new qsa(1, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(uw8.f, getViewLifecycleOwner().f(), n09Var), new qsa(2, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((h8d) this.y.getValue()).c, getViewLifecycleOwner().f(), n09Var), new qsa(3, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((e1i) F1().F2.getValue()).l, getViewLifecycleOwner().f(), n09Var), new qsa(4, null, this), 3), getViewLifecycleScope());
        h1i h1iVar = (h1i) this.Q1.getValue();
        if (h1iVar != null) {
            mvh mvhVar = new mvh(getContext(), D1(), new cta(this, 0), null, 0, 3, false, 184);
            mvhVar.c(new tnh(R.string.message_transcription_onboarding));
            this.R1 = mvhVar;
            D1().k(h1iVar.d);
            e9i.j0(new fz6(n1g.v(new jz(h1iVar.b, 13), getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, this, h1iVar, 15), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(F1().f0().i, getViewLifecycleOwner().f(), n09Var), new qsa(5, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r8e(E1().k), getViewLifecycleOwner().f(), n09Var), new bra(null, F1()), 3), getViewLifecycleScope());
        String str = e93Var.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            qrc.k(e93.i, "messages_list_created", 1, str2, false, null, null, 120);
            return;
        }
        String str3 = e93Var.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onMessagesListWidgetCreated', but traceId is null or empty!", null);
        }
    }

    public final pti q1() {
        return (pti) this.I1.getValue();
    }

    public final int r1() {
        br4 parentController = getParentController();
        ChatScreen chatScreen = parentController instanceof ChatScreen ? (ChatScreen) parentController : null;
        if (chatScreen != null) {
            return chatScreen.K1();
        }
        return 0;
    }

    public final hs2 s1() {
        return (hs2) this.D1.getValue();
    }

    public final et3 t1() {
        return (et3) this.l.getValue();
    }

    public final uea u1() {
        return (uea) this.B.getValue();
    }

    public final hva v1() {
        zv8 zv8Var = T1[12];
        return (hva) this.L1.getValue();
    }

    public final t3f w1() {
        zv8 zv8Var = T1[0];
        return (t3f) this.c.a(this);
    }

    public final e5d x1() {
        return (e5d) this.n.getValue();
    }

    public final jed y1() {
        zv8 zv8Var = T1[9];
        return (jed) this.u1.getValue();
    }

    public final jed z1() {
        zv8 zv8Var = T1[11];
        return (jed) this.w1.getValue();
    }

    public /* synthetic */ MessagesListWidget(t3f t3fVar, ha9 ha9Var, long j, q24 q24Var, Long l, long j2, List list, long j3, boolean z, boolean z2, String str, boolean z3, int i, j95 j95Var) {
        this(t3fVar, ha9Var, j, (i & 8) != 0 ? null : q24Var, (i & 16) != 0 ? null : l, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? r66.a : list, (i & np0.m) != 0 ? 0L : j3, (i & np0.n) != 0 ? false : z, (i & np0.o) != 0 ? false : z2, (i & 1024) != 0 ? null : str, (i & np0.q) != 0 ? false : z3);
    }

    public MessagesListWidget(t3f t3fVar, ha9 ha9Var, long j, q24 q24Var, Long l, long j2, List<String> list, long j3, boolean z, boolean z2, String str, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Widget.ARG_SCOPE_ID, t3fVar);
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, ha9Var.a);
        bundle.putLong("ARG_CHAT_ID", j);
        if (q24Var != null) {
            bundle.putParcelable("ARG_COMMENTS_ID", q24Var);
            if (l != null) {
                bundle.putLong("ARG_COMMENTED_POST_CHAT_ID", l.longValue());
            }
        }
        if (j2 != 0) {
            bundle.putLong("ARG_LOAD_MARK", j2);
        }
        if (j3 != 0) {
            bundle.putLong("ARG_LOAD_MESSAGE_ID", j3);
        }
        List<String> list2 = list;
        if (!list2.isEmpty()) {
            bundle.putStringArrayList("ARG_HIGHLIGHTS", new ArrayList<>(list2));
        }
        if (z) {
            bundle.putBoolean("ARG_HIGHLIGHT_MESSAGE", true);
        }
        if (z2) {
            bundle.putBoolean("ARG_SKIP_UNREAD_DECOR", true);
        }
        if (str != null && str.length() != 0) {
            bundle.putString("ARG_PUSH_LINK", str);
        }
        if (z3) {
            bundle.putBoolean("ARG_IS_PREVIEW", true);
        }
        this(bundle);
    }
}
