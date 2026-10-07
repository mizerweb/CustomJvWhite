package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k85 implements my7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y85 b;
    public final /* synthetic */ Conversation c;

    public /* synthetic */ k85(y85 y85Var, Conversation conversation, int i) {
        this.a = i;
        this.b = y85Var;
        this.c = conversation;
    }

    @Override // defpackage.my7
    public final void a(py7 py7Var) {
        switch (this.a) {
            case 0:
                y85 y85Var = this.b;
                Conversation conversation = this.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallEngineTag", "hold(): result=" + py7Var, null);
                    }
                }
                mjg mjgVar = y85Var.H1;
                Boolean boolValueOf = Boolean.valueOf(conversation.isHeldByMe());
                mjgVar.getClass();
                mjgVar.j(null, boolValueOf);
                break;
            default:
                y85 y85Var2 = this.b;
                Conversation conversation2 = this.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "CallEngineTag", "unhold(): result=" + py7Var, null);
                    }
                }
                mjg mjgVar2 = y85Var2.H1;
                Boolean boolValueOf2 = Boolean.valueOf(conversation2.isHeldByMe());
                mjgVar2.getClass();
                mjgVar2.j(null, boolValueOf2);
                break;
        }
    }
}
