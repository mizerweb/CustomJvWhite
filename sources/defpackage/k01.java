package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k01 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k01(ga7 ga7Var, aec aecVar, long j) {
        this.a = 5;
        this.c = ga7Var;
        this.d = aecVar;
        this.b = j;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        f70 f70Var;
        int iIntValue = 0;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(rx8.b0(((ju6) ((rs6) ((l01) this.c).a.getValue())).g(this.b), (m01) this.d));
            case 1:
                ChatScreen chatScreen = (ChatScreen) this.c;
                long j = this.b;
                qc3 qc3Var = (qc3) this.d;
                ou7 ou7Var = ChatScreen.L1;
                MediaBarWidget mediaBarWidget = new MediaBarWidget(chatScreen.d, j);
                mediaBarWidget.t1 = chatScreen;
                if (qc3Var == qc3.d) {
                    mediaBarWidget.x1().k();
                    String str = mediaBarWidget.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "popupLayoutChangeType=setFullScreen, scrollState=" + mediaBarWidget.x1().getScrollState(), null);
                        }
                    }
                }
                return mediaBarWidget;
            case 2:
                xn3 xn3Var = (xn3) this.c;
                long j2 = this.b;
                ax2 ax2Var = (ax2) this.d;
                qw2 qw2VarJ = xn3Var.j();
                qw2VarJ.getClass();
                return qw2VarJ.v(j2, false, new ot4(26, ax2Var));
            case 3:
                xn3 xn3Var2 = (xn3) this.c;
                long j3 = this.b;
                String str2 = (String) this.d;
                qw2 qw2VarJ2 = xn3Var2.j();
                qw2VarJ2.getClass();
                gm0.n("qw2", "changeChatIcon, chatId = " + j3 + ", path = " + str2);
                qw2VarJ2.r(j3, uw2.b);
                qw2VarJ2.v(j3, false, new bw2(str2, iIntValue));
                qw2VarJ2.o.c(new wo3(Collections.singletonList(Long.valueOf(j3)), false));
                return sbi.a;
            case 4:
                return ((no4) this.c).a.b(this.b, new eo4(1, (cf7) this.d));
            case 5:
                ga7 ga7Var = (ga7) this.c;
                aec aecVar = (aec) this.d;
                long j4 = this.b;
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).x(aecVar, j4);
                }
                return sbi.a;
            case 6:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.c;
                long j5 = this.b;
                MessageModel messageModel = (MessageModel) this.d;
                tda tdaVar = messagesListWidget.p;
                if (tdaVar != null) {
                    qaa qaaVarA = ((raa) messagesListWidget.d.getAccessor().c(869)).a(j5, messageModel.a, true, messageModel.b);
                    qaaVarA.G(messagesListWidget.C1().B().G());
                    View view = messagesListWidget.getView();
                    if (view != null) {
                        Rect rect = new Rect();
                        view.getWindowVisibleDisplayFrame(rect);
                        int[] iArr = new int[2];
                        tdaVar.b().getLocationOnScreen(iArr);
                        messagesListWidget.q.B(messagesListWidget, MessagesListWidget.T1[5], e9i.j0(new fz6(n1g.v(qaaVarA.y, messagesListWidget.getViewLifecycleOwner().f(), n09.d), new wz6((lq4) null, new sfe(), tdaVar, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, rect.bottom - iArr[1])), 3), messagesListWidget.getViewLifecycleScope()));
                    }
                }
                return sbi.a;
            case 7:
                vzb vzbVar = (vzb) this.c;
                long j6 = this.b;
                cq3 cq3Var = (cq3) this.d;
                tzb tzbVar = vzbVar.k;
                if (tzbVar != null) {
                    ((fik) tzbVar).v(j6);
                }
                vzbVar.removeView(cq3Var);
                return sbi.a;
            default:
                ose oseVar = (ose) this.c;
                long j7 = this.b;
                tg4 tg4Var = (tg4) this.d;
                gga ggaVarG = ((toa) oseVar.h()).g(j7);
                if (ggaVarG != null) {
                    c46 c46Var = ggaVarG.n;
                    if (c46Var != null) {
                        f70Var = c46Var.p();
                    } else {
                        f70Var = new f70();
                        f70Var.a = r66.a;
                    }
                    int iB = f70Var.b() + (f70Var.b != null ? 1 : 0);
                    tg4Var.accept(f70Var);
                    int iB2 = f70Var.b() + (f70Var.b != null ? 1 : 0);
                    if (iB > 0 || iB2 > 0) {
                        c46 c46VarC = f70Var.c();
                        toa toaVar = (toa) oseVar.h();
                        iIntValue = ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 10, new cei(j7, c46VarC, pm9.a(c46VarC))))).intValue();
                    }
                }
                return Integer.valueOf(iIntValue);
        }
    }

    public /* synthetic */ k01(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }
}
