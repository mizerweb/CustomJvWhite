package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v1a implements t7b {
    public final /* synthetic */ b2a a;

    public v1a(b2a b2aVar) {
        this.a = b2aVar;
    }

    @Override // defpackage.t7b
    public final void d(long j) {
        b2a b2aVar = this.a;
        u7b u7bVarJ = b2aVar.a.a.j();
        Object obj = u7bVarJ != null ? u7bVarJ.c.get("MediaMetadata.Extra.MESSAGE_ID") : null;
        b2a.a(b2aVar, obj instanceof Long ? (Long) obj : null);
    }
}
