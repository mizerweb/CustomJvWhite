package defpackage;

import android.view.View;
import one.me.chats.tab.ChatsTabWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class utg implements View.OnLongClickListener {
    public final /* synthetic */ vtg a;

    public utg(vtg vtgVar) {
        this.a = vtgVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        vtg vtgVar = this.a;
        osg osgVar = vtgVar.v;
        if (osgVar == null) {
            return false;
        }
        to3 to3Var = vtgVar.u;
        long j = osgVar.i;
        ChatsTabWidget chatsTabWidget = to3Var.a;
        qp4 qp4Var = chatsTabWidget.i;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        qp4 qp4VarBuild = opl.b(chatsTabWidget, 1).f(view).l(xw3.P0(new rp4(R.id.oneme_stories_action_write_message, new tnh(R.string.message_action_send_message), Integer.valueOf(R.drawable.icon_message), (Integer) null, 20), new rp4(R.id.oneme_stories_action_go_to_profile, new tnh(R.string.call_history_dlg_to_profile), Integer.valueOf(R.drawable.icon_profile), (Integer) null, 20), m1m.a(((nv7) chatsTabWidget.B1().i.getValue()).b(j)))).p(n1g.i(new ylc("story_user_id", Long.valueOf(j)))).build();
        chatsTabWidget.i = qp4VarBuild;
        qp4VarBuild.u(chatsTabWidget);
        return true;
    }
}
