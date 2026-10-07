package defpackage;

import java.util.List;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
public final class sa extends kve {
    public final long k;
    public final t3f l;
    public final List m;
    public final Widget n;

    public sa(long j, t3f t3fVar, List list, Widget widget) {
        super(widget);
        this.k = j;
        this.l = t3fVar;
        this.m = list;
        this.n = widget;
    }

    @Override // defpackage.kve
    public final void G(hve hveVar, int i) {
        if (hveVar.o()) {
            return;
        }
        ((ta) this.m.get(i)).getClass();
        MembersListWidget membersListWidget = new MembersListWidget(this.l, new c9a(this.k, p63.MEMBER, 12));
        membersListWidget.setTargetWidget(this.n);
        membersListWidget.setRetainViewMode(xq4.b);
        hveVar.T(new lve(membersListWidget, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return this.m.size();
    }
}
