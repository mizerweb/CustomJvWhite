package defpackage;

import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class m5f implements gpa {
    public final /* synthetic */ n5f a;
    public final /* synthetic */ j6f b;
    public final /* synthetic */ boolean c;

    public m5f(n5f n5fVar, j6f j6fVar, boolean z) {
        this.a = n5fVar;
        this.b = j6fVar;
        this.c = z;
    }

    @Override // defpackage.gpa
    public final void b() {
        n5f n5fVar = this.a;
        MessagesLayoutManager messagesLayoutManager = n5fVar.d;
        if (messagesLayoutManager.w() != 0) {
            n5fVar.j.B(n5fVar, n5f.k[0], yab.i0(tre.d0(n5fVar.a), null, 2, new q40(5, (lq4) null, this, n5fVar, this.b, this.c), 1));
            messagesLayoutManager.M.g(this);
        }
    }

    @Override // defpackage.gpa
    public final String getTag() {
        return "ScrollButton";
    }
}
