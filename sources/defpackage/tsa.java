package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class tsa extends afe {
    public boolean a;
    public final /* synthetic */ MessagesListWidget b;

    public tsa(MessagesListWidget messagesListWidget) {
        this.b = messagesListWidget;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        zv8[] zv8VarArr = MessagesListWidget.T1;
        MessagesListWidget messagesListWidget = this.b;
        if (messagesListWidget.F1().c0().h()) {
            return;
        }
        boolean z = (messagesListWidget.H.l() <= 0 || recyclerView.canScrollVertically(1) || ((opa) messagesListWidget.F1().z2.a.getValue()).b) ? false : true;
        if (!z || this.a) {
            if (z) {
                return;
            }
            this.a = false;
            return;
        }
        this.a = true;
        jsa jsaVarF1 = messagesListWidget.F1();
        rt2 rt2Var = (rt2) jsaVarF1.w2.a.getValue();
        if (rt2Var != null && rt2Var.d0()) {
            List<MessageModel> list = ((opa) jsaVarF1.z2.a.getValue()).a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (MessageModel messageModel : list) {
                if (!messageModel.w() && messageModel.q == mg5.REGULAR) {
                    jsaVarF1.Y2++;
                    vk6 vk6Var = (vk6) jsaVarF1.a2.getValue();
                    long jA = rt2Var.A();
                    int i3 = jsaVarF1.Y2;
                    vk6Var.getClass();
                    ae9.k((ae9) vk6Var.a.getValue(), "SHOW", "channel_pixel", wm9.Q0(new ylc(ApiProtocol.PARAM_CONVERSATION_ID, Long.valueOf(jA)), new ylc("views_count", Integer.valueOf(i3))), 8);
                    return;
                }
            }
        }
    }
}
