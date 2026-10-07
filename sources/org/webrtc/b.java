package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Camera1Session.AnonymousClass3) obj2).lambda$onPreviewFrame$1((byte[]) obj);
                break;
            case 1:
                ((Camera1Session.AnonymousClass3) obj2).lambda$onPreviewFrame$0((byte[]) obj);
                break;
            default:
                ((TextureBufferImpl) obj2).lambda$new$0((TextureBufferImpl.RefCountMonitor) obj);
                break;
        }
    }
}
