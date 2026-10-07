package defpackage;

import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hmd implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ha9 d;

    public /* synthetic */ hmd(long j, boolean z, ha9 ha9Var, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.d;
        boolean z = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                return new AddChatMembersScreen(j, z, ha9Var);
            case 1:
                return new ChangeOwnerScreen(j, z, ha9Var);
            default:
                return new StickersScreen(kng.SET, this.b, this.c, this.d);
        }
    }
}
