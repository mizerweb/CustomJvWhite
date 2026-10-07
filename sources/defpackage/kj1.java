package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kj1 extends fg7 implements af7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(kwb kwbVar, int i) {
        super(0, 0, kwb.class, kwbVar, "applyAddBadgeDrawable", "applyAddBadgeDrawable()V");
        this.a = i;
        switch (i) {
            case 23:
                super(0, 0, kwb.class, kwbVar, "applyCallBadgeVisible", "applyCallBadgeVisible()V");
                break;
            case 24:
                super(0, 0, kwb.class, kwbVar, "applyCloseBadgeDrawableBounds", "applyCloseBadgeDrawableBounds()V");
                break;
            case 25:
                super(0, 0, kwb.class, kwbVar, "applyLiveStreamBadgeVisible", "applyLiveStreamBadgeVisible()V");
                break;
            case 26:
                super(0, 0, kwb.class, kwbVar, "applyStoriesStrokeVisible", "applyStoriesStrokeVisible()V");
                break;
            case 27:
                super(0, 0, kwb.class, kwbVar, "applyOnlineBadgeDrawable", "applyOnlineBadgeDrawable()V");
                break;
            case 28:
                super(0, 0, kwb.class, kwbVar, "applyStoriesStrokeVisible", "applyStoriesStrokeVisible()V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.af7
    public final Object invoke() {
        CharSequence text;
        rt2 rt2Var;
        vg4 vg4VarW;
        int i = this.a;
        lha lhaVar = lha.a;
        mha mhaVar = mha.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.receiver;
                s57 s57Var = new s57(recyclerView, 3);
                if (recyclerView.Y()) {
                    recyclerView.post(new ewg(recyclerView, 26, s57Var));
                } else {
                    s57Var.invoke();
                }
                return sbiVar;
            case 1:
                ((km1) this.receiver).D();
                return sbiVar;
            case 2:
                CallIncomingScreen.o1((CallIncomingScreen) this.receiver);
                return sbiVar;
            case 3:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.receiver;
                ou7 ou7Var = CallIncomingScreen.m;
                callIncomingScreen.q1().p = false;
                b95 b95Var = callIncomingScreen.c;
                if (callIncomingScreen.p1().c((svj) callIncomingScreen.i.getValue())) {
                    sa2 sa2Var = (sa2) callIncomingScreen.h.getValue();
                    String strA = ns4.a(((dz4) ((x02) b95Var.i.a.getValue()).z().getValue()).c);
                    boolean z = ((dz4) ((x02) b95Var.i.a.getValue()).z().getValue()).i;
                    sa2Var.getClass();
                    sa2.c(sa2Var, "REQUEST_PERMISSION_MIC", strA, "BEFORE_JOIN", null, null, null, z, null, 376);
                } else {
                    callIncomingScreen.q1().C(false);
                }
                return sbiVar;
            case 4:
                ((km1) this.receiver).D();
                return sbiVar;
            case 5:
                CallIncomingScreen.o1((CallIncomingScreen) this.receiver);
                return sbiVar;
            case 6:
                ((a22) this.receiver).i.a(c22.b);
                return sbiVar;
            case 7:
                a22 a22Var = (a22) this.receiver;
                if (!a22Var.k && !r5h.X0(v3e.c(((dz4) a22Var.g().z().getValue()).d))) {
                    g4b g4bVarJ = ((h4b) a22Var.f.getValue()).J(4);
                    a22Var.k = true;
                    gu4 gu4Var = a22Var.l;
                    if (gu4Var != null) {
                        yab.h0(gu4Var, lvb.x0(zhb.b, ((n0c) ((xhh) a22Var.c.getValue())).a()), 3, new qt1(a22Var, g4bVarJ, null, 6));
                    }
                    a22Var.i.a(rt3.b);
                }
                return sbiVar;
            case 8:
                gu2 gu2Var = (gu2) this.receiver;
                return e9i.I(e9i.T(new cu2(new jz(((xn3) gu2Var.d.getValue()).k(gu2Var.c), 13), 0), ((n0c) ((xhh) gu2Var.f.getValue())).b()));
            case 9:
                return ChatMediaTabWidget.o1((ChatMediaTabWidget) this.receiver);
            case 10:
                return ((l73) this.receiver).D();
            case 11:
                return ((l73) this.receiver).D();
            case 12:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.receiver;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                int iOrdinal = ((jj3) chatsListSearchScreen.r1().F.a.getValue()).a.ordinal();
                return (iOrdinal == 3 || iOrdinal == 4) ? y3f.CHATS_LIST_SEARCH_RESULT : y3f.CHATS_LIST_SEARCH_INITIAL;
            case 13:
                ((nn4) this.receiver).L0();
                return sbiVar;
            case 14:
                ((nn4) this.receiver).L0();
                return sbiVar;
            case 15:
                ((p26) this.receiver).U();
                return sbiVar;
            case 16:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.receiver;
                zv8[] zv8VarArr2 = MediaKeyboardWidget.u;
                mediaKeyboardWidget.v1();
                return sbiVar;
            case 17:
                MediaKeyboardWidget mediaKeyboardWidget2 = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator = mediaKeyboardWidget2.s;
                if ((objectAnimator == null || !objectAnimator.isRunning()) && mediaKeyboardWidget2.q1().getTranslationY() != mediaKeyboardWidget2.q1().getHeight()) {
                    ObjectAnimator objectAnimator2 = mediaKeyboardWidget2.s;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mediaKeyboardWidget2.q1(), (Property<View, Float>) View.TRANSLATION_Y, mediaKeyboardWidget2.q1().getTranslationY(), mediaKeyboardWidget2.q1().getHeight());
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.start();
                    mediaKeyboardWidget2.s = objectAnimatorOfFloat;
                }
                return sbiVar;
            case 18:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                zv8[] zv8VarArr3 = MessageWriteWidget.I;
                if (messageWriteWidget.getView() != null) {
                    messageWriteWidget.i.a.i = messageWriteWidget.t1().getText();
                    mjg mjgVar = messageWriteWidget.A1().F;
                    nbb nbbVar = new nbb();
                    mjgVar.getClass();
                    mjgVar.j(null, nbbVar);
                }
                return sbiVar;
            case 19:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                if (n7j.o(messageWriteWidget2.t) && (cqk.d(messageWriteWidget2.t1().getSendActionState(), mhaVar) || cqk.d(messageWriteWidget2.t1().getSendActionState(), lhaVar))) {
                    a8j.x(messageWriteWidget2.A1().x, new sla(messageWriteWidget2.t1().getText()));
                    messageWriteWidget2.t1().setText(null);
                } else {
                    CharSequence text2 = messageWriteWidget2.t1().getText();
                    if ((text2 == null || r5h.X0(text2)) && messageWriteWidget2.t1().getEmojiExpandableState() != eha.a) {
                        nma.M(messageWriteWidget2.A1(), 0, 3);
                    } else {
                        MessageWriteWidget.G1(messageWriteWidget2, null, null, 3);
                    }
                }
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) this.receiver;
                zv8[] zv8VarArr4 = MessageWriteWidget.I;
                if (messageWriteWidget3.getView() != null && (((text = messageWriteWidget3.t1().getText()) != null && !r5h.X0(text)) || messageWriteWidget3.A1().E())) {
                    if (n7j.o(messageWriteWidget3.t) && (cqk.d(messageWriteWidget3.t1().getSendActionState(), mhaVar) || cqk.d(messageWriteWidget3.t1().getSendActionState(), lhaVar))) {
                        a8j.x(messageWriteWidget3.A1().x, new sla(messageWriteWidget3.t1().getText()));
                        messageWriteWidget3.t1().setText(null);
                    } else {
                        nma nmaVarA1 = messageWriteWidget3.A1();
                        if (nmaVarA1.d.h() && (rt2Var = (rt2) nmaVarA1.c.getValue()) != null && sol.a(rt2Var, (wo6) nmaVarA1.g.getValue())) {
                            a8j.x(nmaVarA1.w, new dla(sol.c(rt2Var)));
                        }
                    }
                }
                return sbiVar;
            case 21:
                rt2 rt2Var2 = (rt2) ((nma) this.receiver).c.getValue();
                if (rt2Var2 != null && (vg4VarW = rt2Var2.w()) != null) {
                    long jV = vg4VarW.v();
                    long j = rt2Var2.a;
                    bla blaVar = bla.b;
                    Long lValueOf = Long.valueOf(j);
                    o65 o65VarB = blaVar.b();
                    n65 n65Var = new n65();
                    n65Var.a = ":webapp:root";
                    n65Var.d(Long.valueOf(jV), "bot_id");
                    n65Var.d("start_button", "entry_point");
                    n65Var.d(lValueOf, "source_id");
                    o65.e(o65VarB, n65Var.a(), null, null, 4);
                }
                return sbiVar;
            case 22:
                ((kwb) this.receiver).i();
                return sbiVar;
            case 23:
                ((kwb) this.receiver).j();
                return sbiVar;
            case 24:
                ((kwb) this.receiver).k();
                return sbiVar;
            case 25:
                ((kwb) this.receiver).m();
                return sbiVar;
            case 26:
                ((kwb) this.receiver).p();
                return sbiVar;
            case 27:
                ((kwb) this.receiver).o();
                return sbiVar;
            case 28:
                ((kwb) this.receiver).p();
                return sbiVar;
            default:
                return Boolean.valueOf(((nni) this.receiver).d.getBoolean("app.privacy.unsafe.files.default", true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(nni nniVar) {
        super(0, 0, nni.class, nniVar, "getUnsafeFiles", "getUnsafeFiles()Z");
        this.a = 29;
    }
}
