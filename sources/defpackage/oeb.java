package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oeb implements ceb, cg7 {
    public final /* synthetic */ xeb a;

    public oeb(xeb xebVar) {
        this.a = xebVar;
    }

    @Override // defpackage.ceb
    public final void a(udb udbVar) {
        this.a.H(udbVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ceb) && (obj instanceof cg7)) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(1, 0, xeb.class, this.a, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
