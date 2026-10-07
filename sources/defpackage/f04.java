package defpackage;

import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f04 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CommentsBlackListScreen b;

    public /* synthetic */ f04(CommentsBlackListScreen commentsBlackListScreen, int i) {
        this.a = i;
        this.b = commentsBlackListScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CommentsBlackListScreen commentsBlackListScreen = this.b;
        switch (i) {
            case 0:
                r04 r04Var = (r04) commentsBlackListScreen.d.getAccessor().c(1082);
                vv vvVar = commentsBlackListScreen.b;
                zv8 zv8Var = CommentsBlackListScreen.k[0];
                return new q04(((Number) vvVar.a(commentsBlackListScreen)).longValue(), r04Var.a, r04Var.b, r04Var.c, r04Var.d, r04Var.e, r04Var.f, r04Var.g, r04Var.h);
            default:
                zv8[] zv8VarArr = CommentsBlackListScreen.k;
                return new d04(new vn7(11, commentsBlackListScreen), commentsBlackListScreen.d.getExecutors().a());
        }
    }
}
